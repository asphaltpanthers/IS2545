/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightSim.Entity;

/**
 *
 * @author AsphaltPanthers
 */
public class Airplane {
    public String name;
    public int numberOfSeats;
    public int rows;
    public int seatsPerRow;
    
    public Airplane(String name, int numberOfSeats, int rows, int seatsPerRow) {
        this.name = name;
        this.numberOfSeats = numberOfSeats;
        this.rows = rows;
        this.seatsPerRow = seatsPerRow;
    }
}
