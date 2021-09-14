package com.webapp.todo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.webapp.todo.dto.TodoItemDto;
import com.webapp.todo.entity.TodoItem;
import com.webapp.todo.repository.TodoItemRepository;

@Service
public class TodoItemServiceImpl implements TodoItemService {
	
	private TodoItemRepository todoItemRepository;
	
	public TodoItemServiceImpl(TodoItemRepository todoItemRepository) {
		this.todoItemRepository = todoItemRepository;
	}


	@Override
	public List<TodoItemDto> getAllItems() {

		return getTodoItemsDto(todoItemRepository.findAll());
	}


	private List<TodoItemDto> getTodoItemsDto(List<TodoItem> todoItemList) {

		List<TodoItemDto> todoItemsDtoList = new ArrayList<>();
		todoItemList.stream().forEach(todoItem -> todoItemsDtoList.add(convertToDto(todoItem)));
		
		return todoItemsDtoList;
	}
	
	private TodoItemDto convertToDto(TodoItem todoItem) {
		
		TodoItemDto todoItemDto = new TodoItemDto();
		todoItemDto.setId(todoItem.getId());
		todoItemDto.setCourseName(todoItem.getCourse());
		
		return todoItemDto;
	}

}
