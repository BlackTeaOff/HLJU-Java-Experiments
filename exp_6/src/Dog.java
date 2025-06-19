public class Dog extends PetImpl { // Dog Is-A 宠物
    Dog(String name, int age) {
        super(name, age); // 直接调用父类构造器
    }
}
