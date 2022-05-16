package Space;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;

public class Menu extends JPanel implements ActionListener {
    private JButton btnHelp;
    private JButton btnSource;
    public JButton btnClose;
    public JButton btnSettings;
    private JPanel top;
    private JPanel bottom;
    private JPanel middle;
    public JButton btnSingleplayerMode;
    public JButton btnMultiplayerMode;
    private JLabel lblTitle;
    private JTextField inputNickname;
    Menu(){
        declaration();
        this.setLayout(new BorderLayout());
        this.add(top, BorderLayout.NORTH);
        this.add(bottom, BorderLayout.SOUTH);
        this.add(middle, BorderLayout.CENTER);
        this.setOpaque(false);

        lblAppearence();
        btnApearence();

        topArrange();
        middleArrange();
        bottomArrange();
        btnAction();
        inputNickname.addMouseListener(new MouseAdapter(){
            @Override
            public  void mouseClicked(MouseEvent m){
                if(inputNickname.getText().contentEquals("NICKNAME")){
                inputNickname.setText("");}
            }
        });
        inputNickname.setFont(new Font("SEGOE UI",Font.BOLD,12));
        btnHelp.addActionListener(this);
    }
    private void declaration() {
        btnHelp = new JButton();
        btnSource = new JButton();
        btnClose = new JButton();
        btnSettings = new JButton();
        btnSingleplayerMode = new JButton();
        btnMultiplayerMode = new JButton();
        lblTitle = new JLabel();
        inputNickname = new JTextField();
        top = new JPanel();
        bottom = new JPanel();
        middle = new JPanel();
    }
    private void lblAppearence() {
        lblTitle.setText("<html><h1 align='CENTER'>Space Invaders</h1><h2 align='CENTER'>Remake</h2></html>");
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setFont(new Font("SEGOE UI",Font.ITALIC,12));

    }
    private void btnApearence() {
        btnSource.setIcon(new ImageIcon("src/Space/Assets/GIT.png"));
        btnHelp.setIcon(new ImageIcon("src/Space/Assets/help.png"));
        btnSettings.setIcon(new ImageIcon("src/Space/Assets/settings.png"));
        btnClose.setIcon(new ImageIcon("src/Space/Assets/exitIcon.png"));
        btnSingleplayerMode.setIcon(new ImageIcon("src/Space/Assets/singleplayer.png"));
        btnMultiplayerMode.setIcon(new ImageIcon("src/Space/Assets/multiplayer.png"));

        btnSource.setBorderPainted(false);
        btnHelp.setBorderPainted(false);
        btnSettings.setBorderPainted(false);
        btnClose.setBorderPainted(false);
        btnSingleplayerMode.setBorderPainted(false);
        btnMultiplayerMode.setBorderPainted(false);

        btnClose.setOpaque(false);
        btnClose.setContentAreaFilled(false);
        btnSource.setOpaque(false);
        btnSource.setContentAreaFilled(false);

        btnHelp.setOpaque(false);
        btnHelp.setContentAreaFilled(false);
        btnSettings.setOpaque(false);
        btnSettings.setContentAreaFilled(false);

        btnMultiplayerMode.setOpaque(false);
        btnMultiplayerMode.setContentAreaFilled(false);
        btnSingleplayerMode.setOpaque(false);
        btnSingleplayerMode.setContentAreaFilled(false);

        btnHelp.setToolTipText("Jesus is the answer");
        btnClose.setRolloverIcon(new ImageIcon("src/Space/Assets/exitIconS.png"));
        btnSource.setRolloverIcon(new ImageIcon("src/Space/Assets/GITS.png"));
        btnHelp.setRolloverIcon(new ImageIcon("src/Space/Assets/helpS.png"));
        btnSettings.setRolloverIcon(new ImageIcon("src/Space/Assets/settingsS.png"));
        btnSingleplayerMode.setRolloverIcon(new ImageIcon("src/Space/Assets/singleplayerS.png"));
        btnMultiplayerMode.setRolloverIcon(new ImageIcon("src/Space/Assets/multiplayerS.png"));
    }
    private void topArrange() {
        top.setLayout(new BoxLayout(top, BoxLayout.LINE_AXIS));
        top.setPreferredSize(new Dimension(100,60));
        top.add(btnSource);
        top.add(Box.createHorizontalGlue());
        top.add(btnHelp);
        top.setOpaque(false);

        btnHelp.setPreferredSize(new Dimension(71,60));
        btnHelp.setMaximumSize(new Dimension(71,60));
        btnSource.setPreferredSize(new Dimension(71,60));
        btnSource.setMaximumSize(new Dimension(71,60));
    }

    private void middleArrange() {
        middle.setLayout(new BoxLayout(middle, BoxLayout.PAGE_AXIS));
        middle.setPreferredSize(new Dimension(100,100));
        middle.add(Box.createRigidArea(new Dimension(0,80)));
        middle.add(lblTitle);
        middle.add(Box.createRigidArea(new Dimension(0,60)));
        middle.add(inputNickname);
        middle.add(Box.createRigidArea(new Dimension(0,10)));
        middle.add(btnSingleplayerMode);
        middle.add(Box.createRigidArea(new Dimension(0,10)));
        middle.add(btnMultiplayerMode);
        middle.setOpaque(false);

        btnSingleplayerMode.setPreferredSize(new Dimension(180,51));
        btnSingleplayerMode.setMaximumSize(new Dimension(180,51));
        btnMultiplayerMode.setPreferredSize(new Dimension(200,51));
        btnMultiplayerMode.setMaximumSize(new Dimension(200,51));

        inputNickname.setText("NICKNAME");
        inputNickname.setOpaque(false);
        inputNickname.setForeground(Color.WHITE);
        inputNickname.setHorizontalAlignment(JTextField.CENTER);
        inputNickname.setPreferredSize(new Dimension(100,30));
        inputNickname.setMaximumSize(new Dimension(100,30));
        inputNickname.setAlignmentX(JTextField.CENTER_ALIGNMENT);

        lblTitle.setMaximumSize(new Dimension(172,100));
        lblTitle.setPreferredSize(new Dimension(172,100));
        lblTitle.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        btnSingleplayerMode.setAlignmentX(JButton.CENTER_ALIGNMENT);
        btnMultiplayerMode.setAlignmentX(JButton.CENTER_ALIGNMENT);
    }
    private void bottomArrange() {
        bottom.setLayout(new BoxLayout(bottom, BoxLayout.LINE_AXIS));
        bottom.setPreferredSize(new Dimension(100,70));
        bottom.add(btnClose);
        bottom.add(Box.createHorizontalGlue());
        bottom.add(btnSettings);
        bottom.setOpaque(false);

        btnClose.setPreferredSize(new Dimension(80,90));
        btnClose.setMaximumSize(new Dimension(80,90));
        btnSettings.setPreferredSize(new Dimension(80,90));
        btnSettings.setMaximumSize(new Dimension(80,90));
    }
    private void btnAction() {
        btnSource.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnSource){
            try {
                Desktop.getDesktop().browse(URI.create("https://github.com/Norte-invaders"));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        if (e.getSource()==btnHelp){
            String message = new String();
            message="Controls:\n"+"Arrow keys for moving\n"+"If you still have any doubt, please call 911, beacuse we're in paro";
            JOptionPane.showMessageDialog(btnHelp,message,"Helping help",1);
        }
    }
}
