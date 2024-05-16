package Application;
import java.util.Locale;
import java.util.Scanner;
import Util.Calculator;
	
public class Program {
//o 'final' indica que, uma vez o valor declarado, ele não irá mudar
	
	
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
	 
		//função responsavel por calcular a circunferencia e retornar o valor dela
		double c = calc.circumference(radius);
		//função responsavel por calcular o volume
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);
		
		sc.close();
	}
	
}
