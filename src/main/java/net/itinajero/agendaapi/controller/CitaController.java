package net.itinajero.agendaapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.itinajero.agendaapi.entity.Cita;
import net.itinajero.agendaapi.service.ICitaService;

@RestController
@RequestMapping("/api")
public class CitaController {

	@Autowired
	private ICitaService serviceCita;

	@GetMapping("/cita")
	public List<Cita> BuscarTodos() {
		return serviceCita.buscarTodos();
	}

	@PostMapping("/cita")
	public Cita guardar(@RequestBody Cita cita) {
		serviceCita.guardar(cita);
		return cita;
	}

	@PutMapping("/cita")
	public Cita modificar(@RequestBody Cita cita) {
		serviceCita.guardar(cita);
		return cita;
	}

	@DeleteMapping("/cita/{id_cita}")
	public String eleminar(@PathVariable("id_cita") int id_cita) {
		serviceCita.eliminar(id_cita);
		return "Registro Eliminado";
	}

}
