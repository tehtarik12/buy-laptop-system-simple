import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public Main() {
		int inpMenu;
		
		do 
		{
			System.out.println("1. Buy Laptop");
			System.out.println("2. Exit");
			System.out.printf(">>");
			inpMenu = sc.nextInt();
			
			switch (inpMenu) {
			case 1:
				buyLaptop();
				break;

			default:
				break;
			}
			
		}while(inpMenu != 2);
	}

	private void buyLaptop() 
	{
		String laptopName;
		int quantity;
		int priceBefore;
		int discount = 0;
		int finalPrice;
		int priceSum;
		
		do
		{
			System.out.println("Input Laptop Name [Length > 7 && ends with 'Laptop'] : ");
			laptopName = sc.nextLine(); 
		}while(laptopName.length() < 7 || !laptopName.endsWith("Laptop"));
		
		do
		{
			System.out.println("Input Quantity [Between 1 to 5 (inclusive)] : ");
			quantity = sc.nextInt();
		}while(quantity < 1 || quantity > 5);
		
		do
		{
			System.out.println("Input Price [ Price >= 2000000 ] : ");
			priceBefore = sc.nextInt();
		}while(priceBefore < 2000000);
		
		for(int i = 0 ; i < 5 ; i++)
		{
			System.out.println(" ");
		}
		
		if(quantity > 2)
		{
			discount = 600000;
			priceSum = priceBefore * quantity;
			finalPrice = (priceBefore * quantity) - discount;
			System.out.println("Laptop Name : " + laptopName);
			System.out.println("Total Quantity : " + quantity);
			System.out.println("Price per item : " + priceBefore);
			System.out.println("Price before Discount : " + priceSum);
			System.out.println("Discount : " + discount);
			System.out.println("Final Price : " + finalPrice);
			for(int i = 0 ; i < 5 ; i++)
			{
				System.out.println(" ");
			}
		}
		
		else
		{
			finalPrice = priceBefore * quantity;
			System.out.println("Laptop Name : " + laptopName);
			System.out.println("Total Quantity : " + quantity);
			System.out.println("Price per item : " + priceBefore);
			System.out.println("Price before Discount : " + finalPrice);
			System.out.println("Discount : " + discount);
			System.out.println("Final Price : " + finalPrice);
			for(int i = 0 ; i < 5 ; i++)
			{
				System.out.println(" ");
			}
		}
		
	}

	public static void main(String[] args) {
		new Main();

	}

}
