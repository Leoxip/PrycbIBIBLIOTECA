package upeu.edu.pe.library.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Detalle_prestamo {

	private int iddetalle_prestamo;
	private int idprestamo;
	private int idlibro;
}
