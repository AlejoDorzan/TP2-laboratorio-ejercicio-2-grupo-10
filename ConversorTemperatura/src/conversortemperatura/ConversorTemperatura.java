
package conversortemperatura;

import javax.swing.*;

public class ConversorTemperatura extends JFrame {

    // Declaración de componentes
    private JLabel lblTitulo, lblIngreso, lblResultado;
    private JTextField txtTemperatura;
    private JRadioButton rbtnCelsius, rbtnFahrenheit, rbtnKelvin;
    private ButtonGroup grupoOpciones;
    private JButton btnConvertir;
    private JTextArea areaResultado;

    public ConversorTemperatura() {
        // Configuración de la ventana
        setTitle("Conversor de Temperatura");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar ventana
        setLayout(null); // Usamos posiciones absolutas

        // Crear componentes
        lblTitulo = new JLabel("Conversor de Temperatura");
        lblTitulo.setBounds(100, 10, 200, 30);

        lblIngreso = new JLabel("Ingrese temperatura:");
        lblIngreso.setBounds(30, 60, 150, 25);

        txtTemperatura = new JTextField();
        txtTemperatura.setBounds(180, 60, 100, 25);

        // RadioButtons
        rbtnCelsius = new JRadioButton("Celsius");
        rbtnFahrenheit = new JRadioButton("Fahrenheit");
        rbtnKelvin = new JRadioButton("Kelvin");

        rbtnCelsius.setBounds(30, 100, 100, 25);
        rbtnFahrenheit.setBounds(140, 100, 100, 25);
        rbtnKelvin.setBounds(250, 100, 100, 25);

        grupoOpciones = new ButtonGroup();
        grupoOpciones.add(rbtnCelsius);
        grupoOpciones.add(rbtnFahrenheit);
        grupoOpciones.add(rbtnKelvin);

        // Botón
        btnConvertir = new JButton("Convertir");
        btnConvertir.setBounds(140, 140, 100, 30);

        // Área de resultado
        lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(30, 180, 100, 25);

        areaResultado = new JTextArea();
        areaResultado.setBounds(30, 210, 320, 40);
        areaResultado.setEditable(false);

        // Agregar componentes a la ventana
        add(lblTitulo);
        add(lblIngreso);
        add(txtTemperatura);
        add(rbtnCelsius);
        add(rbtnFahrenheit);
        add(rbtnKelvin);
        add(btnConvertir);
        add(lblResultado);
        add(areaResultado);

        // Mostrar ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        new ConversorTemperatura();
    }
}
