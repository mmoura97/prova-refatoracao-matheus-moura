package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class SistemaPrincipal {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();
        
        v1.setNivelCombustivel(-10); 
        v1.abastecer(50);
        v1.consumirCombustivel(100);
        
        System.out.println("Dono do veículo: " + v1.getMotorista());
        
    }
}