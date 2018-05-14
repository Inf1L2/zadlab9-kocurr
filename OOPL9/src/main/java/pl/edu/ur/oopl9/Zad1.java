package pl.edu.ur.oopl9;
import java.util.*;

/**
 *
 * @author kamil
 */
public class Zad1 {
    public static void zad1(){
        int losoweLiczby[];
        losoweLiczby = new int[100];
        Random los = new Random();
        System.out.println("100-u elementowa tablica z liczbami losowymi: ");
        for(int i=0; i<losoweLiczby.length; i++){
            losoweLiczby[i] = los.nextInt(100);
            System.out.println(i + " element tablicy to: " + losoweLiczby[i]);
        }
        Arrays.sort(losoweLiczby);
        System.out.println("Tablica posortowana: ");
        
        for(int i=0; i<losoweLiczby.length; i++){
            System.out.println(i + " element tablicy to: " + losoweLiczby[i]);
        }
    }
}
