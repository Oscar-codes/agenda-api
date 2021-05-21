package net.itinajero.agendaapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tipo_Contacto")
public class Contacto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_contacto;
	private String tipo;

	public Integer getId_contacto() {
		return id_contacto;
	}

	public void setId_contacto(Integer id_contacto) {
		this.id_contacto = id_contacto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Contacto [id_contacto=" + id_contacto + ", tipo=" + tipo + "]";
	}

}
