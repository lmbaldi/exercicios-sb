package com.example.exerciciossb.model.repositories;

import com.example.exerciciossb.model.entities.Produto;

import org.springframework.data.repository.PagingAndSortingRepository;

//responsavel pela persistencia de um produto
public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {}
