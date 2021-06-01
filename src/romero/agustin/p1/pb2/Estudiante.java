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

	public boolean pedirPrestadoUnLibro(Boolean estado) {
		
		int contadorPrestamo=0;
		
		if(contadorPrestamo == 0 && estado.equals(false)) {
			estado=Boolean.TRUE;
			contadorPrestamo++;
			return estado;
		}else {
			if(contadorPrestamo==1 && estado.equals(true)) {
				contadorPrestamo++;
				return estado;
			}else {
				estado=false;
				return estado;
			}
		}
	}
	public boolean pedirPrestadoUnSegundoLibro(Boolean estadoRetorno, int segundoPrestamo) {
		if(segundoPrestamo==1 && estadoRetorno.equals(true)) {
			
			estadoRetorno=false;//ya no puede pedir prestado más libros
		}
		return estadoRetorno;
	}
}
