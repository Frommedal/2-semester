package opgave_1;

public class P12_1 {
	public int width;
	public int height;
	
	public P12_1(int width, int height) {
		this.width = width;
        this.height = height;
	}
	
	public int getArea() {
		if (width <= 0) {
			return 0; 
			}
		else if (width == 1) { 
			return height; 
			}
		else { 
			P12_1 t = new P12_1(this.width -1 , this.height);
			return this.height + t.getArea();
			}
	}
	public static void main(String[] args) {
        P12_1 rectangle = new P12_1(10, 7);
        System.out.println("Area of rectangle is: " + rectangle.getArea());
    }
}
