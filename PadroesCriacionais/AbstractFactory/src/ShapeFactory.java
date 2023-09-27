public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {

        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;
    }

    @Override
    Color getColor(String color) {
        return null;

    }

}

// Creator (Criador): É a classe abstrata que declara o método de fábrica
// abstrato (Factory Method) para criar objetos do tipo Product. Essa classe
// pode conter algum código comum para todas as subclasses, mas não sabe qual
// classe concreta deve ser instanciada.
