package personajes;

import armas.Arma;

public abstract class Personaje {
	
	private String nombre;
	private Arma arma;
	private Integer salud = 100;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	public Integer getSalud() {
		return salud;
	}
	public void setSalud(Integer salud) {
		if(this.getSalud() > 0) {
			this.salud = salud;
		}else {
			this.salud = 0;
		}
		
	}
	
	public abstract void atacar(Personaje p);
	public abstract boolean esCritico();
	
	public int esquivar() {
		int random = (int) (Math.random()*2); //genera numero aleatorio entre 0 y el 1
		return random;
	}
	
}
