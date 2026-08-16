public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        //possible identities: "POC", "2SLGBTQIA+", "Non-traditional", "Late-diagnosed", "Undiagnosed", "Non-speaking"

        Student student1 = new Student("Alex", "alex@wisc.edu", "he/him", "Computer Science", 1);
        Student student2 = new Student("Mary", "mary@wisc.edu", "she/her", "Computer Science", 1);


        student1.addIdentity("POC");
        student1.addIdentity("2SLGBTQIA+");
        student1.addIdentity("Late-diagnosed");
        student1.listIdentities();
        student2.addIdentity("POC");
        System.out.println(student1.getIdentities());

        student1.sharedIdentity(student2);

    }
}
