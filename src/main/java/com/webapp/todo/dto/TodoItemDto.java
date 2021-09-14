package com.webapp.todo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
public class TodoItemDto {
	
	private int id;
	private String courseName;

}
