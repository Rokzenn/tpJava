package jeuDes;

public class Main {
    public static void main(String[] args) {

//  création de la partie
        Partie partie = new Partie(2, 5);

//  init les joueurs + nombre et noms
        partie.initialiser();

//  lancement de la partie
        partie.lancer();
    }
}
