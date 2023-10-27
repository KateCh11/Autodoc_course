package lessons.lesson13.interfaceExample;

public interface iParts {
    int choosePart(int number);

    default double partsPrice(int number) {
        return 33.33;
    }
}
