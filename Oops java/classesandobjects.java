import java.sql.*;


public class classesandobjects {
    public static void main(String args[]){
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/samar","root","Samar@1234" );
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from book_details");
            while(rs.next()){
                System.out.println(rs.getInt(1+" "+rs.getString(2)));
            }
            con.close();
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }    
        
        Pen p1 = new Pen(); //created a pen object called p1
        p1.setcolor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
    }
}

class Pen{
    String color;
    int tip;

    void setcolor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math){
        percentage = (phy+math+chem)/3;
    }
}
