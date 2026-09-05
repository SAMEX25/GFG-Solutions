class Solution {
public static int posOfRightMostDiffBit(int m, int n) {
int x = m ^ n;


    if (x == 0) {
        return -1;
    }

    int position = 1;

    while ((x & 1) == 0) {
        x = x >> 1;
        position++;
    }

    return position;
}

}

