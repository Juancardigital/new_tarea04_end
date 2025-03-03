package cuentas;
/**@author juancar
*clase funcionamiento Cuenta corriente
**/
public class CCuenta {

    private String nombre;

    /**
	 * método getter  
	 * @return nombre = nombre. Devuelve el nombre del titular de la cuenta  
	 **/
    public String getNombre() {
		return nombre;
	}

    /**
     * método setter 
     * @param nombre = nombre. Nombre del titular de la cuenta
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * método getter
	 * @return cuenta = nº de cuenta corriente. Devuelve el nº de cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * método setter 
	 * @param cuenta = nº de cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * método getter. Devuelve el saldo de la cuenta 
	 * @return saldo = saldo cuenta corriente
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * método setter
	 * @param saldo = importe de la cuenta corriente
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * método getter. Devuelve el tipo de interés aplicable a la cuenta
	 * @return tipoInteres = Tipo de interés
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * método setter
	 * @param tipoInteres = tipo de interés de la cuenta
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	private String cuenta;
    private double saldo;
    private double tipoInteres;

/**
 * Constructor que incializa los parámetros de clase de la cuenta
 * @param nom = persona titular de la cuenta
 * @param cue = número de cuenta
 * @param sal = cantidad de saldo en la cuenta (salario)
 * @param tipo = tipo de interés aplicable a la cuenta
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * estado de la cuenta (saldo)
     * @return saldo = saldo de la cuenta
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * ingreso cantidad de la cuenta
     * @param cantidad = ingresar
     * @throws Exception >> Si cantidad es menor o igual a 0, NO se puede ingresar
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * retirar cantidad de la cuenta
     * @param cantidad = retirar
     * @throws Exception >> Si la cantidad es menor o igual a 0, NO se puede ingresar
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
