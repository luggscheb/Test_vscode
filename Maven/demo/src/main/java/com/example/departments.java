package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="departments")
public class departments {

    @OneToMany
    @JoinColumn(name = "dept_emp", nullable=false, insertable=false, updatable=false)
    private Dept_emp dept_emp;

    @OneToMany
    @JoinColumn(name = "dept_manager", nullable=false)
    private Dept_manager dept_manager;

    @Id
    @OneToMany
    @JoinColumn(name = "dept_no", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dept_no;

    @Column(name = "dept_name")
    private String dept_name;


    public Dept_emp getDept_emp() {
        return this.dept_emp;
    }

    public void setDept_emp(Dept_emp dept_emp) {
        this.dept_emp = dept_emp;
    }

    public Dept_manager getDept_manager() {
        return this.dept_manager;
    }

    public void setDept_manager(Dept_manager dept_manager) {
        this.dept_manager = dept_manager;
    }

    public int getDept_no() {
        return this.dept_no;
    }

    public void setDept_no(int dept_no) {
        this.dept_no = dept_no;
    }

    public String getDept_name() {
        return this.dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }


    @Override
    public String toString() {
        return "{" +
            " dept_emp='" + getDept_emp() + "'" +
            ", dept_manager='" + getDept_manager() + "'" +
            ", dept_no='" + getDept_no() + "'" +
            ", dept_name='" + getDept_name() + "'" +
            "}";
    }

}
