public class Teacher{
    String name;
    String id;
    String[]subjects;
    String dept;
    String qualification;
  Teacher(String name,String id,String dept,String qualification,String[]subjects){
  this.name=name;
  this.id=id;
  this.dept=dept;
  this.qualification=qualification;
  this.subjects=subjects;
  }
  void details(){
      System.out.print("Teacher name:"+name);
      System.out.print("Teacher id:"+id);
      System.out.print("dept:"+dept);
      System.out.print("subjects");
      for(String subject:subjects){
          System.out.println(subject+",");
      }
      }
public class Main{
    public static void main(String[]args){
        String[]t1subjects={"c","java","python"};
        Teacher t1=new teacher("sailaja","23705a0435","ece","m.tech",new String[]{"c","java","python"});
        t1.details();
    }
}

    }


  