package venolas5;
import java.util.Scanner;
public class Venolas5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //triangulo 3 lados. 2 lados maiores que o 3° verifique se os valores formam triangulo
       
        //imprimi cada lado do triangulo.
        System.out.print("Digite o 1 lado do triangulo:");
        int a = sc.nextInt();
        System.out.print("Digite o 2 lado do triangulo:");
        int b = sc.nextInt();
        System.out.print("Digite o 3 lado do triangulo:");
        int c = sc.nextInt();
        //preparei uma variavel para guardar o resultado.
        int r = (a + b + c);
        //fiz todas as possibilidades de soma dos lados.
        if (a + b > c && a + c > b && b + c > a){
          System.out.println("O resultado e:" +r);  
        }
        else{
            System.out.print("Triangulo impossivel");
        }
    }                      
}
    //fiz um triangulo isósceles onde a soma de 2 lados tinham que ser maior do que o terceiro, caso contrario não existiria triangulo.

