package com.purchasing.entity;

import javax.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.omg.CORBA.INTERNAL;

import java.time.LocalDateTime;

/**
 * 基础实体类（所有实体的父类）
 * 封装通用字段：ID、创建时间、更新时间
 * 注意：@MappedSuperclass 表示这是「映射超类」，不会生成独立数据库表！
 */
@Data  // Lombok注解：自动生成getter/setter/toString/equals/hashCode
@MappedSuperclass  // JPA注解：标记该类为映射超类，子类会继承其字段到表中
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "created_at", nullable = false, updatable = false, columnDefinition = "datetime")
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false, columnDefinition = "datetime")
    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
