/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.daños;

/**
 *
 * @author aulas4
 */
public interface EvaluableRiesgo {
 
    NivelRiesgo calcularNivelRiesgo();
 
    // por defecto: evacuar si el riesgo es ALTO o mas
    default boolean requiereEvacuacion() {
        return calcularNivelRiesgo().esAlMenos(NivelRiesgo.ALTO);
    }
}

