package com.mycompany.cap4_ejeresuelto7;
import java.util.Scanner;
public class Cap4_ejeResuelto7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1,num2;
        
        System.out.print("dame el valor a: ");
        num1 = entrada.nextInt();
        
        System.out.print("dame el valor b: ");
        num2 = entrada.nextInt();
        
        if(num1 > num2){
            System.out.println("A es mayor que B");
        }else if(num1 < num2){
            System.out.println("A es menor que B");
        }else{
            System.out.println("A es igual que B");
        }
    }
}
