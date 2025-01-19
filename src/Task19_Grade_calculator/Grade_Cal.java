package Task19_Grade_calculator;

public class Grade_Cal {
    public static void main(String[] args){
        //Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59
        int marks=60;
        String Grade= (marks>=90&& marks<=100?"grade A":(marks>=80&& marks<=89)? "grade b":(marks>=70&& marks<=79? "grade c":(marks>=60&& marks<=69? "grade d": "grade f")));
        System.out.println(Grade);
    }
}
