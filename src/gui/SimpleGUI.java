package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;  //для форм, кнопки и т.д

public class SimpleGUI extends JFrame {

    //поля, надписи, кнопки
    private JButton button = new JButton("Press");  //кнопка
    private JTextField input = new JTextField("", 5);  //текстовое поле

    private JLabel label = new JLabel("Input:");

    private JRadioButton radio1 = new JRadioButton("Select this");  //круглая
    private JRadioButton radio2 = new JRadioButton("Select that");

    private JCheckBox check = new JCheckBox("Check", false);   // по умолчанию снят флажок

    public SimpleGUI() {
        super("Simple Example");
        this.setBounds(100, 100, 250, 100);  //размер формы
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();   //форма, куда все помещается
        container.setLayout(new GridLayout(3, 2, 2, 2));   //ряды, колонки,отступы

        container.add(label);
        container.add(input);

        //сгруппировали радио кнопки
        ButtonGroup group = new ButtonGroup(); //
        group.add(radio1);
        group.add(radio2);
        container.add(radio1);
        radio1.setSelected(true);
        container.add(radio2);
        container.add(check);

        //реализация кнопки
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    //обработчик
    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "Button was pressed\n";
            message += "Text is " + input.getText() + "\n";
            message += (radio1.isSelected() ? "Radio #1" : "Radio #2") + "is selected!\n";

            message += "Checkbox is " + ((check.isSelected()) ? "checked " : "unchecked");

            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
