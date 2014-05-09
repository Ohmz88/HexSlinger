package com.orodal.HexSlinger.gui;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import com.orodal.HexSlinger.diceRoller;



public class HexGui extends JFrame
{
	public HexGui()
	{
		super("Hexslinger");
		
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				HexGui.this.setVisible(false);
				HexGui.this.dispose();
			}
		});
		
		final JPanel leftPanel = new JPanel();
		final JPanel inputPanel = new JPanel();
		final JPanel resultPanel = new JPanel();
		final JPanel chipPanel = new JPanel();
		
		final String[] HEX_LEVEL = {"1","2","3","4","5","6","7","8","9","10"};
		final String[] DIE_TYPE = {"4","6","8","10","12","20","100"};
		final String[] MODIFIER = {"0","1","2","3","4","5","6","7","8","9","10"};
		
		final JLabel hexLevelLabel = new JLabel("Hexslingin' Level");
		final JLabel dieTypeLabel = new JLabel("Spell Die Type");
		final JLabel modifierLabel = new JLabel("Bonus or Penalty");
		final JLabel resultLabel = new JLabel("Result: ");
		resultLabel.setHorizontalAlignment(JLabel.RIGHT);
		final JLabel result = new JLabel("");
		result.setHorizontalAlignment(JLabel.CENTER);
		final JLabel oldHandLabel = new JLabel("Old Hand");
		final JLabel bestHandLabel = new JLabel("Best Hand");
		final JLabel bestHand = new JLabel("");
		
		
		BufferedImage pokerFelt = null;
		BufferedImage whiteChip = null;
		BufferedImage redChip = null;
		BufferedImage blueChip = null;
		BufferedImage greenChip = null;
		BufferedImage ace = null;
		try
		{
			pokerFelt = ImageIO.read(new File("resources/pokerfelt.jpg"));
			whiteChip = ImageIO.read(new File("resources/white.png"));
			redChip = ImageIO.read(new File("resources/red.png"));
			blueChip = ImageIO.read(new File("resources/blue.png"));
			greenChip = ImageIO.read(new File("resources/green.png"));
			ace = ImageIO.read(new File("resources/ace.png"));
		} catch (IOException e1)
		{
			e1.printStackTrace();
		}
		final JLabel feltLabel = new JLabel(new ImageIcon(pokerFelt));
		
		
		final JComboBox hexLevelBox = new JComboBox(HEX_LEVEL);
		final JComboBox dieTypeBox = new JComboBox(DIE_TYPE);
		final JComboBox modifierBox = new JComboBox(MODIFIER);
		
		
		final JButton roll = new JButton("Roll");
		roll.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				result.setText(Integer.toString(diceRoller.dieRoll(Integer.parseInt((String)hexLevelBox.getSelectedItem()), 
																   Integer.parseInt((String)dieTypeBox.getSelectedItem()), 
																   Integer.parseInt((String)modifierBox.getSelectedItem()))));
			}
		});
		final JButton whiteButton = new JButton(new ImageIcon(whiteChip));
		whiteButton.setBorder(BorderFactory.createEmptyBorder());
		whiteButton.setContentAreaFilled(false);
		whiteButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				int whiteRoll = diceRoller.dieRoll(1, 
						   						   Integer.parseInt((String)dieTypeBox.getSelectedItem()), 
						   						   Integer.parseInt((String)modifierBox.getSelectedItem()));
				if(whiteRoll > Integer.parseInt(result.getText()))
				{
					result.setText(Integer.toString(whiteRoll));
				}
			}
		});
		final JButton redButton = new JButton(new ImageIcon(redChip));
		redButton.setBorder(BorderFactory.createEmptyBorder());
		redButton.setContentAreaFilled(false);
		redButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				int redRoll = diceRoller.dieRoll(1, 
						Integer.parseInt((String)dieTypeBox.getSelectedItem()), 
						Integer.parseInt((String)modifierBox.getSelectedItem()));
				result.setText(Integer.toString(redRoll + Integer.parseInt(result.getText())));
			}
		});
		final JButton blueButton = new JButton(new ImageIcon(blueChip));
		blueButton.setBorder(BorderFactory.createEmptyBorder());
		blueButton.setContentAreaFilled(false);
		blueButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				int blueRoll = diceRoller.dieRoll(1, 
						Integer.parseInt((String)dieTypeBox.getSelectedItem()), 
						Integer.parseInt((String)modifierBox.getSelectedItem()));
				result.setText(Integer.toString(blueRoll + Integer.parseInt(result.getText())));
			}
		});
		final JButton greenButton = new JButton(new ImageIcon(greenChip));
		greenButton.setBorder(BorderFactory.createEmptyBorder());
		greenButton.setContentAreaFilled(false);
		greenButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				result.setText(Integer.toString(diceRoller.dieRoll(Integer.parseInt((String)hexLevelBox.getSelectedItem()), 
						   Integer.parseInt((String)dieTypeBox.getSelectedItem()), 
						   Integer.parseInt((String)modifierBox.getSelectedItem()))));
			}
		});
		
		
		this.setLayout(new FlowLayout());
		leftPanel.setLayout(new GridLayout(0,1));
		inputPanel.setLayout(new GridLayout(3,2));
		resultPanel.setLayout(new GridLayout(1,2));
		this.add(leftPanel);
		this.add(feltLabel);
		
		
		leftPanel.add(inputPanel);
		inputPanel.add(hexLevelLabel);
		inputPanel.add(hexLevelBox);
		inputPanel.add(dieTypeLabel);
		inputPanel.add(dieTypeBox);
		inputPanel.add(modifierLabel);
		inputPanel.add(modifierBox);
		leftPanel.add(roll);
		leftPanel.add(resultPanel);
		resultPanel.add(resultLabel);
		resultPanel.add(result);
		leftPanel.add(chipPanel);
		chipPanel.add(whiteButton);
		chipPanel.add(redButton);
		chipPanel.add(blueButton);
		chipPanel.add(greenButton);
		
		Graphics2D g = ace.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
		g.drawImage(ace, 300,300, null);
		g.dispose();
		
		this.pack();
		
	}
}
