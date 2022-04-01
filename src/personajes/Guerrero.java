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
	public void esAtacado(Integer daño) {
				
	}
	
	@Override
	public void atacar(Personaje p) {
		int daño = this.getArma().dañoReal();
		
		if(this.getArma() instanceof Espada || this.getArma() instanceof Arco) {
			daño += fuerza;
			p.setSalud(p.getSalud()-daño);
		}else {
			daño += daño + 0;
			p.setSalud(p.getSalud()-daño);
		}
	}


}
