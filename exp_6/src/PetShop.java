public class PetShop {
    LinkedList pets = new LinkedList();

    public boolean add(Pet pet) {
//        if (pet.getName() == pets.search(pet.getName()).data && pet.getAge() == (int)pets.search(pet.getAge()).data) {
//            return false;
//        }
//        if (pets.search(pet) == null) {
//            return false;
//        }
        for (int i = 0; i < pets.size(); i++) {
            Pet p = (Pet) pets.get(i).getData(); // 编译类型是Pet
            if (p.equals(pet)) { // 编译类型是Pet，实际类型看传入的类型，在实例类型里面找equals方法
                return false;
            }
        }
        pets.add(pet);
        return true;
    }

    public boolean delete(Pet pet) {
        return pets.remove(pet);
    }

    public Pet get(int index) {
        if (pets.get(index) != null) {
            return (Pet) pets.get(index).getData();
        }
        return null;
    }

    public int size() {
        return pets.size();
    }
}
