package jeuDes;

import java.util.Random;

public class Joueur {
    /**
     * Attributs
     * nom et score
     */
    private String nom;
    private int score;

    /**
     * Constructeur
     * nom du joueur initialisé
     * score init à 0
     */
    public Joueur(String nom){
        this.nom = nom;
        this.score = 0;
    }

    /**
     * Getter
     * @return nom du joueur
     */
    public String get_nom(){
        return (this.nom);
    }

    /**
     * Getter
     * @return score du joueur
     */
    public int get_score(){
        return (this.score);
    }

    /**
     * methodes : lancement du gobelet
     * maj score joueur
     * @param gobelet partie
     */
    public void jouer(Gobelet gobelet){
        gobelet.lancer();
        this.score += gobelet.get_valeur();
    }

    /**
     * methodes : afficher score joueur
     */
    public void afficher_score(){
        System.out.println("Le joueur " + this.nom + " a un score de : " + this.score);
    }
}
