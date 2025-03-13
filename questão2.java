package bundus;

import java.util.Scanner;
import java.text.DecimalFormat;

public class questão2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
        System.out.print("Digite sua idade: ");
        double idade = sc.nextInt();
        
        if(idade < 18) {
        	System.out.print("Menor de idade");
        } else if(idade >= 18 && idade <= 60) {
        	System.out.print("Adulto");
        } else {
        	System.out.print("Idoso");
        }
        
    }
}