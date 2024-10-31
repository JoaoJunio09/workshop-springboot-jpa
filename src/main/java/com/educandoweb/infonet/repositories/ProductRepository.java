package com.educandoweb.infonet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.infonet.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	// Repositório de operações de acesso a dados com objeto relacional utilizando JPA.
}
