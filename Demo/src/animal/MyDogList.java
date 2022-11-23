package animal;

public class MyDogList {
    private Dog[] dogs = new Dog[5];
    private int nextIndex = 0;

    public void add(Dog dog) {
        if (this.nextIndex < this.dogs.length){
            dogs[nextIndex] = dog;
            System.out.println("Dog added at " + nextIndex);
            this.nextIndex++;
        }
    }
}
