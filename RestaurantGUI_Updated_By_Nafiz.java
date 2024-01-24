
	import java.awt.event.*;
	import java.util.HashMap;
import java.awt.*;
	import javax.swing.*;
public class RestaurantGUI extends JFrame implements ActionListener {
		
		
			private JFrame rframe;
			private JPanel rpanel;
				
			private JLabel FirstName;
			private JLabel SecondName;
			private JLabel LastName;
			private JLabel DateOfBirth;
			private JLabel PassportNumber;
			private JLabel TicketNumber;
	
		
			private JLabel  FoodItem;
			private JLabel EatingTime;

			private JLabel age;
			private JTextField rFirstName;
			private JTextField rSecondName;
			private JTextField rLastName;
			private JTextField rDateOfBirth;
			private JTextField rPassportNumber;
			private JTextField rTicketNumber;
			private JTextField rage;
		
			private JComboBox<String> foodItembox;
			private JComboBox<String> time;
	
			private JButton rSubmit;
		 
		   
		public RestaurantGUI () {
			rframe=new JFrame("RESTAURANT");
			rframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		    rpanel=new JPanel( ) ;
		    rpanel.setLayout(new BoxLayout(rpanel,BoxLayout.Y_AXIS));;	 
		 add(rpanel);
		
		 
		FirstName=new JLabel("First Name");
		 rpanel.add(FirstName);
		 
		rFirstName= new JTextField(40);
		rpanel.add(rFirstName);
			
			 
		SecondName=new JLabel("Second Name");
	    rpanel.add(SecondName);
	    
		rSecondName=new JTextField(40);
		rpanel.add(rSecondName);
			
			
		LastName= new JLabel("Last Name");
		rpanel.add(LastName);
		
		rLastName=new JTextField(50);
		
		
		rpanel.add(rLastName);
		
		
		DateOfBirth=new JLabel("DateOfBirth");	
		rpanel.add(DateOfBirth);
		rDateOfBirth=new JTextField(8);
		rpanel.add(rDateOfBirth);
		
		PassportNumber=new JLabel("PassportNumber");
		rpanel.add(PassportNumber);
		rPassportNumber=new JTextField(20);
		rpanel.add(rPassportNumber);
		
		TicketNumber=new JLabel("TicketNumber");
		rpanel.add(TicketNumber);
		rTicketNumber=new JTextField(20);
		rpanel.add(rTicketNumber);
			
			 age=new JLabel("Age");
			 rpanel.add(age);
			 
			rage=new JTextField(40);
			 rpanel.add(rage);
			 
		
			 
			 FoodItem = new JLabel("Select Food");
			 rpanel.add(FoodItem);
			 
				
				
				String[]fooditems= {"smallplates","Burger","Pasta","Salad","Diytacos","Grills"};
				foodItembox= new JComboBox<>(fooditems);
				rpanel.add(foodItembox);
				foodItembox.addActionListener(this);
			
				EatingTime=new JLabel("Select Eating Time");
				rpanel.add(EatingTime);
				
				String[]eatingtimer= {"Breakfast","Lunch","Dinner"};
				time= new JComboBox<>(eatingtimer);
				rpanel.add(time);
				time.addActionListener(this);
				
				
			 
			 rSubmit=new JButton("Submit");
			rpanel.add(rSubmit);
			rSubmit.addActionListener(this);
			
			rframe.setVisible(true);
			rframe.setLocationRelativeTo(null);
			rframe.setSize(250,150);
			 rframe.getContentPane().add(rpanel);
		   rframe.pack();
		    rframe.validate();
		    }
		
		public void actionPerformed(ActionEvent e) {
		
			
			
			
			
			
			
			
			if(e.getSource()==rSubmit) {
				String RFast= rFirstName. getText();
				FirstName.setText("Fast Name"+RFast);
					System.out.println("First Name:"+RFast);
					String bSecond= rSecondName. getText();
					SecondName.setText("Second Name"+bSecond);
						System.out.println("Second Name:"+bSecond);
						String cLast= rLastName. getText();
						LastName.setText("Last Name"+cLast);
							System.out.println("Last Name:"+cLast);
							int ag=Integer.parseInt (rage. getText ());
							age.setText("Age"+ag);
								System.out.println("Age:"+ag);
								String oz=rDateOfBirth.getText();
								DateOfBirth.setText("oz");
								System.out.println("DateOfBirth:"+oz);
								String RPass=rPassportNumber.getText();
								PassportNumber.setText("RPass");
								System.out.println("PassportNumber:"+RPass);
								String oi=rTicketNumber.getText();
								TicketNumber.setText("oi");
								System.out.println(" Ticket Number:"+oi);
				
				
									
									
								String SelectFood=(String)foodItembox.getSelectedItem();
								switch (SelectFood) {
								
								case "smallplates":
									FoodItem.setText("You choose smallplates");
									break;
								
								
								case "Burger":
									FoodItem.setText("You choose Burger");
									break;
								case "Pasta":
									FoodItem.setText("You Choose Pasta");
									break;
								case "Salad":
									FoodItem.setText("You choose Salad");
									break;
								case "Diytacos":
									FoodItem.setText("you choose Diytacos");
									break;
								case "Grills":
									FoodItem.setText("you choose Grills");
									break;}}
								
								
								String settime=(String)time.getSelectedItem();
								switch(settime) {
								case "Breakfast":
									EatingTime.setText("You Choose Breakfast");
									break;
								case "Lunch":
									EatingTime.setText("You choose Lunch");
									break;
								case "Dinner":
									EatingTime.setText("You Choose Dinner");
									break;
								
								
								
								
								
								
								
								
								
								
								}
								
								
								
								
								
			}
			
			
			
		
		public static void main(String[] args) {
		
	new RestaurantGUI();
		}

	

}

