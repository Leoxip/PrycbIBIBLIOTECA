package upeu.edu.pe.library.daoimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


import upeu.edu.pe.library.dao.Operaciones;
import upeu.edu.pe.library.entity.Prestamo;

@Component
public class PrestamoDaoimpl implements Operaciones<Prestamo> {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Prestamo t) {
		// TODO Auto-generated method stub
		String SQL="INSERT INTO prestamo (idprestamo, idalumno, idempleado, fecha_prestamo, fecha_devolucion) values(0,?,?, now(), curdate())";
		return jdbcTemplate.update(SQL, t.getIdalumno(), t.getIdempleado());
	}

	@Override
	public int update(Prestamo t) {
		// TODO Auto-generated method stub
		String SQL="UPDATE prestamo SET fecha_prestamo = ? WHERE(idprestamo=?)";
		return jdbcTemplate.update(SQL, t.getFecha_prestamo(), t.getFecha_devolucion(), t.getIdprestamo());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL="DELETE FROM prestamo WHERE idprestamo = ?";
		return jdbcTemplate.update(SQL, id);
	}

	@Override
	public Prestamo read(int id) {
		// TODO Auto-generated method stub
		try {
			Prestamo Pres = jdbcTemplate.queryForObject("SELECT * FROM prestamo WHERE idprestamo=?",
		    BeanPropertyRowMapper.newInstance(Prestamo.class), id);
			return Pres;
			}catch(IncorrectResultSizeDataAccessException e){
				return null;
			}

	}

	@Override
	public List<Prestamo> reAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM prestamo",
				BeanPropertyRowMapper.newInstance(Prestamo.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String SQL  = "SELECT * FROM biblioteca.prestamo";
		return jdbcTemplate.queryForList(SQL);
	}
} 
