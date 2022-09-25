package upeu.edu.pe.library.daoimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.library.dao.Operaciones;
import upeu.edu.pe.library.entity.Detalle_prestamo;



@Component
public class Detalle_prestamoDaoimpl implements Operaciones<Detalle_prestamo> {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Detalle_prestamo t) {
		// TODO Auto-generated method stub
		String SQL="INSERT INTO prestamo (iddetalle_prestamo, idprestamo, idlibro) values(0,?,?)";
		return jdbcTemplate.update(SQL, t.getIdprestamo(), t.getIdlibro());
	}

	@Override
	public int update(Detalle_prestamo t) {
		// TODO Auto-generated method stub
		String SQL="UPDATE detalle_prestamo WHERE(iddetalle_prestamo=?)";
		return jdbcTemplate.update(SQL, t.getIddetalle_prestamo());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL="DELETE FROM detalle_prestamo WHERE iddetalle_prestamo = ?";
		return jdbcTemplate.update(SQL, id);
	}

	@Override
	public Detalle_prestamo read(int id) {
		// TODO Auto-generated method stub
		try {
			Detalle_prestamo Det = jdbcTemplate.queryForObject("SELECT * FROM detalle_prestamo WHERE iddetalle_prestamo=?",
		    BeanPropertyRowMapper.newInstance(Detalle_prestamo.class), id);
			return Det;
			}catch(IncorrectResultSizeDataAccessException e){
				return null;
			}
	}

	@Override
	public List<Detalle_prestamo> reAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM detalle_prestamo",
				BeanPropertyRowMapper.newInstance(Detalle_prestamo.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String SQL  = "SELECT * FROM biblioteca.detalle_prestamo";
		return jdbcTemplate.queryForList(SQL);
	}
	

}
