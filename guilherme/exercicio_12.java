package venolas12;
import java.util.Scanner;
public class Venolas12 {
    public static void main(String[] args) {       
        Scanner sc = new Scanner(System.in);
        //
        String senha = ("");       
        //enquanto senha for diferente de "python123" vai imprimir digite sua senha
        while (!senha.equals("python123")) {
            System.out.print("Digite sua senha: ");
            senha = sc.nextLine(); 
        }
        
        System.out.println("Acesso concedido!");
        
    }
}