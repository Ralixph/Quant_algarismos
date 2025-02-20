package View;
import javax.swing.JOptionPane;
import Controller.at3_1;
public class Principal3_1 {

	public static void main(String[] args) {
		at3_1 at = new at3_1(); int i = 0;
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));
		
		System.out.println("O número "+x+" possui "+at.algarismos(x, i)+" algarismos");
	}

}
