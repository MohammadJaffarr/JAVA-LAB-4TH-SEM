class Teacher {
    String designation;
    String collegeName;

    // Constructor
    Teacher(String designation, String collegeName) {
        this.designation = designation;
        this.collegeName = collegeName;
    }

    void work() {
        System.out.println("You are working as a " + designation + " at " + collegeName);
    }
}

class ComputerTeacher extends Teacher {
    String mainSubject;

    // Constructor
    ComputerTeacher(String designation, String collegeName, String mainSubject) {
        super(designation, collegeName); // calling parent constructor
        this.mainSubject = mainSubject;
    }

    void displayDetails() {
        System.out.println("Designation: " + designation);
        System.out.println("College Name: " + collegeName);
        System.out.println("Main Subject: " + mainSubject);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating object
        ComputerTeacher ct = new ComputerTeacher("Professor", "Kargil Campus", "Computer Science");
        ComputerTeacher ct1 = new ComputerTeacher("Professor", "Kargil Campus", "Botany");

        // Calling methods
        ct.work();
        ct.displayDetails();
        ct1.work();
        ct1.displayDetails();
    }
}