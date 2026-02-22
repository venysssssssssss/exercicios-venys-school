package venolas2;
import java.util.Scanner;
public class Venolas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //um radar acima de 80km/h=multado.71-80("atenção:proximo limite) abaixo 71("boa viag
        
        System.out.println("A quantos km/h o carro passou?");       
        double vel = sc.nextDouble();
        if (vel>=80){
            System.out.print("Multado");            
        }
        else if (vel>70){
            System.out.print("Atenção: proximo de limite de velocidade.");
        }
        else {
            System.out.print("Boa viagem!!!");
        }
    }
    
}
//Fiz um codigo no qual um radar fiscaliza a velocidade do carro que passar por ele. ao passar acima de 80 print("multado"),entre 71-80 print("atenção"), abaixo print("boa viagem")