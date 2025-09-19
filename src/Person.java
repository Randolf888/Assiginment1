public abstract class Person implements ParticipateHours { // Abstract class representing a person with participation hours.
    protected String firstName;
    protected String lastName;
    protected int totalHours;

     // Constructor to initialize a person with first and last name, and total hours set to zero.
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalHours = 0;
    }
        // Method to add participation hours based on the course hours.
    public void addHours(int courseHours) {
        this.totalHours += getParticipatingHours(courseHours);
    }
    // Method to get the full name of the person.
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
    // Method to get the total participation hours of the person.
    public int getTotalHours() {
        return this.totalHours;
    }
    // Abstract method to get the title of the person, to be implemented by subclasses, such as Student, Professor, and TeachingAssistant.
    public abstract String getTitle();
    
}