interface XYZ
{
    void show();
}

class ABC implements XYZ
{
   public void show()
   {
        System.out.println("in show");
    }
    public static void main(String args[]){
        XYZ xyz = new ABC();
        xyz.show();
    }
}