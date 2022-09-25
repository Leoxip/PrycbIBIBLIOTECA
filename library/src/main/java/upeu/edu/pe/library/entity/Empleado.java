package upeu.edu.pe.library.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Empleado {

	private int idempleado;
	private  String usuario;
	private  String clave;
	
}
