package javatalks.GUI;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Table2 {
    private JTable jTable = new JTable();
    private JScrollPane jScrollPane = new JScrollPane(jTable);
    public void init() {
        List<String> title = new ArrayList<String>();
        title.add("Name");
        title.add("Create date");
        List<User> date = new ArrayList<User>();
        date.add(new User("Петров", new Date()));
        date.add(new User("Сидоров", new Date()));
        date.add(new User("Иванов", new Date()));
        jTable.setModel(new JTableUser(title, date));
        Container container = getContentPane();
        container.add(jScrollPane);
    }
}

