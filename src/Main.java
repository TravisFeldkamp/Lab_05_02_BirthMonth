public class Main {
    public static void main(String[] args) {
        int birthMonth = 65;// initialize varibale for user input of their birth month
        if (birthMonth >=1 && birthMonth <=12) // if statement saying if the birth month is between 1 and 12 then execute the block of code
        {
            System.out.println("your birth month is: " + birthMonth);// output to user telling them their birth month
        }
        else {//else statement that says if initial conditions are not met run this block of code
            System.out.println("You entered an incorrect month value: " + birthMonth);// output to user that tells them their input was invalid

        }

    }
}