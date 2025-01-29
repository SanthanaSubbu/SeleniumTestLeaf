package week2.day3;

public class APIClient {
	public void sendRequest(String endpoint) {
		System.out.println("Request Sent "+ endpoint);

	}
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
		System.out.println("Request Sent "+ endpoint);
		System.out.println("Request Body "+ requestBody);
		System.out.println("Request Status "+ requestStatus);

	}
	public static void main(String[] args) {
		APIClient a = new APIClient();
		a.sendRequest("yes");
		a.sendRequest("yes","Name",true);

	}

}
