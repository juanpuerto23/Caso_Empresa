package ejecutable;

import controlador.Controlador;
import modelo.empresa;
import vista.VentanaPrincipal;

public class Test
{
    public static void main(String[] args)
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        empresa miEmpresa = null;
        Controlador miControlador = new Controlador(miVentana, miEmpresa);

    }
}