package ar.unrn.main;

import java.util.ArrayList;
import java.util.List;

import ar.unrn.domain.model.Item;
import ar.unrn.domain.model.ItemDeTrabajo;
import ar.unrn.domain.model.ItemSpike;
import ar.unrn.domain.model.ProtectoScrum;
import ar.unrn.domain.model.TareaItem;

public class Main {

	public static void main(String[] args) {

		Item historiaDeUsuario = new ItemDeTrabajo();
		historiaDeUsuario.agregar(new TareaItem(2));
		historiaDeUsuario.agregar(new TareaItem(5));

		Item spike = new ItemSpike(4);

		List<Item> listaItemDeTrabajo = new ArrayList<Item>();
		listaItemDeTrabajo.add(historiaDeUsuario);
		listaItemDeTrabajo.add(spike);

		ProtectoScrum proyecto = new ProtectoScrum("proyecto", listaItemDeTrabajo);

		System.out.println(historiaDeUsuario.tiempoEstimado());
		System.out.println(proyecto.tiempoEstimado());
	}

}
