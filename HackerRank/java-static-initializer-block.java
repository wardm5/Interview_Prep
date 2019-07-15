/*
    Java Static Initializer Block
    https://www.hackerrank.com/challenges/java-static-initializer-block/problem
 */

static Scanner scan = new Scanner(System.in);
static boolean flag;
static int B = scan.nextInt();
static int H = scan.nextInt();
static
{
    if(B>0 && H>0)
        flag=true;
    else
    {
        flag=false;
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
}
