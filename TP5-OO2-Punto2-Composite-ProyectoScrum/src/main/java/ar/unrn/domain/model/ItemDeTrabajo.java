package ar.unrn.domain.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ItemDeTrabajo implements Item {

	private List<Item> tareas;

	public ItemDeTrabajo() {
		super();
		this.tareas = new ArrayList<Item>();
	}

	public void agregar(Item item) {
		Objects.requireNonNull(item);
		this.tareas.add(item);
	}

	public double tiempoEstimado() {
		double tiempoEstimado = 0;

		for (Item item : tareas) {
			tiempoEstimado += item.tiempoEstimado();
		}

		return tiempoEstimado;
	}
}
