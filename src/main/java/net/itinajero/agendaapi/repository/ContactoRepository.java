package net.itinajero.agendaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.itinajero.agendaapi.entity.Contacto;

public interface ContactoRepository extends JpaRepository<Contacto, Integer> {

}
