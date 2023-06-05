import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class glbbController {
    private glbbView V;
    private glbbModel M;
    private double kecepatanAwal;
    private double waktu;
    private double percepatan;
    private double jarak;

    public glbbController() {
        V = new glbbView();
        M = new glbbModel();

        V.getBHitung().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kecepatanAwal = V.getKecepatanAwal();
                waktu = V.getWaktu();
                percepatan = V.getPercepatan();

                jarak = M.hitungJarak(kecepatanAwal, waktu, percepatan);

                DecimalFormat df = new DecimalFormat("#.##");
                V.setLHasil("Jarak: " + df.format(jarak) + " m");
            }
        });
    }
}
