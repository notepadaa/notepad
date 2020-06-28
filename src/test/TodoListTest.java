import org.junit.Assert;
import org.junit.Test;

public class TodoListTest {
    @Test
    public void testAddTodoWhenListFull(){
        Todo todo = new Todo("test");
        TodoList todoList = new TodoList(0);
        int info = todoList.addTodo(todo);
        Assert.assertEquals(-1, info);
    }

    @Test
    public void testAddTodoWithIllegalTodo(){
        Todo todo = new Todo();
        TodoList todoList = new TodoList(1);
        int info = todoList.addTodo(todo);
        Assert.assertEquals(-2, info);
    }

    @Test
    public void testFinishTodoNotInList(){
        Todo todo = new Todo("test in list");
        TodoList todoList = new TodoList(1);
        todoList.addTodo(todo);
        int info = todoList.finishTodo("test not in list");
        Assert.assertEquals(-1, info);
    }

    @Test
    public void testFinishTodoInList(){
        Todo todo = new Todo("test in list");
        TodoList todoList = new TodoList(1);
        todoList.addTodo(todo);
        int info = todoList.finishTodo("test in list");
        Assert.assertEquals(1, info);
    }


}
