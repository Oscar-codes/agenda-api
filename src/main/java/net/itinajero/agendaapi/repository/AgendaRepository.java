package net.itinajero.agendaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.itinajero.agendaapi.entity.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Integer> {

}
