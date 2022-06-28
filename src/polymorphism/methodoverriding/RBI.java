package polymorphism.methodoverriding;

public class RBI {
    float getRateOfInterest(){
        return 7;
    }
}
class SBI extends RBI{
    float getRateOfInterest(){
        return 8;
    }
}
class ICICI extends RBI{
    float getRateOfInterest(){
        return 9.3f;
    }
}
class HDFC extends RBI{
    float getRateOfInterest(){
        return 9;
    }
}
class RBIImpl{
    public static void main(String[] args) {
        RBI rbi;
        rbi =new RBI();
        System.out.println("RBI Rete of Interest "+rbi.getRateOfInterest());
        rbi =new SBI();
        System.out.println("SBI Rete of Interest "+rbi.getRateOfInterest());
        rbi =new ICICI();
        System.out.println("ICICI Rete of Interest "+rbi.getRateOfInterest());
        rbi =new HDFC();
        System.out.println("HDFC Rete of Interest "+rbi.getRateOfInterest());

    }
}

