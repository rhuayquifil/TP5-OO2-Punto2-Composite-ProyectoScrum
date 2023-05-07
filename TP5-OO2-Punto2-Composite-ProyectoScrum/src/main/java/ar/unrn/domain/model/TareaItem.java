package ar.unrn.domain.model;

public class TareaItem implements Item {

	private double tiempoEstimado;

	public TareaItem(double tiempo) {
		super();
		this.tiempoEstimado = tiempo;
	}

	public double tiempoEstimado() {
		return tiempoEstimado;
	}

	public void agregar(Item item) {
	}
}
