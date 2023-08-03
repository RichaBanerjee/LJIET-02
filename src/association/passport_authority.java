package association;
class person
{
    String name;
    int id;

    public person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
class passport extends person
{
    String person_name;

    public passport(String name, int id, String person_name) {
        super(name, id);
        this.person_name = person_name;
    }
}
public class passport_authority {
    public static void main(String args[])
    {
        passport obj=new passport("richa",11,"banerjee");
        System.out.println("name:"+obj.person_name+" passport number:"+obj.id);
    }


}
