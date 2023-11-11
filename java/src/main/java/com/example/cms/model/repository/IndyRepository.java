package com.example.cms.model.repository;

import com.example.cms.model.entity.Indy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IndyRepository extends JpaRepository<Indy,String>{
    @Query(value = "select * from Indy s " +
            "where lower(s.Spec) like lower(concat('%', :searchTerm, '%')) " +
            "or lower(s.Spec) like lower(concat('%', :searchTerm, '%'))", nativeQuery = true)
    List<Indy> searchSpec(@Param("searchTerm") String searchTerm);
}
