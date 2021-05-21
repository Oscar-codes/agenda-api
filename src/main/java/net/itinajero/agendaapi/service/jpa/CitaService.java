package net.itinajero.agendaapi.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.itinajero.agendaapi.entity.Cita;
import net.itinajero.agendaapi.repository.CitaRepository;
import net.itinajero.agendaapi.service.ICitaService;

@Service
public class CitaService implements ICitaService {

	@Autowired
	private CitaRepository repoCita;

	@Override
	public List<Cita> buscarTodos() {
		return repoCita.findAll();
	}

	@Override
	public void guardar(Cita cita) {
		repoCita.save(cita);

	}

	@Override
	public void eliminar(int id_cita) {
		repoCita.deleteById(id_cita);

	}

}
