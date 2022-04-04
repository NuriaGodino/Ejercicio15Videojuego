package juego;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import armas.Arco;
import armas.Arma;
import armas.Espada;
import armas.Hechizos;
import armas.Rezos;
import personajes.Curandero;
import personajes.Guerrero;
import personajes.Mago;
import personajes.Personaje;

public class main {

	public static void main(String[] args) {

		List<Arma> arma = creacionDeArmas();
		List<Personaje> personajes = creacionPersonajes();

		System.out.println("Bienvenidos al juego MArvel RPG");
		Scanner sc = new Scanner(System.in);
		boolean fin = false;

		new main().elegirTuPersonaje();
		int opciones = sc.nextInt();
		switch (opciones) {
		case 1:
			System.out.println("El personaje elegido es: " + personajes.get(0).getNombre());  
			new main().elegirTuContrincante();
			int opciones2 = sc.nextInt();
			switch (opciones2) {
			case 1:
				System.out.println("El personaje elegido es: " + personajes.get(0).getNombre());  
				new main().combate(personajes.get(0), personajes.get(0));
				break;
			case 2:
				System.out.println("El personaje elegido es: " + personajes.get(1).getNombre()); 
				new main().combate(personajes.get(0), personajes.get(1));
				break;
			case 3:
				System.out.println("El personaje elegido es: " + personajes.get(2).getNombre()); 
				new main().combate(personajes.get(0), personajes.get(2));
				break;
			case 4:
				System.out.println("El personaje elegido es: " + personajes.get(3).getNombre()); 
				new main().combate(personajes.get(0), personajes.get(3));
				break;
			case 5:
				System.out.println("El personaje elegido es: " + personajes.get(4).getNombre()); 
				new main().combate(personajes.get(0), personajes.get(4));
				break;
			}
			break;
		case 2:
			System.out.println("El personaje elegido es: " + personajes.get(1).getNombre()); 
			new main().elegirTuContrincante();
			opciones2 = sc.nextInt();
			switch (opciones2) {
			case 1:
				System.out.println("El personaje elegido es: " + personajes.get(0).getNombre());  
				new main().combate(personajes.get(1), personajes.get(0));
				break;
			case 2:
				System.out.println("El personaje elegido es: " + personajes.get(1).getNombre()); 
				new main().combate(personajes.get(1), personajes.get(1));
				break;
			case 3:
				System.out.println("El personaje elegido es: " + personajes.get(2).getNombre()); 
				new main().combate(personajes.get(1), personajes.get(2));
				break;
			case 4:
				System.out.println("El personaje elegido es: " + personajes.get(3).getNombre()); 
				new main().combate(personajes.get(1), personajes.get(3));
				break;
			case 5:
				System.out.println("El personaje elegido es: " + personajes.get(4).getNombre()); 
				new main().combate(personajes.get(1), personajes.get(4));
				break;
			}
			break;
		case 3:
			System.out.println("El personaje elegido es: " + personajes.get(2).getNombre()); 
			new main().elegirTuContrincante();
			opciones2 = sc.nextInt();
			switch (opciones2) {
			case 1:
				System.out.println("El personaje elegido es: " + personajes.get(0).getNombre());  
				new main().combate(personajes.get(2), personajes.get(0));
				break;
			case 2:
				System.out.println("El personaje elegido es: " + personajes.get(1).getNombre()); 
				new main().combate(personajes.get(2), personajes.get(1));
				break;
			case 3:
				System.out.println("El personaje elegido es: " + personajes.get(2).getNombre()); 
				new main().combate(personajes.get(2), personajes.get(2));
				break;
			case 4:
				System.out.println("El personaje elegido es: " + personajes.get(3).getNombre()); 
				new main().combate(personajes.get(2), personajes.get(3));
				break;
			case 5:
				System.out.println("El personaje elegido es: " + personajes.get(4).getNombre()); 
				new main().combate(personajes.get(2), personajes.get(4));
				break;
			}
			break;
		case 4:
			System.out.println("El personaje elegido es: " + personajes.get(3).getNombre()); 
			new main().elegirTuContrincante();
			opciones2 = sc.nextInt();
			switch (opciones2) {
			case 1:
				System.out.println("El personaje elegido es: " + personajes.get(0).getNombre());  
				new main().combate(personajes.get(3), personajes.get(0));
				break;
			case 2:
				System.out.println("El personaje elegido es: " + personajes.get(1).getNombre()); 
				new main().combate(personajes.get(3), personajes.get(1));
				break;
			case 3:
				System.out.println("El personaje elegido es: " + personajes.get(2).getNombre()); 
				new main().combate(personajes.get(3), personajes.get(2));
				break;
			case 4:
				System.out.println("El personaje elegido es: " + personajes.get(3).getNombre()); 
				new main().combate(personajes.get(3), personajes.get(3));
				break;
			case 5:
				System.out.println("El personaje elegido es: " + personajes.get(4).getNombre()); 
				new main().combate(personajes.get(3), personajes.get(4));
				break;
			}
			break;
		case 5:
			new main().elegirTuContrincante();
			opciones2 = sc.nextInt();
			switch (opciones2) {
			case 1:
				System.out.println("El personaje elegido es: " + personajes.get(0).getNombre());  
				new main().combate(personajes.get(4), personajes.get(0));
				break;
			case 2:
				System.out.println("El personaje elegido es: " + personajes.get(1).getNombre()); 
				new main().combate(personajes.get(4), personajes.get(1));
				break;
			case 3:
				System.out.println("El personaje elegido es: " + personajes.get(2).getNombre()); 
				new main().combate(personajes.get(4), personajes.get(2));
				break;
			case 4:
				System.out.println("El personaje elegido es: " + personajes.get(3).getNombre()); 
				new main().combate(personajes.get(4), personajes.get(3));
				break;
			case 5:
				System.out.println("El personaje elegido es: " + personajes.get(4).getNombre()); 
				new main().combate(personajes.get(4), personajes.get(4));
				break;
			}
			System.out.println("El personaje elegido es: " + personajes.get(4).getNombre()); 
			break;
		}

		// Armas
		/*
		 * Arma a1 = new Arco(); Arma a2 = new Espada();
		 * 
		 * a1.setDañoMax(10); a2.setDañoMax(25); // Creo personajes Personaje p1 = new
		 * Guerrero(); Personaje p2 = new Mago();
		 * 
		 * p1.setArma(a1); p1.setNombre("Nuria"); p1.setSalud(2000);
		 * 
		 * p2.setArma(a2); p2.setNombre("Godinus"); p2.setSalud(100);
		 * 
		 * new main().combate(p1, p2);
		 */

	}

