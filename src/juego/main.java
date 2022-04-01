package juego;

import armas.Arco;
import armas.Arma;
import armas.Espada;
import personajes.Guerrero;
import personajes.Mago;
import personajes.Personaje;

public class main {
	
	public static void main(String[] args) {
		// Armas
		Arma a1 = new Arco();
		Arma a2 = new Espada();
		
		a1.setDañoMax(10);
		a2.setDañoMax(25);
		// Creo personajes
		Personaje p1 = new Guerrero();
		Personaje p2 = new Mago();
		
		p1.setArma(a1);
		p1.setNombre("Nuria");
		p1.setSalud(100);
		
		p2.setArma(a2);
		p2.setNombre("Godinus");
		p2.setSalud(100);
		
		p1.atacar(p2);
		System.out.println(p2.getSalud());
		System.out.println(p1.getSalud());
	}
}

