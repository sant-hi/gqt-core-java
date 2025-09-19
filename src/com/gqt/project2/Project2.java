package com.gqt.project2;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

class Cart {
    public static String[] proinCart = new String[100];
    public static int[] amountCart = new int[100];
    public static int count = 0;

    public static void addProd(String product, int amount) {
        if (count < 100) {
            proinCart[count] = product;
            amountCart[count] = amount;
            count++;
        }
    }

    public static String genBill() {
        if (count == 0) return "Empty!";
        String bill = "BILL:\n";
        int total = 0;
        for (int i = 0; i < count; i++) {
            bill += (i + 1) + ". " + proinCart[i] + " : Rs." + amountCart[i] + "\n";
            total += amountCart[i];
        }
        bill += "Total Amount: Rs." + total;
        return bill;
    }
}

class Login extends JFrame implements ActionListener {

    JTextField name, email, phno;
    JButton submit;

    Login() {
        this.setTitle("LOGIN");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.blue);

        JLabel nameL = new JLabel("Name:");
        nameL.setBounds(50, 30, 120, 30);
        this.add(nameL);
        name = new JTextField();
        name.setBounds(180, 30, 150, 30);
        this.add(name);

        JLabel emailL = new JLabel("Email ID:");
        emailL.setBounds(50, 80, 120, 30);
        this.add(emailL);
        email = new JTextField();
        email.setBounds(180, 80, 150, 30);
        this.add(email);

        JLabel phL = new JLabel("Phone No:");
        phL.setBounds(50, 130, 120, 30);
        this.add(phL);
        phno = new JTextField();
        phno.setBounds(180, 130, 150, 30);
        this.add(phno);

        submit = new JButton("Submit");
        submit.setBounds(140, 190, 100, 40);
        submit.addActionListener(this);
        this.add(submit);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String aname = name.getText();
            String aemail = email.getText();
            String aphno = phno.getText();

            if (aname.isEmpty() || aemail.isEmpty() || aphno.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill all values");
            } else {
                this.dispose();
                Category c = new Category(aname);
                c.setVisible(true);
            }
        }
    }
}

class Category extends JFrame implements ActionListener {
    JButton b1, b2, b3, b4;

    Category(String aname) {
        this.setTitle("PRODUCT CATEGORY");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.pink);

        b1 = new JButton("1. ELECTRONICS");
        b1.setBounds(120, 70, 150, 30);
        b1.addActionListener(this);
        this.add(b1);

        b2 = new JButton("2. FURNITURE");
        b2.setBounds(120, 110, 150, 30);
        b2.addActionListener(this);
        this.add(b2);

        b3 = new JButton("3. CLOTHING");
        b3.setBounds(120, 150, 150, 30);
        b3.addActionListener(this);
        this.add(b3);

        b4 = new JButton("4. GROCERIES");
        b4.setBounds(120, 190, 150, 30);
        b4.addActionListener(this);
        this.add(b4);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Products p = new Products();

        if (e.getSource() == b1) {
            p.showProducts("ELECTRONICS");
        } else if (e.getSource() == b2) {
            p.showProducts("FURNITURE");
        } else if (e.getSource() == b3) {
            p.showProducts("CLOTHING");
        } else if (e.getSource() == b4) {
            p.showProducts("GROCERIES");
        }
        p.setVisible(true);
        this.dispose();
    }
}

class Products extends JFrame implements ActionListener {
    JButton b5,b6,b7,b8,b9;
    String category;   

    Products() { 
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
    }

    public void showProducts(String category) {
        this.category = category;  
        this.setTitle("PRODUCTS");
        this.getContentPane().setBackground(Color.red);

        if (category.equals("ELECTRONICS")) {
            b5=new JButton("Mobiles");
            b6=new JButton("Laptops");
            b7=new JButton("Televisions");
            b8=new JButton("Speakers");
            b9=new JButton("Headphones");
        } else if (category.equals("FURNITURE")) {
            b5=new JButton("Chairs");
            b6=new JButton("Tables");
            b7=new JButton("Sofas");
            b8=new JButton("Bed");
            b9=new JButton("Shelves");
        } else if (category.equals("CLOTHING")) {
            b5=new JButton("Men");
            b6=new JButton("Women");
            b7=new JButton("Boys");
            b8=new JButton("Girls");
            b9=new JButton("Kids");
        } else {
            b5=new JButton("Vegetables");
            b6=new JButton("Fruits");
            b7=new JButton("Cleaning");
            b8=new JButton("Snacks");
            b9=new JButton("Dairy");
        }

        b5.setBounds(120, 70, 150, 30);
        b6.setBounds(120, 120, 150, 30);
        b7.setBounds(120, 170, 150, 30);
        b8.setBounds(120, 220, 150, 30);
        b9.setBounds(120, 270, 150, 30);

        this.add(b5);
        this.add(b6);
        this.add(b7);
        this.add(b8);
        this.add(b9);

        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton selected = (JButton) e.getSource();
        this.dispose();
        String pds = "";  

        if (selected == b5) {
            pds = b5.getText();
        } else if (selected == b6) {
            pds = b6.getText();
        } else if (selected == b7) {
            pds = b7.getText();
        } else if (selected == b8) {
            pds = b8.getText();
        } else if (selected == b9) {
            pds = b9.getText();
        }
        ProName pname = new ProName(category, pds); 
        pname.setVisible(true);
    }
}

