package oo.heranca.desafio;

public class Ferrari extends Carro {
    
    @Override
    void acelerar() {   
        
        if (velocidadeAtual >= 360) {
            System.out.println("Limite de velocidade atingido.");
        } else {
            velocidadeAtual += 15;
        }   
    }
    
    @Override
    void frear() {
        
        if (velocidadeAtual <= 0) {
            System.out.println("A ferrari está parada.");
        } else {
            velocidadeAtual -= 15;
        }
    }
}
