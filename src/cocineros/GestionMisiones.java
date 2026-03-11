package cocineros;

import platosCombinados.Mision;

import java.util.ArrayList;

public class GestionMisiones {
    private ArrayList<Mision> misiones;

    public GestionMisiones(){
        this.misiones = new ArrayList<>();
    }

    /**
     * Devuelve el id de la nueva mision creada
     * @param id
     * @param nombre
     * @param dificultad
     * @param nivelRecomendado
     * @param recompensaExperiencia
     * @param completada
     * @return el id de la mision creada.
     */
    public int crearMision(int id, String nombre, String dificultad,int nivelRecomendado,int recompensaExperiencia, boolean completada ){
        int idMisionCreada;

        Mision mision = new Mision(id,nombre, dificultad, nivelRecomendado,recompensaExperiencia,completada);

        idMisionCreada = addMision(mision);

        return idMisionCreada;
    }

    /**
     *
     * @param mision
     * @return
     */
    public int addMision(Mision mision){
        this.misiones.add(mision);

        return mision.getId();
    }

    /**
     * Metodo que muestra todas las misiones
     * @return cadena de texto donde se muestran las misiones
     */
    public String listarMisiones(){
        StringBuilder sb = new StringBuilder("Misiones: { \n");

        for(Mision mision : misiones){
            sb.append("\t");
            sb.append(misiones.toString());
            sb.append("\n");
        }

        return sb.toString();
    }

    /**
     * Metodo que busca la mision por id
     * @param id
     * @return devuelve la mision entera si lo ha encontrado, nulo en caso contrario
     */
    public Mision buscarMisionPorID(int id){
        Mision mision = null;
        boolean seguirBuscando = true;
        int posicion = 0;

        while(!misiones.isEmpty() && seguirBuscando){
            mision = misiones.get(posicion);

            if(mision != null && mision.getId()  == id){

                //mision = misiones.get(posicion);
                seguirBuscando = false;
            }
            posicion++;
        }
        return mision;
    }

    /**
     * Metodo que elimina la mision segun el id que recibimos
     * @param id identificador por el que buscamos la mision que queremos eliminar
     * @return la mision eliminada o null en caso contrario
     */
    public Mision eliminarMision(int id){
        Mision misionEliminada = null;

        if(buscarMisionPorID(id) !=null){
                misionEliminada = buscarMisionPorID(id);
        }

        return misionEliminada;
    }


}




