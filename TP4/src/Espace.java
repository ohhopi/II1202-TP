
public class Espace {
	private float tailleX, tailleY, gravite, vent,temps;
	
	public Espace() {
		tailleX = 50;
		tailleY = 50; // murs
		gravite = -9.81f;
		temps= 0.1f;
		vent = -0.5f;
	}
	
	public Espace(float tailleX, float tailleY, float gravite, float vent, float temps) {
		this.tailleX = tailleX;
		this.tailleY = tailleY;
		this.gravite = gravite;
		this.temps = temps;
		this.vent = vent;
				
	}	
	
	public float getGravite() {
		return gravite;
	}
	public float getVent() {
		return vent;
	}
	public float getTemps() {
		return temps;
	}

	public float getTailleY() {
		return tailleY;
	}

	public float getTailleX() {
		return tailleX;
	}
}
