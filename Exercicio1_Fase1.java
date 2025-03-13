package bundus;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio1_Fase1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
        System.out.print("Digite um número: ");
        double num = sc.nextInt();
        
        if(num % 2 == 0) {
        	System.out.print("E par!");
        } 
        
        else {
        	System.out.print("E impar!");
        }
        
        
    }
}