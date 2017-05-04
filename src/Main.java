import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;

public class Main {

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		WebTarget itemBase = client
				.target("https://hacker-news.firebaseio.com/v0/")
				.path("item");
		String id = "14265489";
		itemBase = itemBase.path(id + ".json");
		
		itemBase = itemBase.queryParam("print", "pretty");
		Builder request = itemBase.request();
		
		Item response = request.get(Item.class);
		
		System.out.println(response);
	}

}
