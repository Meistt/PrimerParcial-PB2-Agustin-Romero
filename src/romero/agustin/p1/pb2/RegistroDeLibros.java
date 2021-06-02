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
		this.identificadorPrestamo=new Integer [300];
		this.alumnoQueSolicitoPrestamo=new String [300];
		this.libroSolicitado=new String [300];
	}

	
	public int getContadorDePrestamosTotal() {
		return contadorDePrestamosTotal;
	}


	public void setContadorDePrestamosTotal(int contadorDePrestamosTotal) {
		this.contadorDePrestamosTotal = contadorDePrestamosTotal;
	}


	public void guardarDatosDePrestamosEnArray(String nombre, String apellido, String nombreLibro) {
		String total;
		if(identificadorPrestamo[i] ==null && alumnoQueSolicitoPrestamo[i] == null && libroSolicitado[i] == null) {
			this.identificadorPrestamo[i]=(i);
			this.alumnoQueSolicitoPrestamo[i]=(nombre+apellido);
			this.libroSolicitado[i]=nombreLibro;
			estadoLibro=false;
			contadorDePrestamosTotal++;
			i++;
			
		}
	}


	public Object[] duelvePrestamo(String nombre, String apellido, String string3) {
		String devolucion;
		
		return null;
	}



}
