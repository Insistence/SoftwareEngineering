public class Main {
    public void judge(Teacher teacher){
        teacher.giveLesson();
        teacher.introduction();
    }

    public static void main(String[] args){
        Main m = new Main();
        m.judge(new JavaTeacher("李明",20, "丽江"));
        System.out.println("-------------------------");
        m.judge(new DBTeacher("张三",40, "北京"));
    }
}
