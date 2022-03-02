package main;

import java.util.Scanner;

import static java.lang.System.in;
//@author Guilherme
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        Cliente cliente = new Cliente();

        boolean isRunning = true;//Boolean para uso no looping
        int e;
        System.out.println("Olá bem-vindo(a) ao Banco DIO");
        System.out.println("Para criar uma conta, digite 1, caso queira sair digite 2");
        e = scan.nextInt();
        if (e == 1) {
            //Criação de conta
            System.out.println("Primeiramente digite seu nome: ");
            cliente.setNome(scan.next());
            System.out.println("Agora digite a sua idade: ");
            cliente.setIdade(scan.nextInt());
            System.out.println("Digite o seu sexo: ");
            cliente.setSexo(scan.next());
            System.out.println("Agora digite o seu cpf(qualquer número)");
            cliente.setCpf(scan.nextLong());
            System.out.println("Digite a sua profissão: ");
            cliente.setEmprego(scan.next());
            System.out.println("Digite seu estado cívil: ");
            cliente.setEstadoCivil(scan.next());
           //Finalização da conta
            System.out.println("Muito bem! Sua conta corrente e conta poupança foram criadas com sucesso!");
            Conta contaC = new ContaCorrente(cliente);
            Conta contaP = new ContaPoupanca(cliente);
            System.out.println("Exibindo dados das contas!");
            contaC.imprimirExtrato();
            contaP.imprimirExtrato();
            System.out.println("Caso deseje continuar operando na sua conta digite 1, caso deseje sair, digite 2");
            int escolha;
            escolha = scan.nextInt();
            if(escolha == 1){
                do {
                    //Operações na conta
                    int escolha2;
                    System.out.println("Caso deseje depositar em sua conta corrente, digite 1, caso deseje sacar nela, digite 2");
                    System.out.println("caso deseje transferir para a sua conta poupança, digite 3, caso deseje depositar em sua conta poupança");
                    System.out.println("digite 4, caso deseje sacar na sua conta poupança digite 5, caso deseje transferir para sua conta corrente");
                    System.out.println("digite 6, caso deseje ver os dados de sua conta, digite 7, caso deseje sair, digite 8.");
                    escolha2 = scan.nextInt();
                    switch (escolha2){
                        case 1://Deposito Conta Corrente
                            System.out.println("Digite o valor a ser depositado: ");
                            contaC.depositar(scan.nextDouble());
                            contaC.imprimirExtrato();
                            break;
                        case 2://Saque Conta Corrente
                            System.out.println("Digite o valor a ser sacado: ");
                            contaC.sacar(scan.nextDouble());
                            contaC.imprimirExtrato();
                            break;
                        case 3://Transferência da Conta Corrente para a Conta Poupança
                            System.out.println("Digite o valor a ser transferido: ");
                            contaC.transferir(scan.nextDouble(),contaP);
                            contaC.imprimirExtrato();
                            contaP.imprimirExtrato();
                           break;
                        case 4://Deposito Conta Poupança
                            System.out.println("Digite o valor a ser depositado: ");
                            contaP.depositar(scan.nextDouble());
                            contaP.imprimirExtrato();
                            break;
                        case 5://Saque Conta Corrente
                            System.out.println("Digite o valor a ser sacado: ");
                            contaP.sacar(scan.nextDouble());
                            contaP.imprimirExtrato();
                            break;
                        case 6://Transferência da Conta Poupança para a Conta Corrente
                            System.out.println("Digite o valor a ser transferido: ");
                            contaP.transferir(scan.nextDouble(),contaC);
                            contaP.imprimirExtrato();
                            contaC.imprimirExtrato();
                            break;
                        case 7://Exibir dados do Cliente e extrato das Contas
                            cliente.dadosCliente();
                            contaC.imprimirExtrato();
                            contaP.imprimirExtrato();
                            break;
                        case 8://Encerrar a aplicação do Banco DIO
                            System.out.println("Fechando aplicação");
                            isRunning = false;
                            break;
                        default://Mensagem de erro
                            System.out.println("Erro! Escolha uma opção válida!");
                            break;
                            }
                }while(isRunning);

            }else{
                System.out.println("Fechando aplicação");
            }


        } else
            System.out.println("Fechando aplicação");
    }
}





