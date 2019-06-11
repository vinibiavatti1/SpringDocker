package br.com.furb.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.furb.app.entity.Livro;
import br.com.furb.app.repository.LivroRepository;

@RestController
@RequestMapping("/livro")
public class LivroController {
	
	@Autowired
	public LivroRepository livroRepository;

	public LivroController() {}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
    public void post(@RequestBody Livro livro) {
		livroRepository.save(livro);
    }
	
}
