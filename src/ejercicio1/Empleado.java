package ejercicio1;

public class Empleado {
	
	// PROPIEDADES
	private static int contador = 1000; 
	private int id;
	private String nombre;
	private int edad;
	
	// CONSTRUCTOR VACIO
	public Empleado() {
	        this.id = contador++;
	        this.nombre = "sin nombre";
	        this.edad = 99;
		
	}
	
	public Empleado(String nombre, int edad) {
		
	}

	//SETTERS Y GETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// METODO QUE NOS DEVUELVE EL PROXIMO ID
    public static int devuelveProximoID() {
        return contador;
    }
	

	
}
