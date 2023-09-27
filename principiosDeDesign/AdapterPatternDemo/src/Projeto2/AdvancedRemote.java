package Projeto2;

public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Controle remoto: tirar volume (mudo)");
        device.setVolume(0);
    }

    public void power() {
    }
}
