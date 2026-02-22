# Gabarito - 15 Exercicios em Java

Este arquivo traz uma resposta de referencia para cada exercicio.
Cada programa e independente e pode ser salvo no arquivo correspondente em `guilherme/`.

## Exercicio 1 - O Segredo da Portaria
```java
import java.util.Scanner;

public class exercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Tem convite (sim/nao): ");
        String convite = sc.nextLine().trim().toLowerCase();

        if (idade > 18 || convite.equals("sim")) {
            System.out.println("Entrada permitida");
        } else {
            System.out.println("Entrada negada");
        }

        sc.close();
    }
}
```

## Exercicio 2 - Radar da Avenida
```java
import java.util.Scanner;

public class exercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Velocidade (km/h): ");
        int velocidade = sc.nextInt();

        if (velocidade > 80) {
            System.out.println("Multado!");
        } else if (velocidade >= 71) {
            System.out.println("Atencao: Limite Proximo");
        } else {
            System.out.println("Boa viagem");
        }

        sc.close();
    }
}
```

## Exercicio 3 - Calculadora de Desconto
```java
import java.util.Scanner;

public class exercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da compra: ");
        double valor = sc.nextDouble();
        double desconto = 0.0;

        if (valor > 500) {
            desconto = 0.20;
        } else if (valor > 200) {
            desconto = 0.10;
        }

        double valorFinal = valor * (1 - desconto);
        System.out.printf("Valor final: R$ %.2f%n", valorFinal);

        sc.close();
    }
}
```

## Exercicio 4 - Login de Sistema
```java
import java.util.Scanner;

public class exercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Usuario: ");
        String usuario = sc.nextLine();
        System.out.print("Senha: ");
        String senha = sc.nextLine();

        if (usuario.equals("admin") && senha.equals("1234")) {
            System.out.println("Acesso concedido");
        } else {
            System.out.println("Falha na seguranca");
        }

        sc.close();
    }
}
```

## Exercicio 5 - Triangulo Impossivel
```java
import java.util.Scanner;

public class exercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lado A: ");
        double a = sc.nextDouble();
        System.out.print("Lado B: ");
        double b = sc.nextDouble();
        System.out.print("Lado C: ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Forma um triangulo");
        } else {
            System.out.println("Nao forma um triangulo");
        }

        sc.close();
    }
}
```

## Exercicio 6 - Media Academica
```java
import java.util.Scanner;

public class exercicio_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = sc.nextDouble();

        double media = (n1 + n2) / 2;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperacao");
        } else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}
```

## Exercicio 7 - Par ou Impar
```java
import java.util.Scanner;

public class exercicio_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

        sc.close();
    }
}
```

## Exercicio 8 - Classificacao de Atleta
```java
import java.util.Scanner;

public class exercicio_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        if (idade >= 5 && idade <= 10) {
            System.out.println("Infantil");
        } else if (idade <= 17) {
            System.out.println("Juvenil");
        } else if (idade >= 18) {
            System.out.println("Senior");
        } else {
            System.out.println("Idade invalida para classificacao");
        }

        sc.close();
    }
}
```

## Exercicio 9 - Conversor de Temperatura
```java
import java.util.Scanner;

public class exercicio_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Converter de C para F ou F para C? (C/F): ");
        String opcao = sc.nextLine().trim().toUpperCase();

        if (opcao.equals("C")) {
            System.out.print("Temperatura em Celsius: ");
            double c = sc.nextDouble();
            double f = (c * 9 / 5) + 32;
            System.out.printf("Fahrenheit: %.2f%n", f);
        } else if (opcao.equals("F")) {
            System.out.print("Temperatura em Fahrenheit: ");
            double f = sc.nextDouble();
            double c = (f - 32) * 5 / 9;
            System.out.printf("Celsius: %.2f%n", c);
        } else {
            System.out.println("Opcao invalida");
        }

        sc.close();
    }
}
```

## Exercicio 10 - Aumento Salarial
```java
import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Salario atual: ");
        double salario = sc.nextDouble();

        double novoSalario;
        if (salario <= 1500) {
            novoSalario = salario * 1.15;
        } else {
            novoSalario = salario * 1.10;
        }

        System.out.printf("Novo salario: R$ %.2f%n", novoSalario);
        sc.close();
    }
}
```

## Exercicio 11 - Ano Bissexto
```java
import java.util.Scanner;

public class exercicio_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ano: ");
        int ano = sc.nextInt();

        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        if (bissexto) {
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Ano nao bissexto");
        }

        sc.close();
    }
}
```

## Exercicio 12 - O Contador Persistente (While)
```java
import java.util.Scanner;

public class exercicio_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senha;
        do {
            System.out.print("Digite a senha: ");
            senha = sc.nextLine();
        } while (!senha.equals("python123"));

        System.out.println("Senha correta!");
        sc.close();
    }
}
```

## Exercicio 13 - Menu de Opcoes (While)
```java
import java.util.Scanner;

public class exercicio_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("[1] Somar");
            System.out.println("[2] Subtrair");
            System.out.println("[3] Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            if (opcao == 1 || opcao == 2) {
                System.out.print("Primeiro numero: ");
                double a = sc.nextDouble();
                System.out.print("Segundo numero: ");
                double b = sc.nextDouble();

                if (opcao == 1) {
                    System.out.println("Resultado: " + (a + b));
                } else {
                    System.out.println("Resultado: " + (a - b));
                }
            } else if (opcao != 3) {
                System.out.println("Opcao invalida");
            }
        }

        System.out.println("Programa encerrado");
        sc.close();
    }
}
```

## Exercicio 14 - Tabuada Automatica (For)
```java
import java.util.Scanner;

public class exercicio_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        sc.close();
    }
}
```

## Exercicio 15 - Busca de Multiplos (For)
```java
public class exercicio_15 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
```
