package net.itinajero.agendaapi.service;

import java.util.List;

import net.itinajero.agendaapi.entity.Agenda;

public interface IAgendaService {

	List<Agenda> buscarTodos();

	void guardar(Agenda agenda);

	void eliminar(int id);
}
