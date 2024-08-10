import javax.swing.*;

public class JavaCalculadora {
    private JPanel JavaCalculadora;
    private JTextField a0TextField;
    private JButton btnZero;
    private JButton btnTwo;
    private JButton btnFive;
    private JButton btnEight;
    private JButton btnMedium;
    private JButton btnVirgula;
    private JButton btnEqual;
    private JButton btnMais;
    private JButton btnOne;
    private JButton btnMinus;
    private JButton btnFour;
    private JButton btnDivision;
    private JButton btnMulti;
    private JButton btnClear;
    private JButton btnSeven;
    private JButton btnThree;
    private JButton btnPorcent;
    private JButton btnNine;
    private JButton btnSix;

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculadora");
        frame.setContentPane(new JavaCalculadora().JavaCalculadora);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
