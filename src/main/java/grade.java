public class grade {

    public static void main(String[] args) {
        int studentGrade= 0 + (int) (Math.random() * 100);

        if (studentGrade > 90){
            System.out.println("You got an A!") ;
        } else if (studentGrade > 80 && studentGrade < 90) {
            System.out.println("You got an B!") ;
        } else if (studentGrade > 70 && studentGrade < 80){
            System.out.println("You got an C!") ;
        } else if (studentGrade > 60 && studentGrade < 70){
            System.out.println("You got an D!") ;
        } else {
            System.out.println("You got an F");

System.out.println(studentGrade);
        }
    }
    }
