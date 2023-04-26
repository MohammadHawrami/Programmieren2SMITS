public class Vektor {
    final double xValue;
    final double yValue;
    final double zValue;
    final int xPosition = 0;
    final int yPosition = 1;
    final int zPosition = 2;

    /**
     * Default Konstruktor ist der Nullvektor.
     */
    public Vektor() {
        xValue = 0;
        yValue = 0;
        zValue = 0;
    }
    /**
     * Konstruktor für Vektorobjekte
     * @param x
     * @param y
     * @param z
     */
    public Vektor(double x, double y, double z) {
        xValue = x;
        yValue = y;
        zValue = z;
    }
    /**
     * Erzeugt Kopie eines übergebenen Vektorobjekts
     * @param vector
     * @return tempVector
     */
    public Vektor createVectorObject(double[] vector) {
        Vektor tempVector = new Vektor(
                vector[xPosition],
                vector[yPosition],
                vector[zPosition]);
        return tempVector;
    }
    /**
     *
     * Addiert zwei Vektorobjekte
     * gibt Ergebnis in Objekt-Kopie aus
     * @param vector
     * @return tempVector
     */
    public Vektor addVectorTo(Vektor vector) {
        double[] ownVector = makeArray();
        double[] secondVector = vector.makeArray();
        double[] newVector = new double[ownVector.length];
        for (int i = 0; i < newVector.length; i++) {
            newVector[i] = ownVector[i] + secondVector[i];
        }
        return  createVectorObject(newVector);
    }
    /**
     * Subtrahiert zwei Vektorobjekte
     * gibt Ergebnis in Objekt-Kopie aus
     * @param vector
     * @return tempVector
     */
    public Vektor subtractVectorFrom(Vektor vector) {
        double[] ownVector = makeArray();
        double[] secondVector = vector.makeArray();
        double[] newVector = new double[ownVector.length];
        for (int i = 0; i < newVector.length; i++) {
            newVector[i] = ownVector[i] - secondVector[i];
        }
        return  createVectorObject(newVector);
    }
    /**
     * gibt den x-Wert eines Vektorobjekts aus
     * @return double xValue
     */
    public double getX() {
        return xValue;
    }
    /**
     * gibt den y-Wert eines Vektorobjekts aus
     * @return double yValue
     */
    public double getY() {
        return yValue;
    }
    /**
     * gibt den z-Wert eines Vektorobjekts aus
     * @return double zValue
     */
    public double getZ() {
        return zValue;
    }
    /**
     * holt sich die Werte eines Vektorobjekts
     * mithilfe der get(X, Y, Z) -Methoden
     * setzt die Werte in ein neues Array ein
     * @return vectorArray
     */
    public double[] makeArray() {
        int vectorDimension = 3;
        double[] vectorArray = new double[vectorDimension];
        vectorArray[xPosition] = this.xValue;
        vectorArray[yPosition] = this.yValue;
        vectorArray[zPosition] = this.zValue;
        return vectorArray;
    }
    /**
     * erhält einen Skalar zum Multiplizieren
     * mit einem Vektor
     * speichert Ergebnis in neuem Array
     * wandelt anschließend Array durch
     * @see createVectorObject() - Methode
     * in ein neues Objekt um
     * @param scalar
     * @return tempVector
     */
    public Vektor multiplyWithScalar(double scalar) {
        makeArray();
        double[] result = new double[makeArray().length];
        for (int i = 0; i < makeArray().length; i++) {
            result[i] = makeArray()[i] * scalar;
        }
        return createVectorObject(result);
    }
    /**
     * erhält ein Vektorobjekt
     * Wandelt Koordinatenwerte der Objekte
     * in Arrays um mit Hilfe von @see makeArray() - Methode
     * multipliziert x1 mit x2, y1 mit y2 und z1 mit z2
     * Koordinaten und addiert die Produkte zusammen
     * gibt die Summe in 'result' aus
     * @param vector
     * @return double result
     */
    public double makeScalarProduct(Vektor vector) {
        makeArray();
        double[] secondVector = vector.makeArray();
        double result = 0;
        for (int i = 0; i < makeArray().length; i++) {
            result += makeArray()[i] * secondVector[i];
        }
        return result;
    }
    /**
     *erhält ein Vektorobjekt
     * Wandelt Koordinatenwerte der Objekte
     * in Arrays um mit Hilfe von @see makeArray() - Methode
     * verrechnet das Kreuzprodukt der zwei Vektorobjekte
     * gibt dieses in einem neuen Vektorobjekt zurück
     * mithilfe von @see createVectorObject() - Methode
     * @param vector
     * @return tempVector
     */
    public Vektor makeCrossProduct(Vektor vector) {
        double[] ownVector = makeArray();
        double[] secondVector = vector.makeArray();
        double[] crossProduct = new double[ownVector.length];
        crossProduct[xPosition] +=
                ownVector[yPosition] * secondVector[zPosition]
                        - ownVector[zPosition] * secondVector[yPosition];
        crossProduct[yPosition] +=
                ownVector[zPosition] * secondVector[xPosition]
                        - ownVector[xPosition] * secondVector[zPosition];
        crossProduct[zPosition] +=
                ownVector[xPosition] * secondVector[yPosition]
                        - ownVector[yPosition] * secondVector[xPosition];
        return createVectorObject(crossProduct);
    }
    /**
     * bekommt ein Vektorobjekt
     * addiert einzelne Koordinaten mit Hilfe
     * von @see makeArray() - Methode
     * prüft die Summe beider auf größe
     * damit Faktorprüfung erfolgen kann
     * Methode gibt true zurück, wenn die x, y und z Koordinaten
     * beider Vektoren gleich sind (Default)
     * oder wenn alle x, alle y und alle z Koordinaten
     * des kürzeren Vektors mit dem selben Faktor
     * multipliziert in Summe x, y und z Koordinaten
     * des größeren Vektors entsprechen.
     * @param vector
     * @return boolean (ist co-Linear oder nicht)
     */
    public boolean isCoLinearTo(Vektor vector) {
        double[] ownVector = makeArray();
        double[] secondVector = vector.makeArray();
        double vectorSum1 = 0;
        double vectorSum2 = 0;
        double factor;
        for (int i = 0; i < ownVector.length; i++) {
            vectorSum1 += ownVector[i];
            vectorSum2 += secondVector[i];
        }
        /**
         * if-Block gibt false zurück, falls Faktor nicht gleich ist
         */
        if (vectorSum1 > vectorSum2) {
            factor = vectorSum1 / vectorSum2;
            for (int j = 0; j < ownVector.length; j++) {
                if (secondVector[j] * factor != ownVector[j]) {
                    return false;
                }
            }
        } else if (vectorSum1 < vectorSum2) {

            factor = vectorSum2 / vectorSum1;
            for (int k = 0; k < ownVector.length; k++) {
                if (ownVector[k] * factor != secondVector[k]) {
                    return false;
                }
            }
        }
        return true;
    }
    /**
     * teilt nacheinander x, y, dann z-Koordinate
     * gibt den Einheitsvektor als
     * neues Objekt zurück mit Hilfe von
     * @see createVectorObject() - Methode
     * @return tempVector
     */
    public Vektor getUnityVec() {
        double[] unityVector = new double[makeArray().length];
        for (int i = 0; i < unityVector.length; i++) {
            unityVector[i] = makeArray()[i] / getAbsoluteValue();
        }
        return createVectorObject(unityVector);
    }
    /**
     * Berechnet die Konstanten der Initialisierung
     * eines Vektorobjekts zum Betrag zusammen
     * gibt den Betrag als neuen double - Wert zurück
     * @return double (Betrag)
     */
    public double getAbsoluteValue() {
        return Math.sqrt(xValue * xValue
                + yValue * yValue
                + zValue * zValue);
    }
    /**
     * erzeugt eine Objektkopie beim Aufruf
     * @see createVectorObject() - Methode
     * rechnet mit übergebenen Vektor Objekt
     * den eingeschlossenen Winkel aus
     * gibt den Winkel als String
     * zurück (bei einer Nachkommastelle abgeschnitten)
     * @param vector2
     * @return String (result)
     */
    public String getImplicitAngle(Vektor vector2) {
        Vektor vector1 = createVectorObject(makeArray());
        double angle = (vector1.makeScalarProduct(vector2)
                / (vector1.getAbsoluteValue() * vector2.getAbsoluteValue()));
        double result = Math.toDegrees(Math.acos(angle));
        return String.format("%1.1f", result);
    }
    /**
     * Methode zur einfachen Bildschirmausgabe
     * der Vektorkoordinaten eines Vektorobjekts
     * @return String (x, y und z-Wert eines Objekts)
     */
    public String printVektorValues() {
        return xValue + " \n"
                + yValue + " \n"
                + zValue + " ";
    }
    /**
     * erhält ein Vektorobjekt
     * erstellt von zu prüfendem
     * und übergebenen Objekt ein
     * neues Array mit Hilfe von @see makeArray() - Methode
     * iteriert über beide Arrays drüber und
     * vergleicht die Werte der Objekte
     * gibt Default true zurück
     * gibt nur false, falls Elemente ungleich sind
     * @param vector
     * @return boolean (ist gleich oder nicht)
     */
    public boolean isEqualTo(Vektor vector) {
        for (int i = 0; i < vector.makeArray().length; i++) {
            if (makeArray()[i] != vector.makeArray()[i]) {
                return false;
            }
        }
        return true;
    }
}