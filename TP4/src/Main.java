
public class Main {
	
	public static Boolean Collision(Balle b, Balle b2){
		double d2 = (b.getPosX()-b2.getPosX())*(b.getPosX()-b2.getPosX()) + (b.getPosY()-b2.getPosY())*(b.getPosY()-b2.getPosY());
					   if (d2 > (b.getRayon() + b2.getRayon())*(b.getRayon() + b2.getRayon()))
					      return false;
					   else
					      return true;
	}

	
	 static public void main(String [] args) throws InterruptedException {
		 
		 Espace terre = new Espace();
		 
		 Balle b = new Balle(15.0f, 45.0f, 0.0f,0.0f, 2.0f);
		 Balle b2 = new Balle(20.0f, 40.0f, 0.0f,0.0f, 2.0f);
		 StdDraw.setXscale(0.0,terre.getTailleX());
		 StdDraw.setYscale(0.0,terre.getTailleY());
		 
		 while(true) {
			 
			 StdDraw.clear();
			 StdDraw.setPenColor(StdDraw.BLUE);
			 StdDraw.filledCircle(b.getPosX(), b.getPosY(), b.getRayon());
			 
			 StdDraw.setPenColor(StdDraw.RED);
			 StdDraw.filledCircle(b2.getPosX(), b2.getPosY(), b2.getRayon());
			 
			 Boolean col = Collision(b, b2);
			 
			 b.majPosition(terre,col);
			 b2.majPosition(terre,col);
			 
			 if (Collision(b,b2)){
				 
			 }
			 
			 StdDraw.show(30);
			 
		 }
	 }
}
