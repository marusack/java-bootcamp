
public class MyPoint {
		private int x;
		private int y;
		
		public MyPoint(){
			this.setX(0);
			this.setY(0);
		}
		public MyPoint(int x, int y){
			this.setX(x);
			this.setY(y);
		}
		
		public String toString(){
			return("("+this.getX()+" , "+this.getY()+")");
		}
		
		public void setXY(int x, int y){
			this.setX(x);
			this.setY(y);
		}
		
		public double distance(int x, int y){
			
			double distance = Math.sqrt(Math.pow(x - this.getX(),2)+ Math.pow(y - this.getY(),2));
		
			return distance;
		}
		public double distance(MyPoint another){
			int x = another.getX();
			int y = another.getY();
			
			double distance = Math.sqrt(Math.pow(x - this.getX(),2)+ Math.pow(y - this.getY(),2));
			return distance;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}
}
