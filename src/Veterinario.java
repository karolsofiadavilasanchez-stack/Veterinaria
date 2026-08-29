public class Veterinario extends Empleados{
    private String especialidad="";
    public Veterinario(String nombre, int edad, double salario, String puesto, String especialidad){
        super(nombre, edad, salario, puesto);
        this.especialidad = especialidad;
    }
        
    }
    public String getEspecialidad(){
        return this.especialidad;
    }
    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }
    @Override
    public void trabajar(){
        System.out.println("Veterinario en consultaS");
    }

    
}
