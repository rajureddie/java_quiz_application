import java.util.*;


public class quiz{
    static class Questions{
        String question;
        String[] options;
        int correctans;
        Questions(String question , String[] options , int correctans){
            this.question=question;
            this.options= options;
            this.correctans=correctans;
    
    }
    
    }

    public static void main (String args[]){
        System.out.println("......welcome to java quiz....");
        System.out.println(" ");
        Questions[] questions = {
            new Questions("Number of primitive data types in Java are?", new String[]{"1. 6","2. 7","3. 8" , "4. 9"},3 ),
            new Questions("Automatic type conversion is possible in which of the possible cases?",new String[]{"1. byte to long","2. int to long" , "3. long to int" , "4. long to short"},2),
            new Questions("When an array is passed to a method, what does the method receive?", new String[]{"1. reference of the array" , "2. copy of the array","3. length of the array","4. copy of the first element"}, 1),
            new Questions("Identify the keyword among the following that makes a variable belong to a class,rather than being defined for each instance of the class.",new String[]{"1. final","2. static" , "3. volatile" , "4. abstract"},2),
            new Questions(" comapareTo() returns ?",new String[]{"1. true","2. false" , "3. an int value" , "4. nne"},3)
             
        };
        int score =0;
        Scanner sc = new Scanner(System.in);
        for(Questions question: questions){
            System.out.println(question.question);
            
            for(String options:question.options){
                System.out.println(options);

            }
            System.out.println();
            System.out.println("Enter your answer");
            int userans = sc.nextInt();
            if(userans == question.correctans){
                System.out.println("Correct answer");
                score++;
            }
            System.out.println(" ");
            
        }
        System.out.println("your Score is" +" "+ score + " "+ "out of"+ " " + questions.length);
            System.out.println(" ");
       
        
    }
}