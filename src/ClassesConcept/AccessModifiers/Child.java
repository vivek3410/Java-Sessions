package ClassesConcept.AccessModifiers;

class Child extends Parent {
    private String childName = "vivek";

    void setChildName(String childName){
        this.childName = childName;
    }

    String getChildName(){
        return childName;
    }
}