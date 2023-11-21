// Just a simple repository to handle the basic CRUD functions of the API
package com.mhughes.cartapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Integer> { }
