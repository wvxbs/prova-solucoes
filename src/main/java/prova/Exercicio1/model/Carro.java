package prova.Exercicio1.model;

public class Carro {
    private int Lotacao;

    private String NivelDeOcupacao;

    public Carro() {
        Lotacao = 0;
        NivelDeOcupacao = "";
    }

    public int getLotacao() {
        return Lotacao;
    }

    public void setLotacao(int lotacao) {
        Lotacao = lotacao;
    }

    public String getNivelDeOcupacao() {
        return NivelDeOcupacao;
    }

    public void setNivelDeOcupacao(String nivelDeOcupacao) {
        NivelDeOcupacao = nivelDeOcupacao;
    }
}
