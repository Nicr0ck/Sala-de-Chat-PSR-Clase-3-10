/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

public class Cliente {
    public String nombreUsuario;
    public String destinatario;
    public String horaDeEnvio;
    public String[] gruposPrivados;
    public String[] mensajes;

    public Cliente(String nombreUsuario, String destinatario, String horaDeEnvio, String[] gruposPrivados, String[] mensajes) {
        this.nombreUsuario = nombreUsuario;
        this.destinatario = destinatario;
        this.horaDeEnvio = horaDeEnvio;
        this.gruposPrivados = gruposPrivados;
        this.mensajes = mensajes;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getHoraDeEnvio() {
        return horaDeEnvio;
    }

    public void setHoraDeEnvio(String horaDeEnvio) {
        this.horaDeEnvio = horaDeEnvio;
    }

    public String[] getGruposPrivados() {
        return gruposPrivados;
    }

    public void setGruposPrivados(String[] gruposPrivados) {
        this.gruposPrivados = gruposPrivados;
    }

    public String[] getMensajes() {
        return mensajes;
    }

    public void setMensajes(String[] mensajes) {
        this.mensajes = mensajes;
    }
}
