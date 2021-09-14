package com.webapp.todo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.todo.dto.TodoItemDto;
import com.webapp.todo.service.TodoItemService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TodoItemController {
	
	private TodoItemService todoItemService;
	
	public TodoItemController(TodoItemService todoItemService) {
		this.todoItemService = todoItemService;
	}

	@GetMapping("/allItems")
	public List<TodoItemDto> getAllItems() {
		
//		log.info("controller get all items called");
		return todoItemService.getAllItems();
	}

}
