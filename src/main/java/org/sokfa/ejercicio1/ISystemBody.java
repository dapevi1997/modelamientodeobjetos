package org.sokfa.ejercicio1;

/**
 * Interfaz para proveer constante universal y obligar a crear método para
 * calcular la fuerza de atracción entre dos cuerpos.
 *
 * @version 1.0.0 2022-06-02
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
public interface ISystemBody {

    /**
     * Constante de gravitavión universal en N*m^2*kg^-2
     */
    double G = 6.67E-11 * 1E-6;

    /**
     * Método para establecer la distancia entre dos cuerpos.
     *
     * @param body1 tipo object, primer cuerpo.
     * @param body2 tipo object, segundo cuerpo.
     * @return Distancia entre los dos cuerpos.
     */
    double distanceBetweenTwoBodies(SystemBody body1, SystemBody body2);
}
