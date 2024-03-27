package com.ivoyant.redis.repo;

import com.ivoyant.redis.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends CrudRepository<Person,String> {
}
