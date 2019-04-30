package cn.MyClass;

import cn.Interface.DataWriter;

import java.util.List;

public class Printer implements DataWriter {
    @Override
    public void Write(List<Object[]> list) {
        System.out.println(list);
        System.out.println("将数据通过打印机进行打印");
    }
}
