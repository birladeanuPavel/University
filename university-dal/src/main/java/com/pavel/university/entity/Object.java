package com.pavel.university.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by Pavel on 28.04.2014.
 */
@Entity
@Table(name = "object")
public class Object implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_object", unique = true, nullable = false)
    private Integer idObject;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Column(name = "number_of_lessons", unique = true, nullable = false)
    private Integer numberOfLessons;

    @Column(name = "number_of_labs", unique = true, nullable = false)
    private Integer numberOfLabs;

    @OneToMany(mappedBy = "object", fetch = FetchType.LAZY)
    private Set<StudentObject> studentObject;

    @OneToMany(mappedBy = "object", fetch = FetchType.LAZY)
    private Set<ObjectProfessor> ObjectProfessor;

    public Object() {

    }

    public Integer getIdObject() {
        return idObject;
    }

    public void setIdObject(Integer idObject) {
        this.idObject = idObject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfLessons() {
        return numberOfLessons;
    }

    public void setNumberOfLessons(Integer numberOfLessons) {
        this.numberOfLessons = numberOfLessons;
    }

    public Integer getNumberOfLabs() {
        return numberOfLabs;
    }

    public void setNumberOfLabs(Integer numberOfLabs) {
        this.numberOfLabs = numberOfLabs;
    }

    public Set<StudentObject> getStudentObject() {
        return studentObject;
    }

    public void setStudentObject(Set<StudentObject> studentObject) {
        this.studentObject = studentObject;
    }

    public Set<ObjectProfessor> getObjectProfessor() {
        return ObjectProfessor;
    }

    public void setObjectProfessor(Set<ObjectProfessor> objectProfessor) {
        ObjectProfessor = objectProfessor;
    }
}
