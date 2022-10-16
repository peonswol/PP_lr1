package com.PPlabs.lr1;

public class LucasNumber {
    private long numPosition;
    public long getNum(int position){

        /*if (position == 0){
            return 2;
        }
        else if (position == 1){
            return 1;
        }

        numPosition = getNum(position-1)+getNum(position-2);
*/

        if (position == 1)
            return 1;
        if (position == 0)
            return 2;

        long position0 = 2, position1 = 1;

        for (int i = 2; i <= position; i++){
            numPosition = position0 + position1;
            position0 = position1;
            position1 = numPosition;
        }

        return numPosition;
    }

}
