public class FileReader {
    private String dataFilename;

    public FileReader(String dataFilename) {
        this.dataFilename = dataFilename;
    }
    public void ReadFromFile(Person person){
        System.out.println("从"+dataFilename +"中读取id为：" + person.Id() + "名字为: " + person.Name() + "的个人信息");
    }
}
