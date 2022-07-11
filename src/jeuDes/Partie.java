package jeuDes;

import java.util.Scanner;

public class Partie{

    /**
     * Attributs
     * tableau de joueurs + nombre de tour + gobelet
     */
        private Joueur joueurs[];
        private int nb_tours;
        private Gobelet gobelet;


    /**
     * constructeur
     * init gobelet
     * nombre de tours à jouer
     * nombre de dès à utiliser
     */
        public Partie(int nb_tours, int nb_des){
            this.nb_tours = nb_tours;
            this.gobelet = new Gobelet(nb_des);
        }


    /**
     * méthodes
     * init nombre de joueur
     * init noms des joueurs
     * verif mini 2
     */
        public void initialiser(){
            Scanner scanner = new Scanner(System.in);
            int nbJoueurs;

            do {
                System.out.println("A combien de joueur voulez vous jouer ?");
                nbJoueurs = scanner.nextInt();
            } while (nbJoueurs < 2);

            this.joueurs = new Joueur[nbJoueurs];
            for (int i = 0; i < nbJoueurs; i++){
                System.out.println("Entrer le nom du joueur ");
                String nomJoueur = scanner.next();
                joueurs[i] = new Joueur(nomJoueur);
            }
        }

    /**
     * affiche le joueur gagnant avec le plus de point
     */
        public void afficher_gagnant(){
            int maxScore = 0;
            String gagnant = "";
            for (Joueur joueur : this.joueurs){
                if(joueur.get_score() > maxScore){
                    maxScore = joueur.get_score();
                    gagnant = joueur.get_nom();
                }
            }
            System.out.println("Le gagnant est : " + gagnant + " avec le score : " + maxScore);
        }

    /**
     * méthodes
     * lancement partie
     * les joueurs jouent chacun leur tour jusqu'à la fin des nombre de tour définies
     * affiche le gagnant
     * affiche numero de tour et score
     */
        public void lancer(){

            int i = 1;
            while(i <= this.nb_tours){
                System.out.println("Tour : " + i);
                for (Joueur joueur : this.joueurs) {
                    System.out.println("Joueur : " + joueur.get_nom() );
                    joueur.jouer(this.gobelet);
                    System.out.println("Score : " + joueur.get_score());
                }
                i++;
            }
        afficher_gagnant();
        }
}
