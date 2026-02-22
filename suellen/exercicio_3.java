/*3. **Calculadora de Desconto:** Peça o valor da compra. Se for acima de R$ 200, aplique 10% de desconto. 
Se for acima de R$ 500, aplique 20%. Exiba o valor final. */
import java.util.Scanner;

public class exercicio_3{
    public static void main(String[] args) {

        System.out.println("Insira o valor da compra: ");
        Scanner valor = new Scanner(System.in);
        double vlr = valor.nextDouble();
        double desconto;
        double valor_final;

        if(vlr < 200){
            System.out.println("Desconto indisponível");
        }else if(vlr > 200 && vlr <= 500){
            desconto = vlr * 0.1;
            valor_final = vlr - desconto;
            System.out.println("Valor com desconto: " + valor_final);
        }else if(vlr > 500){
            desconto = vlr * 0.2;
            valor_final = vlr - desconto;
            System.out.println("Valor com desconto: " + valor_final);
        }
    }

}
