package cn.MyClass;

import cn.Interface.DataWriter;

import java.util.List;

public class ScreenWriter implements DataWriter {
    @Override
    public void Write(List<Object[]> list) {
        System.out.println(list);
        System.out.println("将数据通过屏幕输出");
    }
}
