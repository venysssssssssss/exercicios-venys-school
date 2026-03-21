/*Crie um programa que verifique se três lados formam um triângulo.
- **Regras:** A soma de dois lados deve ser maior que o terceiro lado. */
public class ex8 {
    public static void main(String[] args) {
        float a, b, c;
        a = 15;
        b = 50;
        c = -3;

        if(a + b > c || a + c > b || b + c > a){
            System.out.println("Triângulo formado");
        }else{
            System.out.println("Triângulo não formado");
        }
    }
}
