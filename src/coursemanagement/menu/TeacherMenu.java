package coursemanagement.menu;

import coursemanagement.teacher.service.TeacherService;

import java.util.Scanner;

public class TeacherMenu {
    public static void teacherMenu() {
        while (true) {
            System.out.println("------MUELLIM MENU------\n" +
                    "Edeceyiniz emeliyyati secin:\n" +
                    "1.Muellim elave et\n" +
                    "2.Muellimleri goster\n" +
                    "3.Muellimi kursa teyin et\n" +
                    "4.Muellimi sil\n" +
                    "0.Geri don\n"
            );
            int emeliyyat = new Scanner(System.in).nextInt();
            switch (emeliyyat) {
                case 0:
                    MainMenu.mainMenu();
                    break;
                case 1:
                    TeacherService.addTeacher();
                    break;
                case 2:
                   TeacherService.listTeacher();
                    break;
                case 3:
                    TeacherService.assignTeacherToCourse();
                    break;
                case 4:
                    TeacherService.removeTeacher();
                    break;
                default:
                    System.out.println("sechim yanlisdir");
            }

        }
    }
}
