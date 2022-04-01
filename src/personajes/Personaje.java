package personajes;

import armas.Arma;

public abstract class Personaje {
	
	private String nombre;
	private Arma arma;
	private Integer salud;
	
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
		this.salud = salud;
	}
	
	public abstract void atacar(Personaje p);
	
	public abstract void esAtacado(Integer daño);
	
	
}
