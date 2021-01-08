class Main {
  public static void main(String[] args) {
    System.out.println(recursiveFib(9));
    
  }

  public static int recursiveFib(int num) {
    if (num == 1 || num == 0) {
      return num;
    }

    return recursiveFib(num - 1) + recursiveFib(num - 2);
  }

}

