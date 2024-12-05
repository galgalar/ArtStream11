

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

public class DashboardClient extends JFrame implements ActionListener, StoreRequests, ItemListener
{
    // protected Container con = getContentPane();
    // protected JPanel headerPanel = new JPanel();
    // protected JPanel title = new JPanel();
    // protected JPanel choices = new JPanel();
    // protected ImageIcon accepted = new ImageIcon("C:\\Users\\Owner\\OneDrive\\Documents\\NetBeansProjects\\ArtStreamFinal\\src\\main\\java\\com\\mycompany\\artstreamfinal\\accepted-removebg-preview.png");
    // protected ImageIcon pending = new ImageIcon("C:\\Users\\Owner\\OneDrive\\Documents\\NetBeansProjects\\ArtStreamFinal\\src\\main\\java\\com\\mycompany\\artstreamfinal\\pending-removebg-preview.png");
    // protected ImageIcon profile = new ImageIcon("C:\\Users\\Owner\\OneDrive\\Documents\\NetBeansProjects\\ArtStreamFinal\\src\\main\\java\\com\\mycompany\\artstreamfinal\\profile-removebg-preview.png");
    // protected JPanel contents = new JPanel();
    // protected JPanel[] grids = new JPanel[4];
    // protected JLabel[] profileLabels = new JLabel[4];
    // protected JLabel titleLabel = new JLabel("ARTSTREAM");
    // protected JLabel label = new JLabel("Find Artists");
    // protected Image icon;
    // protected Image iconNewSize;
    
    // protected ImageIcon[] icons = {
    //         new ImageIcon("C:\\Users\\Owner\\OneDrive\\Documents\\NetBeansProjects\\ArtStreamFinal\\src\\main\\java\\com\\mycompany\\artstreamfinal\\digitalarts.jpg"),
    //         new ImageIcon("C:\\Users\\Owner\\OneDrive\\Documents\\NetBeansProjects\\ArtStreamFinal\\src\\main\\java\\com\\mycompany\\artstreamfinal\\charcoal.jpg"),
    //         new ImageIcon("C:\\Users\\Owner\\OneDrive\\Documents\\NetBeansProjects\\ArtStreamFinal\\src\\main\\java\\com\\mycompany\\artstreamfinal\\landscape.jpg"),
    //         new ImageIcon("C:\\Users\\Owner\\OneDrive\\Documents\\NetBeansProjects\\ArtStreamFinal\\src\\main\\java\\com\\mycompany\\artstreamfinal\\portrait.jpg")
    //     };
        
    // protected JLabel[] names = 
    //     {
    //         new JLabel("DIGITAL ARTISTS"),
    //         new JLabel("CHARCOAL ARTISTS"),
    //         new JLabel("LANDSCAPE ARTISTS"),
    //         new JLabel("PORTRAIT ARTISTS")
    //     };
    
    // protected JButton acceptedButton;
    // protected JButton pendingButton;
    // protected JButton profileButton;

    // protected JPanel mainPanel = new JPanel();

    // protected JButton[] viewArtists = new JButton[4];
    // protected JPanel backPanel = new JPanel();
    // protected JButton back = new JButton("back");
    // private String name;
    // private CardLayout card = new CardLayout();
    // private JPanel contentPanel = new JPanel();

    // public DashboardClient()
    // {
    //     super("ArtStream - Dashboard Client");
    //     setSize(1300,1000);
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
        
    //     titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 40)); // Increase font size here
    //     titleLabel.setForeground(Color.WHITE);
    //     title.add(titleLabel);

    //     // Set the icon sizes (as before)
    //     Image acceptedSize = accepted.getImage();
    //     Image iconNewSize1 = acceptedSize.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    //     accepted = new ImageIcon(iconNewSize1);

    //     Image pendingSize = pending.getImage();
    //     Image iconNewSize2 = pendingSize.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    //     pending = new ImageIcon(iconNewSize2);

    //     Image profileSize = profile.getImage();
    //     Image iconNewSize3 = profileSize.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    //     profile = new ImageIcon(iconNewSize3);

