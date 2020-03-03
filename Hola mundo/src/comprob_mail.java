import javax.swing.JOptionPane;


public class comprob_mail {

	public static void main(String[] args) 
	{
		int arroba = 0;
		
		String mail = JOptionPane.showInputDialog("introduce mail");

		for( int i = 0; i < mail.length(); i++)
		{
			if (mail.charAt(i)=='@')
			{
				arroba++;
			}
			
		}	
			if(arroba == 1)
			{
				System.out.println("Es correcto");
			}
			else 
			{
				System.out.println("No es correcto");
				
			}
				
		
	}

}
