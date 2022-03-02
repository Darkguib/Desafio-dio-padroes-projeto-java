package main.strategy;


public class ComandoDeposito implements  Comando {

        public void acao() {
            System.out.println("Processando...");
            System.out.println("Realizando depósito...");
            System.out.println("Depósito realizado com sucesso");
            System.out.println("Imprimindo extrato!");


        }

}