    //     acceptedButton = new JButton(accepted);
    //     pendingButton = new JButton(pending);
    //     profileButton = new JButton(profile);

    //     acceptedButton.setBackground(Color.decode("#303765"));
    //     pendingButton.setBackground(Color.decode("#303765"));
    //     profileButton.setBackground(Color.decode("#303765"));

    //     acceptedButton.setToolTipText("Accepted Commissions");
    //     pendingButton.setToolTipText("Pending Commissions");
    //     profileButton.setToolTipText("Log-out");

    //     choices.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 10));  // Right-aligned with spacing
    //     choices.add(acceptedButton);
    //     choices.add(pendingButton);
    //     choices.add(profileButton);
    //     choices.setBackground(Color.decode("#303765"));
    //     headerPanel.add(choices, BorderLayout.EAST);

    //     mainPanel.setLayout(new BorderLayout());
    //     mainPanel.setBackground(Color.decode("#17224d"));
    //     JPanel secondHeader = new JPanel();

    //     // Set a larger font size for the combo box
        
        
    //     label.setFont(new Font("Segoe UI", Font.PLAIN, 25)); 
    //     label.setMaximumSize(new Dimension(200, 100));
        
    //     label.setBackground(Color.decode("#17224d"));
    //     label.setForeground(Color.WHITE);
    //     label.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 20));
    //     secondHeader.setLayout(new FlowLayout(FlowLayout.LEADING, 10, 10));  // Added spacing between components
    //     secondHeader.add(label);
    //     secondHeader.setBackground(Color.decode("#17224d"));

    //     mainPanel.add(secondHeader, BorderLayout.NORTH);

        
    //     contents.setLayout(new GridLayout(0, 4, 20, 20));  // Increased horizontal and vertical spacing
  
        
        
    //     for (int i = 0; i < grids.length; ++i) {
            
    //         icon = icons[i].getImage();
    //         iconNewSize = icon.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
    //         icons[i] = new ImageIcon(iconNewSize);

    //         profileLabels[i] = new JLabel(icons[i]);
    //         profileLabels[i].setFont(new Font("Segoe UI", Font.PLAIN, 18));
    //         profileLabels[i].setForeground(Color.WHITE);
    //         profileLabels[i].setText(names[i].getText());

    //         profileLabels[i].setVerticalTextPosition(SwingConstants.BOTTOM);
    //         profileLabels[i].setHorizontalTextPosition(SwingConstants.CENTER);

    //         grids[i] = new JPanel();
    //         grids[i].setLayout(new BorderLayout());
    //         grids[i].setBackground(Color.decode("#303765"));

    //         // Add the profile image to the grid
    //         grids[i].add(profileLabels[i], BorderLayout.CENTER);

    //         // Create and configure the "See Profile" button
    //         viewArtists[i] = new JButton("VIEW ARTISTS");
    //         viewArtists[i].addActionListener(this);
    //         viewArtists[i].setBackground(Color.decode("#17224d"));
    //         viewArtists[i].setForeground(Color.WHITE);
    //         viewArtists[i].setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    //         // Add padding around each grid and add the button at the bottom
    //         grids[i].setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    //         grids[i].add(viewArtists[i], BorderLayout.SOUTH);
    //     }

    //     // Add each profile grid to the contents panel
    //     for (int i = 0; i < grids.length; ++i) {
    //         contents.add(grids[i]);
    //     }
    //     contents.setBackground(Color.decode("#17224d"));
    //     // Add the content panel to the main panel
    //     mainPanel.add(contents, BorderLayout.CENTER);
    //     backPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
    //     backPanel.setBackground(Color.decode("#17224d"));
    //     backPanel.add(back);
    //     mainPanel.add(backPanel,BorderLayout.SOUTH);
    //     mainPanel.setBorder(BorderFactory.createEmptyBorder(50, 100, 200, 100));
        
    //     acceptedButton.addActionListener(this);
    //     pendingButton.addActionListener(this);
    //     profileButton.addActionListener(this);
    //     back.addActionListener(this);
        
               
    // }
    
    
    
    // public DashboardClient(String name) {
    //     super("ArtStream - Dashboard Client");
    //     setSize(1300,1000);
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

