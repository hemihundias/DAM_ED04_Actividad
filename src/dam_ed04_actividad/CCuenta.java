/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;

/**
* Esta clase contiene los elementos para operar con una cuenta
* @author David Pardo Calvo
* @version 25/02/2020
*/
public class CCuenta {
    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor por defecto para la clase CCuenta
     * 
     */
    public CCuenta()
    {
    }
    
     /**
     * Constructor para la clase CCuenta
     * 
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
    
    /**
     * @param nom nombre set
     * @see setNombre()
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    
    /**
     * @return cuenta
     * @see getNombre()
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * @return saldo
     * @see getSaldo()
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método que usaremos para ingresar una cantidad en la cuenta
     * @param cantidad
     * @throws java.lang.Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Método que usaremos para retirar una cantidad de la cuenta
     * @param cantidad
     * @throws java.lang.Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * @return cuenta
     */
    public String obtenerCuenta()
    {
        return getCuenta();
    }

    /**
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre nombre set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return tipo interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés tipo interés set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    /**
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta cuenta set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo saldo set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
