package com.example.restlabdate.controller;

import com.example.restlabdate.entity.Lab;
import com.example.restlabdate.repository.LabRepository;
import lombok.AllArgsConstructor;
import org.apache.tomcat.jni.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/patient")
@AllArgsConstructor
public class LabController {
private final LabRepository labRepository;
//    @Autowired
//    private LabRepository labRepository;

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
//    @GetMapping("/{fromDate}/{toDate}")
//    public List<Lab> getData_between(
//            @PathVariable(value = "fromDate") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate fromDate,
//            @PathVariable(value = "toDate") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate toDate) {
//        return labRepository.getData_between(fromDate, toDate);
//    }

    @GetMapping("/{fromDate}/{toDate}")
    public List<Lab> getData_between(
            @PathVariable(value = "fromDate") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate fromDate,
            @PathVariable(value = "toDate") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate toDate) {
        System.out.println(fromDate);
        System.out.println(toDate);
        return labRepository.getData_between(fromDate, toDate);
    }
}
