public class Motherboard {
    public void installCPU(CPU cpu){
        cpu.display();
        System.out.println("cup安装完毕");
    }

    public static void main(String[] args){
        CPU intelcpu = new IntelCPU();
        CPU amdcpu = new AMDCPU();
        Motherboard m = new Motherboard();
        m.installCPU(intelcpu);
        m.installCPU(amdcpu);
    }
}
