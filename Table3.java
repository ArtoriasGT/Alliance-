package javatalks.GUI;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class Table3 {
    private List<String> title = new ArrayList<String>();
    private List<User> date = new ArrayList<User>();

    public JTableUser(List<String> title, List<User> date) {
        this.title = title;
        this.date = date;
    }

    @Override
    public int getRowCount() {
        return date.size();
    }

    @Override
    public int getColumnCount() {
        return title.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return date.get(rowIndex).getElement(columnIndex);
    }

    @Override
    public String getColumnName(int column) {
        return title.get(column);
    }
}
}
