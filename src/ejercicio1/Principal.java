package ejercicio1;

public class Principal {

	public static void main(String[] args) {

		Empleado emp1 = new Empleado("Facundo",23);
		
		Empleado emp2 = new Empleado();
		emp2.setNombre("Juan");
		emp2.setEdad(38);
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		System.out.println("El proximo ID es: " + Empleado.devuelveProximoID());
	}
}