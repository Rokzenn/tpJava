package jeuDes;

public class Gobelet{

    /**
     * Attributs
     * valeur du gobelet
     * tableau de dé
     */
    private int valeurGobelet;
    private De des[];

    /**
     * Constructeur
     * init nombre de dé dans la partie
     * init valeur gobelet à 0
     */
    public Gobelet(int nb_des){
        this.valeurGobelet = 0;

        this.des = new De[nb_des];
        for (int i = 0; i < nb_des; i++){
           this.des[i] = new De();
        }
    }

    /**
     * Getter
     * @return valeur gobelet
     */
    public int get_valeur(){
        return (this.valeurGobelet);
    }

    /**
     * methodes
     * afficher dernier score du gobelet
     */
    public void afficher_score(){
        System.out.println("Score du dernier lancer : " + this.valeurGobelet);
    }

    /**
     * methodes
     * lancement des des du gobelet + maj valeur gobelet
     * afficher le score
     */
    public void lancer(){
        int valGobelet = 0;

        for (De de : this.des){
            de.lancer();
            valGobelet += de.get_valeur();
        }
        this.valeurGobelet = valGobelet;

        afficher_score();
    }


}
