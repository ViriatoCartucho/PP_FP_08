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
public enum MountainBikeSuspension {
    SIMPLE, DOUBLE;

    public String mountainBikeSuspensionToString(MountainBikeSuspension suspension) {

        switch (suspension) {
            case SIMPLE:
                return "Suspensão simples";
            case DOUBLE:
                return "Suspensão dupla";
            default:
                return "Não tem suspnsão";
        }
    }

}
