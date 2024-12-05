
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*; 

public class DashboardArtist extends JFrame implements ActionListener {
    
    // private Container con = getContentPane();
    // private JPanel headerPanel = new JPanel();
    // private JPanel sidePanel = new JPanel(); 
    // private JPanel title = new JPanel();
    // private JPanel choices = new JPanel();
    // private ImageIcon profile = new ImageIcon("C:\\Users\\Owner\\OneDrive\\Documents\\NetBeansProjects\\ArtStreamFinal\\src\\main\\java\\com\\mycompany\\artstreamfinal\\profile-removebg-preview.png");
    // private JButton profileButton;
    // private JPanel mainPanel = new JPanel();
    // private String name;
    
    // public DashboardArtist()
    // {

    //     super("ArtStream - Dashboard Artist");
    //     setSize(1600,1000);
    //     setLocationRelativeTo(null);
    //     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //     con.setLayout(new BorderLayout());
    //     con.add(headerPanel, BorderLayout.NORTH);
    //     con.add(mainPanel, BorderLayout.CENTER);
        
    //     headerPanel.setLayout(new BorderLayout());
    //     headerPanel.setBackground(Color.decode("#303765"));
    //     headerPanel.add(title, BorderLayout.WEST);
    //     headerPanel.add(choices, BorderLayout.EAST);
        
    //     title.setLayout(new FlowLayout(FlowLayout.LEADING));
    //     title.setBackground(Color.decode("#303765"));

    //     // Set a larger font size for the title
    //     JLabel titleLabel = new JLabel("ARTSTREAM");
    //     titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 40)); // Increase font size here
    //     titleLabel.setForeground(Color.WHITE);
    //     title.add(titleLabel);

    //     // Set the icon sizes (as before)
    //     Image profileSize = profile.getImage();
    //     Image iconNewSize1 = profileSize.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    //     profile = new ImageIcon(iconNewSize1);
    //     this.name = name;
    //     profileButton = new JButton(profile);
    //     profileButton.setBackground(Color.decode("#303765"));
    //     profileButton.setToolTipText(name);
    //     choices.add(profileButton);
    //     choices.setBackground(Color.decode("#303765"));
    //     headerPanel.add(choices, BorderLayout.EAST);
        
    //     mainPanel.setBackground(Color.decode("#000e37"));    
    //     mainPanel.setLayout(new BorderLayout());
    //     sidePanel.setBackground(Color.decode("#484e7e"));
    //     sidePanel.setPreferredSize(new Dimension(500,700));
    //     mainPanel.add(sidePanel,BorderLayout.WEST);
        
    //     setVisible(true);
        
    // }
    
    // public DashboardArtist(String name)
    // {
        
    //     super("ArtStream - Dashboard Artist");
    //     setExtendedState(JFrame.MAXIMIZED_BOTH);
    //     setLocationRelativeTo(null);
    //     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //     con.setLayout(new BorderLayout());
    //     con.add(headerPanel, BorderLayout.NORTH);
    //     con.add(mainPanel, BorderLayout.CENTER);
        
    //     headerPanel.setLayout(new BorderLayout());
    //     headerPanel.setBackground(Color.decode("#303765"));
    //     headerPanel.add(title, BorderLayout.WEST);
    //     headerPanel.add(choices, BorderLayout.EAST);
        
    //     title.setLayout(new FlowLayout(FlowLayout.LEADING));
    //     title.setBackground(Color.decode("#303765"));

    //     // Set a larger font size for the title
    //     JLabel titleLabel = new JLabel("ARTSTREAM");
    //     titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 40)); // Increase font size here
    //     titleLabel.setForeground(Color.WHITE);
    //     title.add(titleLabel);

    //     // Set the icon sizes (as before)
    //     Image profileSize = profile.getImage();
    //     Image iconNewSize1 = profileSize.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    //     profile = new ImageIcon(iconNewSize1);
    //     this.name = name;
    //     profileButton = new JButton(profile);
    //     profileButton.setBackground(Color.decode("#303765"));
    //     profileButton.setToolTipText(name);
    //     choices.add(profileButton);
    //     choices.setBackground(Color.decode("#303765"));
    //     headerPanel.add(choices, BorderLayout.EAST);
        
    //     mainPanel.setBackground(Color.decode("#000e37"));    
    //     mainPanel.setLayout(new BorderLayout());
    //     sidePanel.setBackground(Color.decode("#484e7e"));
    //     sidePanel.setPreferredSize(new Dimension(500,700));
    //     mainPanel.add(sidePanel,BorderLayout.WEST);
        
    //     setVisible(true);
        
        
        
    // }
   
    private Container con = getContentPane();
    private JPanel[] panelsContainer = new JPanel[3];
    private ImageIcon profileLogout = new ImageIcon("src\\profile-removebg-preview.png");
    private String name;
    private CardLayout card = new CardLayout();
    private JButton[] reqAccDoneButtons = new JButton[3];


