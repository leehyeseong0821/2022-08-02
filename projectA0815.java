package projectA08;

public class projectA0815 {
       static Object[] makeObj() {
    	   Object[] obj=new Object[5];
    	   
    	   
    	   obj[0]=10;
    	   obj[1]=3.14;
    	   obj[2]="java";
    	   obj[3]="1000";
    	   obj[4]=new String("pro");
    	   
    	   return obj;
       }
	public static void main(String[] args) {
		 Object[]obj=makeObj();
		 int intValue=(int)obj[0];
		 System.out.println(intValue+" ");
		 double doubleValue=(double)obj[1];
		 System.out.println(doubleValue+" ");
		 String str=(String)obj[2];
		 System.out.println(str+" ");
		 String v1=(String)obj[3];
		 System.out.println(v1+" ");
		 String s=(String)obj[4];
		 System.out.println(s+" ");

	}

}
