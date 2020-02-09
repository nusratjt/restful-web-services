package com.spring.micro.project.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardCodedService {

	private static List<Todo> todos = new ArrayList<Todo>();
	private static int idCounter = 0;

	static {
		todos.add(new Todo(++idCounter, "nusrat", "Learn painting with acrylic colors", new Date(), false));
		todos.add(new Todo(++idCounter, "nusrat", "Learn about Microservices", new Date(), false));
		todos.add(new Todo(++idCounter, "nusrat", "Learn programming", new Date(), false));
		todos.add(new Todo(++idCounter, "nusrat", "Learn to cook", new Date(), false));

	}

	public List<Todo> findAll() {
		return todos;
	}

	public Todo deleteTodo(long id) {
		Todo todo = findById(id);

		if (todo == null)
			return null;
		if (todos.remove(todo)) {
			return todo;
		}
		return null;
	}

	public Todo findById(long id) {
		for (Todo todo : todos) {
			if (todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}
}