    public DashboardArtist(String name)
    {
        
        super("ArtStream - Dashboard Artist");
        this.name = name;
        setSize(1600,1000);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        con.setLayout(new BorderLayout());

                for(int j = 0; j < reqAccDoneButtons.length; ++j)
                {
                    if(j == 0)
                    {
                        reqAccDoneButtons[j] = new JButton("REQUESTS");
                        reqAccDoneButtons[j].addActionListener(this);
                        reqAccDoneButtons[j].setActionCommand("requests");
                        reqAccDoneButtons[j].setMaximumSize(new Dimension(300,300));
                        // sideBar.add(reqAccDoneButtons[j]);
                        // sideBar.add(Box.createRigidArea(new Dimension(0,20)));
                    }else if(j== 1)
                    {
                        reqAccDoneButtons[j] = new JButton("ACCEPTED");
                        reqAccDoneButtons[j].addActionListener(this);
                        reqAccDoneButtons[j].setActionCommand("accepted");
                        reqAccDoneButtons[j].setMaximumSize(new Dimension(300,300));
                        // sideBar.add(reqAccDoneButtons[j]);
                        // sideBar.add(Box.createRigidArea(new Dimension(0,20)));
                    }else{
                        reqAccDoneButtons[j] = new JButton("DONE");
                        reqAccDoneButtons[j].addActionListener(this);
                        reqAccDoneButtons[j].setActionCommand("done");
                        reqAccDoneButtons[j].setMaximumSize(new Dimension(300,300));
                        // sideBar.add(reqAccDoneButtons[j]);
                        // sideBar.add(Box.createRigidArea(new Dimension(0,20)));
                    }
                    
                    

                }





        for(int i = 0; i < panelsContainer.length; ++i)
        {
            if(i == 0)
            {
                Image getImage = profileLogout.getImage();
                Image setNewSize = getImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                profileLogout = new ImageIcon(setNewSize);
                JButton profileButton = new JButton(profileLogout);
                panelsContainer[0] = new JPanel();
                panelsContainer[0].setLayout(new BorderLayout());
                profileButton.setBackground(Color.decode("#303765"));
                profileButton.addActionListener(this);
                profileButton.setToolTipText(name);
                JLabel title = new JLabel("ARTSTREAM");
                panelsContainer[0].add(title,BorderLayout.WEST);
                panelsContainer[0].add(profileButton,BorderLayout.EAST);
                panelsContainer[0].setBackground(Color.decode("#303765"));
                con.add(panelsContainer[0],BorderLayout.NORTH);
            }else if(i == 1)
            {

                panelsContainer[1] = new JPanel();
                panelsContainer[1].setBackground(Color.decode("#303765"));
                JPanel sideBar = new JPanel();
                sideBar.setLayout(new BoxLayout(sideBar,BoxLayout.Y_AXIS));
                
                ImageIcon profileArtist = new ImageIcon("src\\portrait.jpg");
                Image getProfileImage = profileArtist.getImage();
                Image setSizeProfile = getProfileImage.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
                profileArtist = new ImageIcon(setSizeProfile);
                JLabel artistImageAndName = new JLabel(profileArtist);
                artistImageAndName.setText(name);
                artistImageAndName.setVerticalTextPosition(SwingConstants.BOTTOM);
                artistImageAndName.setHorizontalTextPosition(SwingConstants.CENTER);
                artistImageAndName.setForeground(Color.WHITE);
                artistImageAndName.setFont(new Font("Monospaced",Font.BOLD,20));
                sideBar.add(artistImageAndName);
                sideBar.add(Box.createRigidArea(new Dimension(0,20)));
                sideBar.setBorder(BorderFactory.createEmptyBorder(100,50,100,50));
                sideBar.setBackground(Color.decode("#303765"));
                sideBar.add(reqAccDoneButtons[0]);
                sideBar.add(Box.createRigidArea(new Dimension(0,20)));
                sideBar.add(reqAccDoneButtons[1]);
                sideBar.add(Box.createRigidArea(new Dimension(0,20)));
                sideBar.add(reqAccDoneButtons[2]);
                sideBar.add(Box.createRigidArea(new Dimension(0,20)));

                // for(int j = 0; j < reqAccDoneButtons.length; ++j)
                // {
                //     if(j == 0)
                //     {
                //         reqAccDoneButtons[j] = new JButton("REQUESTS");
                //         reqAccDoneButtons[j].addActionListener(this);
                //         reqAccDoneButtons[j].setActionCommand("request");
                //         reqAccDoneButtons[j].setMaximumSize(new Dimension(300,300));
                //         sideBar.add(reqAccDoneButtons[j]);
                //         sideBar.add(Box.createRigidArea(new Dimension(0,20)));
                //     }else if(j== 1)
                //     {
                //         reqAccDoneButtons[j] = new JButton("ACCEPTED");
                //         reqAccDoneButtons[j].addActionListener(this);
                //         reqAccDoneButtons[j].setActionCommand("accept");
                //         reqAccDoneButtons[j].setMaximumSize(new Dimension(300,300));
                //         sideBar.add(reqAccDoneButtons[j]);
                //         sideBar.add(Box.createRigidArea(new Dimension(0,20)));
                //     }else{
                //         reqAccDoneButtons[j] = new JButton("DONE");
                //         reqAccDoneButtons[j].addActionListener(this);
                //         reqAccDoneButtons[j].setActionCommand("done");
                //         reqAccDoneButtons[j].setMaximumSize(new Dimension(300,300));
                //         sideBar.add(reqAccDoneButtons[j]);
                //         sideBar.add(Box.createRigidArea(new Dimension(0,20)));
                //     }
                    
                    

                // }

                panelsContainer[1].add(sideBar);
                con.add(panelsContainer[1],BorderLayout.WEST);
            
            
            }else
            {
                panelsContainer[i] = new JPanel();           
                panelsContainer[i].setBackground(Color.decode("#17224d"));
                con.add(panelsContainer[i],BorderLayout.CENTER);


            }



        }

        panelsContainer[2].setLayout(card);
        panelsContainer[2].add("requests",new Requests());
        panelsContainer[2].add("accepted",new Accepted());
        panelsContainer[2].add("done",new Done());


    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();
        switch (command) {
            case "requests":
                card.show(panelsContainer[2],command);
            break;
            case "accepted":
                card.show(panelsContainer[2],command);
            break;
            case "done":
                card.show(panelsContainer[2],command);
            break;
            default:
                break;
        }

    }





    
    
    
    
}
