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

import net.itinajero.agendaapi.entity.Contacto;
import net.itinajero.agendaapi.service.IContactoService;

@RestController
@RequestMapping("/api")
public class ContactoController {

	@Autowired
	private IContactoService serviceContacto;

	@GetMapping("/contacto")
	public List<Contacto> BuscarTodos() {
		return serviceContacto.buscarTodos();
	}

	@PostMapping("/contacto")
	public Contacto guardar(@RequestBody Contacto contacto) {
		serviceContacto.guardar(contacto);
		return contacto;
	}

	@PutMapping("/contacto")
	public Contacto modificar(@RequestBody Contacto contacto) {
		serviceContacto.guardar(contacto);
		return contacto;
	}

	@DeleteMapping("/cita/{id_contacto}")
	public String eleminar(@PathVariable("id_contacto") int id_contacto) {
		serviceContacto.eliminar(id_contacto);
		return "Registro Eliminado";
	}
}
