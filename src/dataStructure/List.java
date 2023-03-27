package dataStructure;

public interface List {
    void add(String item);
    void remove(int id);

    void set(int id, String item);

    void remove(String item);
    String get(int id);
    void add(int id, String item);
    void clear();
    int size();
    boolean isEmpty();
    boolean contains(String anotherItem);
}
