package com.example;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="titles")
public class Titles {
    
    // @ManyToOne
    // @Column(name="emp_no", nullable=false)
    // private Employees employees;	

    @Id
    @JoinColumn(name="emp_no", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Employees emp_no;
    
    @JoinColumn(name="title")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String title;
    
    @Column(name="from_date")
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Date from_date;

    @Column(name="to_date")
    private Date to_date;


    public Employees getEmp_no() {
        return this.emp_no;
    }

    public void setEmp_no(Employees emp_no) {
        this.emp_no = emp_no;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getFrom_date() {
        return this.from_date;
    }

    public void setFrom_date(Date from_date) {
        this.from_date = from_date;
    }

    public Date getTo_date() {
        return this.to_date;
    }

    public void setTo_date(Date to_date) {
        this.to_date = to_date;
    }


    @Override
    public String toString() {
        return "{" +
            " emp_no='" + getEmp_no() + "'" +
            ", title='" + getTitle() + "'" +
            ", from_date='" + getFrom_date() + "'" +
            ", to_date='" + getTo_date() + "'" +
            "}";
    }

}
