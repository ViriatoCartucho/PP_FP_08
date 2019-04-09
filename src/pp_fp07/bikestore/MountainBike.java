package pp_fp07.bikestore;

import pp_fp07.bikestore.enums.BikeTools;
import pp_fp07.bikestore.enums.BrakeType;
import pp_fp07.bikestore.enums.Material;
import pp_fp07.bikestore.enums.MountainBikeSuspension;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão<br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 * Classe que representa a estrutura de uma Bicicleta de montanha
 * </p>
 */
public class MountainBike extends Bicycle {

    /**
     * Número de luzes
     */
    private int numberOfLights;
    /**
     * Tipo de suspensão
     */
    private MountainBikeSuspension suspension;
    /**
     * Utensílios existentes neste tipo de bicicleta
     */
    private BikeTools[] bikeTools;
    /**
     * Número máximo de utensílios para cada bicicleta 
     */
    private final int NUMBER_OF_TOOLS = 10;

    /**
     * Método construtor para a criação de uma instância de
     * {@link MountainBike bicicleta de montanha} sem utensílios.
     *
     * @param numberOfLights Número de luzes
     * @param suspension Tipo de suspensão
     * @param id Identificador da bicicleta
     * @param numberOfGears Número de velocidades
     * @param mainColor Cor da bicicleta
     * @param weelSize Diâmetro das rodas
     * @param brakes {@link BrakeType tipo de travões} da bicicleta
     * @param material {@link Material tipo de material} da bicicleta
     * @param price Preço da bicicleta
     * @param guarantee Anos de garantia
     */
    public MountainBike(int numberOfLights, MountainBikeSuspension suspension,
            int id, int numberOfGears, String mainColor, float weelSize,
            BrakeType brakes, Material material, float price, int guarantee) {
        super(id, numberOfGears, mainColor, weelSize, brakes, material,
                price, guarantee);
        this.numberOfLights = numberOfLights;
        this.suspension = suspension;
        this.bikeTools = new BikeTools[NUMBER_OF_TOOLS];
    }

    public int getNumberOfLights() {
        return numberOfLights;
    }

    public void setNumberOfLights(int numberOfLights) {
        this.numberOfLights = numberOfLights;
    }

    public MountainBikeSuspension getSuspension() {
        return suspension;
    }

    public void setSuspension(MountainBikeSuspension suspension) {
        this.suspension = suspension;
    }

    public BikeTools[] getBikeTools() {
        return bikeTools;
    }

    public void setBikeTools(BikeTools[] bikeTools) {
        this.bikeTools = bikeTools;
    }

    public void insertTool(BikeTools[] bikeTools, BikeTools tool) {
        boolean flagFound = false;
        for (int i = 0; i < bikeTools.length; i++) {
            if (this.bikeTools[i] == tool) {
                flagFound = true;
            }
        }
        boolean flagNew = false;
        if (flagFound != true) {
            for (int i = 0; i < bikeTools.length; i++) {
                if (bikeTools[i] == null) {
                    if (flagNew == false) {
                        bikeTools[i] = tool;
                        flagNew = true;
                    }
                }
            }
        }
    }

    public void editTool(BikeTools[] bikeTools, BikeTools tool_1,
            BikeTools tool_2) {
        for (int i = 0; i < bikeTools.length; i++) {
            if (bikeTools[i] == tool_1) {
                bikeTools[i] = tool_2;
            }
        }
    }

    public void removeTool(BikeTools[] bikeTools, BikeTools tool) {
        for (int i = 0; i < bikeTools.length; i++) {
            if (bikeTools[i] == tool) {
                bikeTools[i] = null;
            }
        }
    }

    public void listTool(BikeTools[] bikeTools) {
        for (BikeTools tools : bikeTools) {
            System.out.println(tools.bikeToolsToString(tools));
        }
    }

    @Override
    public String toString() {
        super.toString();
        System.out.println("Número de Luzes: " + this.getNumberOfLights());
        System.out.println("Tipo de Suspensão: "
                + this.getSuspension().mountainBikeSuspensionToString(getSuspension()));
        for (BikeTools bTools : getBikeTools()) {
            if (bTools != null) {
                System.out.print("Ferramentas: ");
                System.out.println(BikeTools.bikeToolsToString(bTools));
            }
        }
        System.out.println("\n");
        return null;

    }
}
