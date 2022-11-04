/**
 * @author Danna Cielo Cardenas Portugal
 * 
 * Describe a un estudiante
 * Todo estudiante tiene un nombre
 * y guarda las 3 notas que ha sacado en cada una de las tres unidades de
 * trabajo que hay en la evaluaci�n
 */
public class Estudiante {
    private String nombre;
    private NotaEstudianteUnidad notaA;
    private NotaEstudianteUnidad notaB;
    private NotaEstudianteUnidad notaC;

    /**
     * Constructor
     * Inicializa el nombre del estudiante y el resto lo deja a null
     * Cuando se crea un estudiante inicialmente no tiene registrada ninguna
     * nota
     */
    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.notaA = null;
        this.notaB = null;
        this.notaC = null;
    }

    /**
     * Accesor para el nombre
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Mutador para el nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la cantidad de notas registradas hasta el momento
     * (0, 1, 2 o 3)
     */
    public int totalNotas() {
        int cantNotasRegis = 0;

        if(notaA ==  null)
        {
            cantNotasRegis = 0;
        }

        if(notaB ==  null)
        {
            cantNotasRegis = 0;
        }

        if(notaC ==  null)
        {
            cantNotasRegis = 0;
        }

        if (notaA !=  null)
        {
            cantNotasRegis ++;
        }

        if (notaB !=  null)
        {
            cantNotasRegis ++;
        }

        if (notaC !=  null)
        {
            cantNotasRegis ++;
        }

        return cantNotasRegis;
    }

    /**
     * registra un nuevo objeto nota, la nota asociada a una unidad
     * Los objetos se sit�an uno detr�s de otro pero siempre han de quedar
     * las notas en orden de fecha de finalizaci�n de la UT asociada (de
     * menor a mayor)
     * 
     * Pista!! En este m�todo se utilizar� el m�todo totalNotas()
     */
    public void registrarNotaUnidad(NotaEstudianteUnidad nota) {
        int notaCantidad = totalNotas();

        if (notaCantidad == 0){
            notaA = nota;
        }
        else if (notaCantidad == 1){
            notaB = nota;
        }

        else if (notaCantidad == 2){
            notaC = nota;
        }
        else if (notaCantidad == 3){
            notaA = nota;
        }
        else if (notaCantidad == 4){
            notaB = nota;
        }

        else if (notaCantidad == 5){
            notaC = nota;
        }
    }

    /**
     * Calcula y devuelve la nota final obtenida por el estudiante en la
     * evaluaci�n que depender� de la ponderaci�n de cada UT
     * El m�todo devuelve -1 si al invocarlo no se han registrado los tres
     * objetos NotaEstudianteUnidad que se necesitan para calcular la nota final
     */
    public double calcularNotaFinalEstudiante() {
        
        if(totalNotas() != 3){
            return -1;
        }
        
        double notaFinal = notaA.calcularNotaUnidad();
        notaB.calcularNotaUnidad();
        notaC.calcularNotaUnidad();
        
        
        return notaFinal;
    }

    /**
     * Representaci�n textual del estudiante (ver enunciado)
     */
    public String toString() {
        

        return null;
    }

    /**
     * Este m�todo se ha incluido solo para testear la clase m�s f�cilmente
     */
    public void print() {
        System.out.println(this.toString());

    }

}
