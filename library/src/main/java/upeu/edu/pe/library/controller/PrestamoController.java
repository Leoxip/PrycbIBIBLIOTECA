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

import upeu.edu.pe.library.entity.Prestamo;
import upeu.edu.pe.library.service.PrestamoService;

@RestController
@RequestMapping("/api/prestamo")
public class PrestamoController {

	@Autowired
	private PrestamoService prestamoService;
	
	@GetMapping("/all")
	public List<Map<String, Object>> listar(){
		return prestamoService.readAll2();
		
	}
	@GetMapping("/{id}")
	public Prestamo read(@PathVariable int id) {
		return prestamoService.read(id);
	}
	
	
	@PostMapping("/save")
	public int guardar(@RequestBody Prestamo prestamo) {
		return prestamoService.create(prestamo);
		
	}
	
	@PutMapping("/update")
	public int update(@PathVariable int id, @RequestBody Prestamo prestamo){
		
		Prestamo p = prestamoService.read(id);
		p.setFecha_devolucion("2022-09-22");
		return prestamoService.update(prestamo);
	}
	
	@DeleteMapping("/del/{id}")
	public int save(@PathVariable int id) {
		return prestamoService.delete(id);
	}
}
