import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kayıtlı kullanıcı adı ve şifre
        String savedUsername = "user";
        String savedPassword = "password123";

        // Kullanıcıdan giriş bilgilerini alma
        System.out.print("Kullanıcı adınızı girin: ");
        String username = scanner.nextLine();

        System.out.print("Şifrenizi girin: ");
        String password = scanner.nextLine();

        // Giriş bilgilerini kontrol etme
        if (username.equals(savedUsername) && password.equals(savedPassword)) {
            System.out.println("Giriş başarılı! Hoş geldiniz, " + username + "!");
        } else {
            System.out.println("Kullanıcı adı veya şifre yanlış.");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (evet/hayır): ");
            String resetChoice = scanner.nextLine();

            if (resetChoice.equalsIgnoreCase("evet")) {
                System.out.print("Yeni şifreyi girin: ");
                String newPassword = scanner.nextLine();

                // Şifreyi eski şifreyle aynı olmama kontrolü
                if (!newPassword.equals(savedPassword)) {
                    savedPassword = newPassword;
                    System.out.println("Şifre başarıyla sıfırlandı.");
                } else {
                    System.out.println("Yeni şifre eski şifreyle aynı olamaz. Şifre sıfırlama başarısız.");
                }
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        }

        scanner.close();
    }
}