# 🚀 Guia de Lógica de Programação para Iniciantes

Este repositório contém anotações, referências e exercícios práticos sobre os fundamentos da programação, focando em estruturas de controle e operadores.

---

## 🧠 Conteúdo Teórico

### 1. Operadores Lógicos
Os operadores lógicos são usados para combinar expressões booleanas (Verdadeiro/Falso). Eles são a base para a tomada de decisão no código.
- **AND (E):** Retorna verdadeiro apenas se ambas as condições forem verdadeiras.
- **OR (OU):** Retorna verdadeiro se pelo menos uma das condições for verdadeira.
- **NOT (NÃO):** Inverte o estado lógico (o que é verdadeiro vira falso).

📺 **Aula Recomendada:** [Operadores Lógicos e Relacionais - Curso em Vídeo](https://www.youtube.com/watch?v=gMaDhkN9W_A)

---

### 2. Condicionais (if, else e elif)
As estruturas condicionais permitem que o programa execute diferentes blocos de código dependendo de uma condição específica.
- **if:** "Se" a condição for verdade, faça isso.
- **else:** "Caso contrário", faça aquilo.

📺 **Aula Recomendada:** [Condicionais (Parte 1) - Curso em Vídeo](https://www.youtube.com/watch?v=K10u3XIf1-Q)

---

### 3. Estrutura de Repetição `while`
O `while` (enquanto) é utilizado quando queremos que um bloco de código se repita enquanto uma condição for verdadeira. É ideal para quando não sabemos exatamente quantas vezes o ciclo deve rodar.

📺 **Aula Recomendada:** [Repetições (Parte 1) - Curso em Vídeo](https://www.youtube.com/watch?v=L267WcaL7n8)

---

### 4. Estrutura de Repetição `for`
O `for` (para) é geralmente usado quando sabemos previamente a quantidade de iterações ou quando queremos percorrer uma sequência (como uma lista ou um intervalo de números).

📺 **Aula Recomendada:** [Repetições (Parte 2) - Curso em Vídeo](https://www.youtube.com/watch?v=cL4YDtFnCt4)

---

## 📝 Lista de Exercícios (Desafios de Lógica)

1. **O Segredo da Portaria:** Crie um programa que receba a idade de um visitante e se ele tem convite (sim/não). Ele só entra se for maior de 18 **OU** se tiver o convite.
2. **Radar da Avenida:** Um carro passou a $X$ km/h. Se for acima de 80, exiba "Multado!". Se for entre 71 e 80, exiba "Atenção: Limite Próximo". Abaixo disso, "Boa viagem".
3. **Calculadora de Desconto:** Peça o valor da compra. Se for acima de R$ 200, aplique 10% de desconto. Se for acima de R$ 500, aplique 20%. Exiba o valor final.
4. **Login de Sistema:** Verifique se o usuário é "admin" e a senha é "1234". Exiba "Acesso concedido" ou "Falha na segurança".
5. **Triângulo Impossível:** Receba três lados de um triângulo. Para existir, a soma de dois lados deve ser sempre maior que o terceiro. Verifique se os valores formam um triângulo.
6. **Média Acadêmica:** Receba duas notas. Se a média for 7 ou mais, "Aprovado". Entre 5 e 6.9, "Recuperação". Abaixo de 5, "Reprovado".
7. **Par ou Ímpar:** O clássico. Receba um número e diga se ele é par ou ímpar usando o operador de resto (`%`).
8. **Classificação de Atleta:** Dada a idade: 5-10 (Infantil), 11-17 (Juvenil), 18+ (Sênior).
9. **Conversor de Temperatura:** Pergunte ao usuário se ele quer converter de C para F ou F para C, e faça o cálculo baseado na escolha.
10. **Aumento Salarial:** Se ganha até R$ 1500, aumento de 15%. Se ganha mais, 10%.
11. **Ano Bissexto:** Verifique se um ano é bissexto (divisível por 4 e não por 100, ou divisível por 400).
12. **O Contador Persistente (While):** Crie um programa que peça uma senha e não pare de pedir até que a senha correta "python123" seja digitada.
13. **Menu de Opções (While):** Exiba um menu: [1] Somar, [2] Subtrair, [3] Sair. O programa deve rodar até o usuário digitar 3.
14. **Tabuada Automática (For):** Peça um número e exiba a tabuada dele de 1 a 10 usando a estrutura `for`.
15. **Busca de Múltiplos (For):** Exiba todos os números múltiplos de 5 entre 1 e 100.