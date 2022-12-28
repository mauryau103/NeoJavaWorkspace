public class IncrementDecrement {
    public static void main(String[] args) {
        int a=10,b=20,c,d,e,g,h,i;
        System.out.println("Values before increment "+a+" and "+b);

        c=++a;
        d=++b;

        System.out.println("Values after increment "+c+" and "+d);
        e=a>b?++a:++b;
        System.out.println("Turnary Operator value "+e);
        g=e++;
        System.out.println("value aftre increment"+g);
        h=g--;
        System.out.println("value after decrement"+h);
        i=--h;
        System.out.println("Va;ie after decrement"+i);

    }
}
