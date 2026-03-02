/*14. **Tabuada Automática (For):** Peça um número e exiba a tabuada dele de 1 a 10 usando a estrutura `for`. */

import java.util.Scanner;

public class exercicio_14{

    public static void main(String[] args) {
        
        Scanner numero = new Scanner(System.in);
        int i, n;
        System.out.println("---Tabuada de multiplicação---");
        System.out.print("Insira um número: ");
        n = numero.nextInt();

        System.out.println();

        for(i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", n, i, (n*i));
        }




        
    }
}