package diary;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {
    private String title;
    private String body;

    private String id;
    private LocalDateTime localDateTime = LocalDateTime.now();
    public Entry(String title, String body){
        this.title = title;
        this.body = body;
    }


    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;

    }
    public String getId() {
        return id;

    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocalDateTime() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
        String entryDate = dateTimeFormatter.format(localDateTime);
        return entryDate;
    }
    @Override
    public String toString(){
        return "idForThisEntryIs" +id+ "\n Title is" +title+
                "\n Body is " +body+ ".";
    }

    public void setTitle(String newTitle) {
        this.title = title;
    }
}
