import java.util.Objects;

public class SimpleTree {
    Apple apple;

    public SimpleTree(Apple apple) {
        this.apple = apple;
    }

    // Конструктор ПОВЕРХНОСТНОГО(неполного) копирования
    // При поверхностном копировании вложенные объекты(яблоко) не копируются
    public SimpleTree(SimpleTree simpleTree) {
        // Передаем только ссылку на яблоко другого дерева
        this.apple = simpleTree.getApple();
        // По сути у нас будут два дерева с одним яблоком, что не всегда правильно
    }

    public Apple getApple() {
        return apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleTree that = (SimpleTree) o;
        return Objects.equals(apple, that.apple);
    }


    @Override
    public int hashCode() {
        return Objects.hash(apple);
    }

    @Override
    public String toString() {
        return "SimpleTree{" +
                "apple=" + apple +
                '}';
    }
}