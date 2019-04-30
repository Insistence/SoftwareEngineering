package cn.MyClass;

import cn.Interface.IComparer;

import java.util.List;

public class PersonInfoHandler {
    public void run(){
        FileReader fileReader = new FileReader();
        ScreenWriter screenWriter = new ScreenWriter();
        QuickSorter quickSorter = new QuickSorter();
        List<Object[]> list = fileReader.Read();
        screenWriter.Write(list);
        IComparer iComparer = new IdComparer();
        quickSorter.Sort(iComparer, list);
    }

    public static void main(String[] args){
        PersonInfoHandler personInfoHandler = new PersonInfoHandler();
        personInfoHandler.run();
    }
}
