package br.com.furb.app.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.furb.app.entity.Autor;

@RepositoryRestResource(collectionResourceRel = "autor", path = "autor")
public interface AutorRepository extends PagingAndSortingRepository<Autor, Long> {

	public List<Autor> findByNome(@Param("nome") String nome);
	
}
