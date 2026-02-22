/*5. **Triângulo Impossível:** Receba três lados de um triângulo. Para existir, a soma de dois lados deve ser sempre maior que o terceiro. 
Verifique se os valores formam um triângulo. */
import java.util.Scanner;

public class exercicio_5{
    public static void main(String[] args) {
        System.out.println("---Forme um triângulo---");
        System.out.print("Digite o valor de 'a': " );
        Scanner lado_a = new Scanner(System.in);
        int a = lado_a.nextInt();
        System.out.print("Digite o valor de 'b': " );
        Scanner lado_b = new Scanner(System.in);
        int b = lado_b.nextInt();
        System.out.print("Digite o valor de 'c': " );
        Scanner lado_c = new Scanner(System.in);
        int c = lado_c.nextInt();

        if(a + b > c || b + c > a || a + c > b){
            System.out.println("Você formou um triângulo!");
        }else{
            System.out.println("Você não formou um triângulo.");
        }
    }
}

