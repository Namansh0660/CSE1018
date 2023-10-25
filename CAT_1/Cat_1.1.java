
CSE3041 –Programming for Data Science 
#1. Create vector 'student' to store the names of 5 students 
#2. Use assign() function to create a vector 'Marks' to store the marks scored by these students. 
#3. Display the mark of student3. 
#4. Combine the vectors 'student' and 'Marks' as details. 
#5. Find the length of combined vector 'details'. 
#6. Find the minimum mark and print the student who scored it. 
#7. Find the maximum average mark and print the student who scored it. 
#8. Find the total marks scored by all the students. 
#9. Find the mean of the marks scored by all students 
#10. Find the standard deviation of the marks scored by all students 
#11. Arrange the marks in ascending order. 
PART-B
12. Create a list to maintain the details of a student such as registration number, name, no. of courses registered and marks in each subject. 
13. Retrieve the name of the student. 
14. Extract only the registration number and the marks of the student. 
15. Access the mark in the first course registered. 
16. Modify the mark entry in the last course as 5 more than the existing mark




import java.util.Scanner;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean[] lockers = new boolean[n];
        for (int i=1;i<=n;i++)
        {
            shuffle(lockers,i);
        }
        display(lockers);
    }
    public static void shuffle(boolean[] openlocker,  int first) 
    {
        int nextLocker = first;
        for (int i=first-1;i<openlocker.length;i+=nextLocker) 
        {
            openlocker[i]=!openlocker[i];
        }
    }
    public static void display(boolean[] lockers) 
    {
        for (int i=0;i<lockers.length;i++) 
        {
            if (lockers[i]) 
            {
                System.out.println(i+1);
            }
        }
    }
}
