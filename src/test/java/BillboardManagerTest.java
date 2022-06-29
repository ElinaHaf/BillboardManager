import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.billboardManager.BillboardManager;
import ru.netology.domein.BillboardItem;

public class BillboardManagerTest {
    BillboardItem item1 = new BillboardItem(1, "Бладшот", "Боевик", "12 марта");
    BillboardItem item2 = new BillboardItem(2, "Вперед", "Мультфильм", "5 марта");
    BillboardItem item3 = new BillboardItem(3, "Отель <Белград>", "Комедия", "5 марта");
    BillboardItem item4 = new BillboardItem(4, "Джентельмены", "Боевик", "13 февраля");
    BillboardItem item5 = new BillboardItem(5, "Человек-невидимка", "Ужасы", "5 марта");
    BillboardItem item6 = new BillboardItem(6, "Тролли.Мировой тур", "Мультфильм", "Премьера завтра");
    BillboardItem item7 = new BillboardItem(7, "Номер один", "Комедия", "Премьера завтра");


    @Test
    public void shouldSaveFilmsWithQuantityByDefault() {
        BillboardManager manager = new BillboardManager();
        manager.setSaveFilm(item1);
        manager.setSaveFilm(item2);
        manager.setSaveFilm(item3);

        BillboardItem[] expected = {item1, item2, item3};
        BillboardItem[] actual = manager.getFindAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSaveFilmsWithQuantityFilms0() {
        BillboardManager manager = new BillboardManager();


        BillboardItem[] expected = {};
        BillboardItem[] actual = manager.getFindAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSetFilmsWithQuantityAbove10() {
        BillboardManager manager = new BillboardManager();

        manager.setBillboardFilms(12);

        int expected = 10;
        int actual = manager.getBillboardFilms();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetFilmsWithQuantityLess1() {
        BillboardManager manager = new BillboardManager();

        manager.setBillboardFilms(0);

        int expected = 10;
        int actual = manager.getBillboardFilms();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetFilmsWithQuantity5() {
        BillboardManager manager = new BillboardManager(5);

        manager.setBillboardFilms(5);


        int expected = 5;
        int actual = manager.getBillboardFilms();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetFilmsWithQuantityAboveDesigner() {
        BillboardManager manager = new BillboardManager(5);

        manager.setBillboardFilms(7);

        int expected = 5;
        int actual = manager.getBillboardFilms();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetFilmsWithQuantityLessDesigner() {
        BillboardManager manager = new BillboardManager(6);

        manager.setBillboardFilms(3);

        int expected = 3;
        int actual = manager.getBillboardFilms();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAllFilms() {
        BillboardManager manager = new BillboardManager();
        manager.setSaveFilm(item4);
        manager.setSaveFilm(item5);

        BillboardItem[] expected = {item4, item5};
        BillboardItem[] actual = manager.getFindAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWithQuantityFilms2() {
        BillboardManager manager = new BillboardManager(2);
        manager.setSaveFilm(item4);
        manager.setSaveFilm(item5);


        BillboardItem[] expected = {item5, item4};
        BillboardItem[] actual = manager.getFindLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastWithQuantityFilms10() {
        BillboardManager manager = new BillboardManager();
        manager.setSaveFilm(item4);
        manager.setSaveFilm(item5);


        BillboardItem[] expected = {item5, item4};
        BillboardItem[] actual = manager.getFindLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastWithQuantityFilmsAboveLimit() {
        BillboardManager manager = new BillboardManager(2);
        manager.setSaveFilm(item1);
        manager.setSaveFilm(item2);
        manager.setSaveFilm(item3);


        BillboardItem[] expected = {item3, item2};
        BillboardItem[] actual = manager.getFindLast();

        Assertions.assertArrayEquals(expected, actual);

    }


}
