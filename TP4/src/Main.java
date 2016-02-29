
public class Main {
	
	public static void Collision(Balle b, Balle b2){
		double d2 = (b.getPosX()-b2.getPosX())*(b.getPosX()-b2.getPosX()) + (b.getPosY()-b2.getPosY())*(b.getPosY()-b2.getPosY());
		   if (d2 > (b.getRayon() + b2.getRayon())*(b.getRayon() + b2.getRayon())){

			   StdDraw.setPenColor(StdDraw.RED);
			   StdDraw.filledCircle(b2.getPosX(), b2.getPosY(), b2.getRayon());
/*			   float newVX = (b.vX * (b.masse - b2.masse) + (2 * b2.masse * b2.vX))  / (b.masse + b2.masse);
			   float newVY = (b.vY * (b.masse - b2.masse) + (2 * b2.masse * b2.vY))  / (b.masse + b2.masse);
			   float newVX2 = (b2.vX * (b2.masse - b.masse) + (2 * b.masse * b.vX))  / (b2.masse + b.masse);
			   float newVY2 = (b2.vY * (b2.masse - b.masse) + (2 * b.masse * b.vY))  / (b2.masse + b.masse);
			   b.vX = newVX;
			   b.vY = newVY;
			   b2.vX = newVX2;
			   b2.vY = newVY2;   
*/
		   }else{
			   StdDraw.setPenColor(StdDraw.GREEN);
			   StdDraw.filledCircle(b2.getPosX(), b2.getPosY(), b2.getRayon());
		   }
	}

	
	 static public void main(String [] args) throws InterruptedException {
		 
		 Espace terre = new Espace();
		 
		 Balle b = new Balle(15.0f, 45.0f, 0.0f,0.0f, 2.0f,1.0f);
		 Balle b2 = new Balle(20.0f, 40.0f, 0.0f,0.0f, 3.0f,2.0f);
		 StdDraw.setXscale(0.0,terre.getTailleX());
		 StdDraw.setYscale(0.0,terre.getTailleY());
		 
		 while(true) {
			 
			 StdDraw.clear();
			 StdDraw.setPenColor(StdDraw.BLUE);
			 StdDraw.filledCircle(b.getPosX(), b.getPosY(), b.getRayon());
			 
//			 StdDraw.setPenColor(StdDraw.RED);
//			 StdDraw.filledCircle(b2.getPosX(), b2.getPosY(), b2.getRayon());
			 
			 Collision(b, b2);
			 b.majPosition(terre);
			 b2.majPosition(terre);
			 
			 StdDraw.show(30);
			 
		 }
	 }
}
