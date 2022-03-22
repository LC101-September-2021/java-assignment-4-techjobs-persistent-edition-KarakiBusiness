package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank //2
    @Size(max = 50) //2
    private String location; //2

    @OneToMany
    @JoinColumn
    private List<Job> jobs = new ArrayList<>(); //3

    public Employer() {} //2

    public String getLocation() { return location; } //2

    public void setLocation(String location) { this.location = location; } //2

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs){
        this.jobs = jobs;
    }
}
