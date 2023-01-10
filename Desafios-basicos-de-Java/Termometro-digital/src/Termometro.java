import java.util.Scanner;

public class Termometro{
    
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite a temperatura que deseja saber outras unidades de medida: ");
    Double Celsius = scan.nextDouble();
    Double Kelvin = Celsius + 273.15;
    Double Reamur =  Celsius * 0.8;
    Double Rankine = (Celsius * 1.8) + 32 + 459.67;
    Double Fahrenheit = (Celsius * 1.8) + 32;
    System.out.println("A temperatura em graus Celsius é: " + Celsius + " graus Celsius\n");
    System.out.println("A temperatura em graus Kelvin é: " + Kelvin + " graus Kelvin\n");
    System.out.println("A temperatura em graus Reamur é: " + Reamur + " graus Reamur\n");
    System.out.println("A temperatura em graus Rankine é: " + Rankine + " graus Rankine\n");
    System.out.println("A temperatura em graus Fahrenheit é: " + Fahrenheit + " graus Fahrenheit");
    scan.close();
}


} 