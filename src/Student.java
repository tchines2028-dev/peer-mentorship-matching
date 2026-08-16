import java.util.*;

public class Student {

    //Student data
    String name; //First and Last Name of Student
    String email;
    String pronouns; //Student's pronouns
    String major; //Major
    int year; //Year in college by completion not age
    HashSet<String> identity = new HashSet<>(); //Marginalized identity groups Student is a part of
    Set<String> possibleIdentities = Set.of("POC", "2SLGBTQIA+", "Non-traditional", "Late-diagnosed", "Undiagnosed", "Non-speaking"); //contains a list of the possible identity groups a student can be a part of


    public Student(String name, String email, String pronouns, String major, int year){
        this.name = name;
        this.email = email;
        this.pronouns = pronouns;
        this.major = major;
        this.year = year;
        this.identity = new HashSet<>();

    }

    public void introduce(){
        System.out.println("Hello, my name is " + name + " and I am a " + year + "(st) year student studying " + major );
    }

    public void deleteIdentity(String identityLabel){
        if(possibleIdentities.contains(identityLabel)) {
            System.out.println("Deleted " + identity.remove(identityLabel) + " from " + name + "'s list of identities");
        }

        else {
            System.out.println("Label does not exist in list");
        }
    }

    /*
     * Adds an identity label to the Student
     * returns void
     * */
    public void addIdentity(String identityLabel){
        if(possibleIdentities.contains(identityLabel)) {
            identity.add(identityLabel);
        }

        else{
            System.out.println("Identity not possible to add");
        }
    }
    /*
     * Prints/Lists the identities the current Student holds
     * returns void
     * */
    public void listIdentities(){
        System.out.println(name + ":");

        for(String label : identity){
            System.out.println(label);
        }
    }

}
