package ejercicio1;

public class Principal {

	public static void main(String[] args) {

		Empleado emp1 = new Empleado("Facundo",23);
		
		Empleado emp2 = new Empleado();
		emp2.setNombre("Juan");
		emp2.setEdad(38);
		
		Empleado emp3 = new Empleado("Rosa", 41);
		
        Empleado emp4 = new Empleado();
        emp4.setNombre("Fabian");
        emp4.setEdad(45);
        Empleado emp5 = new Empleado("Cristian", 24);

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        System.out.println(emp5);

		
		System.out.println("El proximo ID es: " + Empleado.devuelveProximoID());
	}
}