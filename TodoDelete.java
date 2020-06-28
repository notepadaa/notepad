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
