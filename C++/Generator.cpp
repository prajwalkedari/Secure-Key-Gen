#include <iostream>
#include <ctime>

using namespace std;

int main() {
   // current date/time based on current system
   time_t now = time(0);


tm *ltm = localtime(&now);
  // print various components of tm structure.
int Month = 1 + ltm->tm_mon;
int Year= 1900 + ltm->tm_year;
int Day =  ltm->tm_mday;
int Time = ltm->tm_hour; 
int min =ltm->tm_min;
cout<<"Key:-"<<min*2<<Month*6<<Year*7<<Time*4<<Day*9<<endl;
return 0;  
}
