package br.com.alura.loja.http;

//import java.net.URL;
//import java.net.URLConnection;
import java.util.Map;

public class JavaHTTPClient implements HTTPAdapter {

	@Override
	public void post(String url, Map<String, Object> dados) {
		try {
//			URL urlDaAPI = new URL(url);
//			URLConnection connection = urlDaAPI.openConnection();
//			connection.connect();
			System.out.println("Chamando api externa");
		} catch (Exception e) {
			throw new RuntimeException("Erro ao enviar requisição HTTP", e);
		}
	}
}
