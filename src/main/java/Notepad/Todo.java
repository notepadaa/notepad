package Notepad;

public class Todo {
    private String title;
    private String content;
    private int status;     //0:Doing;  1:Done

    public Todo() {
        this.title = null;
        this.content = null;
        this.status = 0;
    }
    public Todo(String title) {
        this.title = title;
        this.content = null;
        this.status = 0;
    }
    public Todo(String title, String content){
        this.title = title;
        this.content = content;
        this.status = 0;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setContent(String content){
        this.content = content;
    }
    public String getContent(){
        return this.content;
    }
    public int getStatus(){
        return this.status;
    }
    public void finish(){
        this.status = 1;
    }
}
