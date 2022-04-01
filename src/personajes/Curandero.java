package personajes;

import armas.Rezos;

public class Curandero extends Personaje {

	private int sabiduria = 10;

	@Override
	public void atacar(Personaje p) {
		int daño = this.getArma().dañoReal();

		if (this.getArma() instanceof Rezos) {
			daño += sabiduria;
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
