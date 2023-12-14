package reproducer;

import org.mapstruct.factory.Mappers;

class App {
    public static void main(String[] args) {
        System.out.println(new App().greeting);
    }
    public final String greeting = getGreeting();
    public static String getGreeting() {
        final var b = Mappers.getMapper(ABMapper.class)
                .map(new A("dlsa", 123));

        if(b.getId() != 321) {
            throw new AssertionError("incorrect B.c field");
        }

        return b.getAbc();
    }
}
