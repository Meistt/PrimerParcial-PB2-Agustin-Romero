package romero.agustin.p1.pb2;

public class Estudiante {
	private Integer dni;
	private String Apellido;
	private String Nombre;
	
	public Estudiante(Integer dni, String Apellido, String Nombre) {
		this.dni=dni;
		this.Apellido=Apellido;
		this.Nombre=Nombre;
	}

	public Integer getDni() {
		
		return dni;
	}

	public void setDni(Integer dni) {
		
		this.dni = dni;
	}

	public String getApellido() {
		
		return Apellido;
	}

	public void setApellido(String apellido) {
		
		Apellido = apellido;
	}

	public String getNombre() {
		
		return Nombre;
	}

	public void setNombre(String nombre) {
		
		Nombre = nombre;
	}
}
