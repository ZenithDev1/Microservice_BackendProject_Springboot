package com.Zenithdev.firstMicroserviceProject.job;

import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@RequestMapping("/jobs")
public class JobController {


    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping
    public ResponseEntity<List<Job>> findAll(){
        return ResponseEntity.ok(jobService.findAll());
    }

    @PostMapping
    public ResponseEntity <String> createJob(@RequestBody Job job){
        jobService.createJob(job);
        return new ResponseEntity<>("Job created",HttpStatus.CREATED);
    }

    //finding job by id
    @GetMapping("/{id}")
    public ResponseEntity<Job> findJobById(@PathVariable Long id){

        Job job = jobService.findJobById(id);
        if(job != null) {
            return new ResponseEntity<>(job, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteJobById(@PathVariable Long id){
        boolean delete = jobService.deleteJobById(id);
        if(delete) {
            return new ResponseEntity<>("Job deleted",HttpStatus.OK);
        }
        return new ResponseEntity<>("Job not found",HttpStatus.NOT_FOUND);
    }

    //@PutMapping("/jobs/{id}")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<String> updateJobDetailsById(@PathVariable Long id,
                                                       @RequestBody Job updatedJob){
        boolean updated = jobService.updateJobDetailsById(id, updatedJob);
        if(updated) {
            return new ResponseEntity<>("Job updated!",HttpStatus.OK);
        }
        return new ResponseEntity<>("Job not found",HttpStatus.NOT_FOUND);
    }

}
