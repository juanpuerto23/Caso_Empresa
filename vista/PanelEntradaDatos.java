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
    private JLabel lbAuTrans;
    private JLabel lbHorasExtra;
    private JLabel lbfechaIngreso;
    private JTextField tfSumTotal;
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
        lbSumTotal = new JLabel("Salario = ");
        lbSumTotal.setBounds(240,40,130,20);
        add(lbSumTotal);
        
        lbAuTrans = new JLabel("Auxilio = ");
        lbAuTrans.setBounds(240,70,130,20);
        add(lbAuTrans);
        
        lbHorasExtra = new JLabel("Horas Extra = ");
        lbHorasExtra.setBounds(240,100,130,20);
        add(lbHorasExtra);
        
        lbfechaIngreso = new JLabel("Fecha Ingreso= ");
        lbfechaIngreso.setBounds(240,130,130,20);
        add(lbfechaIngreso);
        
        
        //Creación y adición de campos de texto
        tfSumTotal= new JTextField("0");
        tfSumTotal.setBounds(350, 40, 60, 20);
        add(tfSumTotal);
        
        tfAuTrans = new JTextField("0");
        tfAuTrans.setBounds(350, 70, 60, 20);
        add(tfAuTrans);

        tfHorasExtra = new JTextField("0");
        tfHorasExtra.setBounds(350, 100, 60, 20);
        add(tfHorasExtra);

        tffechaIngreso = new JTextField("0");
        tffechaIngreso.setBounds(350, 130, 60, 20);
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
    public String getSalario()
    {
        return tfSumTotal.getText();
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
        tfAuTrans.setText("");
        tfHorasExtra.setText("");
    }
}
