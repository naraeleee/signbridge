package com.example.cms.model.repository;

import com.example.cms.model.entity.Management;
import com.example.cms.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "select * from student s " +
            "where lower(s.firstName) like lower(concat('%', :searchTerm, '%')) " +
            "or lower(s.lastName) like lower(concat('%', :searchTerm, '%'))", nativeQuery = true)
    List<User> search(@Param("searchTerm") String searchTerm);

}
