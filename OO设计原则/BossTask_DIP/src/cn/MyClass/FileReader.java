package cn.MyClass;

import cn.Interface.DataReader;

import java.util.ArrayList;
import java.util.List;

public class FileReader implements DataReader {
    public List<Object[]> Read() {
        List<Object[]> list = new ArrayList<Object[]>();
        System.out.println("从文件中读取数据");
        list.add(new Object[]{"存放从文件中读取的数据"});
        return list;
    }
}
