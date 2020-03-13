package lesson3.phonebook;

public class Person {
    Long phone;
    String mail;

    public Person (Long _phone, String _mail){
        phone = _phone;
        mail = _mail;
    }

    public Long getPhone(Person a) {
        return a.phone;
    }

    public String getMail(Person a) {
        return a.mail;
    }
}
