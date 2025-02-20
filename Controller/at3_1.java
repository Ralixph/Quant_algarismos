package Controller;

public class at3_1 {

	public static void main(String[] args) {
		

	}

	public int algarismos(int a, int i) {
		if (a == 0) {
			return i;
		}
		else {
			
			i += 1;
			
		return algarismos(a /= 10, i);
		}
	
	}
	
}
