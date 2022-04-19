package it.meucci.fattoriale.gervasi;

/**
 * 
 * @author genitori
 *
 */
public class FattorialeClass
{
	

	public FattorialeClass()
	{
		
	}
	
	public int fattoriale(int n)
	{
		int fatt, i;
			
		fatt = 1;
		for (i = 1; i < n; i++) //corretto <=
		{
			fatt = fatt * i;
		}
		return fatt;
	}

}
