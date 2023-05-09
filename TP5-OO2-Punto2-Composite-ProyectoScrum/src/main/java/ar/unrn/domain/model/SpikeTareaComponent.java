package ar.unrn.domain.model;

public class SpikeTareaComponent implements TareaComponent {

	private int tiempoEstimado;

	public SpikeTareaComponent(int tiempoEstimado) {
		this.tiempoEstimado = tiempoEstimado;
	}

	@Override
	public void agregar(TareaComponent item) {
	}

	@Override
	public double tiempoEstimado() {
		return tiempoEstimado;
	}

}
