package cn.MyClass;

import cn.Interface.IComparer;

public class NameComparer implements IComparer {
    @Override
    public int Compare(Object object1, Object object2) {
        System.out.println("将数据object1和object2按照name进行比较");
        return 1;
    }
}
