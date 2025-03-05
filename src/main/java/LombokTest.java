import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LombokTest {
    private String name;
    private int age;

    public static void main(String[] args) {
        LombokTest test = new LombokTest();

        // Setter metotlarını çağır
        test.setName("Ceren");
        test.setAge(22);

        // Getter metotlarını çağır ve sonucu ekrana yazdır
        System.out.println("İsim: " + test.getName());
        System.out.println("Yaş: " + test.getAge());
    }
}
