package com.pavel.university.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Pavel on 28.04.2014.
 */

@Entity
@Table(name = "speciality")
public class Speciality implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_speciality", unique = true, nullable = false)
    private Integer idSpeciality ;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_department")
    private Department department ;

    @OneToMany(mappedBy = "speciality", fetch = FetchType.LAZY)
    private Set<Student> student = new HashSet<Student>();

    public Speciality() {

    }

    public Integer getIdSpeciality() {
        return idSpeciality;
    }

    public void setIdSpeciality(Integer idSpeciality) {
        this.idSpeciality = idSpeciality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Set<Student> getStudent() {
        return student;
    }

    public void setStudent(Set<Student> student) {
        this.student = student;
    }





}
