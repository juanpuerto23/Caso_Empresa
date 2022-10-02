package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //------------------------
    //Atributos
    //------------------------
    private JLabel lbImagen;
    private ImageIcon iImagen;
    private JLabel lbSumTotal;
    private JLabel lbEdad;
    private JLabel lbAuTrans;
    private JLabel lbHorasExtra;
    private JLabel lbfechaIngreso;
    private JTextField tfSumTotal;
    private JTextField tfEdad;
    private JTextField tfAuTrans;
    private JTextField tfHorasExtra;
    private JTextField tffechaIngreso;
    
    //------------------------
    //Metodos
    //------------------------
    
    //Constructor
    public PanelEntradaDatos()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        //Creación y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/empresa.jpg"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10,10,220,176);
        add(lbImagen);
        
        //Creación y adición de etiquetas Color, PosX y PosY
        lbSumTotal = new JLabel("Suma = ");
        lbSumTotal.setBounds(230,10,60,20);
        add(lbSumTotal);
        
        lbEdad = new JLabel("Edad = ");
        lbEdad.setBounds(230,40,60,20);
        add(lbEdad);
        
        lbAuTrans = new JLabel("AuTrans = ");
        lbAuTrans.setBounds(230,70,60,20);
        add(lbAuTrans);
        
        lbHorasExtra = new JLabel("HorasEx = ");
        lbHorasExtra.setBounds(230,100,60,20);
        add(lbHorasExtra);
        
        lbfechaIngreso = new JLabel("Fecha Ingreso= ");
        lbfechaIngreso.setBounds(230,130,60,20);
        add(lbfechaIngreso);
        
        
        //Creación y adición de campos de texto
        tfSumTotal= new JTextField("0");
        tfSumTotal.setBounds(300, 10, 60, 20);
        add(tfSumTotal);
        
        tfEdad = new JTextField("0");
        tfEdad.setBounds(300, 40, 60, 20);
        add(tfEdad);
        
        tfAuTrans = new JTextField("0");
        tfAuTrans.setBounds(300, 70, 60, 20);
        add(tfAuTrans);

        tfHorasExtra = new JTextField("0");
        tfHorasExtra.setBounds(300, 100, 60, 20);
        add(tfHorasExtra);

        tffechaIngreso = new JTextField("0");
        tffechaIngreso.setBounds(300, 130, 60, 20);
        add(tffechaIngreso);
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }
    
    //Metodos de acceso a la información de las cajas de texto
    public String getfechaIngreso()
    {
        return tffechaIngreso.getText();
    }
    public String getSuma()
    {
        return tfSumTotal.getText();
    }
    
    public String getEdadEmpleado()
    {
        return tfEdad.getText();
    }
    
    public String getAUX_TRANSPORTE()
    {
        return tfAuTrans.getText();
    }
    public String getHorasMensuales()
    {
        return tfHorasExtra.getText();
    }
    
    //Metodo para borrar cajas de texto
    public void borrar()
    {
        tfSumTotal.setText("");
        tfEdad.setText("");
        tfAuTrans.setText("");
        tfHorasExtra.setText("");
    }
}
