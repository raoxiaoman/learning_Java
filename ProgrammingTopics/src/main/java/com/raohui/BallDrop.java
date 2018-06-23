

package com.raohui;

public class BallDrop {

    public static void main(String[] args) {
        int floors = 100;
        System.out.println(computeMinDropsInWorstCase1(floors)+"times");
    }
    /*
     * 假设最坏的情况，小球下落的次数为x次，也就是为了测试出临界点N,一共做了x次实验，
     * 如何确定第一次在哪一层开始扔，假设是从第y层开始扔的,
     * 1.如果小球第一次就碎掉了，就剩下一个小球，那么为了确定临界点，只能从第一层开始，第y-1层结束，一层层往上扔，哪一层碎掉，临界点就是那一层。
     * 最坏的情况进行了y-1次，所以测试次数是1+y-1=x,所以第一次测试就是要在x层。
     * 2.如果小球第一次没有碎掉，那N一定比x大，所以需要继续往上找，如何确定第二次从哪一层开始？
     * 这个情况和1是类似的，如果第一个小球的第二次碎掉了,那么第二个小球剩下次数就是x-2
     * （因为是最坏的情况,第二个球把确定第一个小球确定的范围都试了一次），
     * 所以第一个小球第一次测试的层数和第二次测试的层数中间一共x-2+1层（包含第一个小球第二次碎掉的那一层），
     * 同理：如果第一个小球第二次没有碎掉，那就有第三次，第三次和第二次之间共用x-3+1层,以此类推。
     * 最后把这些不相关包含的层加起来应该大于等于楼的总层数100
     * 即：x+(x-1)+(x-2)+...+1>=100
     * 等差数列前n项和(x+1)*x/2 >=100
     * 所以x最小等于14,也就是最坏的情况的最优解是14,
     *
     * 14, 27, 39, 50, 60, 69, 77, 84, 90, 95, 99, 100
     * 所以测试方法就是先用第一个小球在上面序列表示的层数上扔球，直到第一个小球碎掉，层数为n，然后再从序列中碎掉的层数n的前面一个层摔不破的层开始一层层往上加的扔第二个球，直到第二个球碎掉或者层数为n-1。最坏的情况也只需要14次
     * 比方说临界点是39,那次数为3+(39-27-1) = 14。
     * */

     //若floors为n,就是求二元一次方程x2+x-2n=0解的上取整。
    private static int computeMinDropsInWorstCase1(int floors) {
        int a = 1;
        int b =1;
        int c = -2*floors;
        double t = b*b - 4*a*c;

        if(t>0){
            double r1=(Math.sqrt(t)-b)*1.0/(2*a);
            //double r2=(-(Math.sqrt(t))-b)*1.0/(2*a);(b=1 大于0 r2永远是负数)
            return (int)Math.ceil(r1);
        }else{
            return -1;
        }
    }
}
