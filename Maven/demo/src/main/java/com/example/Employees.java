package com.example;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employees {


    @OneToMany
    @JoinColumn(name="salaries", nullable=false)
    private Salaries salaries;
    
    @OneToMany
    @JoinColumn(name="titles", nullable=false)
    private Titles titles;
    
    @Id
    @Column(name="emp_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int emp_no;

    @Column(name="birth_date")
    private Date birth_date;

    @Column(name="first_name")
    private String first_name;

    @Column(name="last_name")
    private String last_name;

    @Column(name="gender")
    private char gender;

    @Column(name="hire_date")
    private Date hire_date;


    public Employees() {
        
    }
    


    @Override
    public String toString() {
        return "{" +
            " emp_no='" + getEmp_no() + "'" +
            ", birth_date='" + getBirth_date() + "'" +
            ", first_name='" + getFirst_name() + "'" +
            ", last_name='" + getLast_name() + "'" +
            ", gender='" + getGender() + "'" +
            ", hire_date='" + getHire_date() + "'" +
            "}";
    }

    public int getEmp_no() {
        return this.emp_no;
    }

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    public Date getBirth_date() {
        return this.birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public String getFirst_name() {
        return this.first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return this.last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getHire_date() {
        return this.hire_date;
    }

    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }



}
