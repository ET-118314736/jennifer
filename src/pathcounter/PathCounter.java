/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathcounter;

/**
 *
 * @author adamoc
 */
public class PathCounter {
    public int countPaths(int inputtedNum){
        int count = 0;
        for(String iteratorStr : Integer.toString(inputtedNum).split("")) {
          System.out.println("The individual values are " + iteratorStr);
            if(iteratorStr.equals("8")){
                count += 2;
            } else if (iteratorStr.equals("0") || iteratorStr.equals("4") || iteratorStr.equals("6") || iteratorStr.equals("9")){
                count += 1;
            } else {
                count += 0;
            }
        }
        return count;
    }
}

/*

iterator explanation:

iterator is the selected number from the whole number string. 
the iterator takes each number individually and checks it against some logic
the logic check increments the count variable accordingly
once every number in the whole number string is checked, the count variable is returned to the program to be displayed


E.g a whole number '1234' would look like this:

first pass through the for loop: iteratorStr is 1
second pass through the for loop: iteratorStr is 2
third pass through the for loop: iteratorStr is 3
fourth pass through the for loop: iteratorStr is 4

*/