    //     titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 40)); 
    //     titleLabel.setForeground(Color.WHITE);
    //     title.add(titleLabel);

    //     Image acceptedSize = accepted.getImage();
    //     Image iconNewSize1 = acceptedSize.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    //     accepted = new ImageIcon(iconNewSize1);

    //     Image pendingSize = pending.getImage();
    //     Image iconNewSize2 = pendingSize.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    //     pending = new ImageIcon(iconNewSize2);

    //     Image profileSize = profile.getImage();
    //     Image iconNewSize3 = profileSize.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    //     profile = new ImageIcon(iconNewSize3);

    //     acceptedButton = new JButton(accepted);
    //     pendingButton = new JButton(pending);
    //     profileButton = new JButton(profile);

    //     acceptedButton.setBackground(Color.decode("#303765"));
    //     pendingButton.setBackground(Color.decode("#303765"));
    //     profileButton.setBackground(Color.decode("#303765"));

    //     acceptedButton.setToolTipText("Accepted Commissions");
    //     pendingButton.setToolTipText("Pending Commissions");
    //     profileButton.setToolTipText(name);

    //     choices.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 10));  // Right-aligned with spacing
    //     choices.add(acceptedButton);
    //     choices.add(pendingButton);
    //     choices.add(profileButton);
    //     choices.setBackground(Color.decode("#303765"));
    //     headerPanel.add(choices, BorderLayout.EAST);

    //     mainPanel.setLayout(new BorderLayout());
    //     mainPanel.setBackground(Color.decode("#17224d"));
    //     JPanel secondHeader = new JPanel();

        
    //     label.setFont(new Font("Segoe UI", Font.PLAIN, 25)); 
    //     label.setMaximumSize(new Dimension(200, 100));
        
    //     label.setBackground(Color.decode("#17224d"));
    //     label.setForeground(Color.WHITE);
    //     label.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 20));
    //     secondHeader.setLayout(new FlowLayout(FlowLayout.LEADING, 10, 10));  // Added spacing between components
    //     secondHeader.add(label);
    //     secondHeader.setBackground(Color.decode("#17224d"));

    //     acceptedButton.setActionCommand(name);


    //     mainPanel.add(secondHeader, BorderLayout.NORTH);
        
    //     mainPanel.add(contentPanel,BorderLayout.CENTER);
        
        
    //     contentPanel.setLayout(card);

    //     acceptedButton.setActionCommand("accepted");
    //     pendingButton.setActionCommand("pending");
    //     contentPanel.add("contents",contents);
    //     contentPanel.add("accepted",new AcceptedCommissions());
    //     contentPanel.add("pending",new PendingCommissions());



        // JPanel contentsPanel = new JPanel();
        // contentsPanel.add(contents);
        
        // contents.setLayout(new GridLayout(0, 4, 20, 20));  // Increased horizontal and vertical spacing   
        
        // for (int i = 0; i < grids.length; ++i) {
            
        //     icon = icons[i].getImage();
        //     iconNewSize = icon.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        //     icons[i] = new ImageIcon(iconNewSize);

        //     profileLabels[i] = new JLabel(icons[i]);
        //     profileLabels[i].setFont(new Font("Segoe UI", Font.PLAIN, 18));
        //     profileLabels[i].setForeground(Color.WHITE);
        //     profileLabels[i].setText(names[i].getText());

        //     profileLabels[i].setVerticalTextPosition(SwingConstants.BOTTOM);
        //     profileLabels[i].setHorizontalTextPosition(SwingConstants.CENTER);

        //     grids[i] = new JPanel();
        //     grids[i].setLayout(new BorderLayout());
        //     grids[i].setBackground(Color.decode("#303765"));

            
        //     grids[i].add(profileLabels[i], BorderLayout.CENTER);

            
        //     viewArtists[i] = new JButton("VIEW ARTISTS");
        //     viewArtists[i].addActionListener(this);
        //     viewArtists[i].setBackground(Color.decode("#17224d"));
        //     viewArtists[i].setForeground(Color.WHITE);
        //     viewArtists[i].setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            
        //     grids[i].setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        //     grids[i].add(viewArtists[i], BorderLayout.SOUTH);
        // }

        
        // for (int i = 0; i < grids.length; ++i) {
        //     contents.add(grids[i]);
        // }
        // contents.setBackground(Color.decode("#17224d"));
        
