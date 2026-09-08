package br.com.fiapride.model;

public class Veiculo {
    private String motorista;
    private String placa;
    private double nivelCombustivel;

    public void abastecer(double litros) {
    	if (litros > 0) {
    		nivelCombustivel = nivelCombustivel + litros;
    	}else {
    		System.out.println("Erro: Não é possível abastecer valores negativos.");
    	}
    	
    }

    public void consumirCombustivel(double litros) {
        if (litros > 0) {
            if (nivelCombustivel >= litros) {
                nivelCombustivel = nivelCombustivel - litros;
            } else {
                System.out.println("Erro: Combustível insuficiente para este consumo.");
            }
        } else {
            System.out.println("Erro: O valor de consumo deve ser maior que zero.");
        }
    }
    
    
    public String getMotorista() {
    	return motorista;
    }
    
    public void setNivelCombustivel(double litros) {
        if (litros >= 0) {
            nivelCombustivel = litros;
        } else {
            System.out.println("Erro: O nível inicial não pode ser menor que zero.");
        }
    }
}