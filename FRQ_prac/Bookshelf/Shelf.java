public class Shelf
{
    public static void main(String[] args)
    {
        Book[] bookShelf = new Book[6];
        bookShelf[0] = new Book("The Hobbit", 400);
        bookShelf[2] = new Book("A Conjuring of Light", 580);
        bookShelf[4] = new Book("The Bible", 1100);
        bookShelf[5] = new Book("Steve Job's Biography", 340);




        for(int i=0; i < bookShelf.length; i++)
        {
            if(bookShelf[i]==null)
            {
                for(int j = i; j < bookShelf.length; j++)
                {
                    if(bookShelf[j] != null)
                    {
                        bookShelf[i] = bookShelf[j];
                        bookShelf[j] = null;
                        break;
                    }
                }
            }
        }

        for (int k = 0; k < bookShelf.length; k++)
        {
            if(bookShelf[k] != null)
            {
                System.out.println(bookShelf[k].getName() + " is at position " + k);
            }
            else
            {
                break;
            }
        }




    }
}