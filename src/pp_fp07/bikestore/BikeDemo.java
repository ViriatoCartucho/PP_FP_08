/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp07.bikestore;

import pp_fp07.bikestore.enums.BrakeType;
import pp_fp07.bikestore.enums.Material;
import pp_fp07.bikestore.enums.MountainBikeSuspension;

/**
 *
 * @author Utilizador
 */
public class BikeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicycle bike = new Bicycle(1, 5, "Preto", 11.0f, BrakeType.H,
                Material.CARBON, 159.99f, 1);
        MountainBike mBike = new MountainBike(4, MountainBikeSuspension.DOUBLE,
                2, 5, "Vermelho", 16.0f, BrakeType.H, Material.CARBON, 359.99f, 1);        
        RoadBike rBike = new RoadBike(50.5f, 4, "...", 3, 4, "Rosa",
                9.0f, 99.99f, 1);       
        BicycleManagment bManag = new BicycleManagment();
        
        bManag.addBike(bManag.getBikes(), bike);
        bManag.addBike(bManag.getBikes(), mBike);
        bManag.addBike(bManag.getBikes(), rBike);
        
        bManag.BicycleManagementToString(bManag.getBikes());
    }
    
}
