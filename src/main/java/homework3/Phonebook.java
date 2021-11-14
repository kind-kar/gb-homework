package homework3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Phonebook {

    private HashMap<String, Set<String>> contacts;

    public Phonebook() {
        this.contacts = new HashMap<>();
    }

    public void add(String name, String phone) {
        final Set<String> phones = contacts.getOrDefault(name, new HashSet<>());
        phones.add(phone);
        contacts.put(name, phones);
    }

    public Set<String> get(String name) {
        return contacts.getOrDefault(name, new HashSet<>());
    }
}
