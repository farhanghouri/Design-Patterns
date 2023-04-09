
public interface PacketBuilder {

	void buildApplicationLayer(byte[] msg, int size);

	void buildTransportLayer();

	void buildNetworkLayer();

	Packet build();
}
