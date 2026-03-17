/*10. **Aumento Salarial:** Se ganha até R$ 1500, aumento de 15%. Se ganha mais, 10%. */
import java.util.Scanner;

public class exercicio_10{
    public static void main(String[] args) {
        System.out.println("Insira o valor bruto do seu salário: ");
        Scanner salario_bruto = new Scanner(System.in);
        double sal_b = salario_bruto.nextDouble();
        double aumento;
        double salarioPosAumento;

        if(sal_b <= 1500){
            aumento = sal_b * 0.15;
            salarioPosAumento = sal_b + aumento;
            System.out.println("Sálario após o aumento: "+ salarioPosAumento);
        }else if(sal_b > 1500){
            aumento = sal_b * 0.1;
            salarioPosAumento = sal_b + aumento;
            System.out.println("Sálario após o aumento: "+ salarioPosAumento);
        }
    }
}