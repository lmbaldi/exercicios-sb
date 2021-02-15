package com.example.exerciciossb.model.repositories;

import com.example.exerciciossb.model.entities.Produto;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

//responsavel pela persistencia de um produto
public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {

    public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

    //more queries
    //findByNomeContaining
    //findByNomeIsContaining
    //findByNomeContains

    //findByNomeStartsWith
    //findByNomeEndsWith

    //findByNomeNotContaining

    @Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
    public Iterable<Produto> searchByNameLike(@Param("nome") String nome);
}
