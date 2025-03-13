package bundus;

import java.text.DecimalFormat;
import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
        System.out.print("Digite sua nota: ");
        int nota = sc.nextInt();
        
        switch(nota) {
        case 1:
        		System.out.print("Seu conceito foi: E!");
        	break;
        case 2:
        		System.out.print("Seu conceito foi: E!");
        	break;
        case 3:
        		System.out.print("Seu conceito foi: D!");
        	break;
        case 4:
        		System.out.print("Seu conceito foi: D!");
        	break;
        case 5:
        		System.out.print("Seu conceito foi: C!");
        	break;
        case 6:
        		System.out.print("Seu conceito foi: C!");
        	break;
        case 7:
        		System.out.print("Seu conceito foi: B!");
        	break;
        case 8:
        		System.out.print("Seu conceito foi: B!");
        	break;
        case 9:
        		System.out.print("Seu conceito foi: A!");
        	break;
        case 10:
        		System.out.print("Seu conceito foi: A!");
        	break;
        default:
        	System.out.print("Nota invalida!");
        }
	}

}
