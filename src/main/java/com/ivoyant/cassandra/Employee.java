package com.ivoyant.cassandra;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @PrimaryKey
    private int id;
    public String name;
}
