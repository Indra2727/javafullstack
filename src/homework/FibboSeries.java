package homework;

public class FibboSeries {
    public static void main(String[] args){
        int no1=0;
        int no2=1;
        int limit=10;
        System.out.println(no1);
        System.out.println(no2);
       // for (int i=10;i>0;i--){
         //   int next=no1+no2;
           // System.out.println(next);
            //no1=no2;
           // no2=next;
        //}
        while (limit>0){
            int res=no1+no2;
            System.out.println(res);
            no1=no2;
            no2=res;
            limit--;
        }
    }
}
