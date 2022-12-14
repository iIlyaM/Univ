public class Main {
    public static void main(String[] args) {
        Student student = new Student("ФКН", 1, 3, "Степан", "Смирнов");
        Professor professor = new Professor("Михаил", "Борунов", "mail@mail.com", "+79859596", "Старший преподаватель");
        Dean dean = new Dean("Татьяна", "Архипова", "", "", "Декан");

        System.out.println("-----------------\n");
        System.out.println(student);
        System.out.println("-----------------\n");
        System.out.println(professor);
        System.out.println("-----------------\n");
        System.out.println(dean);
        System.out.println("-----------------\n");
        professor.setFacultyName("ФКН");
        System.out.println("-----------------\n");
        dean.setFacultyName("ПММ");
        System.out.println("-----------------\n");
        System.out.println(student);
        System.out.println("-----------------\n");
        System.out.println(professor);
        System.out.println("-----------------\n");
        System.out.println(dean);

    }
}