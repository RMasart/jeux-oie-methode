package com.example;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        System.out.println("Lancer le dé");
        int caseCourante = 0;
        int nbLancers = 5;
        int caseObjectif = 20;
        Random generateur = new Random();

        System.out.println("Bienvenue ! Commencons...");

        caseCourante = jouerLaPartie(generateur, caseCourante, nbLancers);
        afficherResultatPartie(caseCourante, caseObjectif);
    }

    public static int jouerLaPartie(Random generateur, int caseCourante, int nbLancers) {
        for (int i = 1; i <= nbLancers; i++) {
            caseCourante = lancerDeDés(generateur, caseCourante, i);
        }
        return caseCourante;
    }

    public static int lancerDeDés(Random generateur, int caseCourante, int numéroLancer) {
        int lancer = generateur.nextInt(6) + 1;
        caseCourante = caseCourante + lancer;
        System.out.println(String.format("Lancer %d : vous avez fait %d. Vous etes sur la case %d.",
                numéroLancer, lancer, caseCourante));
        return caseCourante;
    }

    public static void afficherResultatPartie(int caseCourante, int caseObjectif) {
        if (caseCourante == caseObjectif) {
            System.out.println("Vous avez gagné !");
        } else if (caseCourante > caseObjectif) {
            System.out.println("Vous dépasser, vous avez perdu !");
        } else {
            System.out.println("Vous avez perdu");
        }
    }
}
