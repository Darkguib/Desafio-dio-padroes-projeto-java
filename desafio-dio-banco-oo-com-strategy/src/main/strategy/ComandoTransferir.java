package main.strategy;


public class ComandoTransferir implements Comando{

    @Override
    public void acao() {
        System.out.println("Processando...");
        System.out.println("Realizando trasnferĂȘncia...");
        System.out.println("TransferĂȘncia realizado com sucesso");
        System.out.println("Imprimindo extrato!");

    }
}
