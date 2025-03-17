package paulapallas;

import java.util.ArrayList;

public class ListaTareas {

    private String tarea;
    private boolean feita;
    private ArrayList<String> tareas;

    public ListaTareas() {
        this.feita = false;
        this.tareas = new ArrayList<>();

    }

    public void agregarTarea(String tarea) {
        tareas.add(tarea);

    }

    public void marcarTareaComoCompletada(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            ListaTareas.setFeita(true); // Cambiamos o estado da tarefa
        }
    }


    public void obtenerNumeroTareasPendientes(int indice) {
        
    }

   

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public boolean isFeita() {
        return feita;
    }

    public static void setFeita(boolean feita) {
        feita = false;
    }

    public ArrayList<String> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<String> tareas) {
        this.tareas = tareas;
    }

}
