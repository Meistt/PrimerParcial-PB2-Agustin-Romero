package romero.agustin.p1.pb2;

public abstract class Libro {
	private Integer codigoLibro;
	private String nombreLibro;
	private String autorLibro;
	
	public Libro(Integer codigoLibro, String nombreLibro, String autorLibro) {
		
		this.codigoLibro=codigoLibro;
		this.nombreLibro=nombreLibro;
		this.autorLibro=autorLibro;
	}

	public Integer getCodigoLibro() {
		return codigoLibro;
	}

	public void setCodigoLibro(Integer codigoLibro) {
		this.codigoLibro = codigoLibro;
	}

	public String getNombreLibro() {
		return nombreLibro;
	}

	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}

	public String getAutorLibro() {
		return autorLibro;
	}

	public void setAutorLibro(String autorLibro) {
		this.autorLibro = autorLibro;
	}
}
