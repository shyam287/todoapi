package com.webapp.todo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "TODO_ITEMS")
public class TodoItem {
	
	@Id
	private int id;
	
	@Column(name="COURSE")
	private String course;
	
}