class ProName extends JFrame implements ActionListener{
	String category; 
	JButton b10,b11,b12,b13,b14;
	String[] products;
    int[] amount;
    String selProduct = "";
    int selProAmount = 0;
    
	ProName(String category, String pd) {
		this.category = category;
        this.setTitle("Product Names");
        this.setSize(700, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.green);
        
        b10 = new JButton();
        b11 = new JButton();
        b12 = new JButton();
        b13= new JButton();
        b14= new JButton();
    
        if (category.equals("ELECTRONICS") && pd.equals("Mobiles")) {
            products = new String[]{"Samsung Galaxy S25 Ultra","Apple iPhone","OnePlus","Nothing","iQOO"};
            amount = new int[]{120000, 150000, 70000, 50000, 60000};
        }
         else if (category.equals("ELECTRONICS") && pd.equals("Laptops")) {
            products = new String[]{"Dell","MacBook","HP","Lenovo","Asus"};
            amount = new int[]{120000, 150000, 70000, 50000, 60000};
        }else  if (category.equals("ELECTRONICS") && pd.equals("Televisions")) {
            products = new String[]{"Samsung TV","LG TV","Sony TV","Impex TV","Intex TV"};
            amount = new int[]{120000, 150000, 70000, 50000, 60000};
        }else if (category.equals("ELECTRONICS") && pd.equals("Speakers")) {
            products = new String[]{"JBL","Sony","Bose","Marshall","Boat"};
            amount = new int[]{120000, 150000, 70000, 50000, 60000};
        }else if (category.equals("ELECTRONICS") && pd.equals("Headphones")) {
            products = new String[]{"Sony","Apple AirPods Max","JBL","Skullcandy","Boat"};
            amount = new int[]{120000, 150000, 70000, 50000, 60000};
        }else if (category.equals("FURNITURE") && pd.equals("Chairs")) {
            products = new String[]{"Plastic Chair","Recliner","Dining Chair","Rocking Chair","Office Chair"};
            amount = new int[]{120000, 150000, 70000, 50000, 60000};
        }else if (category.equals("FURNITURE") && pd.equals("Tables")) {
            products = new String[]{"Dining Table","Coffee Table","Study Table","Bedside Table","Folding Table"};
            amount = new int[]{5000, 2000, 3000, 1500, 1200};
        } else if (category.equals("FURNITURE") && pd.equals("Sofas")) {
            products = new String[]{"Leather Sofa","Fabric Sofa","Sectional Sofa","Sofa Bed","Wooden Sofa"};
            amount = new int[]{15000, 10000, 20000, 12000, 18000};
        } else if (category.equals("FURNITURE") && pd.equals("Bed")) {
            products = new String[]{"Single Bed","Double Bed","Queen Bed","King Bed","Bunk Bed"};
            amount = new int[]{4000, 6000, 8000, 10000, 7000};
        } else if (category.equals("FURNITURE") && pd.equals("Shelves")) {
            products = new String[]{"Wall Shelf","Corner Shelf","Bookshelf","TV Unit Shelf","Storage Shelf"};
            amount = new int[]{1500, 2000, 2500, 3000, 2200};
        } else if (category.equals("CLOTHING") && pd.equals("Men")) {
            products = new String[]{"Dhotis","Trousers","Shirts","T-Shirts","Jeans"};
            amount = new int[]{500, 1200, 800, 600, 1000};
        } else if (category.equals("CLOTHING") && pd.equals("Women")) {
            products = new String[]{"Sarees","Kurtis","Leggings","Gowns","Jeans"};
            amount = new int[]{1500, 800, 500, 2000, 1000};
        } else if (category.equals("CLOTHING") && pd.equals("Boys")) {
            products = new String[]{"T-Shirts","Shorts","Shirts","Jeans","Jackets"};
            amount = new int[]{400, 300, 500, 600, 1200};
        } else if (category.equals("CLOTHING") && pd.equals("Girls")) {
            products = new String[]{"Frocks","Skirts","Tops","Leggings","Jeans"};
            amount = new int[]{500, 400, 350, 300, 600};
        } else if (category.equals("CLOTHING") && pd.equals("Kids")) {
            products = new String[]{"Onesies","Baby Frocks","Baby Shorts","Baby T-Shirts","Baby Pajamas"};
            amount = new int[]{300, 400, 250, 200, 350};
        } else if (category.equals("GROCERIES") && pd.equals("Vegetables")) {
            products = new String[]{"Beetroot","Potato","Onion","Tomato","Brinjal"};
            amount = new int[]{30, 20, 25, 20, 35};
        } else if (category.equals("GROCERIES") && pd.equals("Fruits")) {
            products = new String[]{"Apple","Banana","Mango","Orange","Grapes"};
            amount = new int[]{100, 50, 120, 80, 90};
        } else if (category.equals("GROCERIES") && pd.equals("Cleaning")) {
            products = new String[]{"Detergent","Phenyl","Dishwash","Floor Cleaner","Toilet Cleaner"};
            amount = new int[]{150, 100, 120, 200, 180};
        } else if (category.equals("GROCERIES") && pd.equals("Snacks")) {
            products = new String[]{"Chips","Biscuits","Chocolate","Noodles","Popcorn"};
            amount = new int[]{30, 25, 50, 40, 35};
        } else if (category.equals("GROCERIES") && pd.equals("Dairy")) {
            products = new String[]{"Milk","Cheese","Butter","Curd","Paneer"};
            amount = new int[]{50, 100, 80, 60, 120};
        } 
        	
        b10.setText(products[0]+" : Rs." + amount[0]);
        b11.setText(products[1]+" : Rs." + amount[1]);
        b12.setText(products[2]+" : Rs." + amount[2]); 
        b13.setText(products[3]+" : Rs." + amount[3]); 
        b14.setText(products[4]+" : Rs." + amount[4]);
        b10.setBounds(50, 50, 200, 30); 
        b11.setBounds(50, 100, 200, 30);
        b12.setBounds(50, 150, 200, 30);
        b13.setBounds(50, 200, 200, 30);
        b14.setBounds(50, 250, 200, 30);
    
        this.add(b10);
        this.add(b11);
        this.add(b12);
        this.add(b13);
        this.add(b14);
        
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        
  
    
        
        JButton addtoCart=new JButton("Add to Cart");
        addtoCart.setBackground(Color.yellow); 
        addtoCart.setBounds(300, 50, 150, 40);
        addtoCart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	if (!selProduct.isEmpty()) {
            		 Cart.addProd(selProduct, selProAmount);
                    JOptionPane.showMessageDialog(null,"Product added to cart!");
                } else {
                    JOptionPane.showMessageDialog(null,"Please select a product first!");
                }
            }
        });
        this.add(addtoCart);
        
        JButton bNow = new JButton("Buy Now");
        bNow.setBackground(Color.orange);
        bNow.setBounds(300, 200, 150, 40);
        bNow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!selProduct.isEmpty()) {
                   
                    String bill = "Place your order\n\n"
                                 +"Product Selected: " + selProduct + "\n"
                                 + "Total Amount: Rs." + selProAmount + "\n\n"
                                 + "Order Confirmed! Thank you for shopping.";
                    JOptionPane.showMessageDialog(ProName.this, bill);
                    dispose(); 
                } else {
                    JOptionPane.showMessageDialog(null,"Please select a product first!");
                }
            }
        });
        this.add(bNow);

        JButton contShop = new JButton("Continue Shopping");
        contShop.setBackground(Color.yellow); 
        contShop.setBounds(300, 100, 150, 40);
        contShop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); 
              new Category("User").setVisible(true);
               
            }
        });
        this.add(contShop);

        JButton cOut = new JButton("Checkout");
        cOut.setBackground(Color.yellow); 
        cOut.setBounds(300, 150, 150, 40);
        cOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String bill= Cart.genBill();
            	JOptionPane.showMessageDialog(ProName.this, bill);
            }
        });
        this.add(cOut);
              
	}
       @Override
        public void actionPerformed(ActionEvent e) {
            JButton selected = (JButton) e.getSource();
            selProduct = selected.getText();

            for (int i = 0; i < products.length; i++) {
            	 if (selected.getText().contains(products[i])) {
                     selProduct = products[i];   
                     selProAmount = amount[i];
                     break;
                }
            }
            ProDetail dtl= new ProDetail(category,selProduct);
            dtl.setVisible(true);
        }
    }
