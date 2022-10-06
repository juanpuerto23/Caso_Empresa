package modelo;

public class empresa 
{
    //------------------------------
    //---------ATRIBUTOS------------
    //------------------------------
    private int AUX_TRANSPORTE;
    private int fechaIngreso;
    private int horasMensuales;
    private int DialogoHorasSalario;
    public int salario;

    //------------------------------
    //---------METODOS--------------
    //------------------------------

    //Constructor

    public empresa(int pAUX_TRANSPORTE, int phorasMensuales, int pfechaIngreso, int EdadEmpleado, int salario)
    {
        this.fechaIngreso = pfechaIngreso;
        this. horasMensuales = phorasMensuales;
    }

    public int getAUX_TRANSPORTE()
    {
        return this.AUX_TRANSPORTE;
    }

    public int getDialogoHorasSalario()
    {
        return this.DialogoHorasSalario;
    }

    public int getfechaIngreso()
    {
        return this.fechaIngreso;
    }

    public int gethorasMensuales()
    {
        return this.horasMensuales;
    }

    public int getSalario()
    {
        return this.salario;
    }

    public void setfechaIngreso(int pfechaIngreso)
    {
        this.fechaIngreso = pfechaIngreso;
    }

    public void sethorasMensuales(int phorasMensuales)
    {
        this.horasMensuales = phorasMensuales;
    }

    public void sumaTotal(int phorasMensuales)
    {
        if(phorasMensuales!=0)
        {
            sethorasMensuales(phorasMensuales);
        }
    }

    public void EdadEmpleado(int pfechaIngreso)
    {
        if(pfechaIngreso != 2022)
        {
            setfechaIngreso(2022-getfechaIngreso());
        }

    }

    public void AUX_TRANSPORTE() {
    }

    public void horasMensuales(int x, int y) {
    }
}
