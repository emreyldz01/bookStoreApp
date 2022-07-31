package com.emrebeyproje.bookstore.repository;

import com.emrebeyproje.bookstore.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Emre YILDIZ
 */
public interface OrderRepository extends JpaRepository<Order,Integer> { }
