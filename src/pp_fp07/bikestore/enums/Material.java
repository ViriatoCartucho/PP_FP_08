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
public enum Material {
    CARBON, ALUMINIUM;

    public String materialToString(Material material) {
        switch (material) {
            case CARBON:
                return "Carbono";
            case ALUMINIUM:
                return "Alumínio";
            default:
                return "Outro";

        }
    }

}
