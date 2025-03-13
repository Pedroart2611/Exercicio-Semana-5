import java.text.DecimalFormat;
import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
      
        System.out.print("Digite um ano: ");
        double ano = sc.nextInt();
        
        if(ano % 4 == 0) {
        	System.out.print("Bisexto!");
        } else if (ano % 100 == 0 && ano % 400 == 0) {
        	System.out.print("Bisexto!");
        } else {
        	System.out.print("Não é bisexto!");
        }
    }
}
