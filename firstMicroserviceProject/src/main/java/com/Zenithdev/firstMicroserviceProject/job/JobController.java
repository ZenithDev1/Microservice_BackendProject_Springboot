package com.Zenithdev.firstMicroserviceProject.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JobController {

    @Autowired
    private JobService jobService;

//    public JobController(JobService jobService) {
//        this.jobService = jobService;
//    }

    @GetMapping("/jobs")
    public List<Job> findAll(){
        return jobService.findAll();
    }

    @PostMapping("/jobs")
    public String createJob(@RequestBody Job job){
        jobService.createJob(job);
        return "Job created";
    }

    @GetMapping("/jobs/{id}")
    public Job findJobById(@PathVariable Long id){
        Job job = jobService.findJobById(id);
        return job;
    }

}
