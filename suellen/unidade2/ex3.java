/*Escreva um programa que converta uma temperatura de Celsius para Fahrenheit e vice-versa.
- **Fórmula:** F = C * 9/5 + 32, C = (F - 32) * 5/9 */

public class ex3 {
    
    public static void main(String[] args) {
        float c = 50;
        float f = 100;
        float temp_c, temp_f; 

        temp_f = (c * 9/5) + 32;
        temp_c = (f - 32) * 5/9;

        System.out.println("Temperatura em Celsius: "+ temp_c);
        System.out.println("Temperatura em Fahrenheit: "+ temp_f);
    }
}
