package learning.week2day4;

public class Concrete implements DatabaseConnection {

	@Override
	public void connect() {
		
		System.out.println("Connected ----> Concrete");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected ----> Concrete");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Updated ----> Execution update");
	}
	
	public static void main(String[] args) {
		
		Concrete call = new Concrete();
		call.connect();
		call.disconnect();
		call.executeUpdate();
	}

}
