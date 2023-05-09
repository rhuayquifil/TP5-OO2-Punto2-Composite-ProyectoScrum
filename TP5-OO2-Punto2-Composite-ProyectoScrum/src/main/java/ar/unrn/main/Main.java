package ar.unrn.main;

import java.util.ArrayList;
import java.util.List;

import ar.unrn.domain.model.TareaComponent;
import ar.unrn.domain.model.HistoriaDeUsuarioTareaComponent;
import ar.unrn.domain.model.SpikeTareaComponent;
import ar.unrn.domain.model.ProtectoScrum;
import ar.unrn.domain.model.ItemTareaComponent;

public class Main {

	public static void main(String[] args) {

		TareaComponent historiaDeUsuario = new HistoriaDeUsuarioTareaComponent();
		historiaDeUsuario.agregar(new ItemTareaComponent(2));
		historiaDeUsuario.agregar(new ItemTareaComponent(5));

		TareaComponent spike = new SpikeTareaComponent(4);

		List<TareaComponent> listaItemDeTrabajo = new ArrayList<TareaComponent>();
		listaItemDeTrabajo.add(historiaDeUsuario);
		listaItemDeTrabajo.add(spike);

		ProtectoScrum proyecto = new ProtectoScrum("proyecto", listaItemDeTrabajo);

		System.out.println(historiaDeUsuario.tiempoEstimado());
		System.out.println(proyecto.tiempoEstimado());
	}

}
