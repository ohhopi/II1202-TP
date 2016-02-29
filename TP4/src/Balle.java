
public class Balle {
	
	public float posX, posY, vX, vY, rayon, masse;
	
	public Balle(float posX, float posY, float vX, float vY, float rayon, float masse) {
		this.posX = posX;
		this.posY = posY;
		this.vX = vX;
		this.vY = vY;
		this.rayon = rayon;
		this.masse = masse;
	}
	
	
	public void majPosition(Espace spc) {
		
		vX = (masse*spc.getVent() * spc.getTemps()) + vX;
		vY = (masse*spc.getGravite() * spc.getTemps()) + vY;
			
		posY = posY + (vY * spc.getTemps());
		posX = posX + (vX * spc.getTemps());
		
		if ((posY - rayon) <= 0 || (posY + rayon) >= spc.getTailleY()) {
			
			if((posY - rayon) <=0)
				posY = rayon; 
			else
				posY = spc.getTailleY() - rayon;
			
			vY = -vY;
		}
		if ((posX - rayon) <= 0.0 || (posX + rayon) >= spc.getTailleX()) {
			if((posX - rayon) <= 0)
				posX = rayon;
			else
				posX = spc.getTailleX() - rayon;	
			vX = -vX;
		}
	} 

	public double getPosX() {
		return posX;
	}


	public double getRayon() {
		return rayon;
	}


	public double getPosY() {
		return posY;
	}

	
	
	
	
	
	
	
	
}
