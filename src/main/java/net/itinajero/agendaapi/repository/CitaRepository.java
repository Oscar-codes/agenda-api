package net.itinajero.agendaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.itinajero.agendaapi.entity.Cita;

public interface CitaRepository extends JpaRepository<Cita, Integer> {

}
