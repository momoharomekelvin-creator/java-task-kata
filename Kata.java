public class Kata{

public static int maximum(int numberOne,int numberTwo){


  if(numberOne > numberTwo){
    
    return numberOne;

    }else{
        return numberTwo;  
    }

}


public static void main(String[] args){

    int numberOne = 10;

    int numberTwo = 20;


    int result = maximum(numberOne,numberTwo);

    System.out.println(result);

}
}







public static boolean isEven (int number){


if(number % 2 == 0){

     return true;
}
    return false;
}

 public static void main(String[]args){

    int number = 11;

boolean result = isEven(number);

System.out.println(result);



} 
}










public static boolean isPrime(int number){



int counter = 0;
for(int count = 1;count <= number;count++){

    if(number % count == 0){
            counter++;
}
}

         if(counter == 2){

        return true;

    }
    else{

   return false;

}
}
public static void main(String[] args){

  int number = 20;

   boolean result = isPrime(number);

   System.out.println(result);

}




public static int subtract(int numberOne,int numberTwo){


    if(numberOne > numberTwo){
        return numberOne - numberTwo;
    }
    else{
        return numberTwo - numberOne;
    }
}
public static void main(String[] args){

int numberOne = 5;
int numberTwo = 10;

int result = subtract(numberOne,numberTwo);

System.out.println(result);








 public static int divide(int numberOne,int numberTwo){


    if(numberTwo == 0){
        return 0;
    }
    else{
        return numberOne / numberTwo;
    }
}

  public static void main(String [] args){

  int numberOne = 20;
  int numberTwo = 0;

   int result = divide(numberOne,numberTwo);

   System.out.print(result);

}



public static String palindrome(String word){


    String reverse = "";
    for(int count < word.length()-1; count >= 0; count--){

        reverse = reverse + word.charAt(count);
        }
        return word.charAt(reverse);
        }

public static void main(String[] args){

    String word = "madam";

    String result = palindrome(word);

    System.out.print(result);
}
}





    public static int factor (int number) {

        int counter = 0;

        for (int count = 1; count <= number; count++) {
            if (number % count == 0) {
                counter = counter + 1;
            }
        }

        return counter;
    }

    public static void main(String[] args) {

        int number = 16;
        int result = factor(number);

        System.out.println(result);
    }
}































 
