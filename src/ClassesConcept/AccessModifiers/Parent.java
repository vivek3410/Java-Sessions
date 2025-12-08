package ClassesConcept.AccessModifiers;

class Parent{
    private String name = "jagan";
    private String gender = "Male";

    Parent(){
        System.out.println("Constructor from parent");
    }
    
    private Parent(String name){

    }


    String getName(){
        return name;
    }

    String getGender(){
        return gender;
    }

    void setName(String name){
        this.name = name;
    }

    void setGender(String gender){
        this.gender = gender;
    }



}


