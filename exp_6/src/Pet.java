public interface Pet { // 对事物的局部行为进行抽象;允许方法接受实现了该接口的多种不同类(PetImpl-> Cat & Dog)的实例
    String getName(); // 接口的核心作用是定义一个规范或契约
    int getAge();
}

// 作用

// 定义一个规范(标准): 即所有实现它的类(implements)(PetImpl->Cat&Dog)都必须实现上述方法
// 不关心方法如何实现(抽象)，只关心它们必须存在(建立了一个标准)

// 实现多态: 在PetShop类中，add和delete方法可以传入实现了Pet接口的实例，即可以传入多种动物