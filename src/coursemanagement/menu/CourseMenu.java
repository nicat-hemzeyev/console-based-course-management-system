package coursemanagement.menu;

import coursemanagement.course.service.CourseService;

import java.util.Scanner;

public class CourseMenu {
    public static void courseMenu() {
        while (true) {

            System.out.println("------KURS MENU------\n" +
                    "Edeceyiniz emeliyyati secin:\n" +
                    "1.Kurs elave et\n" +
                    "2.Kurslari goster\n" +
                    "3.Kursa telebe elave et\n" +
                    "4.Kursa muellim teyin et\n" +
                    "5.Kursu sil\n" +
                    "0.Geri don"
            );
            int emeliyyat = new Scanner(System.in).nextInt();
            switch (emeliyyat) {
                case 0:
                    MainMenu.mainMenu();
                    break;
                case 1:
                    CourseService.addCourse();
                    break;
                case 2:
                    CourseService.listCourse();
                    break;
                case 3:
                    CourseService.addStudentToCourse();
                    break;
                case 4:
                    CourseService.assignTeacherToCourse();
                    break;
                case 5:
                    CourseService.removeCourse();
                    break;
                default:
                    System.out.println("Yanlis sechim");
            }

        }
    }
}