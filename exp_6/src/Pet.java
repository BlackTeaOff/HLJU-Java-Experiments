public interface Pet { // 对事物的局部行为进行抽象;允许方法接受实现了该接口的多种不同类(PetImpl-> Cat & Dog)的实例
    String getName(); // 接口的核心作用是定义一个规范或契约
    int getAge();
}
