package upeu.edu.pe.library.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prestamo {

	private int idprestamo;
	private int idalumno;
	private int idempleado;
	private  String fecha_prestamo;
	private  String fecha_devolucion;
}
