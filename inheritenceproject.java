/*Scenario:
You are creating a system for a library. There are two types of members: Student and Faculty. Both can borrow books, but:

Student can borrow up to 3 books.
Faculty can borrow up to 10 books.
Design a class hierarchy to represent this scenario using inheritance. Implement a function canBorrow() in both derived classes to check if the member can borrow a book, based on their current borrowed count.

Question:
Write the base and derived classes to represent the scenario. How would you implement the canBorrow() method for Student and Faculty classes?*/
class library{
  String name;
  int bb;
  library(String name)
  {
    this.name=name;
    this.bb=0;
  }
  public boolean cb()
  {
    return false;
  }
  public void bob()
  {
    if(cb())
    {
      bb++;
      System.out.println(name+" You borrowed "+bb+" book ");
    }else{
      System.out.println("Your Limit Exceeded!");
    }
  }
}
class students extends library
{
  students(String name)
  {
    super(name);
  }
  public boolean cb()
  {
    return bb<3;
  }
}
class teachers extends library
{
  teachers(String name)
  {
    super(name);
  }
  public boolean cb()
  {
    return bb<10;
  }
}
class Main {
  public static void main(String[] args) {
      library a = new students("Amar");
      library b1 = new students("Lalitha");
      library b = new teachers("Dr.Prem Kumar");
      b1.bob();
      a.bob();
      a.bob();
      b1.bob();
  }
}