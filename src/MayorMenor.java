import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MayorMenor extends JFrame {
    private JSpinner inA;
    private JSpinner inB;
    private JLabel outRelacion;
    public JPanel contentPane;

    public MayorMenor() {
    MayorDosNumeros evaluar = new MayorDosNumeros(0,0);
    inA.addChangeListener(new ChangeListener() {
        @Override
        public void stateChanged(ChangeEvent e) {
            int a = (int) inA.getValue();
            evaluar.setA(a);
            outRelacion.setText(evaluar.toString());
        }
    });
    inB.addChangeListener(new ChangeListener() {
        @Override
        public void stateChanged(ChangeEvent e) {
            int b = (int) inB.getValue();
            evaluar.setB(b);
            outRelacion.setText(evaluar.toString());
        }
    });
}
}
