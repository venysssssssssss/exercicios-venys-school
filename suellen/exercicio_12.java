/*12. **O Contador Persistente (While):** Crie um programa que peça uma senha e não pare de pedir até que a senha correta "python123" seja  */
import java.util.Scanner;

public class exercicio_12{
    public static void main(String[] args) {
        System.out.print("Insira uma senha: ");
        Scanner senha = new Scanner(System.in);
        String sen = senha.nextLine();

        while(sen.equals("python123")){
            System.out.print("Insira uma senha: ");
        }
        
    }
}