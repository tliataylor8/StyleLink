package com.StyleLink.StyleLink.Respository;

import com.StyleLink.StyleLink.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User ,Long>{

}
