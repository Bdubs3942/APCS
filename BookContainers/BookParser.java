public class BookParser
{
  public static void main(String[] args)
  {
    int count = 0;
    
    BookLoader b = new BookLoader("/Users/dsobolewski/Desktop/APCS/BookContainers/Dracula.txt");
    String x = b.text;

    for(int i = 0; i < (x.length()-7); i++)
    {
      String y = x.substring(i,(i+7));
      String z = "vampire";

      // System.out.println(y.equals(z));
      if(y.equals(z)){
        count++;
      }
    }
    System.out.println(count);
  }
}