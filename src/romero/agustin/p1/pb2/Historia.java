package romero.agustin.p1.pb2;

import romero.agustin.p1.pb2.interfaces.IHistoria;

public class Historia extends Libro implements IHistoria{

	public Historia(Integer codigoLibro, String nombreLibro, String autorLibro) {
		
		super(codigoLibro, nombreLibro, autorLibro);
	}

	@Override
	public String getImprisionDeLibro(String devolucion, String tipoLibro) {
		
		String devolucionLibro="Puedo ser fotocopiado";
		String devolucionError="No puedo ser fotocopiado";
		
		if(devolucion.equals(devolucionLibro) && tipoLibro.equalsIgnoreCase("Historia")) {
			
			return devolucion;
		}else
			return devolucionError;
	}

	
}
