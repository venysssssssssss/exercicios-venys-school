/*Escreva um programa que calcule o IMC de uma pessoa e classifique-a como "Abaixo do peso", "Peso normal", ou "Sobrepeso".
- **Fórmula:** IMC = peso (kg) / altura² (m) */
import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner resp = new Scanner(System.in);

        System.out.print("Insira o seu peso: ");
        double ps = resp.nextDouble();
        System.out.print("Insira a sua altura: ");
        double at = resp.nextDouble();

        double imc;
        int expoente = 2;

        imc = ps/Math.pow(at, expoente);

        if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Peso normal");
        }else if(imc >= 25 && imc <= 29.9){
            System.out.println("Acima do peso");
        }else if(imc < 18.5){
            System.out.println("Abaixo do peso");
        }else if(imc >= 30 && imc <= 34.9){
            System.out.println("Obesidade 1");
        }else if(imc >= 35 && imc <= 39.9){
            System.out.println("Obesidade 2");
        }else if(imc >= 40){
            System.out.println("Obesidade 3");
        }

    }
}
