/*
 * Class: CMSC203 
 * Instructor: Vahabzadeh Monshi, Khandan 
 * Description: property, plot, and management company 
 * Due: 4/22/2025
 * Platform/compiler: eclipse 
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Ben Adams
*/
public class Property {
    // Attributes
    private String propertyName, city, owner;
    private Plot plot;
    private double rentAmount;

    // Constructors
    public Property(String propertyName, String city, double rentAmount, String owner) {
        this.propertyName = propertyName;
        this.city = city;
        this.rentAmount = rentAmount;
        this.owner = owner;
        this.plot = new Plot();
    }


    public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
        this.propertyName = propertyName;
        this.city = city;
        this.rentAmount = rentAmount;
        this.owner = owner;
        this.plot = new Plot(x, y, width, depth);  // Create a plot with specific coordinates and dimensions
    }

    public Property(Property oldProperty) {
        this.propertyName = oldProperty.propertyName;
        this.city = oldProperty.city;
        this.owner = oldProperty.owner;
        this.rentAmount = oldProperty.rentAmount;
        this.plot = new Plot(oldProperty.plot);  // Copy the plot
    }

    // Getters
    public String getPropertyName() {
        return propertyName;
    }

    public String getCity() {
        return city;
    }

    public String getOwner() {
        return owner;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public Plot getPlot() {
        return plot;
    }

    // toString
    @Override
    public String toString() {
        return propertyName + "," + city + "," + owner + "," + rentAmount;
    }
}
