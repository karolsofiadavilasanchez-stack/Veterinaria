public class Veterianrio extends Empleados{
    private String turno ="";
    public Vererinario (String nombre, int edad, double salario, String puesto, String turno) {
        super(nombre, edad, salario, puesto);
        this.turno = turno;
    }
    public String getTurno(){
        return this.turno;
    }
    public void setTurno(String turno){
        this.turno = turno;
    }
    @Override
    public void trabajar(){
        System.out.println("Recepcionista trabajando");
    }

    
}
