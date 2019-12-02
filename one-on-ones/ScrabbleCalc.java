import java.util.Scanner;

public class ScrabbleCalc
{

    public static void main(String[] args)
    {
        String word = "";
        boolean isValidWord = true;

        int wordPointTotal = 0;

        int aTotal = 9;
        int bTotal = 2;
        int cTotal = 2;
        int dTotal = 4;
        int eTotal = 12;
        int fTotal = 2;
        int gTotal = 3;
        int hTotal = 2;
        int iTotal = 9;
        int jTotal = 1;
        int kTotal = 1;
        int lTotal = 4;
        int mTotal = 2;
        int nTotal = 6;
        int oTotal = 8;
        int pTotal = 2;
        int qTotal = 1;
        int rTotal = 6;
        int sTotal = 4;
        int tTotal = 6;
        int uTotal = 4;
        int vTotal = 2;
        int wTotal = 2;
        int xTotal = 1;
        int yTotal = 2;
        int zTotal = 1;
        int blankTotal = 2;

        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int eCount = 0;
        int fCount = 0;
        int gCount = 0;
        int hCount = 0;
        int iCount = 0;
        int jCount = 0;
        int kCount = 0;
        int lCount = 0;
        int mCount = 0;
        int nCount = 0;
        int oCount = 0;
        int pCount = 0;
        int qCount = 0;
        int rCount = 0;
        int sCount = 0;
        int tCount = 0;
        int uCount = 0;
        int vCount = 0;
        int wCount = 0;
        int xCount = 0;
        int yCount = 0;
        int zCount = 0;
        int blankCount = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word: ");
        word = scan.nextLine();
        word = word.toLowerCase();
        
        for(int i = 0; i < word.length(); i++)
        {
            String letter = word.substring(i, i+1);

            if (letter.equals("a") && aCount < aTotal) {
                aCount++;
            }
            else if (letter.equals("b") && bCount < bTotal) {
                bCount++;
            }
            else if (letter.equals("c") && cCount < cTotal) {
                cCount++;
            }
            else if (letter.equals("d") && dCount < dTotal) {
                dCount++;
            }
            else if (letter.equals("e") && eCount < eTotal) {
                eCount++;
            }
            else if (letter.equals("f") && fCount < fTotal) {
                fCount++;
            }
            else if (letter.equals("g") && gCount < gTotal) {
                gCount++;
            }
            else if (letter.equals("h") && hCount < hTotal) {
                hCount++;
            }
            else if (letter.equals("i") && iCount < iTotal) {
                iCount++;
            }
            else if (letter.equals("j") && jCount < jTotal) {
                jCount++;
            }
            else if (letter.equals("k") && kCount < kTotal) {
                kCount++;
            }
            else if (letter.equals("l") && lCount < lTotal) {
                lCount++;
            }
            else if (letter.equals("m") && mCount < mTotal) {
                mCount++;
            }
            else if (letter.equals("n") && nCount < nTotal) {
                nCount++;
            }
            else if (letter.equals("o") && oCount < oTotal) {
                oCount++;
            }
            else if (letter.equals("p") && pCount < pTotal) {
                pCount++;
            }
            else if (letter.equals("q") && qCount < qTotal) {
                qCount++;
            }
            else if (letter.equals("r") && rCount < rTotal) {
                rCount++;
            }
            else if (letter.equals("s") && sCount < sTotal) {
                sCount++;
            }
            else if (letter.equals("t") && tCount < tTotal) {
                tCount++;
            }
            else if (letter.equals("u") && uCount < uTotal) {
                uCount++;
            }
            else if (letter.equals("v") && vCount < vTotal) {
                vCount++;
            }
            else if (letter.equals("w") && wCount < wTotal) {
                wCount++;
            }
            else if (letter.equals("x") && xCount < xTotal) {
                xCount++;
            }
            else if (letter.equals("y") && yCount < yTotal) {
                yCount++;
            }
            else if (letter.equals("z") && zCount < zTotal) {
                zCount++;
            }
            else if (letter.equals(" ") && blankCount < blankTotal) {
                blankCount++;
            }
            else {
                isValidWord = false;
                break;
            }
        }

        // (2 points)-D, G
        // (3 points)-B, C, M, P
        // (4 points)-F, H, V, W, Y
        // (5 points)-K
        // (8 points)- J, X
        // (10 points)-Q, Z


        if(isValidWord)
        {
            for(int i = 0; i < word.length(); i++){
                String letter = word.substring(i, i+1);

                if(letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u") || letter.equals("l") || letter.equals("n") || letter.equals("s") || letter.equals("t") || letter.equals("r"))
                {
                    wordPointTotal += 1;
                }
                else if(letter.equals("d") || letter.equals("g"))
                {
                    wordPointTotal += 2;
                }
                else if(letter.equals("b") || letter.equals("c") || letter.equals("m") || letter.equals("p"))
                {
                    wordPointTotal += 3;
                }
                else if(letter.equals("f") || letter.equals("h") || letter.equals("v") || letter.equals("w") || letter.equals("y"))
                {
                    wordPointTotal += 4;
                }
                else if(letter.equals("k"))
                {
                    wordPointTotal += 5;
                }
                else if(letter.equals("j") || letter.equals("x"))
                {
                    wordPointTotal += 5;
                }
                else if(letter.equals("q") || letter.equals("z"))
                {
                    wordPointTotal += 5;
                }
                else if(letter.equals(" "))
                {
                    continue;
                }
            }
            System.out.println("The word " + word + " is worth " + wordPointTotal + " points.");
        }
        else {
            System.out.println("This word is not valid.");
        }
    }
}