public class PC {
    CPU cpu;
    HardDisk HD;

    public void setCPU(CPU cpu) {
        this.cpu = cpu;
    }

    public void setHardDisk(HardDisk HD) {
        this.HD = HD;
    }
    void show() {
        System.out.println(cpu);
        System.out.println(HD);
    }
}
