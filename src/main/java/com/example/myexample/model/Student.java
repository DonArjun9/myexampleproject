package com.example.myexample.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private Long id;
	private String name;
	private String passportNumber;}