
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Desenhando um círculo");
    }
}

// ConcreteProduct (Produto Concreto): São as classes que implementam a
// interface ou herdam da classe abstrata Product. Essas classes representam os
// objetos específicos que serão criados pelo Factory Method.