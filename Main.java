class Main {
  public static void main(String[] args) {
    final long startTime = System.currentTimeMillis();
    System.out.println(recursiveFib(25));
    final long endTime = System.currentTimeMillis();
    
    System.out.println("Total execution time: " + (endTime - startTime));
    
  }

  public static int recursiveFib(int num) {
    if (num == 1 || num == 0) {
      return num;
    }

    return recursiveFib(num - 1) + recursiveFib(num - 2);
  }

}