	private static List<Arma> creacionDeArmas() {
		List<Arma> armas = new ArrayList<Arma>();

		Arma a1 = new Espada();
		Arma a2 = new Rezos();
		Arma a3 = new Hechizos();
		Arma a4 = new Arco();
		Arma a5 = new Rezos();

		a1.setDañoMax(10);
		a2.setDañoMax(10);
		a3.setDañoMax(10);
		a4.setDañoMax(10);
		a5.setDañoMax(10);

		armas.add(a1);
		armas.add(a2);
		armas.add(a3);
		armas.add(a4);
		armas.add(a5);

		return armas;
	}

	private static List<Personaje> creacionPersonajes() {
		List<Personaje> personajes = new ArrayList<Personaje>();

		Personaje p1 = new Guerrero();
		Personaje p2 = new Curandero();
		Personaje p3 = new Mago();
		Personaje p4 = new Curandero();
		Personaje p5 = new Mago();

		p1.setArma(creacionDeArmas().get(0));
		p1.setNombre("Peter Parker");
		p1.setSalud(200);

		p2.setArma(creacionDeArmas().get(1));
		p2.setNombre("Viuda Negra");
		p2.setSalud(200);

		p3.setArma(creacionDeArmas().get(2));
		p3.setNombre("Capitan America");
		p3.setSalud(200);

		p4.setArma(creacionDeArmas().get(3));
		p4.setNombre("Iron Man");
		p4.setSalud(200);

		p5.setArma(creacionDeArmas().get(4));
		p5.setNombre("Dr Strange");
		p5.setSalud(200);

		personajes.add(p1);
		personajes.add(p2);
		personajes.add(p3);
		personajes.add(p4);
		personajes.add(p5);

		return personajes;
	}

	private void elegirTuPersonaje() {
		System.out.println("Elige tu personaje:");
		System.out.println("1-Peter Parker");
		System.out.println("2-Viuda Negra");
		System.out.println("3-Capitán America");
		System.out.println("4-Iron Man");
		System.out.println("5-Dr Strange");
	}
	
	private void elegirTuContrincante() {
		System.out.println("Elige tu contrincante:");
		System.out.println("1-Peter Parker");
		System.out.println("2-Viuda Negra");
		System.out.println("3-Capitán America");
		System.out.println("4-Iron Man");
		System.out.println("5-Dr Strange");
	}

	private void combate(Personaje p1, Personaje p2) {
		while (p1.getSalud() > 0 && p2.getSalud() > 0) {
			p1.atacar(p2);
			p2.atacar(p1);
		}

		if (p1.getSalud() <= 0) {
			System.out.println("El ganador ha sido " + p2.getNombre());
		} else if (p2.getSalud() <= 0) {
			System.out.println("El ganador ha sido " + p1.getNombre());
		}
	}
}
