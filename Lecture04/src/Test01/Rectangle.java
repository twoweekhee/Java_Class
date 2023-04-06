package Test01;

public class Rectangle {
	int minx;
	int miny;
	int w;
	int h;
	
	Rectangle(int minx, int miny, int w, int h){
		this.minx = minx;
		this.miny = miny;
		this.w = w;
		this.h = h;
	}
		
	void show() {
		System.out.printf("A rectangle with %d * %d at (%d,%d)" ,w, h, minx, miny);
	}
	
	boolean contains(Rectangle r) {
		if((r.minx > this.minx) & (r.minx+r.w < this.minx+this.w) & (r.miny > this.miny ) &(r.miny+r.h < this.miny +this.h)){
			return true;
		}
		
		else {
			return false;
		}
	}
	
	int square() {
		int square = w*h;
		return square;
	}
}

