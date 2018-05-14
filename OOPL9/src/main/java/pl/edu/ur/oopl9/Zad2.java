package pl.edu.ur.oopl9;

import java.util.*;

/**
 *
 * @author kamil
 */
public class Zad2 {

    public static void zad2(){
        
        Random los = new Random();
        TreeSet<Integer> Treerand = new TreeSet<>();
        for(int i=0;i<100;i++)
        {
            Treerand.add(los.nextInt(100));
        }

        Iterator tree = Treerand.iterator();

        while(tree.hasNext())
        {
            Integer value = (Integer)tree.next();
            System.out.println("Wartośc losowa : "+value);
        }     
    }
    
}