package com.pavel.university.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Pavel on 28.04.2014.
 */
@Entity
@Table(name = "faculty")
public class Faculty implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_faculty", unique = true, nullable = false)
    private Integer idFaculty ;

    @Column(name = "block", unique = true, nullable = false)
    private Integer block;

    @Column(name = "cabinet", unique = true, nullable = false)
    private Integer cabinet;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @OneToMany(mappedBy = "faculty", fetch = FetchType.LAZY)
    private Set<Department> department = new HashSet<Department>();

    public Faculty() {

    }

    public Integer getIdFaculty() {
        return idFaculty;
    }

    public void setIdFaculty(Integer idFaculty) {
        this.idFaculty = idFaculty;
    }

    public Integer getBlock() {
        return block;
    }

    public void setBlock(Integer block) {
        this.block = block;
    }

    public Integer getCabinet() {
        return cabinet;
    }

    public void setCabinet(Integer cabinet) {
        this.cabinet = cabinet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Department> getDepartment() {
        return department;
    }

    public void setDepartment(Set<Department> department) {
        this.department = department;
    }


}
