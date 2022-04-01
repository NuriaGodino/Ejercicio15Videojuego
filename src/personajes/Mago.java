package personajes;

import armas.Hechizos;

public class Mago extends Personaje {

	private int inteligencia = 10;

	@Override
	public void atacar(Personaje p) {
		int daño = this.getArma().dañoReal();

		if (this.getArma() instanceof Hechizos) {
			daño += inteligencia;
			p.setSalud(p.getSalud() - daño);
		} else {
			daño += daño + 0;
			p.setSalud(p.getSalud() - daño);
		}

	}

	@Override
	public void esAtacado(Integer daño) {
		// TODO Auto-generated method stub

	}

}
