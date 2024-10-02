class Student
{
    int rno;
    String name;
    static int count;
    
    public Student()
    {
        count++;
    }
    
    public Student(int rno, String name)
    {
        this.rno=rno;
        this.name=name;
        count++;
    }
    
    public static int getCount()
    {
        return count;
    }
    
    public void display()
    {
        System.out.print("Roll no : "+rno);
        System.out.print("Name : "+name);
    }
}

