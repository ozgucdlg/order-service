package com.custumer.order.repository;

import com.custumer.order.model.Orders;
import com.custumer.order.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Long> {

    List<Orders> findByCustomerNumber(String customerNumber);

}
