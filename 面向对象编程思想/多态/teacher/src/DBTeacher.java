public class DBTeacher extends Teacher{
    private String name;
    private int age;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public DBTeacher(String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public void giveLesson(){
        super.giveLesson();
        System.out.println("请打开mysql");
    }

    public void introduction(){
        super.introduction();
        System.out.println("我的名字叫：" + name);
        System.out.println("我来自：" + location);
        System.out.println("我今年：" + age + "岁");
        System.out.println("我是你们的数据库老师");
    }
}
