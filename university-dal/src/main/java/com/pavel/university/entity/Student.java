package com.pavel.university.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Pavel on 28.04.2014.
 */
@Entity
@Table(name = "student")
public class Student implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_student", unique = true, nullable = false)
    private Integer idStudent;

    @Column(name = "first_name", unique = true, nullable = false)
    private String firstName ;


    @Column(name = "last_name", unique = true, nullable = false)
    private String lastName ;


    @Column(name = "date_of_birth", unique = true, nullable = false)
    private String dateOfBirth ;


    @Column(name = "univeristy_year", unique = true, nullable = false)
    private Integer univeristyYear ;

    @Column(name = "average_mark", unique = true, nullable = false)
    private Integer averageMark ;

    @Column(name = "group_name", unique = true, nullable = false)
    private String groupName ;

    @ManyToOne
    @JoinColumn(name = "id_speciality")
    private Speciality speciality ;

    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY)
    private Set<StudentObject> studentObject = new HashSet<StudentObject>();

    public Student() {

    }

    public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getUniveristyYear() {
        return univeristyYear;
    }

    public void setUniveristyYear(Integer univeristyYear) {
        this.univeristyYear = univeristyYear;
    }

    public Integer getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(Integer averageMark) {
        this.averageMark = averageMark;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public Set<StudentObject> getStudentObject() {
        return studentObject;
    }

    public void setStudentObject(Set<StudentObject> studentObject) {
        this.studentObject = studentObject;
    }


}
