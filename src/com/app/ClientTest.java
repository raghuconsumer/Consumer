package com.app;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClientTest {
	public static void main(String[] args) {
		String url = "http://localhost:8082/Provider/rest/msg/show";

		// 1.Create One Empty Client Object:
		Client c = Client.create();
		// 2.Add 'URL' to Client Object:
		WebResource wr = c.resource(url);
		// 3.Make Request call:
		ClientResponse cr = (ClientResponse) wr.delete(ClientResponse.class);
		// 4.Read Entity from ClientResponse object:
		String str = (String) cr.getEntity(String.class);
		// 5.Print Entity:
		System.out.println(str);
		System.out.println(cr.getStatus());
		System.out.println(cr.getStatusInfo());
	}// main()

}// class
