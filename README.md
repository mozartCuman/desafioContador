# DESAFIO CONTADOR DIO

## Descrição do Projeto

  O **DESAFIO CONTADOR DIO** é um projeto em **Java** que utiliza os fundamentos de **Programação Orientada a Objetos (POO)**.
  Ele foi desenvolvido como um desafio para implementar funcionalidades relacionadas à contagem e ao gerenciamento de uma lista de 
pessoas, com foco em boas práticas de código e estruturação.

---

## Funcionalidades
- **Adicionar pessoas** com atributos como número, nome e valores associados.
- **Exibir a lista de pessoas** cadastradas, de forma interativa e legível.
- **Gerar números sequenciais** automáticos para identificar cada pessoa registrada.
- **Contagem entre dois valores** com validações específicas.
- **Interface simples e funcional** com menu interativo.
- **Tratamento de exceções** para garantir estabilidade e prevenir entradas inválidas.

---

## Estrutura do Projeto

O projeto segue o paradigma de Orientação a Objetos e está organizado em várias classes:

- **Contador.java**: Implementa a lógica de contagem dinâmica.
- **Control.java**: Gerencia as operações da lista de pessoas, incluindo adição e recuperação.
- **N1InvalidoException.java**: Classe de exceção personalizada para validação de entradas.
- **Pessoas.java**: Representa as pessoas cadastradas com seus atributos e métodos.
- **Principal.java**: Classe principal que contém o menu interativo e o ponto de entrada do programa.
- **Sobre.java**: Exibe informações sobre o desenvolvedor.

---

## Uso

Aqui está um exemplo de como o programa pode ser utilizado:

1. **Adicionar nova pessoa**:
   - O programa solicita o nome, número 1 (N1) e número 2 (N2).
   - Exemplo de entrada:
     ```
     Nome: João
     N1: 5
     N2: 10
     ```

2. **Exibir a lista de pessoas**:
   - O programa retorna uma listagem com os atributos de cada pessoa cadastrada.
   - Exemplo de saída:
     ```
     Pessoas [numero=1, nome=João, n1=5, n2=10]
     Pessoas [numero=2, nome=Maria, n1=8, n2=15]
     ```

3. **Contagem dinâmica**:
   - O programa realiza uma lógica de contagem usando `N1` e `N2`, informando os números entre esses valores.
   - Exemplo de contagem para `N1=3` e `N2=7`:
     ```
     Contando de 3 até 7: 3, 4, 5, 6, 7
     ```

4. **Tratamento de exceções**:
   - Se valores inválidos forem inseridos, o programa exibe mensagens de erro e solicita nova entrada.

---
## Como Executar

1. Clone o repositório:
    ```bash
    git clone https://github.com/mozartCuman/DESAFIOCONTROLEFLUXO.git
    ```

2. Abra o projeto em um IDE como **IntelliJ IDEA**, **Eclipse**, ou outro de sua preferência.

3. Compile os arquivos `.java`:
    ```bash
    javac Principal.java
    ```

4. Execute o programa:
    ```bash
    java Principal
    ```

5. Navegue pelas opções do menu exibidas no console para:
   - Adicionar pessoas à lista.
   - Exibir as informações cadastradas.
   - Realizar a contagem de números.

## Agradecimentos

Este projeto foi uma oportunidade incrível para aprender e aplicar os fundamentos de **POO em Java** de forma prática. 
Quero agradecer a todos que me apoiaram direta ou indiretamente durante o desenvolvimento deste desafio, seja com feedback, motivação ou compartilhando conhecimento.

Reconheço que ainda há muito a melhorar, mas cada linha de código escrita é um passo em direção ao aprendizado constante.
Se este projeto puder inspirar ou ajudar alguém, já terá cumprido um dos seus principais objetivos.

Sinta-se à vontade para sugerir melhorias, tirar dúvidas ou colaborar. A jornada do conhecimento é sempre melhor quando trilhada em conjunto. 😊

## Sobre mim

Projeto desenvolvido por: **Mozart Cuman**

- **Email:** [mozartcumana@gmail.com](mailto:mozartcumana@gmail.com)
- **GitHub:** [Mozart Cuman](https://github.com/mozartCuman)
- **LinkedIn:** [Mozart Cuman Albuquerque](https://www.linkedin.com/in/mozart-cuman-albuquerque/)
