package Area;

public class Area {
	private double length;
    private double breadth;
	
   public void setDim(double length, double breadth) {
	   this.length = length;
	   this.breadth = breadth;
   }
         
    public double getAreaa() {
    	return length*breadth;
    }
    
    public static void main(String args[]) {
    	Area rectangle = new Area();
    	rectangle.setDim(6.0, 5.0);
    	double area = rectangle.getAreaa();
    	System.out.println("Area of rectangle :" + area);
    }
}
