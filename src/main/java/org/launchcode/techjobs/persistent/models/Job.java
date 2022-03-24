package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{
//3
//    @Id
//    @GeneratedValue
//    private int id;
//
//    private String name;

    @ManyToOne //3
    private Employer employer;  //3

    @ManyToMany
    private List<Skill> skills = new ArrayList<>(); //4

    public Job() {
    }

    public Job(List<Skill> someSkills, Employer employer) {
        super(); //4
        this.employer = employer;
        this.skills = someSkills;
    }

//     Getters and setters.

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public Employer getEmployer() {
        return employer;
    } //3

    public void setEmployer(Employer employer) {
        this.employer = employer;
    } //3

    public List<Skill> getSkills() {
        return skills;
    } //4

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    } //4
}