        // mainPanel.add(contentsPanel, BorderLayout.CENTER);
        // backPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
        // backPanel.setBackground(Color.decode("#17224d"));
        // backPanel.add(back);
        // mainPanel.add(backPanel,BorderLayout.SOUTH);
        // mainPanel.setBorder(BorderFactory.createEmptyBorder(50, 100, 200, 100));
        
    //     acceptedButton.addActionListener(this);
    //     pendingButton.addActionListener(this);
    //     profileButton.addActionListener(this);
    //     back.addActionListener(this);
    //     this.name = name;
               
    //     setVisible(true);
    // }
    // @Override 
    // public void actionPerformed(ActionEvent e)
    // {
    //    Object source = e.getSource();
       
    //    String command = e.getActionCommand();    

    //    switch (command) {
    //     case "accepted":

    //          card.show(contentPanel,command);
    //         break;
       
    //     case "pending":
    //          card.show(contentPanel,command);   
    //         break;
    //    }


    //    if(source == acceptedButton)
    //    {
    //        new AcceptedCommissions();
    //        setVisible(false);
    //    }else if(source == pendingButton)
    //    {
    //        new PendingCommissions();
    //        setVisible(false);
    //    }else if(source == profileButton)
    //    {
    //        int choice = JOptionPane.showConfirmDialog(null,"Are you sure you want to log out?", "Confirm Log-Out",JOptionPane.YES_NO_OPTION);
           
    //        if(choice == JOptionPane.YES_OPTION)
    //        {
    //            new FirstFrame();           
    //            setVisible(false);
    //        }   
    //    }else if(source == viewArtists[0])
    //    {
    //        new DigitalArtists();
    //        setVisible(false);
    //    }else if(source == viewArtists[1])
    //    {
    //        new CharcoalArtists();
    //        setVisible(false);
           
    //    }else if(source == viewArtists[2])
    //    {
    //        new LandscapeArtists();
    //        setVisible(false);
    //    }else if(source == viewArtists[3])
    //    {
    //        new PortraitArtists();
    //        setVisible(false);
    //    }else
    //    {
    //        new SigninClient();
    //        setVisible(false);
    //    }

  

    // // }
   
    // }
    private String name;
    private Container con = getContentPane();
    private JPanel[] panelBorder = new JPanel[3];
    private JLabel title = new JLabel("ARTSTREAM");

    private ImageIcon[] imageIcons = 
    {
        new ImageIcon("src\\artistlogo.png"),
        new ImageIcon("src\\pending-removebg-preview.png"),
        new ImageIcon("src\\accepted-removebg-preview.png"),
        new ImageIcon("src\\profile-removebg-preview.png")
    };
    private JButton[] buttons = new JButton[4];
    private CardLayout card = new CardLayout();

    // private String[] artists = 
    // {
    //     "Select",
    //     "Digital Artists",
    //     "Charcoal Artists",
    //     "Landscape Artists",
    //     "Portrait Artists"
    // };
   // private JComboBox <String> typeOfArtists = new JComboBox<>(artists);
    private JButton[] typeOfArtists = new JButton[4];

    public DashboardClient()
    {

    }



