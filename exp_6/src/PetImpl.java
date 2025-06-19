public abstract class PetImpl implements Pet { // 定义了一个宠物的标准，对整体事物(宠物)的抽象
    String name; // 每个宠物(无论猫狗)都有名字和年龄
    int age;

    PetImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() { // 每个宠物都可以getName，无需在其他宠物类中再写一遍
        return name;
    }
    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + "," + age + "岁";
    }

    @Override
    public boolean equals(Object obj) { // 上转型，当一个方法需要一个父类参数时，可以传入任何一个子类的实例
        if (!(obj instanceof PetImpl)) { // 不是PetImpl类型或者它的子类
            return false;
        }
        return this.name.equals(((PetImpl) obj).name) && this.age == ((PetImpl) obj).age; // 使用equals(==比较内存地址)
    }

    // 作用: 抽取和复用公共代码，如果没有这个抽象类，Cat和Dog类都需要定义name和age，实现getName与getAge
    // 重写toString和equals

    // 抽象宠物，它的子类就是某一种具体的动物，把所有宠物共有的属性集中
}
