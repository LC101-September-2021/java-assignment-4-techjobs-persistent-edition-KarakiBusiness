package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity //2
public class Skill extends AbstractEntity {

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>(); //4

    @Size(max = 500) //2
    private String description; //2

    public Skill() {} //2

    public List<Job> getJobs(){
        return jobs;
    }

    public String getDescription() { return description; } //2

    public void setDescription(String description) { this.description = description; } //2

}