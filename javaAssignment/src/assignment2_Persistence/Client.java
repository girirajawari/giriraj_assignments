package assignment2_Persistence;

//Abstract class persistence with file and database as its subclasses and a client class(Persistence.java,
//FilePersistence.java,DatabasrPersistence.java,Client.java)

public class Client 
{
	public static void main(String[] args)
	{
		Persistence fp=new FilePersistence();
		fp.persist();
		Persistence dp=new DatabasePersistence();
		dp.persist();
	}
}