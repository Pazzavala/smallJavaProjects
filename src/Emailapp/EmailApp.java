package Emailapp;

public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("Maria", "Zavala");

        em1.setAlternateEmail("Ilikethis@dev.comp.com");
        em1.setMailboxCapacity(1000);
        em1.changePassword("PASSWORD");

        System.out.println(em1.showInfo());

        Email em2 = new Email("Paz" , "Rodriguez");
        System.out.println(em2.showInfo());
    }
}
