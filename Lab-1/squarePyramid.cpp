#include<iostream>
using namespace std;

class squarePyramid
{
private:
   float bas, ht; 
public:
    squarePyramid( float base, float height){ // constructor
        bas = base;
        ht = height;
    };
    
    double calculateVolume()
    {
        return (0.333333)*bas*bas*ht; //return volume of pyramid
    };
};
int main(){
    squarePyramid sp(6.5,12.5);
    cout<<"Volume is: "<<sp.calculateVolume()<<endl;    
}



