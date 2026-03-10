class Assignment1 {

    public static int[] findLeapYears(int year) {
        int[] leapYears = new int[15];
        int count = 0;
        int currentYear = year;

        while (count < 15) {
            if (isLeapYear(currentYear)) {
                leapYears[count] = currentYear;
                count++;
            }
            currentYear++;
        }
        return leapYears;
    }

    private static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } 
        else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } 
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        int year = 2000;
        int[] leapYears = findLeapYears(year);

        for (int i = 0; i < leapYears.length; i++) {
            System.out.print(leapYears[i]);
            if (i < leapYears.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}