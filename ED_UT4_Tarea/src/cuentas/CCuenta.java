package cuentas;


/**
 * DAM 2024-2025
 * alumno: Santiago Carrión Lucas
 * Ejercicio UT04
 */
public class CCuenta {


	/**
	 * obtenemos el nombre de la persona que es titular de la cuenta
	 * @return Nombre titular
	 */
    public String getNombre() {
		return nombre;
	}
    /**
     * Modificamos el nombre del titular de la cuenta
     * @param nombre
     */

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * devuelve el número de cuenta
	 * @return Número de la cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * modificamos el número de la cuenta	
	 * @param cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * obtendremos el saldo de la cuenta
	 * @return saldo de la cuenta
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Modificamos el salde la la cuenta
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Devuelve el tipo de interes aplicado
	 * @return tipo de interés aplicado
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}
	
	/** modificamos el tipo de interes
	 * 
	 * @param tipoInterés
	 */

	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /** 
     * Constructore sin datos
     */
    public CCuenta()
    {
    }

    /**
     * constructor con datos
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
    }

    
    /**
     * Devuelve el saldo
     * @return saldo de la cuenta
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Hacemos un ingreso en la cuenta
     * @param cantidad
     * @throws Exception Cuando la cantidad sea negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    
    /**
     * retira una cantidad de dinero
     * @param cantidad cantidad a reitrar
     * @throws Exception si la cantidad a retira es 0 o negativa
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
