package com.asiri.hibernate.Jpaindepth.repository;

import com.asiri.hibernate.Jpaindepth.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class CourseRepository {

    @Autowired
    EntityManager entityManager;

    //find by id
    public Course findById(Long id){
        return  entityManager.find(Course.class, id);
    }
}
