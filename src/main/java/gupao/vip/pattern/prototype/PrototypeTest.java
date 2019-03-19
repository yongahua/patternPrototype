package gupao.vip.pattern.prototype;

import gupao.vip.pattern.prototype.Client;
import gupao.vip.pattern.prototype.PackagePrototypeA;

import java.util.Date;

public class PrototypeTest {

    public static void main(String[] args) {
        PackagePrototypeA packagePrototype = new PackagePrototypeA();

        packagePrototype.setId("1");
        packagePrototype.setPackageName("卡通");
        packagePrototype.setCreateuser("2");
        packagePrototype.setCreatetime(new Date());
        packagePrototype.setUpdateuser("2");
        packagePrototype.setUpdatetime(new Date());

        System.out.println(packagePrototype);

        Client client = new Client(packagePrototype);
        PackagePrototypeA packagePrototypeClone = (PackagePrototypeA) client.startClone(packagePrototype);

        System.out.println(packagePrototypeClone);

        System.out.println("克隆对象中的引用类型地址值："+packagePrototypeClone.getPackageName());
        System.out.println("原对象中的引用类型地址值："+packagePrototype.getPackageName());
        System.out.println("对象地址比较："+(packagePrototypeClone.getPackageName() == packagePrototype.getPackageName()));


        PackagePrototypeA packagePrototypeDeep = packagePrototype.clone();
        System.out.println("深克隆对象中的引用类型地址值："+packagePrototypeDeep.getPackageName());
        System.out.println("对象地址比较："+packagePrototypeDeep.getPackageName()==packagePrototype.getPackageName());

    }
}
