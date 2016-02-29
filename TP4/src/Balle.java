
public class Balle {
	
	private float posX, posY, vX, vY, rayon;
	
	public Balle(float posX, float posY, float vX, float vY, float rayon) {
		this.posX = posX;
		this.posY = posY;
		this.vX = vX;
		this.vY = vY;
		this.rayon = rayon;
	}
	
	
	public void majPosition(Espace spc, Boolean col) {
		
		col = col != null ? col : false;
		
		vX = (spc.getVent() * spc.getTemps()) + vX;
		vY = (spc.getGravite() * spc.getTemps()) + vY;
		
		if (col){
			vY = -vY;
			vX = -vX;
			
			posY = posY + (vY * spc.getTemps());
			posX = posX + (vX * spc.getTemps());
		}else{
			
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
