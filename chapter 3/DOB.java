public class DOB {
    private int day;
    private int month;
    private int year;

    // Setter method to set the Date of Birth
    public void setDOB(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Display the Date of Birth in DD/MM/YYYY format
    public void show() {
        System.out.printf("%02d/%02d/%04d\n", day, month, year);
    }

    // Calculate age difference and return a DOB object
    public DOB findAge(DOB other) {
        DOB ageDifference = new DOB();
        ageDifference.year = this.year - other.year;
        ageDifference.month = this.month - other.month;
        ageDifference.day = this.day - other.day;

        // Adjust for negative month or day differences
        if (ageDifference.day < 0) {
            ageDifference.month--;
            ageDifference.day += 30; // Assuming 30 days per month for simplicity
        }
        if (ageDifference.month < 0) {
            ageDifference.year--;
            ageDifference.month += 12;
        }

        return ageDifference;
    }

    // Main method for testing
    public static void main(String[] args) {
        DOB person1 = new DOB();
        DOB person2 = new DOB();

        person1.setDOB(10, 5, 1990);
        person2.setDOB(15, 8, 1985);

        System.out.println("Person 1's Date of Birth:");
        person1.show();
        System.out.println("Person 2's Date of Birth:");
        person2.show();

        DOB ageDifference = person1.findAge(person2);
        System.out.println("\nAge Difference:");
        System.out.println("Years: " + ageDifference.year);
        System.out.println("Months: " + ageDifference.month);
        System.out.println("Days: " + ageDifference.day);
    }
}
