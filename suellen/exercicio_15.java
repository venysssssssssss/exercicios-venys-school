/*15. **Busca de Múltiplos (For):** Exiba todos os números múltiplos de 5 entre 1 e 100. */

public class exercicio_15{
    public static void main(String[] args) {
        int i;

        for(i = 1; i <= 100; i++){
            if(i % 5 == 0){
                System.out.println(i);
            }
        }
    }
}