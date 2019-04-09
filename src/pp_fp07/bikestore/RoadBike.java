package pp_fp07.bikestore;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão<br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 * Classe que representa a estrutura de uma Bicicleta de estrada
 * </p>
 */
public class RoadBike extends Bicycle {

    private float framesize;
    private int handlebelt;
    private String Observations;

    public RoadBike(float framesize, int handlebelt, String observations,
            int id, int numberOfGears, String mainColor, float weelSize,
            float price, int guaranteeYears) {
        super(id, numberOfGears, mainColor, weelSize, price, guaranteeYears);

        this.handlebelt = handlebelt;
        this.framesize = framesize;
        this.Observations = observations;

    }

    public float getFramesize() {
        return framesize;
    }

    public void setFramesize(float framesize) {
        this.framesize = framesize;
    }

    public int getHandlebelt() {
        return handlebelt;
    }

    public void setHandlebelt(int handlebelt) {
        this.handlebelt = handlebelt;
    }

    public String getObservations() {
        return Observations;
    }

    public void setObservations(String Observations) {
        this.Observations = Observations;
    }

    @Override
    public String toString() {
        super.toString();
        System.out.println("Tamado do quadro: " + this.getFramesize());
        System.out.println("Fitas utilizadas no guiador: "
                + this.getHandlebelt());
        System.out.println("Observações: " + this.getObservations());

        return null;
    }
}
