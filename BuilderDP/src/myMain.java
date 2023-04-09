
public class myMain {

	public static void main(String[] args) {
		PacketBuilder reliablePacketBuilder = new ReliablePacketBuilder();
		reliablePacketBuilder.buildApplicationLayer("hello".getBytes(), 5);
		reliablePacketBuilder.buildTransportLayer();
		reliablePacketBuilder.buildNetworkLayer();
		Packet packet = reliablePacketBuilder.build();
	}

}
