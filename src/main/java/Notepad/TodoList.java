package Notepad;

import java.util.List;
import java.util.ArrayList;

public class TodoList {
    private ArrayList<Todo> todoList;
    private int listSize;               //Capacity of todolist

    public TodoList(){
        this.todoList = new ArrayList<Todo>();
        this.listSize = 0;
    }
    public TodoList(int size){
        this.todoList = new ArrayList<Todo>();
        this.listSize = size;
    }

    public int addTodo(Todo todo){
        if(todo.getTitle() == null){
            System.err.println("Todo title must not be null.");
            return -2;
        }
        if(this.todoList.size() == this.listSize){
            System.err.println("Failed, list is full.");
            return -1;
        }
        todoList.add(todo);
        return 1;
    }

    public int finishTodo(String todoTitle){
        for(Todo todo : todoList)
            if(todo.getTitle().equals(todoTitle)){
                todo.finish();
                return 1;
            }
        System.err.println("Todo not exists in list.");
        return -1;
    }

    public int deleteTodo(String todoTitle){
        for(Todo todo : todoList)
            if(todo.getTitle().equals(todoTitle)){
                todoList.remove(todo);
                return 1;
            }
        System.err.println("Todo not exists in list.");
        return -1;
    }


}
