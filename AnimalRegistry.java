public class AnimalRegistry {
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;

    public AnimalRegistry() {
        sheepPrototype = new Sheep("Prototype Sheep");
        cowPrototype = new Cow();
        horsePrototype = new Horse();
    }

    public Animal createSheep(String name) {
        Sheep cloned = (Sheep) sheepPrototype.clone();
        cloned.setName(name);
        return cloned;
    }

    public Animal createCow() {
        return cowPrototype.clone();
    }

    public Animal createHorse() {
        return horsePrototype.clone();
    }
}