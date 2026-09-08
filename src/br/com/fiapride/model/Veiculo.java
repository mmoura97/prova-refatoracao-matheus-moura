package br.com.fiapride.model;

public class Veiculo {
    public String individuo;
    public String pl;
    public int gas;

    public void adicionar(int v) {
        gas = gas + v;
    }

    public void gasta(double v) {
        gas = gas - v;
    }
}