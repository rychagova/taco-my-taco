package com.taco.tacomytaco.repositpries;

import com.taco.tacomytaco.models.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {

}