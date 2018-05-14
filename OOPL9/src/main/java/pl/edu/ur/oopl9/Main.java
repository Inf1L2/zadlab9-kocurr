/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.Scanner;

/**
 *
 * @author maarchyl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj nr zadania: ");
        menu = in.nextInt();
        switch(menu){
            case 1: Zad1.zad1();
            break;
            case 2: Zad2.zad2();
            break;
            case 3: Zad3.zad3();
            default: 
                System.out.println("Nie ma takiego zadania!");
            break;
        }
    }
    
}