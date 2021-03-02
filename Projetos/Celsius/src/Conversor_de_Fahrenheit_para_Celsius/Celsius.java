package Conversor_de_Fahrenheit_para_Celsius;

public class Celsius {
public static void main (String[] args) {
		
		float Fahrenheit;
		float Celsius;
		
		Fahrenheit = 80.6f;
		Celsius = (Fahrenheit - 32) / 1.8f;
		
		System.out.print("A temperatura hoje está de " + Celsius + " Graus Celsius");
}

}
