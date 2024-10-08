// Class representing a Vehicle in the TrafficSim
class Vehicle {
    // Attributes for the Vehicle class
    private String type;
    private int speed;
    private String direction;

    // Constructor to initialize the Vehicle object
    public Vehicle(String type, int speed, String direction) {
        this.type = type;
        this.speed = speed;
        this.direction = direction;
    }

    // Member function to display the vehicle's information
    public void displayInfo() {
        System.out.println("Vehicle Type: " + this.type + ", Speed: " + this.speed + " km/h, Direction: " + this.direction);
    }

    // Member function to simulate the vehicle movement
    public void move() {
        System.out.println(this.type + " is moving at " + this.speed + " km/h in the " + this.direction + " direction.");
    }

    // Getter for speed
    public int getSpeed() {
        return speed;
    }

    // Setter for speed
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

// Class representing TrafficLight in the TrafficSim
class TrafficLight {
    // Attributes for TrafficLight
    private String color;
    private int duration; // duration the light stays in a particular color

    // Constructor to initialize the TrafficLight object
    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    // Member function to display the current state of the traffic light
    public void displayState() {
        System.out.println("Traffic Light is " + this.color + " for " + this.duration + " seconds.");
    }

    // Member function to change the state of the traffic light
    public void changeColor(String newColor) {
        this.color = newColor;
        System.out.println("Traffic Light changed to " + this.color);
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }
}

// Main class to demonstrate Classes and Objects in the TrafficSim
public class TrafficSim {
    public static void main(String[] args) {
        // Creating an object of the Vehicle class
        Vehicle car = new Vehicle("Car", 60, "North");
        car.displayInfo(); // Display vehicle info
        car.move();        // Simulate vehicle movement
        
        // Adjusting the speed of the car
        car.setSpeed(80);
        System.out.println("Updated speed of the car: " + car.getSpeed() + " km/h");

        // Creating an object of the TrafficLight class
        TrafficLight light = new TrafficLight("Red", 30);
        light.displayState(); // Display traffic light state

        // Changing the traffic light's color
        light.changeColor("Green");
        light.displayState(); // Display updated state
    }
}
