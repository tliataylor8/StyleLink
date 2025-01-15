package com.StyleLink.StyleLink.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StyleLink.StyleLink.Entity.Property;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long>{

}
