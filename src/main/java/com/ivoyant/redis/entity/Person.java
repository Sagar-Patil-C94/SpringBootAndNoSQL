package com.ivoyant.redis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("Person")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable {
    private String id;
    private String fullName;
    private String address;
}
