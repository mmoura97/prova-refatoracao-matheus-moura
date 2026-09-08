package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class SistemaPrincipal {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();
        v1.individuo = "Carlos";
        v1.pl = "ABC-1234";
        v1.gas = -10; // X PERIGO: Valores negativos permitidos!
        v1.adicionar(50);
        v1.gasta(100); // X PERIGO: Consome mais que o disponivel!
        System.out.println("Dono: " + v1.individuo + " | Placa: " + v1.pl + " | Gasolina: " + v1.gas);
    }
}