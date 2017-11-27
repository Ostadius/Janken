package janken;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class MainJanKen {

	public static void main(String[] args) {
		
		String p1;
		String p2;
		int hp1 = 10;
		int hp2 = 10;
		double option = JOptionPane.showConfirmDialog(null,
				"Are you ready to wield the elements of the mortal realm to conquer your rival?", null,
				JOptionPane.YES_NO_OPTION);
		if (option == JOptionPane.YES_OPTION) {
			
			
			p1 = JOptionPane.showInputDialog("What is your name first duelist?");
			p2 = JOptionPane.showInputDialog("What is your name second duelist?");
			int button1 =JOptionPane.showConfirmDialog(null,"Are you ready to duel?", p2, JOptionPane.OK_OPTION);
			if (button1 == JOptionPane.OK_OPTION) {
			    
				//Nedan är actionphase lägg till elementalstyle
				do{
					
					JPasswordField jpass1 = new JPasswordField(1);
					jpass1.setEchoChar('*');
					Box boxchoice = Box.createHorizontalBox();
					JLabel jl = new JLabel("Now choose!");
					boxchoice.add(jpass1);
					boxchoice.add(jl);
					int button = JOptionPane.showConfirmDialog(null, "LETS DO THIS!!",null, JOptionPane.OK_OPTION);				
					
					
				int duelop1= JOptionPane.showConfirmDialog(null,boxchoice,"Your turn " + p1 + ". Rock(1) Paper (2) or Scissors(3)?", JOptionPane.OK_OPTION);
					if(button==JOptionPane.OK_OPTION) {
					char[] input = jpass1.getPassword();
					System.out.println(input);
					if(input!=null) {
				//int duelop2 = JOptionPane.showInputDialog(null,"Ok, your turn " + p2 + ". Rock(1) Paper (2) or Scissors(3)? ",JOptionPane.OK_OPTION);
				int janken1=duelop1;
				int janken2=1;
				
				//Nedan är hpDamage se om du kan göra en switch-sats utav det.
				if (janken1 ==1 && janken2 == 2) {
					hp1=hp1-2;
					JOptionPane.showMessageDialog(null, "Paperslap *PAAPPP* " + p2 + " wins this round");
					JOptionPane.showMessageDialog(null, p1 +" has " +hp1+" health points and "+p2+" has " + hp2+" health points");

				} 
				else if (janken1 == 1 && janken2 == 3) {
					hp2=hp2-2;
					JOptionPane.showMessageDialog(null,p1 + " SMAAAAAASH");
					JOptionPane.showMessageDialog(null, p1 +" has " +hp1+" health points and "+p2+" has " + hp2+" health points");
				} 
				else if (janken1 == 1 && janken2 == 1) {
					JOptionPane.showMessageDialog(null,"SMAAAAA--ouch....:´(");
					hp1--;
					hp2--;
					JOptionPane.showMessageDialog(null, p1 +" has " +hp1+" health points and "+p2+" has " + hp2+" health points");
				} 
				else if (janken1 == 2 && janken2 == 1) {
					JOptionPane.showMessageDialog(null, "Bleh");
					hp2=hp2-2;
					JOptionPane.showMessageDialog(null, p1 +" has " +hp1+" health points and "+p2+" has " + hp2+" health points");
				}
				else if(janken1 ==2 && janken2 ==2) {
					JOptionPane.showMessageDialog(null, "You both suffer damage");
					hp1--;
					hp2--;
					JOptionPane.showMessageDialog(null, p1 +" has " +hp1+" health points and "+p2+" has " + hp2+" health points");
				}
				else if (janken1 ==2 && janken2 ==3) {
					JOptionPane.showMessageDialog(null, "Cut dat!");
					hp2=hp2-2;
					JOptionPane.showMessageDialog(null, p1 +" has " +hp1+" health points and "+p2+" has " + hp2+" health points");
				}
				else if(janken1 == 3 && janken2 ==1) {
					JOptionPane.showMessageDialog(null, "Get Smashed");
					hp1=hp1-2;
					JOptionPane.showMessageDialog(null, p1 +" has " +hp1+" health points and "+p2+" has " + hp2+" health points");
				
				}
				else if(janken1 == 3 && janken2 ==2) {
					JOptionPane.showMessageDialog(null, "GITCUTSUCKA");
					hp2=hp2-2;
					JOptionPane.showMessageDialog(null, p1 +" has " +hp1+" health points and "+p2+" has " + hp2+" health points");
					
				}
				else if(janken1 == 3 && janken2 ==3) {
					JOptionPane.showMessageDialog(null, "*KLINK*");
					hp1--;
					hp2--;
					JOptionPane.showMessageDialog(null, p1 +" has " +hp1+" health points and "+p2+" has " + hp2+" health points");

				}					
					}
					}
					else {
						System.exit(0);
					}
				
		}
				while (hp1 > 0 && hp2 > 0);//win condition
				if(hp1<=0) {
					JOptionPane.showMessageDialog(null, p2.toUpperCase() + " WON THE DUEL!!");
				}
				else if(hp2<=0) {
					JOptionPane.showMessageDialog(null, p1.toUpperCase() + " WON THE DUEL ÄNNA!!");
				}
				else if(hp1<=0 && hp2<=0) {
					JOptionPane.showMessageDialog(null, "It's a draw!!");
				}
				JOptionPane.showMessageDialog(null, "Final score: " +hp1 +" for " + p1+ " and "+ hp2 + " for "+p2);
				}
			System.exit(0);
}
}
}

