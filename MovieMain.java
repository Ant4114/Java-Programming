class Movie{
	String name;
	double rating;
    int year;
    public Movie (String name, double rating , int year){
    	this.name=name;
    	this.rating=rating;
    	this.year=year;

    }
    void printDetails(){
    	System.out.println("Movie Name :"+ name);
    	System.out.println("Movie Rating :"+ rating);
    	System.out.println("Movie year : "+ year);
    	System.out.println("-----------------------");
    }
}
class MovieMain{
	public static void main(String[] args) {
		Movie m1=new Movie ("Mufasa",8.8,2024);
		Movie m2=new Movie ("Dragon",8.5,2025);
		Movie m3=new Movie ("Chava",9.2,2025);
		m1.printDetails();
		m2.printDetails();
		m3.printDetails();
	}
}