package ar.unrn.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import ar.unrn.domain.model.Item;
import ar.unrn.domain.model.ItemDeTrabajo;
import ar.unrn.domain.model.ItemSpike;
import ar.unrn.domain.model.ProtectoScrum;
import ar.unrn.domain.model.TareaItem;

class PruebasUnitarias {

	@Test
	void proyectoScrumConUnaHistoriaDeUsuarioYUnaSpike() {
		Item historiaDeUsuario = new ItemDeTrabajo();
		historiaDeUsuario.agregar(new TareaItem(2));

		Item spike = new ItemSpike(4);

		List<Item> listaItemDeTrabajo = new ArrayList<Item>();
		listaItemDeTrabajo.add(historiaDeUsuario);
		listaItemDeTrabajo.add(spike);

		ProtectoScrum proyecto = new ProtectoScrum("proyecto", listaItemDeTrabajo);

		assertEquals(6.0, proyecto.tiempoEstimado());
	}

	@Test
	void calcularTiempoEstimadoDeHistoriaDeUsuarioConMultiplesTareas() {
		Item historiaDeUsuario = new ItemDeTrabajo();
		historiaDeUsuario.agregar(new TareaItem(2));
		historiaDeUsuario.agregar(new TareaItem(5));
		historiaDeUsuario.agregar(new TareaItem(5));

		assertEquals(12.0, historiaDeUsuario.tiempoEstimado());
	}

}
