import java.util.*;
public class arr_2nd_highestvalue {
    public static void main(String[] args) {
        int a[]=new int[5];
        int largest,i,k;
        int seclarg,thirdlarg;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values in th array");

        for(k=0;k<a.length;k++){
            a[k]=sc.nextInt();
        }

        largest=a[0];
        seclarg=a[1];
        thirdlarg=a[2];

        for(i=0;i<a.length;i++){

            if(a[i]>largest){
                thirdlarg=seclarg;
                seclarg=largest;
                largest=a[i];
                       
            }
            else if(a[i]>seclarg && a[i]!=largest){
                thirdlarg=seclarg;
                seclarg=a[i];
            }
            else if(a[i]>thirdlarg && a[i]!=largest && a[i]!=seclarg){
                thirdlarg=a[i];
            }
        }
        System.out.println("largest value : "+largest);
        System.out.println("second largest value : "+seclarg);
        System.out.println("third largest value : "+thirdlarg);

        sc.close();
    }

}
