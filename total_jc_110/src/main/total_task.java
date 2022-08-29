package main;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class total_task {

    public static void main(String[] args) {
        ArrayList<String> user = new ArrayList<String>();
        user.add("Bob");
        user.add("Alex");
        user.add("Tom");
        user.add("Rich");
    }

    public enum Role {
        ADMIN,
        USER,
        MODERATOR;
    }
}
