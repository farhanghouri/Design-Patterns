
public class StandardPacketBuilder implements PacketBuilder {
	private ApplicationLayer applicationLayer;
	private TransportLayer transportLayer;
	private NetworkLayer networkLayer;
	
	@Override
	public void buildApplicationLayer(byte msg[],int size) {
		applicationLayer = new ApplicationLayer();
		applicationLayer.setData(new Data(msg, size));
	}
	@Override
	public void buildTransportLayer() {
		transportLayer = new TransportLayer();
		transportLayer.setProtocol(new UDP());
	}
	@Override
	public void buildNetworkLayer() {
		networkLayer  = new NetworkLayer();
		networkLayer.setIp(new IPv4());
	}
	@Override
	public Packet build() {
		Packet packet = new Packet();
		packet.getLayers().add(applicationLayer);
		packet.getLayers().add(transportLayer);
		packet.getLayers().add(networkLayer);
		return packet;
	}

}
