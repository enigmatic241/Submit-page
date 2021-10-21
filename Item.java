// Item class
package  obs;

public class Item 
   implements java.io.Serializable
{

   private String isbn,title;
   private int price;
   private int qty;

   public Item(String isbn,String title, int price)
   {
      this.isbn = isbn;
      this.title = title;
      this.price = price;
      this.qty = 1;
   }
   public String getIsbn()
   {
      return  isbn;
   }

   public String getTitle()
   {
      return  title;
   }

   public int getQty()
   {
      return  qty;
   }

   public void setQty(int qty)
   {   this.qty = qty; }

   public void addQty(int qty)
   {   this.qty += qty;  }

   public int getPrice()
   {
      return  price;
   }
   public int showPrice()
   {
      return price;
   }
   
   public void increement_price(int x)
   {
      price+=x;
   }
   public void showItems() {
		try {
			String query = "select * from Donor";
			PreparedStatement pst = connection.prepareStatement(query);
			ResultSet rst = pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rst));
			//rst.close();
			pst.close();
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null, ex);
		}
	}
   
   
} // end of class 
   
