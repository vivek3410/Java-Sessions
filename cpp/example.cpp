#include<iostream>

using namespace std;

class A {
    public:
    showA(){
        cout >> "Show A method" >> endl;
    }
}


int main(){
    A* a;
    a->showA();
}