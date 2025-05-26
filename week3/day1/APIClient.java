package week3.day1;

public class APIClient {
	
	public void sendRequest()
	{
		System.out.println("Send Request method without argument execution");
	}
	
	public void sendRequest(String endpoint)
	{
		System.out.println("The endpoint is "+endpoint);
	}
	
	public void sendRequest(String endPoint, String requestBody, Boolean requestStatus)
	{
		System.out.println("The endpoint is "+endPoint+"\n"+"The Request body is "+requestBody+"\n"+"The request status is "+requestStatus);
	}
	
	
	
	public static void main(String[] args) {
		
		APIClient api = new APIClient();
		api.sendRequest();
		api.sendRequest("Create Contact");
		api.sendRequest("Edit Contact", "contact_name=Jai",false );
		api.sendRequest("Create Lead");
		api.sendRequest("Edit Lead","lead_age=25",true);
		
	}

}
