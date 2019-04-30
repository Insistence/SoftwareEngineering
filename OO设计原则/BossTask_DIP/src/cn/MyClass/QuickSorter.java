package cn.MyClass;

import cn.Interface.IComparer;
import cn.Interface.Sorter;

import java.util.List;

public class QuickSorter implements Sorter {
    @Override
    public void Sort(IComparer iComparer, List<Object[]> list) {
        System.out.println(list);
        System.out.println("将数据进行快排");
    }
}
