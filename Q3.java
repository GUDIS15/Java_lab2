package LAB2;

public class Q3 {
	String pname;
	int qty;
	int price;


public Q3()
{
    pname="Shirts";
    qty=15;
    price=500;
}

public Q3(String pname,int qty, int price)
{
    this.pname=pname;
    this.qty=qty;
    this.price=price;
}

public void display()
{
    System.out.println("Product Name:"+pname);
    System.out.println("Qty:"+qty);
    System.out.println("Price:"+price);
}


public static void main(String[] args) {
	Q3 obj = new Q3("Jeans",17,900);
    obj.display();
}

}



