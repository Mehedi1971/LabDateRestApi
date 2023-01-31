package com.example.restlabdate.controller;

import com.example.restlabdate.entity.Lab;
import com.example.restlabdate.repository.LabRepository;
import lombok.AllArgsConstructor;
import org.apache.tomcat.jni.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/patient")
//@AllArgsConstructor
public class LabController {
//private final LabRepository labRepository;
    @Autowired
    private LabRepository labRepository;

    @GetMapping("/v1")
    public List<Lab> getAllLab(){
//        model.addAttribute("listofAll",);
        System.out.println("jkhjkh");
        return labRepository.findAll();
    }
    @PostMapping("/")
    public Lab adds(@RequestBody Lab lab){
        return labRepository.save(lab);

    }

    @GetMapping("/date")
    public ResponseEntity<List<Lab>> getLaptopsByCreatedDate (@RequestParam java.sql.Date startDate,
                                                                @RequestParam Date endDate) {
        return new ResponseEntity<List<Lab>>(labRepository.findBycreateTimeBetween(startDate, endDate), HttpStatus.OK);
    }
//    @GetMapping("/{fromDate}/{toDate}")
//    public List<Lab> getData_between(
//            @PathVariable(value = "fromDate") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate fromDate,
//            @PathVariable(value = "toDate") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate toDate) {
//        return labRepository.getData_between(fromDate, toDate);
//    }
//@GetMapping
//List<Lab> findByExpiryDateBetween() throws ParseException {
//    Date start = new SimpleDateFormat("yyyy-MM-dd").parse("2023-01-18");
//    Date end = new SimpleDateFormat("yyyy-MM-dd").parse("2023-01-26");
//    List<Lab> findByExpiryDateBetween = labRepository.findByExpiryDateBetween(start, end);
//    System.out.println("findByExpiryDateBetween = " + findByExpiryDateBetween);
//    return findByExpiryDateBetween;
//}
//    @GetMapping("/{fromDate}/{toDate}")
//    public List<Lab> getData_between(
//            @PathVariable(value = "fromDate") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate fromDate,
//            @PathVariable(value = "toDate") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate toDate) {
//        System.out.println(fromDate);
//        System.out.println(toDate);
//        return labRepository.getData_between(fromDate, toDate);
//    }
}
