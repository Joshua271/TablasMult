package com.company;

import java.util.Scanner;

public class TablasMult {

        /*En este primer programa, se pide un numero entero al usuario,
        con ello se creara una tabla de multiplicacion hasta el doceavo
        multiplicando.
         */

    public static void main(String[] args) {

        System.out.println("Ingrese un numero entero: ");
        Scanner n = new Scanner (System.in);
        int num = n.nextInt();

        for(int i=0;i<13;i++){
            int result = num * i;
            System.out.println(num+" x "+i+" = "+result);
        }
    }
}
