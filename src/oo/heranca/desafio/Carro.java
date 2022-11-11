package oo.heranca.desafio;

public class Carro {
    
    int velocidadeAtual;
        
    void acelerar() {
        
        if (velocidadeAtual >= 200) {
            System.out.println("Limite de velocidade atingido.");
        } else {
            velocidadeAtual += 5;
        }
    }
    
    void frear() {
        if (velocidadeAtual <= 0) {
            System.out.println("O carro está parado.");
        } else {
            velocidadeAtual -= 5;
        }
    }
}
