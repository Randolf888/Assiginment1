/**
 * The Student class represents a student who attends courses.
 * Students attend all hours of a course (both lecture and lab hours).
 * This class extends the abstract Person class and provides
 * specific factors for students.
 */
public class Student extends Person {
    
    /**
     * Constructor to create a Student with first and last name.
     * @param firstName is the first name of the student
     * @param lastName is the last name of the student
     */
    public Student(String firstName, String lastName) {
        super(firstName, lastName); // Call the parent class constructor
    }
    
    /**
     * Calculates the participating hours for a student based on course hours.
     * Students attend all hours of the course.
     * @param courseHours the total hours of the course
     * @return all course hours (students attend both lecture and lab hours)
     */
    @Override
    public int getParticipatingHours(int courseHours) {
        return courseHours; // Students attend all hours
    }
    
    /**
     * Returns the title of this person.
     * @return the string "Student"
     */
    @Override
    public String getTitle() {
        return "Student";
    }
}