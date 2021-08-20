class PossibleCombinations {
 public static void main(String[] args) {
  int[] input = { Integer.parseInt(args[0]),Integer.parseInt(args[1]), Integer.parseInt(args[2]) };
  for (int x = 0; x < 3; x++) {
   for (int y = 0; y < 3; y++) {
    for (int z = 0; z < 3; z++) {
     if (x != y && y != z && z != x) {
      System.out.println(input[x] + "" + input[y] + "" + input[z]);
     }
    }
   }
  }
 }
}