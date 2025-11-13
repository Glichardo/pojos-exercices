package org.ies.tierno.objects.workshop.readers;

import org.ies.tierno.objects.workshop.model.Garage;
import org.ies.tierno.objects.workshop.model.Vehicle;

import java.util.Scanner;

public class GarageReader {
    private final Scanner scanner;
    private final VehicleReader vehicleReader;

    public GarageReader(Scanner scanner, VehicleReader vehicleReader){
        this.scanner = scanner;
        this.vehicleReader = vehicleReader;
    }

    public Garage read(){
        System.out.println("Introduce los datos del taller");

        System.out.println("Nombre:");
        String name = scanner.nextLine();

        System.out.println("Dirección:");
        String address = scanner.nextLine();

        Vehicle[] vehicles = readVehicles();

        return new Garage()


    }


}