    public DashboardClient(String name)
    {
        super("ArtStream");
        setSize(1600,1000);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.name = name;  
        con.setLayout(new BorderLayout());
        con.setBackground(Color.decode("#303765"));
        

        for(int i = 0; i < imageIcons.length; ++i)
        {
            Image icon = imageIcons[i].getImage();
            Image resizeIcon = icon.getScaledInstance(30,30,Image.SCALE_SMOOTH);
            imageIcons[i] = new ImageIcon(resizeIcon);
            buttons[i] = new JButton(imageIcons[i]);
            buttons[i].setBackground(Color.decode("#303765"));
            buttons[i].addActionListener(this);
           

        }
        for(int i = 0; i < buttons.length; ++i)
        {
            switch (i) {
                case 0:
                    buttons[0].setToolTipText("Artists");
                    buttons[0].setActionCommand("typeArtist");
                    typeOfArtists[0] = new JButton("Digital Artists");
                    typeOfArtists[0].setActionCommand("digital");
                    typeOfArtists[i].addActionListener(this);
                    break;
                case 1:
                    buttons[1].setToolTipText("Pending Commissions");
                    buttons[1].setActionCommand("pending");
                    typeOfArtists[1] = new JButton("Charcoal Artists");
                    typeOfArtists[1].setActionCommand("charcoal");
                    typeOfArtists[i].addActionListener(this);
                    break;
                case 2:
                    buttons[2].setToolTipText("Accepted Commissions");
                    buttons[2].setActionCommand("accepted");
                    typeOfArtists[2] = new JButton("Landscape Artists");
                    typeOfArtists[2].setActionCommand("landscape");
                    typeOfArtists[i].addActionListener(this);
                    break;
                case 3:
                    buttons[3].setToolTipText(name);
                    buttons[3].setActionCommand("logout");
                    typeOfArtists[3] = new JButton("Portrait Artists");
                    typeOfArtists[3].setActionCommand("portrait");
                    typeOfArtists[i].addActionListener(this);
                    break;        
                default:
                    break;
            }
        }


        for(int i = 0; i < panelBorder.length; ++i)
        {
            if(i == 0)
            {
                panelBorder[i] = new JPanel();
                panelBorder[i].setLayout(new BorderLayout());
                title.setForeground(Color.WHITE);
                title.setFont(new Font("Monospaced",Font.BOLD,30));
                JPanel panelTitle = new JPanel();
                panelTitle.add(title);
                panelTitle.setBackground(Color.decode("#303765"));
                panelTitle.setBorder(BorderFactory.createEmptyBorder(0,20,0,20));
                panelBorder[i].add(panelTitle,BorderLayout.WEST);             
                
                JPanel buttonsPanel = new JPanel();
                buttonsPanel.setLayout(new FlowLayout());
                buttonsPanel.add(buttons[0]);
                buttonsPanel.add(buttons[1]);
                buttonsPanel.add(buttons[2]);
                buttonsPanel.add(buttons[3]);
                buttonsPanel.setBackground(Color.decode("#303765"));
                panelBorder[i].add(buttonsPanel,BorderLayout.EAST);
                panelBorder[i].setBackground(Color.decode("#303765"));

                con.add(panelBorder[i],BorderLayout.NORTH);
                

            }else if(i == 1)
            {
                panelBorder[i] = new JPanel();
                
                // panelBorder[i].setLayout(new FlowLayout());
                panelBorder[i].setBackground(Color.decode("#17224d"));
                con.add(panelBorder[i],BorderLayout.CENTER);

            }else
            {
                ImageIcon profileOfClient = new ImageIcon("src\\profile.jpg");
                Image getProfileOfClient = profileOfClient.getImage();
                Image setProfileOfClient = getProfileOfClient.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
                profileOfClient = new ImageIcon(setProfileOfClient);

                JLabel clientName = new JLabel(profileOfClient);
                clientName.setText(name);
                clientName.setVerticalTextPosition(SwingConstants.BOTTOM);
                clientName.setHorizontalTextPosition(SwingConstants.CENTER);
                clientName.setForeground(Color.WHITE);
                clientName.setFont(new Font("Monospaced",Font.BOLD,20));

                // JPanel picOfClient = new JPanel();
                // picOfClient.setLayout(new BoxLayout(picOfClient, BoxLayout.Y_AXIS));
                // picOfClient.add(clientName);

                panelBorder[i] = new JPanel();
                panelBorder[i].setLayout(new BoxLayout(panelBorder[i], BoxLayout.Y_AXIS));
                panelBorder[i].setBackground(Color.decode("#484e7e"));
                panelBorder[i].setBorder(BorderFactory.createEmptyBorder(100,50,100,50));
                // typeOfArtists.setMaximumSize(new Dimension(200,20));

                panelBorder[i].add(clientName);
                clientName.setAlignmentX(CENTER_ALIGNMENT);

                JLabel artistLabel = new JLabel("View Available Artists");
                artistLabel.setForeground(Color.WHITE);
                artistLabel.setFont(new Font("Monospaced",Font.BOLD,15));

                panelBorder[i].add(Box.createRigidArea(new Dimension(0,20)));
                panelBorder[i].add(artistLabel);
                artistLabel.setAlignmentX(CENTER_ALIGNMENT);

                panelBorder[i].add(Box.createRigidArea(new Dimension(0,20)));

                // typeOfArtists.setAlignmentX(CENTER_ALIGNMENT);
                panelBorder[i].add(typeOfArtists[0]);
                typeOfArtists[0].setMaximumSize(new Dimension(400,50));
                typeOfArtists[0].setAlignmentX(CENTER_ALIGNMENT);
                panelBorder[i].add(Box.createRigidArea(new Dimension(0,20)));

                panelBorder[i].add(typeOfArtists[1]);
                typeOfArtists[1].setMaximumSize(new Dimension(400,50));
                typeOfArtists[1].setAlignmentX(CENTER_ALIGNMENT);
                panelBorder[i].add(Box.createRigidArea(new Dimension(0,20)));

                panelBorder[i].add(typeOfArtists[2]);
                typeOfArtists[2].setMaximumSize(new Dimension(400,50));
                typeOfArtists[2].setAlignmentX(CENTER_ALIGNMENT);
                panelBorder[i].add(Box.createRigidArea(new Dimension(0,20)));

                panelBorder[i].add(typeOfArtists[3]);
                typeOfArtists[3].setMaximumSize(new Dimension(400,50));
                typeOfArtists[3].setAlignmentX(CENTER_ALIGNMENT);
                panelBorder[i].add(Box.createRigidArea(new Dimension(0,20)));

                con.add(panelBorder[i],BorderLayout.WEST);

            }
                
        }



        panelBorder[1].setLayout(card);
        panelBorder[1].add("typeArtist",new TypesOfArtists());
        panelBorder[1].add("pending",new PendingCommissions());
        panelBorder[1].add("accepted",new AcceptedCommissions());

        panelBorder[1].add("digital",new DigitalArtists());
        panelBorder[1].add("charcoal",new CharcoalArtists());
        panelBorder[1].add("landscape",new LandscapeArtists());
        panelBorder[1].add("portrait",new PortraitArtists());



        // buttons[0].setActionCommand("typeArtist");
        // buttons[1].setActionCommand("pending");
        // buttons[2].setActionCommand("accepted");
        // buttons[3].setActionCommand("accepted");


      


    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();

        switch (command) {
            case "typeArtist":
                card.show(panelBorder[1], command);
                break;
             case "pending":
                card.show(panelBorder[1], command);
                break;
            case "accepted":
                card.show(panelBorder[1], command);
                break;
            case "digital":
                card.show(panelBorder[1], command);
                break;
             case "charcoal":
                card.show(panelBorder[1], command);
                break;
            case "landscape":
                card.show(panelBorder[1], command);
                break;
            case "portrait":
                card.show(panelBorder[1], command);
                break;        
            case "logout":
                int i = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?","System",JOptionPane.YES_NO_OPTION);
                if(i == 0)
                {
                    new SetupAccountClient();
                    dispose();
                } 
                break;
            default:
                break;
        }

    }

    @Override
    public void itemStateChanged(ItemEvent e)
    {
        // String command = e.getActionCommand();

        // switch (command) {
        //     case "typeArtist":
        //         card.show(panelBorder[1], command);
        //         break;
        //      case "pending":
        //         card.show(panelBorder[1], command);
        //         break;
        //     case "accepted":
        //         card.show(panelBorder[1], command);
        //         break;
        //     case "logout":
        //         int i = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?","System",JOptionPane.YES_NO_OPTION);
        //         if(i == 0)
        //         {
        //             new SetupAccountClient();
        //             dispose();
        //         } 
        //         break;
        //     default:
        //         break;
        // }
    


    }
    



    
    
}
