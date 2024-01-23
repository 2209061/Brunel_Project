   
package RestaurantGUI;
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
			private JLabel DateOfBirth   ;
			private JLabel PassportNumber;
			private JLabel TicketNumber;
			private JLabel  smallplates;
			private JLabel  Burger;
			private JLabel  AlldayBreakfast ;
			private JLabel  Pasta;
			private JLabel Salads;
			private JLabel Diytacos; 
			private JLabel Grills;
			private JLabel  Breakfast;
			private JLabel  Lunch;
			private JLabel  Dinner ;
			private JLabel age;
			private JTextField rFirstName;
			private JTextField rSecondName;
			private JTextField rLastName;
			private JTextField rDateOfBirth;
			private JTextField rPassportNumber;
			private JTextField rTicketNumber;
			private JTextField csmallplates;
			private JTextField cBurger;
			private JTextField cAlldaybreakfast;
			private JTextField cPasta;
			private JTextField cSalads; 
			private JTextField cDiytacos;
			private JTextField cGrills;
			private JTextField rage;
			private JTextField dBreakfast;
			private JTextField dLunch;
			private JTextField dDinner;
	
			private JButton rSubmit;
		 
		   
		public RestaurantGUI () {
			rframe=new JFrame("RESTAURANT");
			rframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		    rpanel=new JPanel( ) ;
		rpanel.setLayout(new BoxLayout(rpanel,BoxLayout.Y_AXIS));	 
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
			 
			 smallplates=new JLabel ("smallplates");
				rpanel.add(smallplates);
				csmallplates=new JTextField(40);
				rpanel.add(csmallplates);
			 Burger=new JLabel("Burger");
				rpanel.add(Burger);
				cBurger=new JTextField(20);
				rpanel.add(cBurger);
				AlldayBreakfast=new JLabel("AlldayBreakfast");
				rpanel.add(AlldayBreakfast);
				cAlldaybreakfast=new JTextField(40);
						rpanel.add(cAlldaybreakfast);
				Pasta=new JLabel ("pasta, (PRICE) 1 plate=£11.95");
				rpanel.add(Pasta);
				cPasta=new JTextField(20);
				rpanel.add(cPasta);
				Salads=new JLabel ("Salads (PRICE) 1 Portion=£8.00");
				rpanel.add(Salads);
				cSalads=new JTextField (20);
				rpanel.add(cSalads);
				Diytacos=new JLabel("Diytacos (PRICE)1Portion=£9.50");
				rpanel.add(Diytacos);
				cDiytacos=new JTextField (20);
				rpanel.add(cDiytacos);
				Grills=new JLabel("Grills (PRICE)1 Portion=£12.00");
				rpanel.add(Grills);
				cGrills=new JTextField (40);
			
				rpanel.add(cGrills);
				
				Breakfast=new JLabel("Breakfast");
				rpanel.add(Breakfast);
				dBreakfast=new JTextField(40);
				rpanel.add(dBreakfast);
				
				Lunch=new JLabel("Lunch");
				rpanel.add(Lunch);
				dLunch=new JTextField(20);
				rpanel.add(dLunch);
				
				Dinner=new JLabel("Dinner");
				rpanel.add(Dinner);
				dDinner=new JTextField(40);
				rpanel.add(dDinner);
				
			 
			 rSubmit=new JButton("Submit");
			rpanel.add(rSubmit);
			rSubmit.addActionListener(this);
			
			rframe.setVisible(true);
			rframe.setLocationRelativeTo(null);
			rframe.setSize(400,350);
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
				
								
								String u= csmallplates. getText();
								smallplates.setText("smallplates="+u);
									System.out.println("smallplates:"+u);
									String y=cBurger. getText();
									Burger.setText("Burger"+y);
										System.out.println("Burger:"+y);
										String k= cAlldaybreakfast. getText();
										AlldayBreakfast.setText("Alldaybreakfast"+k);
											System.out.println("Alldaybreakfast:"+k);
											String l=cPasta.getText();
											Pasta.setText("Pasta"+l);
												System.out.println("Pasta:"+l);
												String m=cSalads.getText();
												Salads.setText("Salads"+m);
												System.out.println("Salads="+m);
												String n=cDiytacos.getText();
												Diytacos.setText("Diytacos="+n);
												System.out.println("Diytacos:"+n);
												String p=cGrills.getText();
												Grills.setText("Grills="+p);
												System.out.println("Grills:"+p);
												String db= dBreakfast. getText();
												Breakfast.setText("Breakfast"+db);
													System.out.println("Breakfast:"+db);
													String f= dLunch. getText();
													Lunch.setText("Lunch"+f);
														System.out.println("Lunch:"+f);
														String g= dDinner. getText();
														Dinner.setText("Dinner"+g);
															System.out.println("Dinner:"+g);		
								
								
								
								
								
			}
			
			
			
		}
		public static void main(String[] args) {
		
	new RestaurantGUI();
		}

	

}
