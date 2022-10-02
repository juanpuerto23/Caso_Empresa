package vista;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
    //----------------------
    //Atributos
    //----------------------
    public JButton bSumaTotal;
    public JButton bCrear;
    public JButton bEdad;
    public JButton bAuxilio;
    public JButton bHorasExtra;
    
    //----------------------
    //Metodos
    //----------------------
    
    //Constructor
    public PanelOperaciones()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de los botones
        bSumaTotal = new JButton("Suma Total");
        bSumaTotal.setFont(new Font("Arial", BOLD, 10));
        bSumaTotal.setBounds(10,20,90,20);
        add(bSumaTotal);
        bSumaTotal.setActionCommand("salario");

        bCrear = new JButton("Crear");
        bCrear.setFont(new Font("Arial", BOLD, 10));
        bCrear.setBounds(390,20,90,20);
        add(bCrear);
        bCrear.setActionCommand("crear");
        
        
        bEdad = new JButton("Edad");
        bEdad.setFont(new Font("Arial", BOLD, 12));
        bEdad.setBounds(105,20,90,20);
        add(bEdad);
        bEdad.setActionCommand("Edad");
        bEdad.setEnabled(false);
        
        bAuxilio = new JButton("Auxilio");
        bAuxilio.setFont(new Font("Arial", BOLD, 12));
        bAuxilio.setBounds(200,20,90,20);
        add(bAuxilio);
        bAuxilio.setActionCommand("Auxilio de transporte");
        bAuxilio.setEnabled(false);
        
        bHorasExtra = new JButton("Horas Extra");
        bHorasExtra.setFont(new Font("Arial", BOLD, 12));
        bHorasExtra.setBounds(295,20,80,20);
        add(bHorasExtra);
        bHorasExtra.setActionCommand("Horas");
        bHorasExtra.setEnabled(false);
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        bCrear.addActionListener(pAL);
        bSumaTotal.addActionListener(pAL);
        bEdad.addActionListener(pAL);
        bAuxilio.addActionListener(pAL);
        bHorasExtra.addActionListener(pAL);
    }

    public void desactivarBotonCrear()
    {
        bCrear.setEnabled(false);
    }

    public void activarBotones()
    {
        bSumaTotal.setEnabled(true);
        bEdad.setEnabled(true);
        bHorasExtra.setEnabled(true);
        bAuxilio.setEnabled(true);
    }
}