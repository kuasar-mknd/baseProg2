package ch.comem.m501.dulexSamuel;

import java.util.ArrayList;
import java.util.LinkedList;

public class exercice1 {
    public static void main(String[] args) {
        //Liste contenant les piles et les lampe frontales
        LinkedList<Pile> pilesArray = new LinkedList<>();
        ArrayList<LampeFrontale> lampeFrontaleArray = new ArrayList<>();

        //Création des piles et d'une lampe frontale
        createPiles(3, pilesArray);
        createLampeFrontales(1, lampeFrontaleArray);

        //Récupération de la tension des piles
        System.out.println("La tension des piles " + Pile.getType() + " est de " + Pile.getTension() + " V");

        //Test d'ajout de piles dans la lampe
        lampeFrontaleArray.get(0).ajouterPile(pilesArray.get(0));
        lampeFrontaleArray.get(0).ajouterPile(pilesArray.get(1));
        lampeFrontaleArray.get(0).getStatus();
        lampeFrontaleArray.get(0).allumer();
        lampeFrontaleArray.get(0).getStatus();
        lampeFrontaleArray.get(0).ajouterPile(pilesArray.get(1));
        lampeFrontaleArray.get(0).getNbOfPile();
        lampeFrontaleArray.get(0).ajouterPile(pilesArray.get(2));
        lampeFrontaleArray.get(0).allumer();
        lampeFrontaleArray.get(0).getStatus();
        lampeFrontaleArray.get(0).retirerPile(pilesArray.get(1));
        lampeFrontaleArray.get(0).allumer();
        lampeFrontaleArray.get(0).getStatus();
        lampeFrontaleArray.get(0).ajouterPile(pilesArray.get(1));
        lampeFrontaleArray.get(0).allumer();
        lampeFrontaleArray.get(0).getStatus();
        lampeFrontaleArray.get(0).eteindre();
        lampeFrontaleArray.get(0).getStatus();
        lampeFrontaleArray.get(0).getNbOfPile();

        //Création de nouvelles piles
        createPiles(5, pilesArray);
        lampeFrontaleArray.get(0).ajouterPile(pilesArray.get(3));

        //Création d'une nouvelle lampe frontale
        createLampeFrontales(1, lampeFrontaleArray);
        lampeFrontaleArray.get(1).ajouterPile(pilesArray.get(0));
        lampeFrontaleArray.get(1).ajouterPile(pilesArray.get(3));
        lampeFrontaleArray.get(1).allumer();



    }

    static void createPiles(int nbPile, LinkedList<Pile> pilesArray) {
        for (int i = 0; i < nbPile; i++) {
            pilesArray.add(new Pile());
        }
    }

    static void createLampeFrontales(int nbLampeFrontale, ArrayList<LampeFrontale> lampeFrontaleArray) {
        for (int i = 0; i < nbLampeFrontale; i++) {
            lampeFrontaleArray.add(new LampeFrontale());
        }
    }
}
