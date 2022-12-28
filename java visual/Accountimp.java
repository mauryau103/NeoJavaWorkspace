public class Accountimp {

    float num,balance,custid;

    Accountimp(float mynum){
        num=mynum;
    }
    void transaction(float bal,float cid){
        balance = bal;
        custid=cid;
    }
    void printEmp() {
        System.out.println(" Account number  : " + num );
        System.out.println("customer ID :" + custid);
        System.out.println("Balance :" + balance);
     }
    public static void main(String[] args) {
        Accountimp aimp=new Accountimp(01);
        aimp.transaction(20000, 32456);
        aimp.printEmp();
    }
}
