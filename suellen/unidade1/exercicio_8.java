/*8. **Classificação de Atleta:** Dada a idade: 5-10 (Infantil), 11-17 (Juvenil), 18+ (Sênior). */

import java.util.Scanner;

public class exercicio_8{
    public static void main(String[] args) {
        System.out.println("Insira a sua idade: ");
        Scanner idade = new Scanner(System.in);
        int id = idade.nextInt();

        if(id >= 5 && id <= 10){
            System.out.println("Atleta infantil");
        }else if(id >= 11 && id <=17){
            System.out.println("Atleta juvenil");
        }else if(id >= 18 && id <= 65){
            System.out.println("Atleta sênior");
        }else{
            System.out.println("Você não tem idade para competir");
        }
    }
}