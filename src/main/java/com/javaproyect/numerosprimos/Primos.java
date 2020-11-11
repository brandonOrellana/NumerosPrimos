package com.javaproyect.numerosprimos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Brandon Orellana Rojas
 */
public class Primos {
    private static int  primo = 0;
    static Scanner reader = new Scanner(System.in);
    
    public static void main(String[] args) {
        do{
            System.out.println("Enter a prime number > 0, -1 to finish:");
            try{
                primo = reader.nextInt();
            }catch(InputMismatchException ime){
                System.out.println("PLEASE ENTER A NUMBER");
                reader.next();
            }
            System.out.println("it's "+esPrimo(primo)+" that "+primo+" is prime.");
        }while(primo!=-1);

    }
    
    public static boolean esPrimo(int n){
        if(n == 0 || n==1){
            System.out.println("(The "+n+" is a special number,neither prime nor composite)");
            return false;
        } else if(n<-1){
            System.out.println("Please enter a positive number.");
            return false;
        }
        int numeros=n;
        while(numeros != 2){
            numeros--;
            if(n % numeros == 0){
                return false;
            }
        }
        return true;
    }
    
}

