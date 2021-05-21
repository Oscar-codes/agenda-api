package net.itinajero.agendaapi.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.itinajero.agendaapi.entity.Agenda;
import net.itinajero.agendaapi.repository.AgendaRepository;
import net.itinajero.agendaapi.service.IAgendaService;

@Service
public class AgendaService implements IAgendaService {

	@Autowired
	private AgendaRepository repoAgenda;

	@Override
	public List<Agenda> buscarTodos() {
		return repoAgenda.findAll();
	}

	@Override
	public void guardar(Agenda agenda) {
		repoAgenda.save(agenda);
	}

	@Override
	public void eliminar(int id) {
		repoAgenda.deleteById(id);

	}

}
