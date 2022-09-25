package upeu.edu.pe.library.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.library.dao.Operaciones;
import upeu.edu.pe.library.daoimpl.PrestamoDaoimpl;
import upeu.edu.pe.library.entity.Prestamo;

@Service
public class PrestamoService implements Operaciones<Prestamo> {

	@Autowired
	private PrestamoDaoimpl doimpl;

	@Override
	public int create(Prestamo t) {
		// TODO Auto-generated method stub
		return doimpl.create(t);
	}

	@Override
	public int update(Prestamo t) {
		// TODO Auto-generated method stub
		return doimpl.update(t);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return doimpl.delete(id);
	}

	@Override
	public Prestamo read(int id) {
		// TODO Auto-generated method stub
		return doimpl.read(id);
	}

	@Override
	public List<Prestamo> reAll() {
		// TODO Auto-generated method stub
		return doimpl.reAll();
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return doimpl.readAll2();
	}
}
