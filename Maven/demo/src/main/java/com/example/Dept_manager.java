package com.example;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dept_manager")
public class Dept_manager {
    
    @Id
    @Column(name="dept_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dept_no;

    @Id
    @Column(name="emp_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int emp_no;

    @Column(name="from_date")
    private Date from_date;

    @Column(name="to_date")
    private Date to_date;


    public int getDept_no() {
        return this.dept_no;
    }

    public void setDept_no(int dept_no) {
        this.dept_no = dept_no;
    }

    public int getEmp_no() {
        return this.emp_no;
    }

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
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
            " dept_no='" + getDept_no() + "'" +
            ", emp_no='" + getEmp_no() + "'" +
            ", from_date='" + getFrom_date() + "'" +
            ", to_date='" + getTo_date() + "'" +
            "}";
    }

}
