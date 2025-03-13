package bundus;

import java.util.Scanner;
import java.text.DecimalFormat;

public class questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextInt();
        
        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextInt();
        
        System.out.print("Escolha uma operação(+,-,*,/): ");
        char op = sc.next().charAt(0);
        
        double result = 0;
        
        switch(op) {
        
        case '+':
        	result = num1 + num2;
        	break;
        case '-':
        	result = num1 - num2;
        	break;
        case '*':
        	result = num1 * num2;
        	break;
        case '/':
        	result = num1 / num2;
        	if(num2 == 0) {
        		System.out.print("Erro!");
        	}
        	break;
        default:
        	System.out.print("Operação inválida!");
        }
        
        System.out.print("O resultado é: " + result);
        
    }
}