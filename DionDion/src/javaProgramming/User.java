package javaProgramming;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User 
{
	private String username;
	private String password;
	private String lastName;
	private String firstName;
	private List<User> userList;

	public String getUsername() 
	{
		return username;
	}

	public void setUsername(String username) 
	{
		this.username = username;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public List<User> getUserList() 
	{
		userList = new ArrayList<User>();
		Scanner file = null;

		try
		{
			file = new Scanner(new File("C:/Users/PC1/Desktop/cris/folder/customerRegistration.txt"));
			
			while(file.hasNext())
			{
				String line[] = file.nextLine().split(",");
				User user = new User();
				
				user.setUsername(line[0]);
				user.setPassword(line[1]);
				user.setLastName(line[2]);
				user.setFirstName(line[3]);
				
				userList.add(user);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		file.close();
		
		return userList;
	}

	public void setUserList(List<User> userList) 
	{
		this.userList = userList;
	}
	
	public void addUser(User user) throws IOException
	{
		FileWriter fw = new FileWriter(new File("C:/Users/PC1/Desktop/cris/folder/customerRegistration.txt"), true);
		
		fw.append(user.getUsername()+",");
		fw.append(user.getPassword()+",");
		fw.append(user.getLastName()+",");
		fw.append(user.getFirstName()+"\n");
		
		fw.close();
	}
}