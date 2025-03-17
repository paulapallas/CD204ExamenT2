package paulapallas;


import java.util.ArrayList;

public class ListaTareas {

    private String tarea;
    private boolean feita;
    private ArrayList<String> tareas;


    public ListaTareas (String tarea, boolean feita){
        this.tarea= tarea;
        this.feita=false;
        this.tareas= new ArrayList<>();

    }


    public void agregarTarea(String tarea2) {
        tareas.add(tarea2);
       
    }


    public void marcarTareaComoCompletada(int i) {
        
    }


    public Object obtenerNumeroTareasPendientes() {
       
    }


    
}
