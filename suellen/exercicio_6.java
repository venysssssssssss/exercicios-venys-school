/*6. **Média Acadêmica:** Receba duas notas. Se a média for 7 ou mais, "Aprovado". Entre 5 e 6.9, "Recuperação". Abaixo de 5, "Reprovado". */

import java.util.Scanner;

public class exercicio_6{
    public static void main(String[] args) {
        System.out.println("Insira a sua primeira nota: ");
        Scanner nota1 = new Scanner(System.in);
        float n1 = nota1.nextFloat();

        System.out.println("Insira a sua segunda nota: ");
        Scanner nota2 = new Scanner(System.in);
        float n2 = nota2.nextFloat();

        float media;
        media = (n1 + n2)/2;
        System.out.println("Sua média é "+ media);

        if(media >= 7){
            System.out.println("Aprovado!");
        }else if(media >= 5 && media < 6.9){
            System.out.println("Recuperação.");
        }else{
            System.out.println("Reprovado");
        }

    }
}