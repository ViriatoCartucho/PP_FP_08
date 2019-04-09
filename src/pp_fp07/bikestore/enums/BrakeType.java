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
public enum BrakeType {
    P, H;

    public String brakeTypeToString(BrakeType brake) {
        switch (brake) {
            case P:
                return "Pinças";
            case H:
                return "Hidraúlicos";
            default:
                return "Outro";
        }
    }

}
