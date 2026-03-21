/*Escreva um programa que calcule o salário líquido de um funcionário, descontando 10% de imposto.
- **Fórmula:** Salário Líquido = Salário Bruto - (Salário Bruto * 10/100) */
public class ex9 {
    public static void main(String[] args) {
        double salario_bruto = 5977.85;
        double salario_liquido;

        salario_liquido = salario_bruto - (salario_bruto*10/100);
        System.out.println("O salário líquido é "+ Math.round(salario_liquido));

    }
}
