package tdtu.edu.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tdtu.edu.com.model.CartItem;

public interface ShoppingCartRepository extends JpaRepository<CartItem, Integer>{

}
