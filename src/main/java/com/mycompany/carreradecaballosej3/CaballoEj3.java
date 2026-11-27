/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carreradecaballosej3;

import java.util.Random;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

/**
 *
 * @author andrea
 */
public class CaballoEj3 implements Runnable {

    private String nombreCaballo;
    private int tiempo;
    private JProgressBar barra; 

    public CaballoEj3(String nombreCaballo, JProgressBar barra) {
        this.nombreCaballo = nombreCaballo;
        this.barra = barra;
    }

    //Punto de entrada del hilo
    //Los hilos comienzan a ejecutarse aquí, codigo que se ejecutará simultaneamente
    @Override
    public void run() {
        System.out.println("Sale " + nombreCaballo);
        try {
            Random timeAleatorio = new Random();
            
            // La carrera tiene 10 tramos
            for (int contar = 0; contar < 10; contar++) {
                
            // Tiempo aleatorio de este tramo: entre 200 y 800 ms    
            int numero = timeAleatorio.nextInt(601) + 200;
            
            // El caballo "corre" este tramo (está en ms )
            Thread.sleep(numero);
            
            // Se SUMA al tiempo total, no se sustituye
            tiempo += numero;
            
            int tramo = contar +1;
            
            // Solo el hilo de la interfaz puede tocar la ventana
            SwingUtilities.invokeLater(() -> {
                barra.setValue(tramo);
            });
 
        }
           
            System.out.println("Soy el caballo " + nombreCaballo + " he tardado " + (tiempo / 1000.0) + " segundos");
            

        } catch (InterruptedException exc) {
            System.out.println(nombreCaballo + " Interrumpido, ");
        }
    }

    //Getters
    public String getNombreCaballo() {
        return nombreCaballo;
    }

    public int getTiempo() {
        return tiempo;
    }

}
