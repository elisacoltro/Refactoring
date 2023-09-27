package Projeto2;

public class BasicRemote implements Remote {
    protected Device device;

    public BasicRemote() {
    }

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        System.out.println("Controle remoto: alternar energia (ligado/desligado)");
        if (device.isEnabled()) {
            device.disable();
        } else

        {
            device.enable();
        }

    }

    @Override
    public void volumeDown() {
        System.out.println("Controle remoto: diminuir volume");
        device.setVolume(device.getVolume() - 10);
    }

    @Override
    public void volumeUp() {
        System.out.println("Controle remoto: aumentar volume");
        device.setVolume(device.getVolume() + 10);
    }

    @Override
    public void channelDown() {
        System.out.println("Controle remoto: alterar canal (diminuir)");
        device.setChannel(device.getChannel() - 1);
    }

    @Override
    public void channelUp() {
        System.out.println("Controle remoto: alterar canal (aumentar)");
        device.setChannel(device.getChannel() + 1);
    }

}
