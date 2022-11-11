package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		
		Monstro monstro = new Monstro();
		monstro.y = 10;
		monstro.x = 10;
//		j1.andar(Direcao.NORTE);
//		j1.andar(Direcao.NORTE);
		
		Heroi heroi = new Heroi();
		heroi.y = 10;
		heroi.x = 11;
				
		System.out.println("Monstro tem: " + monstro.vida + " PV.");
		System.out.println("Heroi tem: " + heroi.vida + " PV.");
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.OESTE);
		
		// Heroi nao consegue mais atacar
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Monstro tem: " + monstro.vida + " PV.");
		System.out.println("Heroi tem: " + heroi.vida + " PV.");
	}
}




