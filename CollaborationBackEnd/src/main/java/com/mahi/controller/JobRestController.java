package com.mahi.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mahi.dao.JobDao;
import com.mahi.dao.SignUpDao;
import com.mahi.model.Job;
import com.mahi.model.JobApplication;

@RestController
public class JobRestController 
{

	@Autowired
	JobDao jobDAO;
	
	@PostMapping("/jobposting")
	public ResponseEntity<Job> jobPosting(@RequestBody Job job)
	{
		jobDAO.add(job);
		return new ResponseEntity<Job>(job, HttpStatus.OK);
	}

	
	@GetMapping("/alljobs")
	public ResponseEntity<List<Job>> allJobs()
	{
 		List<Job> list=jobDAO.list();
 		for(Job j: list)
 		{
 			System.out.println(j.getDt());
 		}
		return new ResponseEntity<List<Job>>(list,HttpStatus.OK);
	}
}

