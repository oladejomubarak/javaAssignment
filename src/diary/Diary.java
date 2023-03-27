package diary;

import java.util.ArrayList;

public class Diary {
    private ArrayList<Entry> entries = new ArrayList<>();

    private String firstName;
    private String lastName;
    private String password;
    private String email;

    public Diary(){

    }

    public void writeAnEntry(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int countEntry() {
        return entries.size();
    }

    public Entry write(String title, String body) {
        Entry newEntry = new Entry(title, body);
        entries.add(newEntry);
        newEntry.setId(entries.size()+"");

    return newEntry;
    }



    public Entry findEntryById(String id) {
        int index = Integer.parseInt(id);
        return entries.get(index - 1);
    }
    public Entry findEntryByTitle(String title) {
        for (int i = 0; i < entries.size(); i++){
            Entry found = entries.get(i);
            if (found.getTitle().equals(title));
            return found;
        }
        return null;
    }

    public void deleteEntryById(String id) {
        int index = Integer.parseInt(id);
        entries.remove(index - 1);
    }

    public String viewEntryById(String id) {
        int index = Integer.parseInt(id);
        Entry result = entries.get(index - 1);
        return result.toString();
    }

    /* public void editTitle(String entryId, String newTitle) {
        Entry toBeEdited = findEntryById(entryId);
        toBeEdited.setTitle(newTitle);
    }*/
    public String editTitle(String entryId, String newTitle) {
        int index = Integer.parseInt(entryId);
        if(index <= entries.size()){
            Entry toBeEdited = entries.get(index - 1);
            toBeEdited.setTitle(newTitle);
            return "Success";}
        else{
            return "Entry does not exist";
        }
    }

    public void deleteAllEntries() {

        entries.clear();
    }
}
