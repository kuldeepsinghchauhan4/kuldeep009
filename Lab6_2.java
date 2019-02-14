class ExceptionHandler extends Exception{
    ExceptionHandler(String s){
        super(s);
    }
}




class Person{
    int age;
   /* Person(int age){
        this.age=age;
    }*/
    void verify(int age) throws ExceptionHandler{
        if(age<15){
            throw new ExceptionHandler("not valid");
        }
        else{
            System.out.println("valid age");
        }
    }
}







class Lab6_2{
    public static void main(String args[]){
       Person p=new Person();
       try{
       p.verify(16);    
       }catch(Exception e){
           System.out.println("exception has been handled");
           
       }
       System.out.println("normal execution");
       
    }
    
}