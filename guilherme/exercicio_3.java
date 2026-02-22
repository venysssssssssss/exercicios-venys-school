package venolas3.pkg0;
import java.util.Scanner;
public class Venolas30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //imprimi na tela a pergunta do valor da compra.
        System.out.print("Digite o valor da compra: ");
        //atribui o valor da compra ao caractere "v".
        double v = sc.nextDouble();
        //Se o valor da compra for maior que 500 atribui um desconto de 20%.
        if (v > 500) {
            System.out.printf("Sua compra teve 20% de desconto: %.2f\n", (v * 0.80));
        } 
        //Se o valor da compra for maior que 200 atribui um desconto de 10%.
        else if (v > 200) {
            System.out.printf("Sua compra teve 10% de desconto: %.2f\n", (v * 0.90));
        } 
        //Se o valor da compra for menor não recebe desconto.
        else {
            System.out.printf("Sua compra não teve desconto: %.2f\n", v);
        }

        sc.close();
    }
}
 //Fiz um codigo de uma calculadora na qual:Se for acima de R$ 200, aplique 10% de desconto. Se for acima de R$ 500, aplique 20%. Exiba o valor final.       
        
               
    
    

