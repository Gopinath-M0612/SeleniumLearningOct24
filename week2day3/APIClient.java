package learning.week2day3;

public class APIClient {

	String SendRequest(String endPoint)
	{
		System.out.println(endPoint);
		return endPoint;
	}
	
	String SendRequest(String endPoint, String requestBody,boolean requestStatus) {
		System.out.println(endPoint+" "+requestBody+" "+requestStatus);
		return requestBody;
	}
		
	public static void main(String[] args) {
		
		APIClient call = new APIClient();
		call.SendRequest("Request sent");
		call.SendRequest("Requestsent", "Requestbody", false);

	}

}
