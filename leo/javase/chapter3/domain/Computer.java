package leo.javase.chapter3.domain;

public class Computer {

    private double cpu;
    private int memory;

    public Computer() {
    }

    public Computer(double cpu, int memory) {
        this.cpu = cpu;
        this.memory = memory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", memory=" + memory +
                '}';
    }
}
