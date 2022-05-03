package prova.Exercicio1;

import prova.Exercicio1.model.Carro;
import prova.Exercicio1.model.Metro;

import java.util.Scanner;

public class Exercicio1 {
    Metro metro = new Metro();

    public Exercicio1() {
        InformarOcupacaoDoCarro();
        ExibirCarros();
    }

    public void InformarOcupacaoDoCarro() {
        Scanner scanner = new Scanner(System.in);

        while(metro.getNumeroDeCarros() < 6){
            System.out.println("Informe a ocupacao atual do carro");
            metro.adicionarCarro(scanner.nextInt());
        }

        scanner.close();
    }

    private void ExibirCarros() {
        int Acumulador = 1;

        for (Carro carro : metro.getCarros()) {
            System.out.println("Carro número: " + Acumulador + "\nLotação: " + carro.getLotacao() + "\nNível de ocupação: " + carro.getNivelDeOcupacao());
            System.out.println("\n\n");
            Acumulador = Acumulador + 1;
        }
    }
}
