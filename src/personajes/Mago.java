package personajes;

import armas.Hechizos;

public class Mago extends Personaje {

	private int inteligencia = 10;

	@Override
	public void atacar(Personaje p) {
		int da�o = this.getArma().da�oReal();

		if (this.getArma() instanceof Hechizos) {
			da�o += inteligencia;
			p.setSalud(p.getSalud() - da�o);
		} else {
			da�o += da�o + 0;
			p.setSalud(p.getSalud() - da�o);
		}

	}

	@Override
	public void esAtacado(Integer da�o) {
		// TODO Auto-generated method stub

	}

}
