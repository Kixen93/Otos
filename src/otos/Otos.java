/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package otos;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author itsso
 */
public class Otos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hány mezőt játszunk? He?");
        Scanner  be = new Scanner(System.in);
        int mezoszam = be.nextInt();
        Random rnd = new Random();
        
        for (int i=1;i<=mezoszam;i++) {
            
            int[] mezo= new int[5];
        
        for (int y=0;y<=(mezo.length-1);y++){ 
            mezo[y]= rnd.nextInt(90)+1;
        }
        Arrays.sort(mezo);
        for (int y=1;y<=mezo.length-1;y++){
            int min = y-1;
            if(mezo[y]-mezo[min]==0){
//            System.out.println("Egyezés : " + mezo[y]);
            mezo[y]= rnd.nextInt(50)+1;
            Arrays.sort(mezo);
            y=0;
            }}
        for (int j=0;j<=mezo.length-1;j++){
            System.out.print(mezo[j]+ " ");
    }
            System.out.println();
        }
    }
    
}
