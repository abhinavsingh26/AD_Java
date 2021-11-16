class Book1 
{
	
	String name; 
	float price; 
	String aname; 
	int isbnno; 
	String publication;
	

	public Book1(String name, float price, String aname, int isbnno, String publication) 
	{
		this.name = name;
		this.price = price;
		this.aname = aname;
		this.isbnno = isbnno;
		this.publication = publication;
	}
	
	void dispayBook() 
	{
		System.out.println(name+" "+price+" "+aname+" "+isbnno+" "+publication);
	}	
}
