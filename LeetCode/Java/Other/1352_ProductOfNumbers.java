//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------
Problem:
1352. Product of the Last K Numbers
Medium

160

9

Add to List

Share
Implement the class ProductOfNumbers that supports two methods:

1. add(int num)

Adds the number num to the back of the current list of numbers.
2. getProduct(int k)

Returns the product of the last k numbers in the current list.
You can assume that always the current list has at least k numbers.
At any time, the product of any contiguous sequence of numbers will fit into a single 
32-bit integer without overflowing.

 

Example:

Input
["ProductOfNumbers","add","add","add","add","add","getProduct","getProduct","getProduct","add","getProduct"]
[[],[3],[0],[2],[5],[4],[2],[3],[4],[8],[2]]

Output
[null,null,null,null,null,null,20,40,0,null,32]

Explanation
ProductOfNumbers productOfNumbers = new ProductOfNumbers();
productOfNumbers.add(3);        // [3]
productOfNumbers.add(0);        // [3,0]
productOfNumbers.add(2);        // [3,0,2]
productOfNumbers.add(5);        // [3,0,2,5]
productOfNumbers.add(4);        // [3,0,2,5,4]
productOfNumbers.getProduct(2); // return 20. The product of the last 2 numbers is 5 * 4 = 20
productOfNumbers.getProduct(3); // return 40. The product of the last 3 numbers is 2 * 5 * 4 = 40
productOfNumbers.getProduct(4); // return 0. The product of the last 4 numbers is 0 * 2 * 5 * 4 = 0
productOfNumbers.add(8);        // [3,0,2,5,4,8]
productOfNumbers.getProduct(2); // return 32. The product of the last 2 numbers is 4 * 8 = 32 

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1) create array
    2) for adding, make sure you multiply each item as you add
    3) when getting, should check if the k value is greater than the list size, if so, return 0
    4) k is the size of the list, then return that last item
    5) else return the last item divided by the kth item from the start of the list
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class ProductOfNumbers {
    public List<Integer> list;
    public ProductOfNumbers() {
        list = new ArrayList<>();
    }
    
    public void add(int num) {
        // if the number is zero, then nothing before this point would matter, all would be 0
        if (num == 0)
            list.clear();
        // if the list has nothing, then just add that number
        else if (list.size() == 0)
            list.add(num);
        // otherwise, add that number times the prior number
        else 
            list.add(list.get(list.size()-1)*num);
    }
    
    public int getProduct(int k) {
        // if the input is greater than the list size, then return 0 since there is no output
        if (k > list.size()) 
            return 0;
        // if the input matches the size, return last item in the list
        if (k == list.size()) 
            return list.get(list.size()-1);
        // else return the list's last item divided by the list's kth from the start item
        return list.get(list.size()-1)/list.get(list.size()-1-k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */

/*
  Runtime: 13 ms, faster than 97.62% of Java online submissions for Product of the Last K Numbers.
  Memory Usage: 53.7 MB, less than 100.00% of Java online submissions for Product of the Last K Numbers.
*/
