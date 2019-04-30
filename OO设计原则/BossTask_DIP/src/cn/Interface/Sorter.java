package cn.Interface;

import java.util.List;

public interface Sorter {
    public void Sort(IComparer iComparer, List<Object[]> list);
}
