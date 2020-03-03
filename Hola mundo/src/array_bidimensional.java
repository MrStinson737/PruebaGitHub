import javax.swing.*;
public class array_bidimensional {

	public static void main(String[] args)
	{
		int[][] matriz = new int [4][5];
		
		for(int a = 0; a < 4; a++)
		{
			for(int b = 0; b < 5; b++)
			{
				
			String num = JOptionPane.showInputDialog("Introduce un número para el elemento (" + a + " , " + b + ")");
				
				 matriz[a][b] = Integer.parseInt(num);
				 
				 
			}
			
		}
		
		for(int a = 0; a < 4; a++)
		{
			System.out.println("");
			for(int b = 0; b < 5; b++)
			{
				
				System.out.print(matriz [a][b] + "   ");
				 

			}
			
		}

	}

}
