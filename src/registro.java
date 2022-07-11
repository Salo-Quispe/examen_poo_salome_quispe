public class registro {

    private String nombre;
    private String apellido;
    private int CI;

    public registro(String nombre, String apellido, int CI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.CI = CI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public String toString (int banco){
        System.out.println( "Cliente " +apellido+nombre+"con CI" +CI);
        return null;
    }
}