package br.com.Projeto02.models;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface ProdutoManager {

	List<Produto> obterTodos();
	
}
