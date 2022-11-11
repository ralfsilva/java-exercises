package oo.heranca.desafio;

public class Corolla extends Carro {
    
    @Override
    void acelerar() {   
        
        if (velocidadeAtual >= 220) {
            System.out.println("Limite de velocidade atingido.");
        } else {
            velocidadeAtual += 10;
        }   
    }
    
    @Override
    void frear() {
        if (velocidadeAtual <= 0) {
            System.out.println("O corolla está parado.");
        } else {
            velocidadeAtual -= 10;
        }
    }
}
