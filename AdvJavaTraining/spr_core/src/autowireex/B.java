package autowireex;

import org.springframework.stereotype.Component;

@Component
public class B {
    public void printing() {
        System.out.println("B class");
    }
    public B(){
        super();
        System.out.println("B is created");
    }
}
