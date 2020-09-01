import java.util.*;
import java.sql.*;
import com.mysql.jdbc.*;

public class Book
{
			public static void main(String args[]) throws Exception
				{
					try
					{
						Scanner s=new Scanner(System.in);
						Connection conn=DriverManager.getconnection("jdbc:mysql://localhost:3306/library","root","");
						System.out.println("1.insert\n2.update\n3.delete\n");
						int choice=s.nextInt();
						if(choice==1)
						{
							String sql="INSERT INTO book(title,name,price) VALUES (?,?,?)";
							PreparedStatement h=conn.prepareStatement(sql);
							
							System.out.println("enter the book_title..");
							h.setString(1,s.next());
							
							System.out.println("enter the book_name..");
							h.setString(2,s.next());
							
							System.out.println("enter the book_price...");
							h.setInt(3,s.nextInt());					
							
							
							int row = h.executeUpdate();
							if(row>0)
							{
									System.out.println(" insert successfully");
							}
							else
							{
									System.out.println("error");
							}
				
						}
						else if(choice==2)
						{
							
						}
						
						
					}
				}
		
}