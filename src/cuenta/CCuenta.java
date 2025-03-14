package cuenta;
/**
 * La clase CCuenta permite realizar operaciones como
 * ingresar y retirar dinero, así como consultar el saldo actual.
 */
public class CCuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    /**
     * Devuelve el saldo actual de la cuenta.
     *
     * @return El saldo actual de la cuenta.
     */
    public double estado()
    {
        return getSaldo();
    }
    /**
     * Ingresa una cantidad de dinero en la cuenta. Si la cantidad es negativa,
     * se lanzará una excepción.
     *
     * @param cantidad La cantidad de dinero a ingresar.
     * @throws Exception Si la cantidad es negativa, se lanzará una excepción.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Retira una cantidad de dinero de la cuenta. Si la cantidad es negativa
     * o si no hay suficiente saldo, se lanzará una excepción.
     *
     * @param cantidad La cantidad de dinero a retirar.
     * @throws Exception Si la cantidad es negativa o si no hay suficiente saldo,
     *                   se lanzará una excepción.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    public void operativa_cuenta(String operacion, float cantidad) {
        try {
            if (operacion.equals("ingresar")) {
                ingresar(cantidad);
                System.out.println("Ingreso realizado: " + cantidad);
            } else if (operacion.equals("retirar")) {
                retirar(cantidad);
                System.out.println("Retiro realizado: " + cantidad);
            } else {
                System.out.println("Operación no válida");
            }
        } catch (Exception e) {
            System.out.println("Error en la operación: " + e.getMessage());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInterés() {
        return tipoInterés;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
