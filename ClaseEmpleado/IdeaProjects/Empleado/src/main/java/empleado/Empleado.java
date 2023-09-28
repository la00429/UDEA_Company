package empleado;

public class Empleado {

    // Atributos

    private String nombreEmpleado;

    private String correoElectronico;

    private String nombreEmpresa;

    private String rolEmpleado;

    // getts y setts

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    // Constructores

    public Empleado(String nombreEmpleado, String correoElectronico, String nombreEmpresa, String rolEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.correoElectronico = correoElectronico;
        this.nombreEmpresa = nombreEmpresa;
        this.rolEmpleado = rolEmpleado;
    }

        //metodos
        public void imprimirDetalles(){
            System.out.println("nombreEmpleado: " + nombreEmpleado);
            System.out.println("correoElectronico: " + correoElectronico);
            System.out.println("nombreEmpresa: " + nombreEmpresa);
            System.out.println("rolEmpleado: " + rolEmpleado);

        }
    }


