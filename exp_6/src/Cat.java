public class Cat extends PetImpl { // Cat Is-A 宠物
    Cat(String name, int age) {
        super(name, age);
        this.name = name;
        this.age = age;
    }
}
