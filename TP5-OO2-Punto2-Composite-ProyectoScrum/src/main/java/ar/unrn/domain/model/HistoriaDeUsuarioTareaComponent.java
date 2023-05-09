package ar.unrn.domain.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HistoriaDeUsuarioTareaComponent implements TareaComponent {

	private List<TareaComponent> tareas;

	public HistoriaDeUsuarioTareaComponent() {
		super();
		this.tareas = new ArrayList<TareaComponent>();
	}

	public void agregar(TareaComponent item) {
		Objects.requireNonNull(item);
		this.tareas.add(item);
	}

	public double tiempoEstimado() {
		double tiempoEstimado = 0;

		for (TareaComponent item : tareas) {
			tiempoEstimado += item.tiempoEstimado();
		}

		return tiempoEstimado;
	}
}
