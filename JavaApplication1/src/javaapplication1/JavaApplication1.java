package javaapplication1;

import java.util.*;
import javax.swing.JOptionPane;

public class JavaApplication1 {

    public static void main(String[] args) {
        ArrayList<Cliente> lista_clientes = new ArrayList<>();
        ArrayList<Mensaje> lista_mensaje = new ArrayList<>();
        
        String puerto = JOptionPane.showInputDialog("Ingresar puerto del server: ");
        String ip = JOptionPane.showInputDialog("Ingresar ip del server: ");
        servidor servidor = new servidor(ip, puerto);
        
        int opcion_ingreso;
        
        do {
            opcion_ingreso = Integer.parseInt(
                JOptionPane.showInputDialog("¿Desea ingresar al programa? 1-Sí | 2-No")
            );
            
            if (opcion_ingreso == 1) {
                int option_menu = Integer.parseInt(
                    JOptionPane.showInputDialog(
                        "Seleccione una opción:"
                                + "\n1-Enviar mensaje"
                                + "\n2-Editar mensaje"
                                + "\n3-Mostrar mensajes"
                                + "\n4-Mostrar ip y puerto"
                    )
                );

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
                        JOptionPane.showMessageDialog(null, "IP: " + servidor.ip + "\nPuerto: " + servidor.puerto);
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "No valido");
                        break;
                }
            }
        } while (opcion_ingreso != 2);
    }
}