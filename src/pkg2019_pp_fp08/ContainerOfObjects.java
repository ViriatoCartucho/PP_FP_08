/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2019_pp_fp08;

/**
 *
 * @author Utilizador
 */
public class ContainerOfObjects {

    /**
     * Número de objectos, por defeito
     */
    private final int DEFAULT_SIZE = 100;
    /**
     * Conjunto de objectos
     */
    private Object[] objects;

    /**
     * Constructor que permite a instanciação da classe tendo por base um vetor
     * de elementos recebido
     *
     * @param objects Lista de objectos sem tamanho fixo
     */
    public ContainerOfObjects(Object[] objects) {

        this.objects = objects;
    }

    /**
     * Constructor que permite a instanciação da classe tendo por base um valor
     * por defeito(100)
     */
    public ContainerOfObjects() {

        this.objects = new Object[DEFAULT_SIZE];
    }

    /**
     * Construtor que permite a instanciação da classe defenindo um valor máximo
     * de elementos
     *
     * @param maxSize número máximo de elementos permitidos no vetor
     */
    public ContainerOfObjects(int maxSize) {

        this.objects = new Object[maxSize];
    }

    /**
     * Método responsável por inserir um {@link Object objecto} na coleção de
     * {@link ContainerOfObjects#objects objectos}
     *
     * @param newObject {@link Object objecto} a inserir no vetor
     * @return valor booleano que sinaliza o sucesso/insucesso da operação
     */
    protected boolean addObject(Object newObject) {
        boolean flag = false;
        for (int i = 0; i < this.objects.length; i++) {
            if (this.objects[i] == null) {
                this.objects[i] = newObject;
                flag = true;
            }
        }
        return flag;
    }

    /**
     * Método responsável por remover um {@link Object objecto} do vetor de
     * {@link ContainerOfObjects#objects objectos}
     *
     * @param position indice correspondente ao elemento a eliminar
     * @return o {@link Object objecto} eliminado
     */
    protected Object removeObject(int position) {
        Object object = null;
        for (Object object1 : this.objects) {
            object = this.objects[position];
            this.objects[position] = null;
        }
        return object;
    }

    /**
     * Método responsável por substituir um {@link Object objecto} no vetor de
     * {@link ContainerOfObjects#objects objectos}
     *
     * @param position indice correspondente ao elemento a modificar
     * @param newObject novo objecto a colocar no vetor
     * @return valor booleano que sinaliza o sucesso/insucesso da operação
     */
    protected boolean setObject(int position, Object newObject) {

        boolean flag = false;
        for (Object object1 : this.objects) {
            this.objects[position] = newObject;
            flag = true;
        }
        return flag;
    }
    /**
     * Método responsável por encontrar um {@link Object objecto} no vetor de
     * {@link ContainerOfObjects#objects objectos}
     * 
     * @param obj objecto que queremos encontrar
     * @return o indice da posição onde se encontra o objecto 
     */
    protected int finodObject(Object obj) {
        int objectRef = 0;
        for (int i = 0; i < this.objects.length; i++) {
            if (this.objects[i] == obj) {
                objectRef = i;
            }
        }
        return objectRef;
    }
}
