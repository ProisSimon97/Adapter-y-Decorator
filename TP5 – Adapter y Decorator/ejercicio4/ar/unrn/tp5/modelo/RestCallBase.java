package ar.unrn.tp5.modelo;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class RestCallBase implements RestCall {

	private String url;

	public RestCallBase(String url) {
		this.url = url;
	}

	public String run() {

		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder().url(this.url).build();

		try (Response response = client.newCall(request).execute()) {
			return response.body().string();

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void write(String msj) {
		// TODO Auto-generated method stub
		System.out.println(msj);
	}
}