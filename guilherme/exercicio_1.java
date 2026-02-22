package venolas1;
import java.util.Scanner;
public class Venolas1 {
    // crie um codigo que pergunte se a pessoa tem +de 18 anos se nao pergunte se tem convite
    public static void main(String[] args) {
        //criei um objt Scanner
        Scanner sc = new Scanner(System.in);
        //criei prints para nome
        System.out.print("Digite seu nome:");
        String nome = sc.nextLine();
        //criei esse print para idade
        System.out.print("Digite sua idade:");
        int id = sc.nextInt();
        //Scanner para limpar o buffer e receber o proximo valor
        sc.nextLine();
        //criei um print para pergunta
        System.out.println("Voce tem convite?(sim/nao)");
        //criei scan para capturar a resposta 
        String tem_convite = sc.nextLine();     
        //criei uma condição onde valida se a idade é menor de 18 e verifica se a variavel tem convite é nao minusculo ou Nao maiusculo
        //&& representa "e". "||" representa ou. "equals" representa "==".
        if (id<18 && tem_convite.equals("nao") || tem_convite.equals("NAO")){
            System.out.print("Recusado");
        }
        //se e menor que 18 e tem convite ou é maior que 18 aprovado
        else {
             System.out.print("Aprovado");
                    }
            sc.close();
        }
    }
//Codigo que faz a verificação de idade e se tem ou não um convite                                                                                                                                          
               
        
        
        
        
  
    
    

