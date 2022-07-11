package jeuDes;

public class Run {
    public static void main(String[] args) {

//  création de la partie
        Partie partie = new Partie(4, 5);

//  init les joueurs + nombre et noms
        partie.initialiser();

//  lancement de la partie
        partie.lancer();
    }
}
