//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
Design a stack that supports push, pop, top, and retrieving the minimum element
in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

class MinStack {
    private List<Integer> stack;
    private int size;
    private Stack<Integer> minStack;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new ArrayList<>();
        size = 0;
        minStack = new Stack<>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(Integer x) {
        if (x == null)
            return;
        this.stack.add(x);
        this.minStack.push(Math.min(x, minStack.peek()));
        size++;
    }

    public void pop() {
        if (size <= 0)
            return;
        this.stack.remove(this.stack.size()-1);
        size--;
        minStack.pop();
    }

    public int top() {
        if (size <= 0)
            return 0;
        return this.stack.get(this.stack.size()-1);
    }

    public int getMin() {
        if (stack.size() <= 0)
            return 0;
        return minStack.peek();
    }
}

/*
    Runtime: 5 ms, faster than 72.58% of Java online submissions for Min Stack.
    Memory Usage: 40.9 MB, less than 25.37% of Java online submissions for Min Stack.
*/
