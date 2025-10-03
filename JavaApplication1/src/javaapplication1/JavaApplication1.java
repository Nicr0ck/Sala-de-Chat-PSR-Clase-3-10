package javaapplication1;

import java.util.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class JavaApplication1 {

    public static void main(String[] args) {
        ArrayList<Cliente> lista_clientes = new ArrayList<>();
        ArrayList<Mensaje> lista_mensaje = new ArrayList<>();
        
        String puerto = JOptionPane.showInputDialog("Ingresar puerto del server: ");
        String ip = JOptionPane.showInputDialog("Ingresar ip del server: ");
        
        
        int opcion_ingreso = Integer.parseInt(JOptionPane.showInputDialog("¿Desea ingresar al programa? 1-Sí | 2-No"));
        do{
            int option_menu = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción:"));
            
            switch(option_menu){
                case 1: 
                    JOptionPane.showMessageDialog(null, "Has seleccionado: Enviar mensaje");
                    break;
                    
                case 2: 
                    JOptionPane.showMessageDialog(null, "Has seleccionado: Editar mensaje");
                    break;
                    
                case 3: 
                    JOptionPane.showMessageDialog(null, "Has seleccionado: Mostrar mensajes");
                    break;
                    
                case 4: 
                    JOptionPane.showMessageDialog(null, "Has seleccionado: Mostrar ip y puerto");
                    break;
                    
                default:
                    break;
            }
            
        } while (opcion_ingreso!=2);
        
    }
}
