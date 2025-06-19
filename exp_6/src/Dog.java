public class Dog extends PetImpl { // Dog Is-A 宠物
    Dog(String name, int age) {
        super(name, age);
        this.name = name;
        this.age = age;
    }
}
