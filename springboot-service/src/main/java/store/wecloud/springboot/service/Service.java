package store.wecloud.springboot.service;

public class Service {
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String sayHello(){
        return "hello " + author;
    }
}
