package autowireex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class A {
    @Autowired
    B b;
    public A(B b) {
        super();
        this.b = b;
        System.out.println("A is created");
    }
    public B getB(){
        return  b;
    }
    public void setB(B b){
        this.b=b;
    }
    public void printing(){
        System.out.println("Hello A");
    }
    public void display() {
        printing();
        b.printing();
        System.out.println("Display in a A class");
    }
}
