package ar.unrn.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import ar.unrn.domain.model.TareaComponent;
import ar.unrn.domain.model.HistoriaDeUsuarioTareaComponent;
import ar.unrn.domain.model.SpikeTareaComponent;
import ar.unrn.domain.model.ProtectoScrum;
import ar.unrn.domain.model.ItemTareaComponent;

class PruebasUnitarias {

	@Test
	void proyectoScrumConUnaHistoriaDeUsuarioYUnaSpike() {
		TareaComponent historiaDeUsuario = new HistoriaDeUsuarioTareaComponent();
		historiaDeUsuario.agregar(new ItemTareaComponent(2));

		TareaComponent spike = new SpikeTareaComponent(4);

		List<TareaComponent> listaItemDeTrabajo = new ArrayList<TareaComponent>();
		listaItemDeTrabajo.add(historiaDeUsuario);
		listaItemDeTrabajo.add(spike);

		ProtectoScrum proyecto = new ProtectoScrum("proyecto", listaItemDeTrabajo);

		assertEquals(6.0, proyecto.tiempoEstimado());
	}

	@Test
	void calcularTiempoEstimadoDeHistoriaDeUsuarioConMultiplesTareas() {
		TareaComponent historiaDeUsuario = new HistoriaDeUsuarioTareaComponent();
		historiaDeUsuario.agregar(new ItemTareaComponent(2));
		historiaDeUsuario.agregar(new ItemTareaComponent(5));
		historiaDeUsuario.agregar(new ItemTareaComponent(5));

		assertEquals(12.0, historiaDeUsuario.tiempoEstimado());
	}

}
