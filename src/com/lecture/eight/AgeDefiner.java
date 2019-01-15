package com.lecture.eight;

public class AgeDefiner {

    /**
     * 2 methods. One is for woman the other for man
     * <p>
     * Woman: <18  you are very young
     * 18-45 you are young
     * 46-60 you are still young
     * 61-... You were young.
     */
    public void womanAge(int... womanAges) {
        for (int ageOfWoman : womanAges) {
            if (ageOfWoman < 0) {
                System.out.println("age cant be negative");
                System.exit(0);
            } else if ( ageOfWoman < 18) {
                System.out.println("you are very young");
            } else if (  ageOfWoman < 46) {
                System.out.println("you are young");
            } else if (ageOfWoman < 61) {
                System.out.println("you are still young");
            } else {
                System.out.println("You were young.");
            }
        }
    }
    /**
     *  <18 you are very young
     *  18-31 you are still young
     *  32-45 game over
     *  46- ... are you still alive
     */
    public void manAge(int... manAges) {
        for (int ageOfMan : manAges) {
            if (ageOfMan < 0) {
                System.out.println("age cant be negative");
                System.exit(0);
            }else if (ageOfMan < 18) {
                System.out.println("you are very young");
            } else if (ageOfMan < 32) {
                System.out.println("you are still young");
            } else if (ageOfMan < 46) {
                System.out.println("game over");
            } else {
                System.out.println("are you still alive");
            }
        }
    }

}
