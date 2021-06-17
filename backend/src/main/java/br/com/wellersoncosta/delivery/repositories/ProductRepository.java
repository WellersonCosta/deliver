package br.com.wellersoncosta.delivery.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wellersoncosta.delivery.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	List<Product> findAllByOrderByNameAsc();
	
}
