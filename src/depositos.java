public class depositos {

    private double cant;
    private int cuenta;

    public depositos(double cant, int cuenta) {
        this.cant = cant;
        this.cuenta = cuenta;
    }

    public double getCant() {
        return cant;
    }

    public void setCant(double cant) {
        this.cant = cant;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String toString (){
        System.out.println( "El deposito a la cuenta N° " +cuenta+ " de " +cant+ " dolares a sido completada");
        return null;
    }
}
