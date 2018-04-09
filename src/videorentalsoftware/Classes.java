/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videorentalsoftware;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.Date;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.util.Map;
import java.util.HashMap;
import javax.swing.JOptionPane;
/**
 *
 * @author dhruv
 */
public class Classes {
    
}



class Employee implements Serializable {
	protected int empId;
        private static int id = 0;
	protected String username;
	protected String name;
	protected char sex;
	protected Date DOB;
	protected String emailID;
	protected String bankAcNo;
	protected int salary;
	protected String address;
	protected long phoneNo;
	protected String password;

	public Employee(String name, String username, String password, int salary, long phoneNo, String sex) {
		this.name = name;
		this.username = username;
		this.password = password;
                this.phoneNo = phoneNo;
		this.salary = salary;
                if(sex=="Male") this.sex = 'M';
                else this.sex = 'F';
                empId = ++id;
	}
        
        public static int getNewId() {
            id++;
            return id;
        }

	public String getName() {
		return name;
	}

	public String getUsername() {
		return username;
	}

	public int getSalary() {
		return salary;
	}
        
        public char getSex() {
            return sex;
        }
        
        public String getPassword() {
            return password;
        }
        
        public long getPhoneNo() {
            return phoneNo;
        }
        
        public int getEmpId() {
            return empId;
        }
        

}

//class Manager extends Employee implements Serializable {
//
//	public Manager(String name, String username, String password, int salary) {
//		super(name, username, password, salary);
//	}
//
//}
//
//class Clerk extends Employee implements Serializable {
//
//	public Clerk(String name, String username, String password, int salary) {
//		super(name, username, password, salary);
//	}
//}

class BarcodeReader implements Serializable {

}

class CD implements Serializable {
	
	protected int productID;
	protected String name;
	protected Date dateOfPurchase;
	protected int dailyRentalCharge;
	protected boolean loaned;
	protected String format;
	protected int purchasePrice;
	protected Date lastDateReturned;
	protected String type; 	//"Music"/"Video"
        private static int Id = 0;

	public CD(String name, int dailyRentalCharge, int purchasePrice, String type) {
		dateOfPurchase = new Date();
		lastDateReturned = new Date();
		loaned = false;
		this.name = name;
		this.purchasePrice = purchasePrice;
		productID = ++Id;
		this.dailyRentalCharge = dailyRentalCharge;
		this.type = type;

	}

	public void updateLoanStatus(boolean status) {
		loaned = status;
	}
        
        public int getProductId(){
            return productID;
        }
        
        public String getName() {
            return name;
        }
        
        public int getPurchasePrice() {
            return purchasePrice;
        }
        
        public String getType() {
            return type;
        } 
        
        public Date getPurchaseDate() {
            return dateOfPurchase;
        }
        
        public Date getlastDate() {
            return lastDateReturned;
        }
        
        public boolean isLoaned() {
            return loaned;
        }

	public void returnCD(Date date) {
            lastDateReturned = date;
	}

	public int getDailyRentalCharge(Date loanDate) {
            Date date = new Date();
            if(TimeUnit.DAYS.convert(date.getTime() - loanDate.getTime(), TimeUnit.MILLISECONDS) > 365)
                    return dailyRentalCharge/2;
            return dailyRentalCharge;
	}
}

/*class MusicCD extends CD {
	protected List<String> artists;
}

class VideoCD extends CD {
	protected String director;
}
*/
class Database {
	public HashMap<Integer, CD> inventory;
	public HashMap<Integer, Customer> customerDatabase;
	public HashMap<Integer, Employee> employeeDatabase;
}



class SalesDatabase {
	
	private int income;
	private int expense;

	public void addExpense(int exp) {
		expense += exp;
	}

	public void addIncome(int inc) {
		income += inc;
	}

	public int getProfit() {
		return income - expense;
	}



}

class SalesTransaction implements Serializable {
    protected Date loanDate;
    protected Date returnDate;
    protected boolean returnCondition;
    protected int totalCost;
    protected int transID;
    protected Customer customer;
    protected CD item;
    private static int currID = 0;
    
    public Date getLoanDate() {
        return loanDate;
    }
    
    public Date getReturnDate() {
        return returnDate;
    }
    
    public boolean isDamaged(){
        return returnCondition;
    }
    
    public int getTotalCost() {
        return totalCost;
    }
    
    public int getTransId() {
        return transID;
    }
    
    public Customer getCustomer() {
        return customer;
    }
    
    public CD getCD() {
        return item;
    }
    
    public SalesTransaction(Customer customer, CD item) {
        //MAKE THIS WHERE THE CONSTRUCTOR IS CALLED
        /*if(item.type=="Music")
        {
        	if(customer.musicRentals >= 1)
        		return;
        	else customer.musicRentals++;
        }
        else if(item.type=="Video")
        {
        	if(customer.videoRentals >= 2)
        		return;
        	else customer.videoRentals++;
        }*/

        loanDate = new Date();
        transID = ++currID;
        this.item = item;
        this.customer = customer;
        item.updateLoanStatus(true);

    }
    
    public void returnItem(boolean returnCondition) {
        returnDate = new Date();
        this.returnCondition = returnCondition;
        if(item.type=="Music")
        	customer.musicRentals--;
        else if(item.type=="Video")
        	customer.videoRentals--;
        long noOfDays = returnDate.getTime() - loanDate.getTime();
        noOfDays = TimeUnit.DAYS.convert(noOfDays, TimeUnit.MILLISECONDS);
        if(returnCondition)
        {
        	item.returnCD(returnDate);
        	item.updateLoanStatus(false);
        	
        	totalCost = (int)noOfDays*item.getDailyRentalCharge(loanDate);
        }
        //else delete item
        else {
        	totalCost = 0;
        }
        //update salesdatabase with profit

    }
        	
}

class Printer {

}

class Customer implements Serializable {
    private static int id = 0;
    protected int custId; 
    protected String username;
    protected String name;
    protected char sex;
    protected Date DOB;
    protected String emailID;
    protected String phoneNo;
    protected String address;
    protected int musicRentals;
    protected int videoRentals;
    private String password;

    public Customer() {
        musicRentals = 0;
        videoRentals = 0;
        this.sex = 'M';
        custId = 0;
    }
    
    public Customer(String name, String username, String password, String sex, String phoneNo) {
        this.username = username;
        this.name = name;
        this.password = password;
        musicRentals = 0;
        videoRentals = 0;
        this.phoneNo = phoneNo;

        if(sex=="Male") this.sex = 'M';
        else this.sex = 'F';
        custId = ++id;

        //take deposit 1000 rs into salesdatabase
    }

    public String getName() {
            return name;
    }

    public String getUsername() {
            return username;
    }

    public int getMusicRentals() {
        return musicRentals;
    }
    
    public int getVideoRentals() {
        return videoRentals;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getPhoneNo() {
        return phoneNo;
    }
    
    public char getSex() {
        return sex;
    }
    
    public int getId() {
        return custId;
    }
    
    public void updateDetails(String name, String username, String password, String phoneNo) {
        this.username = username;
        this.name = name;
        this.password = password;
        this.phoneNo = phoneNo;
    }
    
    public void login(String username, String password) {
        if(password == this.password) {

        }
        else {
                //login failed
        }
    }
}




