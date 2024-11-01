package com.educandoweb.infonet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.infonet.entities.OrderItem;
import com.educandoweb.infonet.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {	
	// Não é preciso adicionar implementação, por que o Spring JPA já tem uma implementação para esta interface;
}
