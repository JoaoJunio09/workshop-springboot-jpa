package com.educandoweb.infonet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.infonet.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	// Interface que faz parte da camada de Data Repositories.
	// Interface que deixa a disponibilização toda as operações de acesso a dados.
	
}
