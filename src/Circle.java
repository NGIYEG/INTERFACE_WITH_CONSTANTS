/**
 * The Area class implements the Constants interface
 * to calculate the area of a circle using predefined constants.
 */
public class Circle implements Constants {

    /**
     * Calculates the area of a circle.
     * Formula: Area = π * radius^2
     *
     * @return The calculated area as a float.
     */
    float GetArea() {
        return pi * rad * rad; // Use constants from the Constants interface
    }
    float getCircum(){
        return 2*pi*rad;
    }
}
