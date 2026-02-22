/*2. **Radar da Avenida:** Um carro passou a $X$ km/h. Se for acima de 80, exiba "Multado!". 
Se for entre 71 e 80, exiba "Atenção: Limite Próximo". Abaixo disso, "Boa viagem". */

public class exercicio_2 {
    public static void main(String[] args) {
        float km_h = 74;

        if(km_h > 80){
            System.out.println("Ultrapassou o limite permitido! Multado!");
        }else if(km_h >= 71 && km_h <= 80){
            System.out.println("Atenção: Limite de velocidade próximo!");
        }else{
            System.out.println("Boa viagem!");
        }
    }
}