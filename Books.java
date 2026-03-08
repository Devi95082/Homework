class Books
{
	int bookid;
	String title;
	String author;
	boolean available;
	Books(int bookid,String title,String author)
	{
		this.bookid=bookid;
		this.title = title;
		this.author = author;
		available=true;
		
		
	}
	void display()
	{
		System.out.println("Book ID : "+bookid);
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);	
		
	}
	void borrow()
	{
		if(available)
		{
			available=false;
			System.out.println("Book is Borrowed Successfully");
		}
		else
		{
			System.out.println("Book is already Borrowed");
		}
	}
	void returnbook()
	{
		available=true;
		System.out.println("Book return successfully");
	}
}