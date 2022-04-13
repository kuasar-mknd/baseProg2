package ch.comem.m501.dulexSamuel;

public class Pile {
    private static String type = "AAA"; // type de la pile
    private static Float tension = 1.5f; // tension de la pile
    private boolean inUse = false; // si la pile est en cours d'utilisation

    /**
     * Constructeur
     */
    public Pile(){
        this.inUse = false;
    }

    /**
     * Constructeur avec type et tension
     * @param type type de la pile par exemple AAA
     * @param tension tension de la pile par exemple 1.5
     */
    public Pile(String type, Float tension){
        Pile.type = type;
        Pile.tension = tension;
    }

    /**
     * Méthode qui permet de mettre la pile en utilisation
     */
    public void setInUse(boolean inUse){
        this.inUse = inUse;
    }

    /**
     * Méthode qui permet de savoir si la pile est en utilisation
     * @return boolean true si en utilisation
     */
    public boolean getInUse(){
        return this.inUse;
    }

    /**
     * Méthode qui permet de savoir le type de la pile
     * @return String type de la pile, par défaut AAA
     */
    public static String getType(){
        return type;
    }

    /**
     * Méthode qui permet de changer le type des piles
     * @param type type des piles par exemple AAA
     */
    public static void setType(String type){
        Pile.type = type;
    }

    /**
     * Méthode qui permet de savoir la tension des piles
     * @return Float tension des piles, par défaut 1.5
     */
    public static Float getTension(){
        return tension;
    }

    /**
     * Méthode qui permet de changer la tension des piles
     * @param tension tension des piles par exemple 1.5
     */
    public static void setTension(Float tension){
        Pile.tension = tension;
    }
}
