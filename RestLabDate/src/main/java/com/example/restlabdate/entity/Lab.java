package com.example.restlabdate.entity;


import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.LastModifiedDate;



@Entity
@Table(name = "labs")
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Lab {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
//@JSONField(format = "yyyy-MM-dd HH:mm:ss")
//@LastModifiedDate
    @Temporal(TemporalType.DATE)
    private Date createTime;
    private long age;
    @OneToOne(cascade = CascadeType.ALL)
    private Lines lines;
//    private List<Lines> lines=new ArrayList<>();
    private String patientName;
    private String invoiceNumber;
    private String patientIdentifier;
    private String sex;
//
//    public Lab() {
//
//    }

//    public Lab(long id, Date createTime, long age, Lines lines, String patientName, String invoiceNumber, String patientIdentifier, String sex) {
//        this.id = id;
//        this.createTime = createTime;
//        this.age = age;
//        this.lines = lines;
//        this.patientName = patientName;
//        this.invoiceNumber = invoiceNumber;
//        this.patientIdentifier = patientIdentifier;
//        this.sex = sex;
//    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    @PrePersist
    private  void onCreate(){
            createTime=new Date();
    }
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public Lines getLines() {
        return lines;
    }

    public void setLines(Lines lines) {
        this.lines = lines;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getPatientIdentifier() {
        return patientIdentifier;
    }

    public void setPatientIdentifier(String patientIdentifier) {
        this.patientIdentifier = patientIdentifier;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

//    @Override
//    public String toString() {
//        return "Lab{" +
//                "id=" + id +
//                ", createTime='" + createTime + '\'' +
//                ", age=" + age +
//                ", lines=" + lines +
//                ", patientName='" + patientName + '\'' +
//                ", invoiceNumber='" + invoiceNumber + '\'' +
//                ", patientIdentifier='" + patientIdentifier + '\'' +
//                ", sex='" + sex + '\'' +
//                '}';
//    }
}
