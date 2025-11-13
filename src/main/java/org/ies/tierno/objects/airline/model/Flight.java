package org.ies.tierno.objects.airline.model;

import java.util.Arrays;
import java.util.Objects;

public class Flight {
    private int flightNumber;
    private String source;
    private String destination;
    private String boardingGate;
    private Passenger[] passengers;

    public Flight(int flightNumber, String source, String destination, String boardingGate, Passenger[] passengers) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.boardingGate = boardingGate;
        this.passengers = passengers;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getBoardingGate() {
        return boardingGate;
    }

    public void setBoardingGate(String boardingGate) {
        this.boardingGate = boardingGate;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return flightNumber == flight.flightNumber && Objects.equals(source, flight.source) && Objects.equals(destination, flight.destination) && Objects.equals(boardingGate, flight.boardingGate) && Objects.deepEquals(passengers, flight.passengers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNumber, source, destination, boardingGate, Arrays.hashCode(passengers));
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber=" + flightNumber +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", boardingGate='" + boardingGate + '\'' +
                ", passengers=" + Arrays.toString(passengers) +
                '}';
    }
}
