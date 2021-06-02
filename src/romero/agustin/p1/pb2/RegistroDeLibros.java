package romero.agustin.p1.pb2;

public class RegistroDeLibros {
	int i=0;
	int contadorDePrestamosTotal=0;
	private String nombreAlumno;
	private String apellidoAlumno;
	public String nombreLibro;
	public Boolean estadoLibro;
	private Integer[] identificadorPrestamo;
	private String[] alumnoQueSolicitoPrestamo;
	private String [] libroSolicitado;
	
	public RegistroDeLibros(String nombreAlumno, String apellidoAlumno, String nombreLibro) {
		this.nombreAlumno=nombreAlumno;
		this.apellidoAlumno=apellidoAlumno;
		this.nombreLibro=nombreLibro;
		estadoLibro=true;
	}

	
	public void guardarDatosDePrestamosEnArray(String nombre, String apellido, String nombreLibro) {
		
		if(identificadorPrestamo[i]==null && alumnoQueSolicitoPrestamo[i] == null && libroSolicitado[i] == null) {
			identificadorPrestamo[i]=((Integer)(i+4));
			alumnoQueSolicitoPrestamo[i]=(nombre+apellido);
			libroSolicitado[i]=nombreLibro;
			estadoLibro=false;
			contadorDePrestamosTotal++;
			i++;
		}
	}
	

}
