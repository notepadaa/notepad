import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TodoListTest {
    @Test
    public void testDeleteTodoWhenListFull(){
        Todo todo = new Todo("test");
        TodoList todoList = new TodoList(5);
        todoList.addTodo(todo);
        int info = todoList.deleteTodo(todo.getTitle());
        Assertions.assertEquals(1, info);
    }
}
