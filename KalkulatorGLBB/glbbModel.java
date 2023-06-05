class glbbModel {
    public glbbModel(){}

    public double hitungJarak(double kecepatanAwal, double waktu, double percepatan) {
        return kecepatanAwal * waktu + 0.5 * percepatan * Math.pow(waktu, 2);
    }
}