class Student implements Cloeable
{
    public String Name;
    public int Marks;
    public int Age;

    public Student(String str,int A,int B)
    {
        this.Name = str;
        this.Marks = A;
        this.Age = B;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

class CloneDemo
{
    public static void main(String Arg[])
    {
        try
        {
        Student sobj = new Student("Amit",87,25);
        System.out.println("Name of Student :"+sobj.Name);
        System.out.println("Marks obtain by the student :"+sobj.Marks);
        System.out.println("Age of Student :"+sobj.Age);

        Student sobjx = (Student)sobj.clone();
        System.out.println("Name of Student :"+sobjx.Name);

        System.out.println("Marks obtain by the student :"+sobjx.Marks);

        System.out.println("Age of Student :"+sobjx.Age);

        }
        catch(Exception obj)
        {}
    }
}