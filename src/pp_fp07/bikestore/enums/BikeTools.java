/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp07.bikestore.enums;

/**
 *
 * @author Utilizador
 */
public enum BikeTools {
    WATER_BOTTLE, TIRE_CHANGE_KIT;

    public static String bikeToolsToString(BikeTools tools) {
        switch (tools) {
            case WATER_BOTTLE:
                return "Garrafa de Água";
            case TIRE_CHANGE_KIT:
                return "Kit para mudar pnéus";
            default:
                return "Outro";
        }
    }

}
