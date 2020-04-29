public class Palindrome {

    public static void main(String[] args){

        //Print all palindromes between 1000 - 9999
        for(int i = 1000; i < 10000; i++){

            String currentNum = Integer.toString(i);
            String reversedNum = Integer.toString(i);

            //Change the string into a StringBuilder
            //Reverse it and see if it's the same as the current number being iterated
            if(new StringBuilder(reversedNum).reverse().toString().equals(currentNum)){
                System.out.println(reversedNum);
            }
        }
    }
}
