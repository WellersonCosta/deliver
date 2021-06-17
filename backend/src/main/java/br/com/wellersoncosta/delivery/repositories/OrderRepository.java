package br.com.wellersoncosta.delivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wellersoncosta.delivery.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
