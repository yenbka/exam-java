package yennth4_exam_order;
import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Equals;

import yennth4_exam_order.Product;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){	
		Product p[]= null;
		System.out.print("Nhập số sản phẩm: ");
        int n=sc.nextInt();
        p= new Product[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Sản phẩm " + (i+1));
            p[i] = new Product();
            input(p[i]);
                 
}
        for (int i = 0; i < n; i++) {
			p[i].display();
		}
        System.out.print("Nhập id sản phẩm cần order: ");
        int idcompare = sc.nextInt();sc.nextLine();
        System.out.print("Nhập số lượng: ");
        int quanity = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(idcompare == p[i].id) {
            	float total = quanity * p[i].price;
            	System.out.print("Tổng tiền: "+total);
            }			
		}
        
	}
static void input(Product pro){
    System.out.print("Nhập id: ");
    pro.setId(sc.nextInt());sc.nextLine();
    System.out.print("Nhập tên sản phẩm: ");
    pro.setName(sc.nextLine());
    System.out.print("Nhập giá sản phẩm: ");
    pro.setPrice(sc.nextFloat());
}

}
