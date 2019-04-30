public class SoftwareSchool{
    private Printer printer = new Printer();
    //输出学院的详细信息
    public String detail() {
        return "这里是软件学院";
    }
    //使用学院打印机打印教师
    public void print(Teacher t){
        printer.print(t.detail());
    }
    //使用学院打印机打印系
    public void print(Department d){
        printer.print(d.detail());
    }
}

