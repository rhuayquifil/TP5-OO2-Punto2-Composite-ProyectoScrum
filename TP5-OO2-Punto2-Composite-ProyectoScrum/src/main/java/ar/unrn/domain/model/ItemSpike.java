package ar.unrn.domain.model;

public class ItemSpike implements Item {

	private int tiempoEstimado;

	public ItemSpike(int tiempoEstimado) {
		this.tiempoEstimado = tiempoEstimado;
	}

	@Override
	public void agregar(Item item) {
	}

	@Override
	public double tiempoEstimado() {
		return tiempoEstimado;
	}

}
