package br.com.Projeto02.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.Projeto02.models.ProdutoManager;

@Controller
public class ProdutoController {

	@Autowired
	private ProdutoManager produtoManager;
	
	@RequestMapping("/produtos")
	public String todos(Model model)
	{
		model.addAttribute("produtos",
				produtoManager.obterTodos());
		return "produtos";
	}
	
}
