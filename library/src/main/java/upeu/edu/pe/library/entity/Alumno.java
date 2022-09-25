package upeu.edu.pe.library.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {
  
	private int idalumno;
	private  String nombre;
	private  String apellido;
	private  String telefono;
	
}
