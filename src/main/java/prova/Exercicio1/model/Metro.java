package prova.Exercicio1.model;

import java.util.ArrayList;

public class Metro {
    private ArrayList<Carro> Carros;

    public Metro() {
        Carros = new ArrayList<Carro>();
    }

    public ArrayList<Carro> getCarros() {
        return Carros;
    }

    public int getNumeroDeCarros() {
        return Carros.size();
    }

    public void adicionarCarro(int lotacao) {
        Carro carro = new Carro();
        carro.setLotacao(lotacao);

        if(verificarValidadeDoValorInserido(lotacao)) {
            if (Carros.size() < 6)
                carro.setNivelDeOcupacao(definirNivelDeOcupacaoDoCarro(lotacao));
                Carros.add(carro);
        }
        else
            System.out.println("Valor Inválido");
    }

    public boolean verificarValidadeDoValorInserido(int lotacao) {
        if (lotacao < 0)
            return false;

        if (lotacao > 250)
            return false;

        return true;
    }

    public String definirNivelDeOcupacaoDoCarro(int lotacao) {
        if (lotacao < 51) return "Azul";

        if (lotacao < 101) return("Amarela");

        if (lotacao < 151)  return("Laranja");

        if(lotacao < 252) return "Vermelha";

        return "Nível inválido";
    }
}
