package excel;

import java.io.IOException;

public class ExcelRead2 
{
	public static void main(String[] args) throws IOException 
	{
		System.out.println(ExcelRead.getStringdata(1, 0));
		System.out.println(ExcelRead.getIntegerdata(1, 1));			
	}
}

