package oo.heranca.desafio;

public class TesteCarro {

    public static void main(String[] args) {
        
        Carro carro1 = new Carro();
        Carro corolla1 = new Corolla();
        
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        
        System.out.println(carro1.velocidadeAtual);
        
        carro1.frear();
        carro1.frear();
        carro1.frear();
        carro1.frear();
        carro1.frear();
        carro1.frear();
        
        System.out.println(carro1.velocidadeAtual);
        
        corolla1.acelerar();
        corolla1.acelerar();
        corolla1.acelerar();
        corolla1.acelerar();
      
        System.out.println(corolla1.velocidadeAtual);
        
        corolla1.frear();
        corolla1.frear();
        corolla1.frear();
        corolla1.frear();
        corolla1.frear();
        
        System.out.println(corolla1.velocidadeAtual);
        
        Ferrari ferrari1 = new Ferrari();
        
        ferrari1.acelerar();
        ferrari1.acelerar();
        ferrari1.acelerar();
        ferrari1.acelerar();
        
        System.out.println(ferrari1.velocidadeAtual);
        
        ferrari1.frear();
        ferrari1.frear();
        ferrari1.frear();
        ferrari1.frear();
        ferrari1.frear();
        
        System.out.println(ferrari1.velocidadeAtual);
    }
}
