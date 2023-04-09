import java.util.ArrayList;
import java.util.List;

public class Packet {
	private List<Layer> layers = new ArrayList<Layer>();

	public List<Layer> getLayers() {
		return layers;
	}

	public void setLayers(List<Layer> layers) {
		this.layers = layers;
	}
	
	public void showLayers() {
		for(Layer layer: layers) {
			System.out.println(layer);
		}
	}
	
}
