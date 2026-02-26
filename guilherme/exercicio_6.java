package venolas6;
import java.util.Scanner;
public class Venolas6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//duas notas.Se a média for 7 ou mais,"Aprovado".Entre 5 e 6.9, "Recuperação".Abaixo de 5, "Reprovado".       
        System.out.print("Digite a respectiva nota:");
        double n1 = sc.nextDouble();
        System.out.print("Digite a respectiva nota:");
        double n2 = sc.nextDouble();
        double media = (n1 + n2)/ 2;
        
        if (media >= 7){
            System.out.print("Aprovado.");
        }
        else if (media >= 5){
            System.out.print("Recuperação.");
        }
        else {
            System.out.println("Reprovado");
        }
        sc.close();
    }
    
}
Média Acadêmica: Receba duas notas. Se a média for 7 ou mais, "Aprovado". Entre 5 e 6.9, "Recuperação". Abaixo de 5, "Reprovado".