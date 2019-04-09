package pp_fp07.bikestore;

import pp_fp07.bikestore.enums.BrakeType;
import pp_fp07.bikestore.enums.Material;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão<br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 * Classe que representa a estrutura de uma Bicicleta
 * </p>
 */
public class Bicycle {

    /**
     * Identificador numérico da bicicleta
     */
    private int id;
    /**
     * Número de velocidades
     */
    private int numberOfGears;
    /**
     * Cor da bicicleta
     */
    private String mainColor;
    /**
     * Diâmetro das rodas
     */
    private float weelSize;

    /**
     * Tipo de travões TODO: BrakeType
     */
    private BrakeType brakes;

    /**
     * Tipo de material TODO: Material
     */
    private Material material;

    /**
     * Preço da bicicleta
     */
    private float price;

    /**
     * Número de anos de garantia
     */
    private int guaranteeYears;

    /**
     * Método construtor para a criação de uma instância de .
     * {@link Bicycle bicicleta}
     *
     * @param id Identificador da bicicleta
     * @param numberOfGears Número de velocidades
     * @param mainColor Cor da bicicleta
     * @param weelSize Diâmetro das rodas
     * @param brakes {@link BrakeType tipo de travões} da bicicleta
     * @param material {@link Material tipo de material} da bicicleta
     * @param price Preço da bicicleta
     * @param guaranteeYears Anos de garantia da bicicleta
     */
    public Bicycle(int id, int numberOfGears, String mainColor, float weelSize,
            BrakeType brakes, Material material, float price, int guaranteeYears) {
        this.id = id;
        this.numberOfGears = numberOfGears;
        this.mainColor = mainColor;
        this.weelSize = weelSize;
        this.brakes = brakes;
        this.material = material;
        this.price = price;
        this.guaranteeYears = guaranteeYears;
    }

    /**
     * Método construtor para a criação de uma instância de .
     * {@link Bicycle bicicleta} com o tipo de travão e de material predefinido.
     * Travão sendo hidraúlico e o material sendo carbono
     *
     * @param id Identificador da bicicleta
     * @param numberOfGears Número de velocidades
     * @param mainColor Cor da bicicleta
     * @param weelSize Diâmetro das rodas
     * @param price Preço da bicicleta
     * @param guaranteeYears Anos de garantia da bicicleta
     */
    public Bicycle(int id, int numberOfGears, String mainColor, float weelSize,
            float price, int guaranteeYears) {
        this.id = id;
        this.numberOfGears = numberOfGears;
        this.mainColor = mainColor;
        this.weelSize = weelSize;
        this.brakes = BrakeType.H;
        this.material = Material.CARBON;
        this.price = price;
        this.guaranteeYears = guaranteeYears;
    }

    /**
     * Método getter para a variável de instância {@link Bicycle#id id}
     *
     * @return o {@link Bicycle#id id} de uma bicicleta
     */
    public int getId() {
        return id;
    }

    /**
     * Método setter para a variável de instância {@link Bicycle#id id}
     *
     * @param id {@link Bicycle#id id} de uma bicicleta
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Método getter para a variável de instância
     * {@link Bicycle#numberOfGears numberOfGears}
     *
     * @return o {@link Bicycle#numberOfGears numberOfGears} de uma bicicleta
     */
    public int getNumberOfGears() {
        return numberOfGears;
    }

    /**
     * Método setter para a variável de instância
     * {@link Bicycle#numberOfGears NumberOfGears}
     *
     * @param numberOfGears {@link Bicycle#numberOfGears NumberOfGears} de uma
     * bicicleta
     */
    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    /**
     * Método getter para a variável de instância
     * {@link Bicycle#mainColor mainColor}
     *
     * @return o {@link Bicycle#mainColor mainColor} de uma bicicleta
     */
    public String getMainColor() {
        return mainColor;
    }

    /**
     * Método setter para a variável de instância
     * {@link Bicycle#mainColor mainColor}
     *
     * @param mainColor {@link Bicycle#mainColor mainColor} de uma bicicleta
     */
    public void setMainColor(String mainColor) {
        this.mainColor = mainColor;
    }

    /**
     * Método getter para a variável de instância
     * {@link Bicycle#weelSize weelSize}
     *
     * @return o {@link Bicycle#weelSize weelSize} de uma bicicleta
     */
    public float getWeelSize() {
        return weelSize;
    }

    /**
     * Método setter para a variável de instância
     * {@link Bicycle#weelSize weelSize}
     *
     * @param weelSize {@link Bicycle#weelSize weelSize} de uma bicicleta
     */
    public void setWeelSize(float weelSize) {
        this.weelSize = weelSize;
    }

    /**
     * Método getter para a variável de instância {@link Bicycle#brakes brakes}
     *
     * @return o {@link Bicycle#brakes brakes} de uma bicicleta
     */
    public BrakeType getBrakes() {
        return brakes;
    }

    /**
     * Método setter para a variável de instância {@link Bicycle#brakes brakes}
     *
     * @param brakes {@link Bicycle#brakes brakes} de uma bicicleta
     */
    public void setBrakes(BrakeType brakes) {
        this.brakes = brakes;
    }

    /**
     * Método getter para a variável de instância
     * {@link Bicycle#material material}
     *
     * @return o {@link Bicycle#material material}
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * Método setter para a variável de instância
     * {@link Bicycle#material material}
     *
     * @param material {@link Bicycle#material material}
     */
    public void setMaterial(Material material) {
        this.material = material;
    }

    /**
     * Método getter para a variável de instância {@link Bicycle#price price}
     *
     * @return o {@link Bicycle#price price}
     */
    public float getPrice() {
        return price;
    }

    /**
     * Método setter para a variável de instância {@link Bicycle#price price}
     *
     * @param price {@link Bicycle#price price}
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * Método getter para a variável de instância
     * {@link Bicycle#guaranteeYears guaranteeYears}
     *
     * @return o {@link Bicycle#guaranteeYears guaranteeYears}
     */
    public int getGuaranteeYears() {
        return guaranteeYears;
    }

    /**
     * Método setter para a variável de instância
     * {@link Bicycle#guaranteeYears guaranteeYears}
     *
     * @param guaranteeYears {@link Bicycle#guaranteeYears guaranteeYears}
     */
    public void setGuaranteeYears(int guaranteeYears) {
        this.guaranteeYears = guaranteeYears;
    }

    /**
     * Método toString
     *
     * @return
     */
    @Override
    public String toString() {

        System.out.println("!!!!!------- Bicicleta: -------!!!!!");
        System.out.println("ID: " + this.getId());
        System.out.println("Número de Mudanças: " + this.getNumberOfGears());
        System.out.println("Cor: " + this.getMainColor());
        System.out.println("Tamanho da Roda: " + this.getWeelSize() + " cm");
        System.out.println("Tipo de travões: " + this.brakes.brakeTypeToString(brakes));
        System.out.println("Material: " + this.material.materialToString(material));
        System.out.println("Preço: " + this.getPrice() + " €");
        System.out.println("Garantia: " + this.getGuaranteeYears());
        System.out.println(" ");

        return null;
    }

}
