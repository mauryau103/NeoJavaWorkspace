package first;

public class Student {
    private String name;
    void display(){
        System.out.println("hello "+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
