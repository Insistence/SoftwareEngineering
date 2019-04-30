public class Student extends Person{
    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void display(){
        super.display();
        System.out.println("专业:" + getMajor());
    }

    public void study(){
        System.out.println("学生要上课");
    }
}
