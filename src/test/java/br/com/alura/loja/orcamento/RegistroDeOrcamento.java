package br.com.alura.loja.orcamento;

import java.util.Map;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.http.HTTPAdapter;
import lombok.AllArgsConstructor;

//Utilização do pattern Adapter. O principal objetivo em utilizar esse padrão é a abstração dos detalhes da comunicação HTTP.
@AllArgsConstructor
public class RegistroDeOrcamento {
	
	private HTTPAdapter http;

	public void registrar(Orcamento orcamento) {
		
		if(!orcamento.isFinalizado()) {
			throw new DomainException("Orçamento não finalizado");
		}
		
		//Essa url é fictícia, visto que a finalidade da aplicação é a aplicação de padrões de projeto
		String url = "http://api....";
		
		Map<String, Object> dados = Map.of(
				"valor", orcamento.getValor(),
				"quantidadeItens", orcamento.getQuantidadeItens());
		
		http.post(url, dados);
	}
}
