package learning.week2day4;

public class JavaConnection implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("Connected");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected");
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execution updated");
	}
	
	public static void main(String[] args) {
		
		JavaConnection call = new JavaConnection();
		call.connect();
		call.disconnect();
		call.executeUpdate();
		
	}

}
