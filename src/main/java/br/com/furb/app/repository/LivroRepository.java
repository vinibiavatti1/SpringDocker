package br.com.furb.app.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.furb.app.entity.Livro;

@RepositoryRestResource(collectionResourceRel = "livro", path = "livro")
public interface LivroRepository extends PagingAndSortingRepository<Livro, Long> {

	public List<Livro> findByAutor_Nome(@Param("nome") String nome);
	public List<Livro> findByTitulo(@Param("titulo") String titulo);
	public List<Livro> findByIsbn(@Param("isbn") String isbn);
	
}
