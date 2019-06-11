package br.com.furb.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.furb.app.entity.Autor;
import br.com.furb.app.repository.AutorRepository;

@RestController
@RequestMapping("/autor")
public class AutorController {
	
	@Autowired
	public AutorRepository autorRepository;

	public AutorController() {}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
    public void post(@RequestBody Autor autor) {
		autorRepository.save(autor);
    }
	
}
