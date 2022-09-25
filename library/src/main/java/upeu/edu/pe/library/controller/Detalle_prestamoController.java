package upeu.edu.pe.library.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.library.entity.Detalle_prestamo;

import upeu.edu.pe.library.service.Detalle_prestamoService;


@RestController
@RequestMapping("/api/detalle_prestamo")
public class Detalle_prestamoController {
	
	@Autowired
	private Detalle_prestamoService detalle_prestamoService;
	
	@GetMapping("/all")
	public List<Map<String, Object>> listar() {
		return detalle_prestamoService.readAll2();
	}
	
	@GetMapping("/{id}")
	public Detalle_prestamo read(@PathVariable int id) {
		return detalle_prestamoService.read(id);
	}
	
	@PostMapping("/save")
	public int guardar(@RequestBody Detalle_prestamo detalle_prestamo){
		return detalle_prestamoService.create(detalle_prestamo);
		
	}
	
	@PutMapping("/update")
	public int update(@PathVariable int id, @RequestBody Detalle_prestamo detalle_prestamo){
		
		Detalle_prestamo d = detalle_prestamoService.read(id);
		d.getIdlibro();
		return detalle_prestamoService.update(detalle_prestamo);
	}
	
	@DeleteMapping("/del/{id}")
	public int save(@PathVariable int id) {
		return detalle_prestamoService.delete(id);
	}

}
