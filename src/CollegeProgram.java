import java.util.Scanner;

public class CollegeProgram {
    public static void main(String[] args) {
        // Records of participants: role, first name, last name, course, hours
        String[] records = {
            "Professor Isaac Newton Physics 6",
            "TA Marie Curie Physics 6",
            "Professor Isaac Newton Calculus 4",
            "Student Amy Adams Calculus 4",
            "Student Will Smith Calculus 4",
            "Student Brad Pitt Physics 6",
            "Student Will Smith Physics 6",
            "Professor Dmitri Mendeleev Chemistry 6",
            "TA Carl Gauss Calculus 4",
            "Student Amy Adams Economics 3",
            "Professor Adam Smith Economics 3",
            "TA Marie Curie Chemistry 6",
            "Student Brad Pitt Chemistry 6",
            "Student Will Smith Chemistry 6"
        };

        // Array to store people objects (professors, TAs, students)
        Person[] people = new Person[20];
        int personCount = 0; // keeps track of how many unique people we have

        // Process each record one by one
        for (String record : records) {
            // Scanner splits each record into parts
            Scanner sc = new Scanner(record);
            String title = sc.next();      // Professor, TA, or Student
            String firstName = sc.next();  // e.g., Isaac
            String lastName = sc.next();   // e.g., Newton
            String courseName = sc.next(); // course (not used in total hours)
            int courseHours = sc.nextInt();// number of hours
            sc.close();

            // Check if this person already exists in our array
            Person p = null;
            for (int i = 0; i < personCount; i++) {
                if (people[i].firstName.equals(firstName) && people[i].lastName.equals(lastName)) {
                    p = people[i];
                    break;
                }
            }

            // If not found, create a new object depending on their role
            if (p == null) {
                if (title.equals("Professor")) p = new Professor(firstName, lastName);
                else if (title.equals("TA")) p = new TA(firstName, lastName);
                else if (title.equals("Student")) p = new Student(firstName, lastName);

                // Add new person to the array
                people[personCount++] = p;
            }

            // Add the course hours to this person's total
            p.addHours(courseHours);
        }

        // Display the results: total participation hours for each person
        System.out.println("===== Total Participation Hours =====");
        for (int i = 0; i < personCount; i++) {
            Person p = people[i];
            System.out.println(p.getTitle() + " " + p.getFullName() + " " + p.getTotalHours());
        }
    }
}
