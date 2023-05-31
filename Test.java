public class Test {
    public static void main(String[] args) {

        // 1. Поверхностное копирование
        System.out.println("***ТЕСТ ПОВЕРХНОСТНОГО КОПИРОВАНИЯ***");
        // Создадим маленькое яблоко
        Apple smallApple = new Apple(3);

        // Создадим дерево с маленьким яблоком
        SimpleTree tree = new SimpleTree(smallApple);

        // Создадим ПОВЕРХНОСТНУЮ(неполную) копию дерева
        SimpleTree treeCopy = new SimpleTree(tree);

        // Яблоко внутри деревьев одно и то же
        System.out.println("Яблоко одно и то же?");
        System.out.println(tree.getApple() == treeCopy.getApple()); // true

        // Это плохо, так как при изменении состояния яблока у одного дерева, оно автоматом меняется у другого,
        // а мы при копировании не хотим этого

        // Меням размер яблока исходного дерева на с 3 на 10
        tree.getApple().setSize(10);

        // У копии дерева оно изменилось тоже. Это нежелательное поведение
        System.out.println("Исходное дерево: " + tree.getApple());
        System.out.println("Копия дерева: " + treeCopy.getApple());

        // 2. Глубокое копирование

        // Создадим маленький апельсин
        Orange smallOrange = new Orange(3);
        System.out.println("\n***ТЕСТ ГЛУБОКОГО КОПИРОВАНИЯ***");
        // Тут будем использовать класс DeepTree в котором реализван глубокий конструктор копирования
        // Создадим дерево с маленьким апельсином
        DeepTree deepTree = new DeepTree(smallOrange);

        // Создадим ГЛУБОКУЮ(полную) копию дерева
        DeepTree deepTreeCopy = new DeepTree(deepTree);

        // Теперь у каждого дерева будет свой апельсин
        System.out.println("Апельсин один и то же?");
        System.out.println(deepTree.getOrange() == deepTreeCopy.getOrange()); // false

        // Мы можем изменить апельсин исходного дерева не трогая копию!

        // Меням размер апельсина исходного дерева на с 3 на 10
        deepTree.getOrange().setSize(10);

        // У копии дерева оно изменилось тоже. Это нежелательное поведение
        System.out.println("Исходное дерево: " + deepTree.getOrange());
        System.out.println("Копия дерева: " + deepTreeCopy.getOrange());
    }
}
