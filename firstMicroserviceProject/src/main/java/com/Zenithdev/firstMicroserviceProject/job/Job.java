package com.Zenithdev.firstMicroserviceProject.job;

public class Job {

    private Long id;
    private String title;
    private String description;
    private String minSallary;
    private String maxSallary;
    private String location;

    public Job(Long id, String title, String description, String minSallary, String maxSallary, String location) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.minSallary = minSallary;
        this.maxSallary = maxSallary;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMaxSallary() {
        return maxSallary;
    }

    public void setMaxSallary(String maxSallary) {
        this.maxSallary = maxSallary;
    }

    public String getMinSallary() {
        return minSallary;
    }

    public void setMinSallary(String minSallary) {
        this.minSallary = minSallary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
