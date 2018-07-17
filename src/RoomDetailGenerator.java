import java.util.Scanner;

public class RoomDetailGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//open the scanner object
		Scanner scan = new Scanner(System.in);
		
		//declare variables
		double length;
		double width;
		double height;
		double perimeter;
		double areaRoom;
		double volume;
		
		
		//prompt user input
		System.out.println("Enter Length: ");
		length = scan.nextDouble();
		System.out.println("Enter Width: ");
		width = scan.nextDouble();
		System.out.println("Enter Height: ");
		height = scan.nextDouble();
		
		//make calculations
		perimeter = (length * 2) + (width * 2);
		areaRoom = length * width;
		volume = length * width * height;
		
		//print results
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Area: " + areaRoom);		
		System.out.println("Volume: " + volume);

		
		//close the scanner
		scan.close();
	}

}
