package controlflowstatement;

public class ForLoopEx {
    public static void main(String[] args){
        //simple For Loop
        for (int i=0;i<3;i++){
            System.out.println(i);
        }
        // Nested for loop
        for(int i=0; i<5;i++){
            for(int j=0; j<5;j++){
                System.out.println(i+" "+j);
            }
        }
        for(int i=3; i>0;i--){
            for(int j=3; j>0;j--) {
                System.out.println(i + " " + j);
            }
        }
        //Enhance for loop
        int a[] ={5,10,15,20,25,30};
        for (int no:a){
            System.out.println(no);
        }
    }
}
