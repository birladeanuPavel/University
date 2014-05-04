package com.pavel.university.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by Pavel on 28.04.2014.
 */
@Entity
@Table(name = "professor")
public class Professor implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_professor", unique = true, nullable = false)
    private Integer idProfessor;

    @Column(name = "first_name", unique = true, nullable = false)
    private String firstName;

    @Column(name = "last_name", unique = true, nullable = false)
    private String lastName;

    @Column(name = "date_of_birth", unique = true, nullable = false)
    private String dateOfBirth;

    @OneToMany(mappedBy = "professor", fetch = FetchType.LAZY)
    private Set<ObjectProfessor> objectProfessor;

    public Professor() {

    }

    public Integer getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(Integer idProfessor) {
        this.idProfessor = idProfessor;
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

    public Set<ObjectProfessor> getObjectProfessor() {
        return objectProfessor;
    }

    public void setObjectProfessor(Set<ObjectProfessor> objectProfessor) {
        this.objectProfessor = objectProfessor;
    }

}
