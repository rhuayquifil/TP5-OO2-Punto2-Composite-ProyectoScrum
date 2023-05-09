package ar.unrn.domain.model;

public class ItemTareaComponent implements TareaComponent {

	private double tiempoEstimado;

	public ItemTareaComponent(double tiempo) {
		super();
		this.tiempoEstimado = tiempo;
	}

	public double tiempoEstimado() {
		return tiempoEstimado;
	}

	public void agregar(TareaComponent item) {
	}
}
