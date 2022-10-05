package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import modelo.empresa;
import vista.DialogoHorasSalario;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    //--------------------------------
    //Atributos
    //--------------------------------
    private VentanaPrincipal venPrin;
    private empresa model;

    //--------------------------------
    //Metodos
    //--------------------------------

    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, empresa pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        String comando = ae.getActionCommand();

        if(comando.equals("crear"))
        {
            try
            {
                int horasMensuales = Integer.parseInt(venPrin.miPanelEntradaDatos.getHorasMensuales());
                int salario = Integer.parseInt(venPrin.miPanelEntradaDatos.getSalario());
                int EdadEmpleado = Integer.parseInt(venPrin.miPanelEntradaDatos.getEdadEmpleado());
                int AUX_TRANSPORTE = Integer.parseInt(venPrin.miPanelEntradaDatos.getAUX_TRANSPORTE());
                int fechaIngreso = Integer.parseInt(venPrin.miPanelEntradaDatos.getfechaIngreso());
                //Creación del objeto tipo Carro
                model = new empresa(AUX_TRANSPORTE, fechaIngreso, horasMensuales, EdadEmpleado, salario);

                venPrin.miPanelResultado.mostrarResultado("Usted gana " + salario + " salarios minimos");
                venPrin.miPanelResultado.mostrarResultado("Sus horas trabajadas son " + horasMensuales);
                venPrin.miPanelResultado.mostrarResultado("Su valoracion es de " + horasMensuales);
                venPrin.miPanelResultado.mostrarResultado("Su edad es de " + EdadEmpleado);
                venPrin.miPanelResultado.mostrarResultado("Su auxilio de transporte es " + AUX_TRANSPORTE);
                venPrin.miPanelResultado.mostrarResultado("Su antiguedad es de " + (2022 - fechaIngreso) + " años");

                //Desactivar boton crear
                venPrin.miPanelOperaciones.desactivarBotonCrear();
                //Activar botones
                venPrin.miPanelOperaciones.activarBotones();
                

            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error en datos de entrada", "Error", JOptionPane.ERROR_MESSAGE);
            }   
        }

        if(comando.equals("salario"))
        {   
            venPrin.crearDialogoMover();
            this.venPrin.miDialogoSalario.agregarOyentesBotones(this);  
        }
        
        if(comando.equals("Horas"))
        {
            int x = Integer.parseInt(DialogoHorasSalario.getHorasMensuales());
            int y = Integer.parseInt(DialogoHorasSalario.getHorasMensuales());
            model.horasMensuales(x, y);
            venPrin.miPanelResultado.mostrarResultado("\nSu numero de horas totales es (" + model.gethorasMensuales()+"," + model.gethorasMensuales()+")");
            ((DialogoHorasSalario) venPrin.miDialogoSalario).cerrarDialogo();
        }
        
        if(comando.equals("Edad"))
        {
            model.EdadEmpleado(0);
            venPrin.miPanelResultado.mostrarResultado("\n su edad actual es" + model.getEdadEmpleado());
        }
        
        if(comando.equals("Auxilio de transporte"))
        {
            model.AUX_TRANSPORTE();
            venPrin.miPanelResultado.mostrarResultado("\n Su auxilio de transporte es" + model.getAUX_TRANSPORTE());
        }
    }    
}