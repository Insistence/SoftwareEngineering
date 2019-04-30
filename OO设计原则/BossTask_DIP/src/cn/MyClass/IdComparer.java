package cn.MyClass;

import cn.Interface.IComparer;

public class IdComparer implements IComparer {
    @Override
    public int Compare(Object object1, Object object2) {
        System.out.println("将数据object1和object2按照id进行比较");
        return 0;
    }
}
