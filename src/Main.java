// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        HardDisk disk = new HardDisk();
        PC pc = new PC();
        cpu.setSpeed(2200);
        disk.setAmount(200);
        pc.setCPU(cpu);
        pc.setHardDisk(disk);
        pc.show();

    }
}