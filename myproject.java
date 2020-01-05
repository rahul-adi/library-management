import java.util.Scanner;
public class Project
{
    public static void main(String[] args) 
  {
    char r;
    do{
     System.out.println("Library Management");
     System.out.println("press 1 to add book");
     System.out.println("press 2 to Issue a book");
     System.out.println("press 3 to return a book");
     System.out.println("press 4 to print complete detais");
     System.out.println("press 5 to exit");
     Scanner obj3=new Scanner(System.in);
     System.out.println("enter any no.");
     int a=obj3.nextInt();
     switch(a)
      {
      case 1:
      library ab=new library();
      ab.add();
      break;
      case 2:
      library ac=new library();
      ac.issue();
      break;
      case 3:
      library ad=new library();
      ad.retn();
      break;
        case 4:
        library ae=new library();
        ae.detail();
        break;
        case 5:
        library af=new library();
        af.ext();
        break;
        default:
         System.out.println("invalid no");

      }
     System.out.println("you want to select next option Y/N");
     r=obj3.charAT(0);
     while(r=='y'||r=='Y');
     if(r=='n'||r=='N')
      {
      Library z=new Library();
       }
class  Library{
  static String str,b,date;
  static int a,c;
  void add()
  {
    System.out.println("enter book name,price and book_no");
    scanner obj1=new Scanner(system.in);
    String str=obj1.nextLine();
    float price=obj1.nextLine();
    int bookno=obj1.nextInt();
    System.out.println("your details is " +str +price +bookno);
  }
  void issue()
  {
      Scanner obj2=new Scanner(System.in);
      System.out.println("book name");
      str=obj2.nextLine();
      System.out.println("book_id");
      a=obj2.nextInt();
      obj2.nextLine();
      System.out.println("issue_date");
      b=obj2.nextLine();
      System.out.println("Total no.of book ISSUED");
      c=obj2.nextInt();
      obj2.nextLine();
      System.out.println("return book date");
      date=obj2.nextLine();
  }
  int getid()
  {
    return a;
  }
  void retn()
  {
    System.out.println("Student name and book_id");
    Scanner c=new Scanner(System.in);
    string name=c.nextLine();
    int bookid=c.nextInt();
        if(a==bookid)
        {
          System.out.println("Total details");
          System.out.println("book name" +Library.str);
          System.out.println("book_id" +Library.a);
          System.out.println("issue_date" +Library.b);
          System.out.println("total no. of book issused" +Library.c);
          System.out.println("return date" +Library.date);
        }
        else
        {
          System.out.println("BOOk ID IS WORNG");
        }
  }
  void  detail()
  {
          System.out.println("book name" +Library.str);
          System.out.println("book_id" +Library.a);
          System.out.println("issue_date" +Library.b);
          System.out.println("total no. of book issused" +Library.c);
          System.out.println("return date" +Library.date);
  }
  void ext()
  {
      System.exit(0);
  }   
  }