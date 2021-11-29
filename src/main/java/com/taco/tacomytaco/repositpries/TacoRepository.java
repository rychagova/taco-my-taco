package com.taco.tacomytaco.repositpries;

import com.taco.tacomytaco.models.Taco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacoRepository extends CrudRepository<Taco, Long> {
}
