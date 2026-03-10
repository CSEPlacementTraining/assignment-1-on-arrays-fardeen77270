class Assignment1 {
  public static int[] findLeapYears(int year) {
  // Implement your code here and change the return value accordingly
    int[] leapYears = new int[15];
int count = 0;
int currentYear = year + 1;

while (count < 15) {

    if ((currentYear % 4 == 0 && currentYear % 100 != 0) || (currentYear % 400 == 0)) {
        leapYears[count] = currentYear;
        count++;
    }

    currentYear++;
}

return leapYears;
  }
  
  public static void main(String[] args) {
    int year = 2000;
    int[] leapYears;
    leapYears = findLeapYears(year);
    for (int index = 0; index < leapYears.length; index++) {
      System.out.println(leapYears[index]);
    }
  }
}
