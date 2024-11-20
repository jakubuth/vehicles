package pl.example.vehicles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testCarMoveAndFuelType() {
        Car car = new Car("Sedan");
        car.move();
        assertEquals("Car is driving", outputStreamCaptor.toString().trim());

        outputStreamCaptor.reset();
        assertEquals("Petrol", car.fuelType());
    }

    @Test
    public void testBicycleMoveAndFuelType() {
        Bicycle bicycle = new Bicycle("Mountain Bike");
        bicycle.move();
        assertEquals("Bicycle is pedaling", outputStreamCaptor.toString().trim());

        outputStreamCaptor.reset();
        assertEquals("Human Power", bicycle.fuelType());
    }

    @Test
    public void testBoatMoveAndFuelType() {
        Boat boat = new Boat("Yacht");
        boat.move();
        assertEquals("Boat is sailing", outputStreamCaptor.toString().trim());

        outputStreamCaptor.reset();
        assertEquals("Diesel", boat.fuelType());
    }
}
