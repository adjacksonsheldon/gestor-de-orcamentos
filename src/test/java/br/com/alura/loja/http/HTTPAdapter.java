package br.com.alura.loja.http;

import java.util.Map;

public interface HTTPAdapter {
	void post(String url, Map<String, Object> dados);
}
