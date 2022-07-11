package jeuDes;
import java.util.Random;

public class De{

    /**
     * Attributs
     */
    private int valeur;

    /**
     * Constructeur
     * valeur init à 0
     */
    public De() {
        this.valeur = 0;
    }

    /**
     * Getter
     * @return valeur
     */
    public int get_valeur(){
        return (this.valeur);
    }


    /**
     * methodes
     * lancer un dé
     */
    public void lancer(){
        Random ranNum = new Random();
        this.valeur = ranNum.nextInt(1, 6);
    }
}
