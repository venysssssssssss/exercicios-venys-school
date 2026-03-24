/*Crie um programa que converta minutos em horas e minutos.
- **Fórmula:** Horas = minutos / 60, Minutos Restantes = minutos % 60 */

import java.text.DecimalFormat;

public class ex10 {
    public static void main(String[] args) {
        double horas, minutos;
        minutos = 85;
        horas = minutos/60;
        DecimalFormat df = new DecimalFormat("#.0");
        String valor_formatado = df.format(horas);

        System.out.println(minutos + " minutos equivalem a " + valor_formatado + " horas");
    }
}