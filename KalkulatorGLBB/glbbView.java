import javax.swing.*;
import java.awt.*;

class glbbView extends JFrame {
    private JLabel L1;
    private JLabel L2;
    private JLabel LKecepatanAwal;
    private JLabel LWaktu;
    private JLabel LPercepatan;
    private JLabel LHasil;
    private JButton BHitung;
    private JTextField kecepatanAwal;
    private JTextField waktu;
    private JTextField percepatan;

    public glbbView() {

        // membuat interface /frame

        setTitle("Kalkulator GLBB");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new GridLayout(5, 2));

        L1 = new JLabel("Kalkulator GLBB");
        L2 = new JLabel("Masukkan Data");
        LKecepatanAwal = new JLabel("Kecepatan Awal (m/s)");
        LWaktu = new JLabel("Waktu (s)");
        LPercepatan = new JLabel("Akselerasi (m/s^2)");
        LHasil = new JLabel();
        BHitung = new JButton("Hitung Jarak");
        kecepatanAwal = new JTextField();
        waktu = new JTextField();
        percepatan = new JTextField();

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        
        add(L1, constraints);
        add(L2, constraints);
        add(LKecepatanAwal, constraints);
        add(kecepatanAwal, constraints);
        add(LWaktu, constraints);
        add(waktu, constraints);
        add(LPercepatan, constraints);
        add(percepatan, constraints);
        add(LHasil, constraints);
        add(BHitung, constraints);

        // menampilkan jendela / frame
        setVisible(true);

        // mengatur penempatan jendela agar di tengah layar
        setLocationRelativeTo(null); 
    }

    public JButton getBHitung() {
        return BHitung;
    }

    public double getKecepatanAwal() {
        return Double.parseDouble(kecepatanAwal.getText());
    }

    public double getWaktu() {
        return Double.parseDouble(waktu.getText());
    }

    public double getPercepatan() {
        return Double.parseDouble(percepatan.getText());
    }

    public void setLHasil(String jarak){
        LHasil.setText(jarak);
    }
}
