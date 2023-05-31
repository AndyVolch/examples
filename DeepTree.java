import java.util.Objects;

public class DeepTree{
    Orange orange;

    public DeepTree(Orange orange) {
        this.orange = orange;
    }

    // Конструктор ГЛУБОКОГО(полного) копирования
    // При глубоком копировании создаются копии вложенных объектов(апельсина)
    public DeepTree(DeepTree deepTree) {
        // Создаём своё новой апельсин, для копии дерева
        this.orange = new Orange(deepTree.getOrange().getSize());
        // Теперь у двух копий деревьев есть по своему апельсину.
        // Они одинаковые по размеру, но это два разных по сути апельсина
    }

    public Orange getOrange() {
        return orange;
    }

    public void setOrange(Orange orange) {
        this.orange = orange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeepTree deepTree = (DeepTree) o;
        return Objects.equals(orange, deepTree.orange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orange);
    }

    @Override
    public String toString() {
        return "DeepTree{" +
                "orange=" + orange +
                '}';
    }
}
