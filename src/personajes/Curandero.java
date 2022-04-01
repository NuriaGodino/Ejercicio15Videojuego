package personajes;

import armas.Rezos;

public class Curandero extends Personaje {

	private int sabiduria = 10;

	@Override
	public void atacar(Personaje p) {
		int da�o = this.getArma().da�oReal();

		if (this.getArma() instanceof Rezos) {
			da�o += sabiduria;
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
