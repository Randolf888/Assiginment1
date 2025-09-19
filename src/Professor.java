/**
 * The Professor class represents a professor who teaches courses.
 * Professors only attend lecture hours of a course.
 * This class extends the abstract Person class and provides
 * specific factors for professors.
 */
public class Professor extends Person {
    
    /**
     * Constructor to create a Professor with first and last name.
     * @param firstName is the first name of the professor
     * @param lastName is the last name of the professor
     */
    public Professor(String firstName, String lastName) {
        super(firstName, lastName); // Call the parent class constructor
    }
    
    /**
     * Calculates the participating hours for a professor based on course hours.
     * Professors only attend lecture hours.
     * @param courseHours the total hours of the course
     * @return the lecture hours the professor attends
     */
    @Override
    public int getParticipatingHours(int courseHours) {
        // Calculate lab hours: 2 if course > 4 hours, otherwise 1
        int labHours = (courseHours > 4) ? 2 : 1;
        // Professors only attend lecture hours (total hours - lab hours)
        return courseHours - labHours;
    }
    
    /**
     * Returns the title of this person.
     * This one returns Professor 
     */
    @Override
    public String getTitle() {
        return "Professor";
    }
}
