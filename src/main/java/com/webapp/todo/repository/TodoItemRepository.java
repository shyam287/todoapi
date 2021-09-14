package com.webapp.todo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webapp.todo.entity.TodoItem;

@Repository
public interface TodoItemRepository extends CrudRepository<TodoItem, Integer> {
	
	
	List<TodoItem> findAll();
	
	TodoItem findById(int id);

	List<TodoItem> findByCourse(String courseName);
	
}
