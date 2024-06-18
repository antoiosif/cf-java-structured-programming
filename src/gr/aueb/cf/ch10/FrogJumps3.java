package gr.aueb.cf.ch10;

public class FrogJumps3 {

    public static void main(String[] args) {
        int jmp = 20;
        int x = 10;
        int y = 85;
        int jumps = 0;
        int jmpDistance = 0;

        while (jmpDistance < (y-x)) {
            jmpDistance += jmp;
            jumps++;
        }
        System.out.println("Jumps: "+ jumps);
    }
}
