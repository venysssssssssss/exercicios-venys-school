package venolas15;
public class Venolas15 {
public static void main(String[] args) {       
       //Busca de Múltiplos (For): Exiba todos os números múltiplos de 5 entre 1 e 100.
       System.out.println("Numeros multiplos de 5 entre 1 e 100.");
             
       for (int i = 1; i <= 100; i++){ 
        //toda conta que a divisão por 5 for 0 o multiplicador sera imprimido.       
           if (i % 5 ==0){               
               System.out.println(i);
           }
       }
           
    }
    
}
