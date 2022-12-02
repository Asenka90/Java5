/**
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */
package Lesson5.T1;

public class T1 {
public static void main(String[] args) {
    PhoneBook book = new PhoneBook();
    book.addContact("Давыдова Карина", new String[] { "+79999999999", "+78888888888" });
    book.addContact("Петров Артемий", new String[] { "+77777777777", "+7666666666" });
    book.addContact("Звонкова Алина", new String[] { "+75555555555" });
    System.out.println("Телефонная книга:");
    System.out.println(book);
    System.out.println("Удалить контакт \"Давыдова Карина\" ");
    book.delContact("Давыдова Карина");
    System.out.println(book);
    System.out.println("Список имен");
    System.out.println(book.getNames());
    System.out.println("\n вывод телефонов для контакта \"Петров Артемий\" ");
    System.out.println(book.getPhones("Петров Артемий")); 
}
    
}