class StringBufferExample1
{
  public static void main(String args[])
  {
    StringBuffer sb = new StringBuffer("abcdefghijk");
    sb.delete(3,7);
    System.out.println(sb);
  }
}
