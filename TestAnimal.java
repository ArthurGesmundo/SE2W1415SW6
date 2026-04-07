public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();
        Animal sheep = registry.createSheep("she1ep");
        Animal cow = registry.createCow();
        Animal horse = registry.createHorse();

        ((Sheep) sheep).setName("shee1p");
        ((Cow) cow).setSound("2moo");
        ((Horse) horse).setColor("gray");

        System.out.println(sheep.getType() + " named " + ((Sheep)sheep).getName());
        System.out.println(cow.getType() + " says " + ((Cow) cow).getSound());
        System.out.println(horse.getType() + " colored " + ((Horse) horse).getColor());

        Animal sheep2 = registry.createSheep("she2ep");
        ((Sheep) sheep2).setName("shee2p");

        System.out.println(sheep.getType() + " named " + ((Sheep)sheep2).getName());

        Animal cow2 = registry.createCow();
        ((Cow)cow2).setFood("cow feed");
        ((Cow)cow2).setSound("MAA");
        System.out.println(cow2.getType() + " eats " + ((Cow)cow2).getFood());
        System.out.println(cow2.getType() + " says " + ((Cow)cow2).getSound());

    }
}