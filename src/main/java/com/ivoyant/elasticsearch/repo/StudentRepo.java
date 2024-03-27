package com.ivoyant.elasticsearch.repo;

import com.ivoyant.elasticsearch.entity.Student;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepo extends ElasticsearchRepository<Student, String> {
}
