package net.itinajero.agendaapi.service;

import java.util.List;

import net.itinajero.agendaapi.entity.Contacto;

public interface IContactoService {

	List<Contacto> buscarTodos();

	void guardar(Contacto contacto);

	void eliminar(int id_contacto);
}
