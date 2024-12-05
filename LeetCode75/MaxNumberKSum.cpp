#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

// int maxOperations(vector<int>& nums, int k) {
//     int total = 0;
//     int length = nums.size();
//     std::sort(nums.begin(),nums.end());
//     cout << length;

//     for( int i = 0; i < 5; i++){
//         cout << i;
//         for (int j = i+1; j < 6; j++){
//             if(nums.at(i) + nums.at(j) == k){
//                 // nums.erase(j);
//                 // nums.erase(i);
//                 j=i;
//                 i--;
//             }
//             if(nums.at(i) + nums.at(j) >= k){
//                 i++;
//                 j=i+1;
//             }
//         }
//     }
//     return total;
// }

int main() {    
    std::vector<int> nums = {1,4,7,9,3};
    int k = 5;
    int total = 0;
    int length = nums.size();
    std::sort(nums.begin(),nums.end());
    cout << nums.at(2);

    // for( int i = 0; i < 5; i++){
    //     for (int j = i+1; j < 6; j++){
    //         if(true){
    //             cout << true;
    //         }
    //         // if(nums.at(i) + nums.at(j) == k){
    //             // nums.erase(j);
    //             // nums.erase(i);
    //             // j=i;
    //         //     i--;
    //         // }
    //         //if(nums.at(i) + nums.at(j) >= k){
    //         //     i++;
    //         //     j=i+1;
    //         //}
    //     cout << j;
    //     }
    //     cout << "test";
    // }
    return total;
}