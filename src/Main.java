public class Main {

    public static void main(String[] args) {

        Cat famousCat = new Cat("Dwarf Calico", 3, true);
        famousCat.setOwnership("Tabatha Bundesen", "Grumpy");
        System.out.println(famousCat.getName() + "has lived" + famousCat.pctExpectedLife() + "of its expected life");
        System.out.println(famousCat);
    }
}