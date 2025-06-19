public class Cat extends PetImpl { // Cat Is-A 宠物
    Cat(String name, int age) {
        super(name, age); // 直接调用父类构造器
    }
}
