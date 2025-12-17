import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LessonLibraryTest {

    @Test
    public void testAddLesson() {
        // Создаем экземпляр класса LessonLibrary
        LessonLibrary library = new LessonLibrary();

        // Добавляем урок
        boolean result = library.addLesson("Математика", "Урок по алгебре");

        // Проверяем, что урок был успешно добавлен
        assertTrue(result, "Урок должен быть успешно добавлен");
    }
}