class ProDetail extends JFrame {
	JButton buyNow;
	String category, item;
	ProDetail(String category,String item){
		
	
		  this.setTitle("Product Description");
		  this.setSize(600, 400);
	      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      this.setLayout(null);
	      this.getContentPane().setBackground(Color.orange);

	        JTextArea desc = new JTextArea(10,40);
	        desc.setBounds(20, 20, 450, 220); 
	        desc.setLineWrap(true);
	        desc.setWrapStyleWord(true);
	        desc.setEditable(false);
	        
	        if (category.equals("ELECTRONICS")) {
	            if (item.equals("Samsung Galaxy S25 Ultra")) {
	                desc.setText("\r\n"
	                		+ "OS	‎                :Android 16.0\r\n"
	                		+ "Product Dimensions	‎:0.42 x 14.32 x 15.84 cm; 215 g\r\n"
	                		+ "Colour	‎            :Silver Shadow\r\n"
	                		+ "Rating               :4.5/5");
	            } else if (item.equals("Apple iPhone")) {
	                desc.setText("\r\n"
	                		+ "Brand	         : Apple\r\n"
	                		+ "Operating System	 : iOS 17\r\n"
	                		+ "RAM               : 256 GB\r\n"
	                		+ "Rating            :4.7/5");
	            } else if (item.equals("OnePlus")) {
	                desc.setText("\r\n"
	                		+ "Brand	          :OnePlus\r\n"
	                		+ "Operating System	  :Android 15, OxygenOS\r\n"
	                		+ "CPU Model	      :Snapdragon 8 Elite\r\n"
	                		+ "Rating             :4.5/5");
	            } else if (item.equals("Nothing")) {
	                desc.setText("Product Dimensions	:‎16.35 x 7.75 x 0.83 cm; 201 g\r\n"
	                		+ "Other display features	:‎Wireless\r\n"
	                		+ "Rating                   :4.4/5");
	            } else if (item.equals("iQOO")) {
	                desc.setText("\r\n"
	                		+ "Brand	         :iQOO\r\n"
	                		+ "Operating System	 :Funtouch OS 15 based on Android 15\r\n"
	                		+ "RAM Memory      	 :6 GB\r\n"
	                		+ "Rating            :4.3/5");
	            }else if (item.equals("Dell")) {
	                desc.setText(
	                        "Brand: Dell\r\n" +
	                        "Operating System: Windows 11\r\n" +
	                        "Processor: Intel i7 12th Gen\r\n" +
	                        "Rating: 4.5/5"
	                    );
	                } else if (item.equals("MacBook")) {
	                    desc.setText(
	                        "Brand: Apple\r\n" +
	                        "Operating System: macOS Ventura\r\n" +
	                        "Processor: Apple M2\r\n" +
	                        "Rating: 4.7/5"
	                    );
	                } else if (item.equals("HP")) {
	                    desc.setText(
	                        "Brand: HP\r\n" +
	                        "Operating System: Windows 11\r\n" +
	                        "Processor: Intel i5 11th Gen\r\n" +
	                        "Rating: 4.3/5"
	                    );
	                } else if (item.equals("Lenovo")) {
	                    desc.setText(
	                        "Brand: Lenovo\r\n" +
	                        "Operating System: Windows 11\r\n" +
	                        "Processor: Intel i5 12th Gen\r\n" +
	                        "Rating: 4.2/5"
	                    );
	                } else if (item.equals("Asus")) {
	                    desc.setText(
	                        "Brand: Asus\r\n" +
	                        "Operating System: Windows 11\r\n" +
	                        "Processor: AMD Ryzen 7\r\n" +
	                        "Rating: 4.4/5"
	                    );}
	                    else if (item.equals("Samsung TV")) {
	                        desc.setText(
	                            "Brand: Samsung\r\n" +
	                            "Screen Size: 55 Inches\r\n" +
	                            "Resolution: 4K UHD\r\n" +
	                            "Rating: 4.6/5"
	                        );
	                    } else if (item.equals("LG TV")) {
	                        desc.setText(
	                            "Brand: LG\r\n" +
	                            "Screen Size: 50 Inches\r\n" +
	                            "Resolution: 4K UHD\r\n" +
	                            "Rating: 4.5/5"
	                        );
	                    } else if (item.equals("Sony TV")) {
	                        desc.setText(
	                            "Brand: Sony\r\n" +
	                            "Screen Size: 65 Inches\r\n" +
	                            "Resolution: 4K UHD\r\n" +
	                            "Display Type: LED\r\n" +
	                            "Rating: 4.7/5"
	                        );
	                    } else if (item.equals("Impex TV")) {
	                        desc.setText(
	                            "Brand: Impex\r\n" +
	                            "Screen Size: 43 Inches\r\n" +
	                            "Resolution: Full HD\r\n" +
	                            "Rating: 4.2/5"
	                        );
	                    } else if (item.equals("Intex TV")) {
	                        desc.setText(
	                            "Brand: Intex\r\n" +
	                            "Screen Size: 32 Inches\r\n" +
	                            "Resolution: HD\r\n" +
	                            "Rating: 4.0/5"
	                        );
	                    }
	        }
	     else if (category.equals("FURNITURE")) {
	            if (item.equals("Plastic Chair")) { 
	            	desc.setText("\r\n"
	            		+ "Brand	:Prima\r\n"
	            		+ "Colour	:Sandalwood\r\n"
	            		+ "Material	:Plastic\r\n"
	            		+ "rating         :3/5");
	            }else if (item.equals("Recliner")) {
	            	desc.setText("Brand	The Sleep Company\r\n"
	           
	            		+ "Colour	Grey\r\n"
	            		+ "Material	SmartGRID\r\n"
	            		+ "Product Dimensions	99.7D x 87.6W x 108H Centimeters\r\n"
	            		+ "Size	1 Seater\r\n"
	            	);}
	            else if (item.equals("Dining Chair")) { desc.setText("Brand	Craft Capital\r\n"
	            		+ "Colour	Blue\r\n"
	            		+ "Material	Velvet\r\n"
	            		+ "Product Dimensions	35D x 40W x 70H Centimeters\r\n");}
	            else if (item.equals("Rocking Chair")) { desc.setText("Brand	Sweetcrispy\r\n"
	            		+ "Colour	Deep Gray\r\n"
	            		+ "Material	Metal\r\n");}
	            else if (item.equals("Office Chair")) { desc.setText("Brand	GODREJ INTERIO\r\n"
	            		+ "Colour	Black Ink\r\n"
	            		+ "Material	Polypropylene\r\n"
	            		+ "Product Dimensions	76.1D x 76.1W x 114H Centimeters\r\n");}
	            else if (item.equals("Dining Table")) { desc.setText(
	                    "Brand: HomeTown\r\n" 
	                   +"Colour: Walnut\r\n" 
	                   + "Special Feature: Scratch Resistant, Sturdy Legs\r\n" 
	                    +"Rating: 4/5"
	                );}
	                else if (item.equals("Coffee Table")) { desc.setText(
	                    "Brand: Urban Ladder\r\n" +
	                    "Colour: Brown\r\n" +
	                    "Rating: 4.2/5"
	                );}
	                else if (item.equals("Study Table")) { desc.setText(
	                    "Brand: Nilkamal\r\n" +
	                    "Colour: Oak\r\n" +
	                    "Material: Engineered Wood\r\n" +
	                    "Rating: 4/5"
	                );}
	                else if (item.equals("Bedside Table")) { desc.setText(
	                    "Brand: Godrej Interio\r\n" +
	                    "Colour: Teak\r\n" +
	                    "Material: Wood\r\n" +
	                    "Rating: 4/5"
	                );}
	                else if (item.equals("Folding Table")) { desc.setText(
	                    "Brand: Amazon Basics\r\n" +
	                    "Colour: White\r\n" +
	                    "Rating: 4/5"
	                );}
	                else if (item.equals("Leather Sofa")) { desc.setText(
	                    "Brand: Durian\r\n" +
	                    "Colour: Brown\r\n" +
	                    "Rating: 4.3/5"
	                );}
	                else if (item.equals("Fabric Sofa")) { desc.setText(
	                    "Brand: Nilkamal\r\n" +
	                    "Colour: Grey\r\n" +
	                    "Rating: 4/5"
	                );}
	                else if (item.equals("Sectional Sofa")) { desc.setText(
	                    "Brand: Urban Ladder\r\n" +
	                    "Colour: Beige\r\n" +
	                    "Rating: 4.5/5"
	                );}
	                else if (item.equals("Sofa Bed")) { desc.setText(
	                    "Brand: HomeTown\r\n" +
	                    "Colour: Grey\r\n" +
	                    "Rating: 4.2/5"
	                );}
	                else if (item.equals("Wooden Sofa")) { desc.setText(
	                    "Brand: Godrej Interio\r\n" +
	                    "Colour: Teak\r\n" +
	                    "Rating: 4.3/5"
	                );}
	                else if (item.equals("Single Bed")) { desc.setText(
	                    "Brand: HomeTown\r\n" +
	                    "Colour: Brown\r\n" +
	                    "Rating: 4/5"
	                );}
	                else if (item.equals("Double Bed")) { desc.setText(
	                    "Brand: Durian\r\n" +
	                    "Colour: Walnut\r\n" +
	                    "Rating: 4.2/5"
	                );}
	                else if (item.equals("Queen Bed")) { desc.setText(
	                    "Brand: Godrej Interio\r\n" +
	                    "Colour: Teak\r\n" +
	                    "Material: Solid Wood\r\n" +
	                    "Rating: 4.3/5"
	                );}
	                else if (item.equals("King Bed")) { desc.setText(
	                    "Brand: Urban Ladder\r\n" +
	                    "Colour: Brown\r\n" +
	                    "Material: Wood\r\n" +
	                    "Rating: 4.4/5"
	                );}
	                else if (item.equals("Bunk Bed")) { desc.setText(
	                    "Brand: Nilkamal\r\n" +
	                    "Colour: White\r\n" +
	                    "Material: Metal\r\n" +
	                    "Rating: 4/5"
	                );}
	                else if (item.equals("Wall Shelf")) { desc.setText(
	                    "Brand: HomeTown\r\n" +
	                    "Colour: Brown\r\n" +
	                    "Material: Engineered Wood\r\n" +
	                    "Rating: 4/5"
	                );}
	                else if (item.equals("Corner Shelf")) { desc.setText(
	                    "Brand: Urban Ladder\r\n" +
	                    "Colour: Teak\r\n" +
	                    "Rating: 4.2/5"
	                );}
	                else if (item.equals("Bookshelf")) { desc.setText(
	                    "Brand: Nilkamal\r\n" +
	                    "Colour: Walnut\r\n" +
	                    "Rating: 4.3/5"
	                );}
	                else if (item.equals("TV Unit Shelf")) { desc.setText(
	                    "Brand: HomeTown\r\n" +
	                    "Colour: Black\r\n" +
	                    "Rating: 4.2/5"
	                );}
	                else if (item.equals("Storage Shelf")) { desc.setText(
	                    "Brand: Godrej Interio\r\n" +
	                    "Colour: White\r\n" +
	                    "Rating: 4.3/5"
	                );}
	        }
	                else if (category.equals("CLOTHING")) {
	                
	                    if (item.equals("Dhotis")) desc.setText(
	                        "Traditional Indian dhoti, comfortable and stylish.\r\n" +
	                        "Size: Free Size\r\n" +
	                        "Rating: 4.5/5"
	                    );
	                    else if (item.equals("Trousers")) desc.setText(
	                        "Formal and casual trousers for men.\r\n" +
	                        "Material: Cotton/Polyester blend\r\n" +
	                        "Rating: 4.4/5"
	                    );
	                    else if (item.equals("Shirts")) desc.setText(
	                        "Men's full-sleeve shirts, premium quality.\r\n" +
	                        "Material: Cotton\r\n" +
	                        "Rating: 4.5/5"
	                    );
	                    else if (item.equals("T-Shirts")) desc.setText(
	                        "Men's T-Shirts, casual and comfortable.\r\n" +
	                        "Material: Cotton\r\n" +
	                        "Rating: 4.3/5"
	                    );
	                    else if (item.equals("Jeans")) desc.setText(
	                        "Men's denim jeans, stylish and durable.\r\n" +
	                        "Material: Denim\r\n" +
	                        "Rating: 4.5/5"
	                    );

	                    else if (item.equals("Sarees")) desc.setText(
	                        "Traditional Indian saree, elegant and beautiful.\r\n" +
	                        "Material: Silk/Cotton blend\r\n" +
	                        "Rating: 4.8/5"
	                    );
	                    else if (item.equals("Kurtis")) desc.setText(
	                        "Women's kurtis, comfortable and stylish.\r\n" +
	                        "Material: Cotton/Polyester\r\n" +
	                        "Rating: 4.6/5"
	                    );
	                    else if (item.equals("Leggings")) desc.setText(
	                        "Women's leggings, stretchy and comfortable.\r\n" +
	                        "Material: Cotton/Spandex blend\r\n" +
	                        "Sizes: S, M, L, XL\r\n" +
	                        "Usage: Casual wear, daily use\r\n" +
	                        "Rating: 4.5/5"
	                    );
	                    else if (item.equals("Gowns")) desc.setText(
	                        "Women's gowns, elegant and flowing.\r\n" +
	                        "Material: Silk/Chiffon\r\n" +
	                        "Sizes: S, M, L\r\n" +
	                        "Usage: Parties, special occasions\r\n" +
	                        "Rating: 4.7/5"
	                    );
	                    else if (item.equals("Jeans")) desc.setText(
	                        "Women's denim jeans, stylish and comfortable.\r\n" +
	                        "Material: Denim\r\n" +
	                        "Sizes: 28-36\r\n" +
	                        "Usage: Casual wear\r\n" +
	                        "Rating: 4.6/5"
	                    );

	                    else if (item.equals("T-Shirts")) desc.setText(
	                        "Boys' T-Shirts, casual and fun designs.\r\n" +
	                        "Material: Cotton\r\n" +
	                        "Sizes: 6-14 years\r\n" +
	                        "Usage: Daily wear\r\n" +
	                        "Rating: 4.4/5"
	                    );
	                    else if (item.equals("Shorts")) desc.setText(
	                        "Boys' shorts, comfortable for summer.\r\n" +
	                        "Material: Cotton\r\n" +
	                        "Sizes: 6-14 years\r\n" +
	                        "Usage: Casual wear\r\n" +
	                        "Rating: 4.3/5"
	                    );
	                    else if (item.equals("Shirts")) desc.setText(
	                        "Boys' formal and casual shirts.\r\n" +
	                        "Material: Cotton\r\n" +
	                        "Sizes: 6-14 years\r\n" +
	                        "Usage: School, casual wear\r\n" +
	                        "Rating: 4.4/5"
	                    );
	                    else if (item.equals("Jeans")) desc.setText(
	                        "Boys' denim jeans, durable and stylish.\r\n" +
	                        "Material: Denim\r\n" +
	                        "Sizes: 6-14 years\r\n" +
	                        "Usage: Casual wear\r\n" +
	                        "Rating: 4.5/5"
	                    );
	                    else if (item.equals("Jackets")) desc.setText(
	                        "Boys' jackets, warm and comfortable.\r\n" +
	                        "Material: Polyester/Poly-cotton\r\n" +
	                        "Rating: 4.6/5"
	                    );

	                    else if (item.equals("Frocks")) desc.setText(
	                        "Girls' frocks, stylish and comfortable.\r\n" +
	                        "Material: Cotton/Polyester blend\r\n" +
	                        "Sizes: 6-14 years\r\n" +
	                        "Usage: Casual wear, parties\r\n" +
	                        "Rating: 4.7/5"
	                    );
	                    else if (item.equals("Skirts")) desc.setText(
	                        "Girls' skirts, trendy and colorful.\r\n" +
	                        "Usage: Casual wear\r\n" +
	                        "Rating: 4.6/5"
	                    );
	                    else if (item.equals("Tops")) desc.setText(
	                        "Girls' tops, comfortable and stylish.\r\n" +
	                        "Material: Cotton/Polyester\r\n" +
	                        "Rating: 4.5/5"
	                    );
	                    else if (item.equals("Leggings")) desc.setText(
	                        "Girls' leggings, stretchy and comfy.\r\n" +
	                        "Material: Cotton/Spandex blend\r\n" +
	                        "Rating: 4.5/5"
	                    );
	                    else if (item.equals("Jeans")) desc.setText(
	                        "Girls' denim jeans, durable and stylish.\r\n" +
	                        "Material: Denim\r\n" +
	                        "Rating: 4.6/5"
	                    );

	                    else if (item.equals("Onesies")) desc.setText(
	                        "Baby onesies, soft and comfortable.\r\n" +
	                        "Material: Cotton\r\n" +
	                        "Rating: 4.7/5"
	                    );
	                    else if (item.equals("Baby Frocks")) desc.setText(
	                        "Cute baby frocks for girls.\r\n" +
	                        "Rating: 4.6/5"
	                    );
	                    else if (item.equals("Baby Shorts")) desc.setText(
	                        "Comfortable baby shorts.\r\n" +
	                        "Material: Cotton\r\n" +
	                        "Rating: 4.5/5"
	                    );
	                    else if (item.equals("Baby T-Shirts")) desc.setText(
	                        "Soft and colorful baby T-Shirts.\r\n" +
	                        "Material: Cotton\r\n" +
	                        "Rating: 4.5/5"
	                    );
	                    else if (item.equals("Baby Pajamas")) desc.setText(
	                        "Comfortable baby pajamas, perfect for sleep.\r\n" +
	                        "Material: Cotton\r\n" +
	                        "Rating: 4.6/5"
	                    );
	                
	        } else if (category.equals("GROCERIES")) {
	        	 if (item.equals("Beetroot")) desc.setText(
	        		        "Fresh Beetroots, rich in vitamins and minerals.\r\n" +
	        		        "Quantity: 1 kg\r\n" +
	        		        "Storage: Keep refrigerated or in a cool, dry place.\r\n" +
	        		        "Rating: 4.5/5"
	        		    );
	        		    else if (item.equals("Potato")) desc.setText(
	        		        "Fresh potatoes, ideal for cooking and frying.\r\n" +
	        		        "Quantity: 1 kg\r\n" +
	        		        "Storage: Store in a cool, dark place.\r\n" +
	        		        "Rating: 4.3/5"
	        		    );
	        		    else if (item.equals("Onion")) desc.setText(
	        		        "Fresh onions, perfect for cooking and salads.\r\n" +
	        		        "Quantity: 1 kg\r\n" +
	        		        "Storage: Keep in a cool, ventilated place.\r\n" +
	        		        "Rating: 4.4/5"
	        		    );
	        		    else if (item.equals("Tomato")) desc.setText(
	        		        "Fresh red tomatoes, rich in Vitamin C and antioxidants.\r\n" +
	        		        "Quantity: 1 kg\r\n" +
	        		        "Storage: Keep refrigerated for longer shelf life.\r\n" +
	        		        "Rating: 4.6/5"
	        		    );
	        		    else if (item.equals("Brinjal")) desc.setText(
	        		        "Fresh brinjals (eggplants), firm and shiny.\r\n" +
	        		        "Quantity: 1 kg\r\n" +
	        		        "Storage: Store in a cool place, avoid moisture.\r\n" +
	        		        "Rating: 4.5/5"
	        		    );

	        		    else if (item.equals("Apple")) desc.setText(
	        		        "Fresh apples, crisp and juicy.\r\n" +
	        		        "Quantity: 1 kg\r\n" +
	        		        "Storage: Refrigerate to maintain freshness.\r\n" +
	        		        "Rating: 4.7/5"
	        		    );
	        		    else if (item.equals("Banana")) desc.setText(
	        		        "Ripe bananas, rich in potassium.\r\n" +
	        		        "Quantity: 1 dozen\r\n" +
	        		        "Storage: Keep at room temperature.\r\n" +
	        		        "Rating: 4.5/5"
	        		    );
	        		    else if (item.equals("Mango")) desc.setText(
	        		        "Fresh mangoes, sweet and juicy.\r\n" +
	        		        "Quantity: 1 kg\r\n" +
	        		        "Storage: Keep in a cool place, refrigerate when ripe.\r\n" +
	        		        "Rating: 4.8/5"
	        		    );
	        		    else if (item.equals("Orange")) desc.setText(
	        		        "Fresh oranges, rich in Vitamin C.\r\n" +
	        		        "Quantity: 1 kg\r\n" +
	        		        "Storage: Keep in a cool, dry place or refrigerate.\r\n" +
	        		        "Rating: 4.6/5"
	        		    );
	        		    else if (item.equals("Grapes")) desc.setText(
	        		        "Fresh grapes, sweet and juicy.\r\n" +
	        		        "Quantity: 500 g\r\n" +
	        		        "Storage: Refrigerate to maintain freshness.\r\n" +
	        		        "Rating: 4.7/5"
	        		    );

	        		    else if (item.equals("Detergent")) desc.setText(
	        		        "Powdered detergent, effective for laundry cleaning.\r\n" +
	        		        "Quantity: 1 kg\r\n" +
	        		        "Usage: Suitable for machine and hand wash.\r\n" +
	        		        "Rating: 4.5/5"
	        		    );
	        		    else if (item.equals("Phenyl")) desc.setText(
	        		        "Disinfectant phenyl, keeps your home clean and germ-free.\r\n" +
	        		        "Quantity: 1 Litre\r\n" +
	        		        "Usage: Dilute before use on floors.\r\n" +
	        		        "Rating: 4.4/5"
	        		    );
	        		    else if (item.equals("Dishwash")) desc.setText(
	        		        "Dishwashing liquid, removes grease effectively.\r\n" +
	        		        "Quantity: 500 ml\r\n" +
	        		        "Usage: Apply on sponge and scrub dishes.\r\n" +
	        		        "Rating: 4.5/5"
	        		    );
	        		    else if (item.equals("Floor Cleaner")) desc.setText(
	        		        "Floor cleaner liquid, keeps floors shiny and germ-free.\r\n" +
	        		        "Quantity: 1 Litre\r\n" +
	        		        "Usage: Dilute with water before mopping.\r\n" +
	        		        "Rating: 4.6/5"
	        		    );
	        		    else if (item.equals("Toilet Cleaner")) desc.setText(
	        		        "Toilet cleaner, removes tough stains and disinfects.\r\n" +
	        		        "Quantity: 500 ml\r\n" +
	        		        "Usage: Pour directly into the toilet bowl.\r\n" +
	        		        "Rating: 4.5/5"
	        		    );

	        		    else if (item.equals("Chips")) desc.setText(
	        		        "Crispy potato chips, lightly salted.\r\n" +
	        		        "Quantity: 100 g\r\n" +
	        		        "Storage: Store in a cool, dry place.\r\n" +
	        		        "Rating: 4.6/5"
	        		    );
	        		    else if (item.equals("Biscuits")) desc.setText(
	        		        "Crunchy biscuits, perfect for tea-time.\r\n" +
	        		        "Quantity: 200 g\r\n" +
	        		        "Storage: Keep in an airtight container.\r\n" +
	        		        "Rating: 4.5/5"
	        		    );
	        		    else if (item.equals("Chocolate")) desc.setText(
	        		        "Rich and creamy chocolate bars.\r\n" +
	        		        "Quantity: 100 g\r\n" +
	        		        "Storage: Keep in a cool place.\r\n" +
	        		        "Rating: 4.7/5"
	        		    );
	        		    else if (item.equals("Noodles")) desc.setText(
	        		        "Instant noodles, quick and easy to cook.\r\n" +
	        		        "Quantity: 70 g\r\n" +
	        		        "Storage: Keep in a dry place.\r\n" +
	        		        "Rating: 4.4/5"
	        		    );
	        		    else if (item.equals("Popcorn")) desc.setText(
	        		        "Buttery popcorn, perfect for snacks.\r\n" +
	        		        "Quantity: 50 g\r\n" +
	        		        "Storage: Keep in a sealed packet.\r\n" +
	        		        "Rating: 4.5/5"
	        		    );

	        		    else if (item.equals("Milk")) desc.setText(
	        		        "Fresh cow milk, rich in calcium.\r\n" +
	        		        "Quantity: 1 Litre\r\n" +
	        		        "Storage: Keep refrigerated.\r\n" +
	        		        "Rating: 4.7/5"
	        		    );
	        		    else if (item.equals("Cheese")) desc.setText(
	        		        "Soft cheese, ideal for sandwiches and cooking.\r\n" +
	        		        "Quantity: 200 g\r\n" +
	        		        "Storage: Refrigerate.\r\n" +
	        		        "Rating: 4.6/5"
	        		    );
	        		    else if (item.equals("Butter")) desc.setText(
	        		        "Creamy butter, perfect for cooking and baking.\r\n" +
	        		        "Quantity: 200 g\r\n" +
	        		        "Storage: Refrigerate.\r\n" +
	        		        "Rating: 4.5/5"
	        		    );
	        		    else if (item.equals("Curd")) desc.setText(
	        		        "Fresh yogurt, probiotic-rich.\r\n" +
	        		        "Quantity: 500 g\r\n" +
	        		        "Storage: Keep refrigerated.\r\n" +
	        		        "Rating: 4.6/5"
	        		    );
	        		    else if (item.equals("Paneer")) desc.setText(
	        		        "Fresh cottage cheese (paneer), high protein.\r\n" +
	        		        "Quantity: 200 g\r\n" +
	        		        "Storage: Keep refrigerated.\r\n" +
	        		        "Rating: 4.7/5"
	        		    );
	        	
	        }
	
	       
	        this.add(desc);
	        this.setVisible(true);
	}

}


public class Project2 {
    public static void main(String[] args) {
       Login l= new Login();
    }
}
