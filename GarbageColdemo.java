class Box
{
    int length;
    int breath;
    int height;
    void setDim(int l, int b, int h)
    {
    	length = l;
    	breath = b;
    	height = h;
    }
    int volume()
    {
    	return length*breath*height;
    }
}
public class GarbageColdemo
{
    public static void main(String[] args)
    {
        Box blackbox = new Box();
        blackbox.setDim(10,8,6);
        System.out.println("Vol of blackbox is "+blackbox.volume());
        blackbox = null; //Dereference 1
        
        Box woodbox = new Box();
        woodbox.length = 10;
        woodbox.breath = 20;
        woodbox.height = 5;
        int w = woodbox.volume();
        System.out.println("Vol of woodbox is "+w);
        woodbox = blackbox; //Dereference 2
    }
}
