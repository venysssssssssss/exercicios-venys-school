package venolas4;
import java.util.Scanner;
public class Venolas4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // "admin" e a senha é "1234". Exiba "Acesso concedido" ou "Falha na segurança".

        //Fiz print dos dados e criei objetos correspondentes(cuidado com a ordem!!!).
        System.out.print("Digite seu usuario:");
        String name = sc.nextLine();  
        System.out.print("Digite a senha:");
        String s = sc.nextLine();
        
        //Atribui que o "name" é admin e somente admin.        
        if (name.equals("admin") && s.equals("1234")){
            System.out.print("Acesso concedido");
        }
        //se a senha não for ("1234").
        else {       
            System.out.print("Acesso negado");
        }
        
    }
    
}
//Verifique se o usuário é "admin" e a senha é "1234". Exiba "Acesso concedido" ou "Falha na segurança".
//Leve em conta a ordem das variaveis!!