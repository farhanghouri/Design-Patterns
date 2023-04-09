
public class Data {
	private byte msg[];
	private int size;
	
 
	public Data(byte[] msg, int size) {
		this.msg = msg;
		this.size = size;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public byte[] getMsg() {
		return msg;
	}
	public void setMsg(byte msg[]) {
		this.msg = msg;
	}
}
