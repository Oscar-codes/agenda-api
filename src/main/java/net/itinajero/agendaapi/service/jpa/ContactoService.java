package net.itinajero.agendaapi.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.itinajero.agendaapi.entity.Contacto;
import net.itinajero.agendaapi.repository.ContactoRepository;
import net.itinajero.agendaapi.service.IContactoService;

@Service
public class ContactoService implements IContactoService {

	@Autowired
	private ContactoRepository repoContacto;

	@Override
	public List<Contacto> buscarTodos() {
		return repoContacto.findAll();
	}

	@Override
	public void guardar(Contacto contacto) {
		repoContacto.save(contacto);

	}

	@Override
	public void eliminar(int id_contacto) {
		repoContacto.deleteById(id_contacto);

	}

}
