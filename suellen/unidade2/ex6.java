/*Crie um programa que calcule a área de um círculo, recebendo o raio.
- **Fórmula:** Área = π * raio² */

/* Math.PI -> valor de PI
Math.pow -> faz a potenciação
Math.round -> aproxima o valor para o mais próximo
 */

public class ex6 {
    public static void main(String[] args) {
        double area;
        double raio = 4;
        int expoente = 2;

        area = Math.PI * Math.pow(raio, expoente);

        System.out.println("A area do circulo é "+ Math.round(area));
    }
    

}
