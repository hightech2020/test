package main;



import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;

public class Client {
	private String ID;
	private String nom;
	private String prenom;
	private String email;
	private String password;
	private Date datenaissance;
	
	private boolean isPremium;
	private int ptsFid;
	
	Connection conn = null;
	private Statement statement = null;
	private ResultSet resultSet = null;
	
	
	
	
	public String getID() {
		return ID;
	}



	public void setID(String iD) {
		ID = iD;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public Date getDatenaissance() {
		return datenaissance;
	}



	public void setDatenaissance(Date datenaissance) {
		this.datenaissance = datenaissance;
	}



	public boolean isPremium() {
		return isPremium;
	}



	public void setPremium(boolean isPremium) {
		this.isPremium = isPremium;
	}



	public int getPtsFid() {
		return ptsFid;
	}



	public void setPtsFid(int ptsFid) {
		this.ptsFid = ptsFid;
	}



	public Connection getConn() {
		return conn;
	}



	public void setConn(Connection conn) {
		this.conn = conn;
	}



	public Statement getStatement() {
		return statement;
	}



	public void setStatement(Statement statement) {
		this.statement = statement;
	}



	public ResultSet getResultSet() {
		return resultSet;
	}



	public void setResultSet(ResultSet resultSet) {
		this.resultSet = resultSet;
	}



	public Client(String iD, String nom, String prenom, String email, String password,Date datenaissance, boolean isPremium, int ptsFid,
			Connection conn, Statement statement, ResultSet resultset) {
		super();
		ID = iD;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.datenaissance=datenaissance;
		this.isPremium = isPremium;
		this.ptsFid = ptsFid;
		this.conn = conn;
		this.statement = statement;
		this.resultSet = resultset;
	}
	public int calculAge() {
		System.out.println(Calendar.getInstance().get(Calendar.YEAR));
		System.out.println(this.datenaissance.getYear());
		int age = Calendar.getInstance().get(Calendar.YEAR) - this.datenaissance.getYear() -1900;
		return age ; 
		
	}
	
	
	
	
	public void getConnected(String url, String user, String password) throws SQLException{
		
		
		conn = DriverManager.getConnection(url, user, password);
		if(conn == null)
		{
			throw new SQLException("connection not open");
		}
		else
			System.out.println("Connected");
	}
	
	public boolean authentification (String id, String pwd, Connection cnx) throws SQLException, NullPointerException{
		if( id == null || pwd == null)
		{
			throw new NullPointerException("Parameter must be not null");
		}
		else {
			String pass = null;
			java.sql.PreparedStatement st = cnx.prepareStatement("SELECT password FROM client WHERE ID = ?");
			st.setString(1, id);
			resultSet = st.executeQuery();
			
			int count = 0;
			while(resultSet.next()) {
				
				pass = resultSet.getString("password");
				System.out.println("password in database : "+ pass);
				count++;
			}
			
			if(count==0)
			{
				System.out.println(" No such client in the database");
				return false;
			}
			
			else if(count == 1)
			{
				if(pass.compareTo(pwd)==0)
				{
					System.out.println("welcome client : you are authentificated");
					return true;
				}
				else 
				{
					System.out.println("wrong password");
					return false;
				}
			}
			else
			{
				System.out.println("Error : two instances of same client");
				return false;
			}
		}
		
	}
	
	
	
}