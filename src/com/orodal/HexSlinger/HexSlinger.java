package com.orodal.HexSlinger;

import com.orodal.HexSlinger.gui.*;

import javax.swing.*;

//import java.awt.*;
//import java.awt.image.BufferedImage;
//import java.awt.event.*;
//
//import javax.imageio.ImageIO;
//
//import java.io.File;
//import java.io.IOException;
//
//import net.miginfocom.swing.MigLayout;
	
public class HexSlinger
{
//	private final String[] HEX_LEVEL = {"1","2","3","4","5","6","7","8","9","10"};
//	private final String[] DIE_TYPE = {"4","6","8","10","12","20","100"};
//	private final String[] BONUS = {"0","1","2","3","4","5","6","7","8","9","10"};
//	
//	private JFrame mainFrame;
//	
//	private JLabel hexLevelLabel;
//	private JLabel dieTypeLabel;
//	private JLabel bonusLabel;
//	private JLabel resultLabel;
//	private JLabel bestHandLabel;
//	private JLabel bestHand;
//	private JLabel result;
//	
//	private JComboBox hexLevelComboBox;
//	private JComboBox dieTypeComboBox;
//	private JComboBox bonusComboBox;
//	
//	private JButton rollButton;
//	private JButton whiteButton;
//	private JButton redButton;
//	private JButton blueButton;
//	private JButton greenButton;
//	private JButton drawButton;
//	private JButton clearButton;
//	
//	private JCheckBox oldHandCheckBox;
//	
//	private JLabel feltLabel;
//	
//	private BufferedImage whiteChip;
//	private BufferedImage redChip;
//	private BufferedImage blueChip;
//	private BufferedImage greenChip;
//	private BufferedImage pokerFelt;
//	
//	private diceRoller roller;
	
//	public HexSlinger()
//	{
//		roller = new diceRoller();
//	}
	
	public static void main(String[] args) 
	{
       // final String text = args[0];
        SwingUtilities.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                final HexGui gui = new HexGui();
                gui.setVisible(true);
            }
        });
    }
	
//	public static void main(String[] args) throws IOException 
//	{
//		HexSlinger hexSlinger = new HexSlinger();
//		hexSlinger.prepareGUI();
//	}
	
//	private void prepareGUI()
//	{
//		mainFrame = new JFrame("Hexslinger");
//		mainFrame.setSize(945,590);
//		mainFrame.setLayout(new MigLayout("wrap 3"));
//		mainFrame.setResizable(false);
//		
//		hexLevelLabel = new JLabel("Hexslingin' Level:",JLabel.RIGHT);
//		dieTypeLabel = new JLabel("Spell Die Type:",JLabel.RIGHT);
//		bonusLabel = new JLabel("Die Modifier:",JLabel.RIGHT);
//		resultLabel = new JLabel("Result:",JLabel.RIGHT);
//		bestHandLabel = new JLabel("Best Hand:",JLabel.RIGHT);
//		bestHand = new JLabel("",JLabel.CENTER);
//		result = new JLabel("",JLabel.LEFT);
//		
//		hexLevelComboBox = new JComboBox(HEX_LEVEL);
//		dieTypeComboBox = new JComboBox(DIE_TYPE);
//		bonusComboBox = new JComboBox(BONUS);
//		
//		try
//		{
//			whiteChip = ImageIO.read(new File("resources/white.png"));
//			redChip = ImageIO.read(new File("resources/red.png"));
//			blueChip = ImageIO.read(new File("resources/blue.png"));
//			greenChip = ImageIO.read(new File("resources/green.png"));
//			pokerFelt = ImageIO.read(new File("resources/pokerfelt.jpg"));
//		} catch (IOException e)
//		{
//			e.printStackTrace();
//		}
//		
//		feltLabel = new JLabel(new ImageIcon(pokerFelt));
//
//		oldHandCheckBox = new JCheckBox("Old Hand");
//		
//		rollButton = new JButton("Roll");
//		whiteButton = new JButton(new ImageIcon(whiteChip));
//		whiteButton.setBorder(BorderFactory.createEmptyBorder());
//		whiteButton.setContentAreaFilled(false);
//		redButton = new JButton(new ImageIcon(redChip));
//		redButton.setBorder(BorderFactory.createEmptyBorder());
//		redButton.setContentAreaFilled(false);
//		blueButton = new JButton(new ImageIcon(blueChip));
//		blueButton.setBorder(BorderFactory.createEmptyBorder());
//		blueButton.setContentAreaFilled(false);
//		greenButton = new JButton(new ImageIcon(greenChip));
//		greenButton.setBorder(BorderFactory.createEmptyBorder());
//		greenButton.setContentAreaFilled(false);
//		drawButton = new JButton("Draw");
//		clearButton = new JButton("Clear");
//		
//		rollButton.setActionCommand("roll");
//		whiteButton.setActionCommand("white");
//		redButton.setActionCommand("red");
//		blueButton.setActionCommand("blue");
//		greenButton.setActionCommand("green");
//		
//		rollButton.addActionListener(new ButtonClickListener());
//		
//		mainFrame.addWindowListener(new WindowAdapter() {
//	         public void windowClosing(WindowEvent windowEvent){
//		        System.exit(0);
//	         }        
//	      });
//		
//		mainFrame.add(hexLevelLabel);
//		mainFrame.add(hexLevelComboBox,"align center, w 50!");
//		mainFrame.add(feltLabel,"span 1 11");
//		mainFrame.add(dieTypeLabel);
//		mainFrame.add(dieTypeComboBox,"align center, w 50!");
//		mainFrame.add(bonusLabel);
//		mainFrame.add(bonusComboBox,"align center, w 50!");
//		mainFrame.add(rollButton,"span 2 1, align center, w 150!, gaptop 25, gapbottom 25");
//		mainFrame.add(resultLabel, "gapbottom 25");
//		mainFrame.add(result,"align left");
//		mainFrame.add(whiteButton,"split 2");
//		mainFrame.add(redButton);
//		mainFrame.add(blueButton,"split 2");
//		mainFrame.add(greenButton);
//		mainFrame.add(oldHandCheckBox,"span 2 1, align center, gaptop 25");
//		mainFrame.add(drawButton,"span 2 1, align center, w 150!");
//		mainFrame.add(bestHandLabel,"span 2 1, align center");
//		mainFrame.add(bestHand,"span 2 1");
//		mainFrame.add(clearButton,"span 2 1, align center, w 150!, gaptop 150");
//		
//		mainFrame.setVisible(true);
//	}
	
//	public int getHexLevel()
//	{
//		
//		return Integer.parseInt((String)hexLevelComboBox.getSelectedItem());
//	}
//	
//	public int getDieType()
//	{
//		
//		return Integer.parseInt((String)dieTypeComboBox.getSelectedItem());
//	}
//	
//	public int getbonus()
//	{
//		
//		return Integer.parseInt((String)bonusComboBox.getSelectedItem());
//	}
	
//	private class ButtonClickListener implements ActionListener
//	{
//		public void actionPerformed(ActionEvent e)
//		{
//			String command = e.getActionCommand();
//			if( command.equals( "roll" ))  
//			{
//				result.setText(Integer.toString(roller.dieRoll(getHexLevel(),getDieType(),getbonus())));
//	        }
//		}
//		
//	}
}
