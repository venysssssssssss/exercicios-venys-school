/*11. **Ano Bissexto:** Verifique se um ano é bissexto (divisível por 4 e não por 100, ou divisível por 400). */

import java.util.Scanner;

public class exercicio_11{
    public static void main(String[] args) {
        System.out.print("Insira um ano: ");
        Scanner ano = new Scanner(System.in);
        int a = ano.nextInt();

        if(a % 4 == 0 && a % 100 != 0 || a % 400 == 0){
            System.out.println("O ano é bissexto");
        }else{
            System.out.println("O ano não é bissexto");
        }
    }
}