// Если необходимо, исправьте данный код


try {
   int d = 0;
   int[] intArray;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
} catch (IndexOutOfBoundsException e) {
   System.out.println("Catching exception: " + e);
}
