package com.Zenithdev.firstMicroserviceProject.job;

import org.springframework.stereotype.Service;

import java.util.List;


public interface JobService {

    List<Job> findAll();
    void createJob(Job job);
    Job findJobById(Long id);

}
