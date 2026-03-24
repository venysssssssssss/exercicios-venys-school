/*Escreva um programa que aplique um desconto de 10% em um produto.
- **Fórmula:** Valor com Desconto = Valor Original - (Valor Original * 10/100) */
public class ex11 {
    public static void main(String[] args) {
        double valor_produto = 2540;
        double valor_desconto;

        valor_desconto = valor_produto - (valor_produto * 10/100);
        System.out.println("Valor com desconto: "+ valor_desconto);


    }
}