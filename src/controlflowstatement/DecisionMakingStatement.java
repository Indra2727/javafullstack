package controlflowstatement;

public class DecisionMakingStatement {
    public static void main(String[] args){
        String city = "pune";
        if (city == "pune")
            System.out.println("You are from pune");
        else
            System.out.println("You are from Mumbai");

        if (city == "Mumbai")
            System.out.println("You are from mumbai");
        else if (city == "Goa")
            System.out.println("You are from goa");
        else
            System.out.println("You are from pune");

        String country = "India";
        if (country == "India"){
            if (city == "Goa"){
                System.out.println("goa is in india");
            }
            else{
                if (city == "pune"){
                    System.out.println("pune is in india");
                }
            }

        }
        else {
            System.out.println("You are from another Country");
        }


    }
}
