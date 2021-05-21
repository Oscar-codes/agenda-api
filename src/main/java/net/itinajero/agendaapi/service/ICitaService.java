package net.itinajero.agendaapi.service;

import java.util.List;

import net.itinajero.agendaapi.entity.Cita;

public interface ICitaService {

	List<Cita> buscarTodos();

	void guardar(Cita cita);

	void eliminar(int id_cita);
}
