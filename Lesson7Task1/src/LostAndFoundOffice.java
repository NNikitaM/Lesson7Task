import java.util.ArrayList;

public class LostAndFoundOffice {
    ArrayList<Object> things = new ArrayList<>(); // создайте список things

    public void put(Object element) { // реализуйте метод put()
        things.add(element);
    }

    public boolean check(Object target) { // реализуйте метод check()
        if (target == null) { // проверка на пустую ссылку
            return false;
        }
        for (Object object : things) { // логика проверки вещи в списке
            if (object.equals(target)) {
                return true;
            }
        }
        return false;
    }
}
