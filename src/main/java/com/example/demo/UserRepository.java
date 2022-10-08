package com.example.demo;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
//@ComponentScan(basePackageClasses = User.class)
public interface UserRepository extends CrudRepository<User, Integer> {

    public List<User> findByTeam(String team);

    @Query("SELECT u FROM User u")
    public List<User>
        listUsers();
}
