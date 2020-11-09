import java.io.File;
import java.util.Scanner;

public class FileSize
{
	/*
	 * Directory
	 * |
	 * | file 2 file2 file3 dir1
	 *                       |
	 *                       file4 file5 dir2
	 *                                    |
	 *                                    file6
	 */
	
	public static long getSize(File file)
	{
		long size = 0;
		// if file -> get size
		// if directory -> get all of the files
		// 
		
		
		return size;
	}
	
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please give me a directory for a file.");
		String str = input.nextLine();
		System.out.println("The size is: " + getSize(new File(str))); //creates a new file from the string; could also be a directory
	}
}
