package inheritance;
//Hierarchical Inheritance
public class Students {
    String name = "ABC";
    int rno = 1;
    String div = "B";
}
class PhysicsMarks extends Students{
    double marks = 78;
}
class ChemistryMarks extends Students{
    double marks = 86;
}
class MathsMarks extends Students{
    double marks = 90;
}
class StudentImpl{
    public static void main(String[] args) {
        MathsMarks mathsMarks=new MathsMarks();
        PhysicsMarks physicsMarks=new PhysicsMarks();
        ChemistryMarks chemistryMarks=new ChemistryMarks();

        double total=mathsMarks.marks+physicsMarks.marks+chemistryMarks.marks;
        double percentage=(total/3);

        System.out.println("----Student Details----");
        System.out.println("Roll No :"+mathsMarks.rno);
        System.out.println("Name :"+mathsMarks.name);
        System.out.println("Div :"+mathsMarks.div);
        System.out.println("Percentage :"+percentage);
    }
}