package Placement_Training.LinkedList;
public class swapTwoNibbles {
    static int swapNibbles(int a)
    {
        return ((a & 0x0F) << 4 | (a & 0xF0) >> 4);
    }
    public static void main(String arg[])
    {
        int x = 110;
        System.out.print(swapNibbles(x));
    }
}