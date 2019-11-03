import java.util.Scanner; 
public class Multiplicacion{

	public static void main(String [] args){

		double primerNumero, segundoNumero, tercerNumero, numeroTotal;
		Scanner teclado = new Scanner(System.in);

		System.out.println ("¿Cuál es el primer número?");
		primerNumero = teclado.nextDouble();
		System.out.println ("¿Cuál es el segundo número?");
		segundoNumero = teclado.nextDouble();
		System.out.println ("¿Cuál es el tercer número?");
		tercerNumero = teclado.nextDouble();
		System.out.println(primerNumero + "x" + segundoNumero + "x" + tercerNumero);
		numeroTotal= primerNumero * segundoNumero * tercerNumero;
		System.out.println ("El resultado es" + "\t" + numeroTotal);

	}
}
