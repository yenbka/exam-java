package yennth4_exam_order;
import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Equals;

import yennth4_exam_order.Product;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception{	
		String choose = null; char con = 'y';
		float total = 0;
		float sum = 0;
		String yn = null;
		Product p[]= null;
		showMenu();
		int n =0;
		boolean exit = false;
		while(true){
			choose = sc.nextLine();
			switch(choose) {
			case "1":
				try {
					System.out.print("Enter total product: ");
			        n=sc.nextInt();
			        p= new Product[n];
			        for (int i = 0; i < n; i++) {
			            System.out.println("Product " + (i+1));
			            p[i] = new Product();
			            input(p[i]);
			        }
					
				} catch (Exception e) {
					System.out.println("Invalid data. Please input valid data!");
				}
				break;
			case "2":
				for (int i = 0; i < n; i++) {
					p[i].display();
				}
				break;
			case "3":
				do {
				System.out.println("List Products: ");	
				for (int i = 0; i < n; i++) {
					p[i].display();
				}
				System.out.print("Enter id product: ");
		        int idcompare = sc.nextInt();sc.nextLine();
		        System.out.print("Enter quanity: ");
		        int quanity = sc.nextInt();
		        System.out.println("Do you want input next product?y/n:");
		        con = sc.next().charAt(0);
		        for (int i = 0; i < n; i++) {
		            if(idcompare == p[i].id) {
		            	total = quanity * p[i].price;	            	
		            }
		        }
		        sum += total;
		        if(con == 'n') {
		        	System.out.println("Total price: "+sum);
		        }
				}while(con == 'y');
				break;		        
			case "0":
                System.out.println("Exited!");
                exit  = true;
                break;
            default:
                System.out.println("Invalid! Please choose action in below menu:");
                break;
            }
            if (exit) {
                break;
            }
            showMenu();
        }
	}
static void input(Product pro){
	try {
		System.out.print("Enter id: ");
	    pro.setId(sc.nextInt());sc.nextLine();
	    System.out.print("Enter product name: ");
	    pro.setName(sc.nextLine());
	    System.out.print("Enter product price: ");
	    pro.setPrice(sc.nextFloat());
		
	} catch (Exception e) {
		System.out.println("Invalid data. Please input valid data!");	
	}
}

public static void showMenu() {
    System.out.println("-----------LIST FUNCTION------------");
    System.out.println("1. Create products.");
    System.out.println("2. View list product.");
    System.out.println("3. Orders.");
    System.out.println("0. exit.");
    System.out.println("---------------------------");
    System.out.print("Please choose: ");
}

}
