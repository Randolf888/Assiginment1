/**
 * The TA class represents a Teaching Assistant who assists in courses.
 * TAs only conduct lab hours of a course.
 * This class extends the abstract Person class and provides
 * specific factors for teaching assistants.
 */
public class TA extends Person {
    
    /**
     * Constructor to create a TA with first and last name.
     * @param firstName the first name of the TA
     * @param lastName the last name of the TA
     */
    public TA(String firstName, String lastName) {
        super(firstName, lastName); // Call the parent class constructor
    }
    
    /**
     * Calculates the participating hours for a TA based on course hours.
     * TAs only conduct lab hours.
     * @param courseHours is the total hours of the course
     * @return the lab hours the TA conducts (2 if course > 4 hours, otherwise 1)
     */
    @Override
    public int getParticipatingHours(int courseHours) {
        return (courseHours > 4) ? 2 : 1;
    }
    
    /**
     * Returns the title of this person.
     * This one returns the string "TA"
     */
    @Override
    public String getTitle() {
        return "TA";
    }
}