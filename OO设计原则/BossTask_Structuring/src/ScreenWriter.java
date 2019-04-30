public class ScreenWriter {
    public void Write(Person person){
        System.out.println(person.Id());
        System.out.println(person.Name());
        System.out.println("将个人信息写到文件中");
    }
}
