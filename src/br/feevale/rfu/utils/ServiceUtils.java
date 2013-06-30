package br.feevale.rfu.utils;

import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientResponse;

@SuppressWarnings("deprecation")
public class ServiceUtils {

	public static <T> T request(String path, Class<T> returnType) {
		return request(path, null, returnType);
	}
	
	public static <T> T request(String path, Object o, Class<T> returnType) {
		ClientResponse<T> response = null;
		try {
			ClientRequest request = new ClientRequest(String.format("%s%s", System.getProperty("ws.url"), path));
			
			if (o != null) {
				request.body("application/xml", o);
			}
			
			request.accept(MediaType.APPLICATION_XML);
			
			response = request.post(returnType);
			return response.getEntity();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if (response != null) {
				response.close();
			}
		}
	}
	
}
