package main.strategy;


public class ComandoTransferir implements Comando{

    @Override
    public void acao() {
        System.out.println("Processando...");
        System.out.println("Realizando trasnferência...");
        System.out.println("Transferência realizado com sucesso");
        System.out.println("Imprimindo extrato!");

    }
}
