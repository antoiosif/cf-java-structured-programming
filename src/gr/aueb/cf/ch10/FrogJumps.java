package gr.aueb.cf.ch10;

public class FrogJumps {

    public static void main(String[] args) {
        int x = 10, y = 85, d = 30;
        System.out.println(getJumps(x, y, d));
    }

    public static int getJumps(int startPos, int endPos, int jmp) {
        int jmpPoint;
        int jmpCount = 0;

        jmpPoint = startPos;
        while (jmpPoint < endPos) {
            jmpPoint += jmp;
            jmpCount++;
        }
        return jmpCount;
    }
}
