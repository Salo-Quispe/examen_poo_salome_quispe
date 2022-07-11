public class retiros {

    private double cantidad;

    public retiros(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String toString (){
        System.out.println( "El retiro de " +cantidad+ " dolares a sido completado");
        return null;
    }
}
