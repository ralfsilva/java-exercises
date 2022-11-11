package oo.heranca.desafio.espelho;

public class Lamborghini extends Carro {

    Lamborghini() {
        super(311);
    }
    
    Lamborghini(int velocidadeMaxima) {
        super(velocidadeMaxima);
        delta = 20;
    }
    
//    @Override
//    void acelerar() {
//        velocidadeAtual += 15;
//    }
}
