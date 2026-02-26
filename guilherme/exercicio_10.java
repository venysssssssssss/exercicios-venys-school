package venolas10;
import java.util.Scanner;
public class Venolas10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Aumento Salarial: Se ganha até R$ 1500, aumento de 15%. Se ganha mais, 10%.
        System.out.print("Digite o salario do seu funcionario:");
        double salario = sc.nextDouble();
        
        if (salario <= 1500){
            System.out.println("O aumento de seu salario foi de 15%.");
            double aumento1 = salario * 1.15; 
            System.out.printf("O salario atual e de: %.2f%n", aumento1);           
        }
        else {
            System.out.println("O aumento de seu salario foi de 10%.");
            double aumento2 = salario * 1.10;
            System.out.printf("O salario atual e de: %.2f%n", aumento2); 
        }
        sc.close();
            }
    
}
