import java.util.ArrayList;

public class Staff {
    static int id = 0;
    static ArrayList<Integer> uid;
    static ArrayList<String> name;
    static ArrayList<String> age;
    static ArrayList<String> addr;
    static ArrayList<String> pos;

    // # name , age , addr , pos
    static void addStaff(String arr[]) {
        uid.add(++id);
        name.add(arr[0]);
        age.add(arr[1]);
        addr.add(arr[2]);
        pos.add(arr[3]);
    }

    static void removeStaff(int i) {
        
    }
}
