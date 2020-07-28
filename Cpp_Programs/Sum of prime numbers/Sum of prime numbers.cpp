#include <iostream>

using namespace std;

int main() {

    int num, i, upto, sum = 0;

    
    cout << "Find sum of prime numbers upto : ";
    cin >> upto;

    for(num = 2; num <= upto; num++) {

        for(i = 2; i <= (num / 2); i++) {

            if(num % i == 0) {
                i = num;
                break;
            }
        }

        
        if(i != num) {
            sum += num;            
        }
    }

    cout << endl << "Sum of all prime numbers upto " << upto << " : " << sum;

    return 0;
}
