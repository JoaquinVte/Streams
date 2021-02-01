package exceptions;

public class E0 {

	public static void main(String[] args) {

		int n = 5;
		int d = 1;

		try {
			System.out.println(divide(n, d));
		} catch (Exception e) {
			System.out.println("No se puede realizar la operacion");
		}

	}

	private static int divide(int numerador, int denominador) throws Exception {

		int division = 0;

		if (denominador == 0)
			throw new Exception("Division por cero");
		else
			division = numerador / denominador;

		return division;

	}

}
