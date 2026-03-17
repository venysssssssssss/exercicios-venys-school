/***Login de Sistema:** Verifique se o usuário é "admin" e a senha é "1234". Exiba "Acesso concedido" ou "Falha na segurança". */
import java.util.Scanner;

public class exercicio_4{

    public static void main(String[] args) {
       System.out.println("--- Faça Login ---");
       System.out.println("Usuário: ");
       Scanner usuario = new Scanner(System.in);
       String user = usuario.nextLine();
       System.out.println("Senha: ");
       Scanner senha = new Scanner(System.in);
       String password = senha.nextLine();

       if (user.equals("admin") && password.equals("1234")) {
            System.out.print("Acesso concedido!");
       }else{
            System.out.println("Falha na segurança");
       }
    }
    

}