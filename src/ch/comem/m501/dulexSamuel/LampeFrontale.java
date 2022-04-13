package ch.comem.m501.dulexSamuel;

import java.util.ArrayList;
import java.util.Objects;

public class LampeFrontale {
    private boolean allume; // true si la lampe est allumée, false sinon
    private static final int NB_PILE_TO_START = 3;
    private static final float TENSION = 1.5f;
    private static final String TYPE = "AAA";
    private final ArrayList<Pile> piles = new ArrayList<Pile>(); // liste des piles de la lampe

    /**
     * Constructeur
     */
    public LampeFrontale() {
        this.allume = false;
    }

    /**
     * Permet d'allumer la lampe frontale
     */
    public void allumer() {
        if(this.piles.size() == NB_PILE_TO_START) {
            this.allume = true;
            System.out.println("Lampe allumée");
        }
        else{
            System.out.println("Il faut "+ NB_PILE_TO_START +" piles pour allumer la lampe");
        }
    }

    /**
     * Permet d'éteindre la lampe frontale
     */
    public void eteindre() {
        this.allume = false;
        System.out.println("Lampe éteinte");
    }

    /**
     * Permet d'ajouter une pile à la lampe frontale
     * @param pile la pile à ajouter
     */
    public void ajouterPile(Pile pile) {
        if(pile.getInUse()) {
            System.out.println("Pile déjà utilisée");
        }
        else if (this.piles.size() < NB_PILE_TO_START) {
            if(Objects.equals(Pile.getType(), TYPE) && Pile.getTension() == TENSION) {
                piles.add(pile);
                pile.setInUse(true);
                System.out.println("Pile ajoutée");
            }
            else{
                System.out.println("Pile non ajoutée, car ça n'est pas une pile "+TYPE+" "+TENSION+"V");
            }
        }
        else {
            System.out.println("Il y a déjà "+ NB_PILE_TO_START +" piles dans la lampe");
        }
    }

    /**
     * Permet de retirer une pile de la lampe frontale
     * @param pile la pile à retirer
     */
    public void retirerPile(Pile pile) {
        this.eteindre();
        if(pile.getInUse()) {
            pile.setInUse(false);
            piles.remove(pile);
            System.out.println("Pile retirée");
        }
        else {
            System.out.println("Pile déjà libre");
        }
    }

    /**
     * Permet de savoir si la lampe est allumée
     * @return true si la lampe est allumée, false sinon
     */
    public boolean getStatus(){
        if(this.allume){
            System.out.println("La lampe est allumée");
        }
        else{
            System.out.println("La lampe est éteinte");
        }
        return this.allume;
    }

    /**
     * Permet de savoir le nombre de piles dans la lampe frontale
     * @return le nombre de piles dans la lampe frontale
     */
    public int getNbOfPile(){
        System.out.println("Il y a " + this.piles.size() + " piles dans la lampe");
        return this.piles.size();
    }
}
