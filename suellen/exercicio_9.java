/*9. **Conversor de Temperatura:** Pergunte ao usuário se ele quer converter de C para F ou F para C, e faça o cálculo baseado na escolha. */

import java.util.Scanner;

public class exercicio_9{
    public static void main(String[] args) {
        
        System.out.println("1 - Converter para C");
        System.out.println("2 - converter para F");
        
        Scanner opcao = new Scanner(System.in);
        int op = opcao.nextInt();

        float valor_convertido;

        switch (op) {
            case 1:
                System.out.println("Insira um valor: ");
                Scanner valor = new Scanner(System.in);
                float valor_c = valor.nextFloat();

                valor_convertido =  (valor_c*9/5) + 32;
                System.out.println("O valor em F é "+ valor_convertido);
                break;

            case 2:
                System.out.println("Insira um valor: ");
                Scanner valor_f = new Scanner(System.in);
                float f = valor_f.nextFloat();

                valor_convertido =  (f - 32) * 5/9;
                System.out.println("O valor em C é "+ valor_convertido);
                break;
        
            default:
                break;
        }
    }
}
