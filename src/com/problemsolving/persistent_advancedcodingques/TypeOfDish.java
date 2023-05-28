package com.problemsolving.persistent_advancedcodingques;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TypeOfDish {
    public static void main(String[] args) {
        typeOf(new int[] {1,2,2,3,1,2,1,1,3,1,1});
    }

    // By Using Collections (Map)
    private static void typeOf(int[] arr) { // 1 2 2 3 1 2 1 1 3 1 1
        Map<Integer, Integer> dishCount = new HashMap<>();

        int i = 0;
        while (i < arr.length) {
            int added = ((-1) * arr[i]);
//            System.out.println(added);
            if (dishCount.containsKey(arr[i])) {
                if(arr[i-1] != ((-1) * arr[i])){
                    dishCount.put(arr[i], dishCount.get(arr[i])+1);
                    arr[i] = added;
                }
            } else {
                dishCount.put(arr[i], 1);
                arr[i] = added;
            }
            i++;
        }
//        System.out.println(dishCount);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(dishCount.get(arr[1]));

            for (Map.Entry<Integer,Integer> m : dishCount.entrySet()) {
                System.out.println("Type " + m.getKey() + " : has " + m.getValue() + " dishes available to choose");
            }
        }
    }

/* Without using Collections
#include<iostream>
using namespace std;
int main()
{
       int t,n,i,max,x;
       cin>>t;
       while(t--)
        {
             cin>>n;
             int arr[n];
             max=0;
            for(i=0;i<n;i++) {
                cin>>arr[i];
            }
             int b[1001]={0};
           for(i=0;i<n;i++)
             {
                b[arr[i]]++;
                if(arr[i]==arr[i+1])
                    i++;
             }
        for(i=1;i<=1000;i++) {
            if(b[i]>max)
            {
                max=b[i];
                x=i;
            }
        }
        cout<<x<<endl;
    }
	return 0;
}
*/