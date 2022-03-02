package main.strategy;



public class ComandoSacar implements Comando{


    @Override
    public void acao() {
        System.out.println("Processando...");
        System.out.println("Realizando saque...");
        System.out.println("Saque realizado com sucesso");
        System.out.println("Imprimindo extrato!");


    }
}
