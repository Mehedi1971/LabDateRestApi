package com.example.restlabdate.repository;

import com.example.restlabdate.entity.Lab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface LabRepository extends JpaRepository<Lab,Long> {
//    String qry = "select * from labs a  where create_time between coalesce(:fromDate,a.create_time) and coalesce(:toDate,a.create_time);";
//
//    @Query(value = qry, nativeQuery = true)
//    List<Lab> getData_between(
//            @Param("fromDate") LocalDate date, @Param("toDate")LocalDate date2
//    );
    @Query(nativeQuery = true, value = "select * from labs  where create_time between '2023-01-26' and '2023-01-26'")
    List<Lab> getData_between(@Param("startDate") LocalDate date, @Param("endDate") LocalDate date2);

}
