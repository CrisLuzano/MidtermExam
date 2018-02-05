package midterm;

public class Information 
{
	private String name;
	private String password;
	private String confirmPass;
	private String city;
	private String gender;
	private String gmail;
	private String submit;
	
	public String getName() 
	{
		return name;
	}
	
	public String getConfirmPass() 
	{
		return confirmPass;
		
	}

	public void setConfirmPass(String confirmPass) 
	{
		this.confirmPass = confirmPass;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getPassword() 
	{
		return password;
	}
	
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	public String getCity() 
	{
		return city;
	}
	
	public void setCity(String city) 
	{
		this.city = city;
	}
	
	public String getGender() 
	{
		return gender;
	}
	
	public void setGender(String gender) 
	{
		this.gender = gender;
	}
	
	public String getGmail() 
	{
		return gmail;
	}
	
	public void setGmail(String gmail) 
	{
		this.gmail = gmail;
	}
	
	public String getSubmit() 
	{
		return submit;
	}
	
	public void setSubmit(String submit) 
	{
		this.submit = submit;
	}

}
