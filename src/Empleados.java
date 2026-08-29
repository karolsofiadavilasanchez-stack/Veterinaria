public class Empleados {
    private String nombre = "";
    private int edad =0;
    private double salario =0;
    private String puesto ="";

    public Empleados(String nombre, int edad, double salario, String puesto) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.puesto = puesto;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public String getPuesto(){
        return this.puesto;
    }
    public void setPuesto(String puesto){
        this.puesto = puesto;
    }
    public void trabajar(){
        System.out.println("Empleado trabajando");
    }
    
}
