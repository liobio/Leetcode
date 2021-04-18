public class Fast_string_append_in_Java {
    public static void main(String[] args) {
 
        String line = "";
        long startTime = System.nanoTime();
        for(int i = 0; i < 30000; i++) {
            line += (char) i;
        }
        long endTime = System.nanoTime();
        System.err.println(endTime-startTime);

        StringBuilder str = new StringBuilder();
        startTime = System.nanoTime();
        for(int i = 0; i < 30000; i++) {
            str.append(i);
        }
        endTime = System.nanoTime();
        System.err.println(endTime - startTime);
  
    }
}

