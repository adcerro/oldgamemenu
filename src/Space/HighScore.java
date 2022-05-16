package Space;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class HighScore extends JPanel {
    private JLabel lblHighscore;
    public JTable tblHighsc;
    private JPanel tblappearence;
    HighScore(){
        declaration();

        this.setOpaque(false);
        this.setLayout(new BorderLayout());
        tblappearence.setLayout(new BoxLayout(tblappearence, BoxLayout.PAGE_AXIS));

        appearence();

        this.setBorder(new EmptyBorder(0,20,20,20));
        this.add(lblHighscore,BorderLayout.NORTH);
        this.add(tblappearence,BorderLayout.CENTER);
        tblappearence.add(tblHighsc.getTableHeader());
        tblappearence.add(tblHighsc);

    }

    private void appearence() {

        lblHighscore.setText("<html><h1>Highscores</h1></html>");
        lblHighscore.setForeground(Color.white);
        lblHighscore.setFont(new Font("SEGOE UI",Font.ITALIC,12));
        lblHighscore.setMaximumSize(new Dimension(130,50));

        tblHighsc.setBackground(Color.BLACK);
        tblHighsc.setForeground(Color.white);
        tblHighsc.setGridColor(Color.WHITE);
        tblHighsc.getTableHeader().setForeground(Color.white);
        tblHighsc.getTableHeader().setBackground(Color.BLACK);
        tblHighsc.setBorder(new LineBorder(Color.white));
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
        tblHighsc.getTableHeader().setFont(new Font("SEGOE UI",Font.BOLD,14));
        tblHighsc.getColumnModel().getColumn(0).setCellRenderer(renderer);
        tblHighsc.getColumnModel().getColumn(1).setCellRenderer(renderer);
        tblappearence.setOpaque(false);
        tblHighsc.setDefaultEditor(Object.class,null);
    }

    private void declaration() {
        String[] colummNames = {"#","Score"};
        Object[][] info ={{"1","200"},{"2","300"}};
        lblHighscore = new JLabel();
        tblHighsc = new JTable(info,colummNames);
        tblappearence = new JPanel();
    }

}
