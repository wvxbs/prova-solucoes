package prova.Exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {
    ArrayList<Integer> Numeros;

    public Exercicio2() {
        this.Numeros = new ArrayList<Integer>();
        InserirNumero();
        ExibirQTDNumerosPares();
        ExibirQTDNumerosImpares();
    }

    private boolean ValidarNumero(int numero) {
        if(numero < 0) return false;

        if(numero > 100) return false;

        return true;
    }

    public void InserirNumero() {
        Scanner scanner = new Scanner(System.in);
        int Acumulador = 1;
        int EntradaDoUsuario = 0;

        while (Numeros.size() < 20) {
            System.out.println("Insira o " + Acumulador + " número");
            EntradaDoUsuario = scanner.nextInt();

            if(ValidarNumero(EntradaDoUsuario)) {
                Numeros.add(EntradaDoUsuario);
                Acumulador = Acumulador + 1;
            }
            else
                System.out.println("Número invalido");
        }

        scanner.close();
    }

    private boolean VerificarSeONumeroEhPar(int numero) {
        if (numero % 2 == 0)
            return true;

        return false;
    }

    private void ExibirQTDNumerosPares() {
        int Acumulador = 0;

        for (int numero : Numeros) {
            if (VerificarSeONumeroEhPar(numero)) {
                Acumulador = Acumulador + 1;
            }
        }

        System.out.println("Quantidade de números pares: " + Acumulador);
    }

    private void ExibirQTDNumerosImpares() {
        int Acumulador = 0;

        for (int numero : Numeros) {
            if (!VerificarSeONumeroEhPar(numero)) {
                Acumulador = Acumulador + 1;
            }
        }

        System.out.println("Quantidade de números impares " + Acumulador);
    }
}
