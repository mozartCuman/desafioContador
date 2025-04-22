package controleFluxo;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
/*import controleFluxo.Controle;
import controleFluxo.Pessoas;
import java.util.ArrayList;*/

public class Principal {
    Controle control = new Controle();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); 
        Controle control = new Controle(); 

            /*Pessoas p1 = new Pessoas(1, "ricardo", 2, 8);
            p1.visualizar();*/
        
        while (true) {
            
            byte opcao, opcao2 = 0;
            String nome;
            int n1, n2;
            

            System.out.println("Programa de contagem e registro de conto");
            System.out.println("******************************************* \n");
            System.out.println("Para registrar uma contagem pressione [1]");
            System.out.println("Para mais opções pressione [2]");
            System.out.println("Para sair pressione [3]");
            System.out.println();

            opcao = scan.nextByte();
            
            /*try {
                opcao = scan.nextByte(); // Lê a opção escolhida
             catch (InputMismatchException e) {
                System.err.println("Entrada inválida. Por favor, digite um número válido.");
                scan.nextLine(); // Limpa o buffer
                continue;*/
            
           

            switch (opcao) {
                case 1:
                    try {
                        System.out.println("Qual o seu nome?");

                        scan.skip("\\R?"); 
                        nome = scan.nextLine();

                        System.out.println("Digite o primeiro número:");
                        n1 = scan.nextInt();
                        System.out.println("Digite o segundo número:");
                        n2 = scan.nextInt();

                        control.Adicionar(new Pessoas(control.gerarNumero() ,nome, n1, n2));
                       // pessoa.atualizarDados(nome, n1, n2);
                        Contador.contador(n1, n2);
                    } catch (InputMismatchException e) {
                        System.err.println("Entrada inválida. Por favor, insira números corretos.");
                        scan.nextLine(); // Limpa o buffer
                    } catch (N1InvalidoException e) {
                        System.err.println("Erro: " + e.getMessage());
                    }
                    break;
                case 2:
                    
                    System.out.println("***+++ O que deseja??? +++***");

                    System.out.print(" Ver a lista de pessoas [1]: ");
                    opcao2 = scan.nextByte();

                    switch (opcao2){
                        case 1:
                            List<Pessoas> lipe = control.getListaPessoas();
                            for (Pessoas pessoas : lipe) {
                                System.out.println(pessoas);
                            }

                            break;
                    }


                break;

                case 3:
                    System.out.println("Lista de pessoas e suas contagens:");
                    //control.getListaPessoas();
                    scan.close();
                    Sobre.sobre();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        
    }
}