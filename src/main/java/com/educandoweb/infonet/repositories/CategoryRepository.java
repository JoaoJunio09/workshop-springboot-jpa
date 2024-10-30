package com.educandoweb.infonet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.infonet.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	// reporitório de operações a acesso a dados com JPA.
}
