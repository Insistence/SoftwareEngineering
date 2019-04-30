public class PersonInfoHandler {
    public void run(){
        Person person = new Person(12, "张三");
        FileReader fileReader = new FileReader("用户信息表.txt");
        ScreenWriter screenWriter = new ScreenWriter();
        Sorter sorter = new Sorter();
        fileReader.ReadFromFile(person);
        screenWriter.Write(person);
        sorter.QuickSort(person);
    }

    public static void main(String[] args){
        PersonInfoHandler personInfoHandler = new PersonInfoHandler();
        personInfoHandler.run();
    }
}
