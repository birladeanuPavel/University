package com.pavel.university.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Pavel on 28.04.2014.
 */
@Entity
@Table(name = "object_professor")
public class ObjectProfessor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_object")
    private Object object;

    @ManyToOne
    @JoinColumn(name = "id_professor")
    private Professor professor;

    public ObjectProfessor() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
