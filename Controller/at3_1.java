package Controller;

public class at3_1 {

	public static void main(String[] args) {
		

	}

	public int algarismos(int a, int i) {
		//Quando o valor passado for igual a 0 a função se encerra
		if (a == 0) {
			return i;
		}
		else {
			
			i += 1;
			
		return algarismos(a /= 10, i);
		}
	
	}
	
}
