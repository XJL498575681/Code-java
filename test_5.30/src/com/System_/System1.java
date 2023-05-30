package com.System_;

public class System1 {
    public static void main(String[] args) {


        System.out.println(" ri ");
        System.exit(0);
        System.out.println(" ef ");


        //arraycopy

        /*
        源数组
        @param     src   the source array.
srcPos: 从源数组的哪个索引位置开始拷贝
*param   srcPosstarting   position in the source array.
dest :目标数组，即把源数组的数据拷贝到哪个数组
@param
dest
the destination array.
destPos:把源数组的数据拷贝到目标数组的哪个索引*@param
destPosstarting position in the destination data.
length:从源数组拷贝多少个数据到目标数组
*@param
length the number of array elements to be copied.


         */
        int [] src = {1,2,3};
        int [] dest = new int[3];

        System.arraycopy(src,0,dest,0,3);


        //'currentTimeMillens:返回当前时间距离1970-1-1的毫秒数
        System.out.println(System.currentTimeMillis());





    }
}
