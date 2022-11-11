package oo.heranca.desafio.espelho;

public class TesteCarro {

    public static void main(String[] args) {
        
        Carro c1 = new Civic();
        Lamborghini c2 = new Lamborghini();
        
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        
        System.out.println(c1);
        
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        
        System.out.println(c1);
        
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        
        System.out.println(c2);
        
        c2.frear();
        c2.frear();
        
        System.out.println(c2);
    }
}
