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

import net.itinajero.agendaapi.entity.Agenda;
import net.itinajero.agendaapi.service.IAgendaService;

@RestController
@RequestMapping("/api")
public class AgendaController {

	@Autowired
	private IAgendaService serviceAgenda;

	@GetMapping("/agenda")
	public List<Agenda> BuscarTodos() {
		return serviceAgenda.buscarTodos();
	}

	@PostMapping("/agenda")
	public Agenda guardar(@RequestBody Agenda agenda) {
		serviceAgenda.guardar(agenda);
		return agenda;
	}

	@PutMapping("/agenda")
	public Agenda modificar(@RequestBody Agenda agenda) {
		serviceAgenda.guardar(agenda);
		return agenda;
	}

	@DeleteMapping("/agenda/{id}")
	public String Eliminar(@PathVariable("id") int id) {
		serviceAgenda.eliminar(id);
		return "Registro Eliminado";
	}

}
