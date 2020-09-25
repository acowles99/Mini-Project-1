class CheckMyAge {
  public static void main(String[] args) {
    int myAge = 15;
    int myBirthday = 0110;
    int todaysDate = 923;

    if (todaysDate == myBirthday)
    {
      myAge= myAge +1;
    System.out.println("I am " +myAge+ " years old");
    }else{
    System.out.println("I am still " +myAge+ " years old");
    }

  }
}