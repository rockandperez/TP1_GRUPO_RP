package ejercicio1;

public class Empleado {
	
	// PROPIEDADES
	private static int contador = 999; 
	private final int id;
	private String nombre;
	private int edad;
	
	// CONSTRUCTOR VACIO
	public Empleado() {

        this.id = tomaId();
        this.nombre = "sin nombre";
        this.edad = 99;
		
	}
	
	public Empleado(String nombre, int edad) {

		this.id = tomaId();
		this.nombre = nombre;
		this.edad = edad;
	}
	

	//TO_STRING()
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	//SETTERS Y GETTERS
	public int getId() {
		return id;
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
        return contador+1;
    }
	
    public static int tomaId() {
        return ++contador;
    }

	
}
