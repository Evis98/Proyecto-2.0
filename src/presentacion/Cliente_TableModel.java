/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import logica.Cliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Ivan
 */
public class Cliente_TableModel extends AbstractTableModel implements TableModel {

    String[] cols = {"nombre", "id", "correo", "provincia", "canton", "distrito", "telefono"};               //
    List<Cliente> rows;

    public Cliente_TableModel(List<Cliente> rows) {
        this.rows = rows;
    }

    @Override
    public int getColumnCount() {
        return 7;                               
    }

    @Override
    public String getColumnName(int col) {
        return cols[col];
    }

    @Override
    public int getRowCount() {
        return rows.size();
    }

    public Object getValueAt(int row, int col) {
        Cliente c = rows.get(row);
        java.text.DecimalFormat df = new java.text.DecimalFormat("####");
        switch (col) {
            case 0:
                return c.getId();
            case 1:
                return c.getNombre();
            case 2:
                return c.getCorreo();
            case 3:
                return c.getProvincia();
            case 4:
                return c.getCanton();
            case 5:
                return c.getDistrito();
            case 6:
                return c.getTelefono();

            default:
                return "";
        }
    }    
}
/**
 *
 * @author Ivan
 */
