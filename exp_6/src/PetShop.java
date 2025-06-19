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
            PetImpl p = (PetImpl) pets.get(i).data;
            if (p.equals(pet)) {
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
            return (Pet) pets.get(index).data;
        }
        return null;
    }

    public int size() {
        return pets.size();
    }
}
