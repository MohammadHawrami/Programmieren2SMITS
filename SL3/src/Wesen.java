/**
 * Basisklasse fuer alle Wesen im Spiel
 */
public abstract class Wesen {

    /**
     * Greife das andere Wesen an. Der Schaden wird berechnet und beim
     * gegnerischen Wesen abgezogen.
     *
     * @param gegner Wesen, das angegriffen werden soll
     * @return Zugefuegter Schaden.
     */
    public abstract double attack(Wesen gegner);

    /**
     * Beschraenkt den Schaden.
     *
     * @param dmg Schaden.
     * @return Vebleibender Schaden nach der Beschraenkung
     */
    public double beschraenkeSchaden(double dmg){
        return dmg;
    }
}
