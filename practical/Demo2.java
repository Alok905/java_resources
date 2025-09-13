class Computer {
    public void playMusic() {
        System.out.println("Playing music");
    }

    public String getMeAPen(int cost) {
        if (cost < 10)
            return "No pen for you";
        return "Here is your pen";
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.playMusic();
        String pen = comp.getMeAPen(10);
        System.out.println(pen);
    }
}
