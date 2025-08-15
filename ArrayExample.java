public class ArrayExample {
    public static void main(String[] args) {
        int[] marks;

        marks = new int[6];

        marks[0] = 65;
        marks[1] = 75;
        marks[2] = 60;
        marks[3] = 85;
        marks[4] = 75;
        marks[5] = 90;

        System.out.println("Marks of students: ");
        for(int i = 0; i < marks.length; i++){
            System.out.println("Student "+ (i+1) + ": " + marks[i]);
        }
        
    }
    
}
