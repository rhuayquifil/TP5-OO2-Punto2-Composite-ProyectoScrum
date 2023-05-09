package ar.unrn.domain.model;

import java.util.List;

public class ProtectoScrum {

	private String nombre;
	private List<TareaComponent> listaItemDeTrabajo;

	public ProtectoScrum(String nombre, List<TareaComponent> listaItemDeTrabajo) {
		super();
		this.nombre = nombre;
		this.listaItemDeTrabajo = listaItemDeTrabajo;
	}

	public double tiempoEstimado() {
		double tiempoEstimado = 0;

		for (TareaComponent item : listaItemDeTrabajo) {
			tiempoEstimado += item.tiempoEstimado();
		}

		return tiempoEstimado;
	}

}
