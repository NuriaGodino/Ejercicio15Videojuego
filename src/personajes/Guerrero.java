package personajes;

import armas.Arco;
import armas.Espada;

public class Guerrero extends Personaje{
	
	private Integer fuerza = 10;

	public Integer getFuerza() {
		return fuerza;
	}

	public void setFuerza(Integer fuerza) {
		this.fuerza = fuerza;
	}

	@Override
	public void esAtacado(Integer da�o) {
				
	}
	
	@Override
	public void atacar(Personaje p) {
		int da�o = this.getArma().da�oReal();
		
		if(this.getArma() instanceof Espada || this.getArma() instanceof Arco) {
			da�o += fuerza;
			p.setSalud(p.getSalud()-da�o);
		}else {
			da�o += da�o + 0;
			p.setSalud(p.getSalud()-da�o);
		}
	}


}
