public class SensorActuador {
    private int temperatura;
    private int minTemp;
    private int maxTemp;

    public SensorActuador(int temp, int min, int max) {
        this.temperatura = temp;
        this.minTemp = min;
        this.maxTemp = max;
    }

    public int getTemperatura() {
        return this.temperatura;
    }

    public void disminuirTemp(int i) {
        int newTemp = this.temperatura - i;
        if (newTemp >= this.minTemp) {
            this.temperatura = newTemp;
        }
    } 

    public void aumentarTemp(int i) {
        int newTemp = this.temperatura + i;
        if (newTemp <= this.maxTemp) {
            this.temperatura = newTemp;
        }
    }
}