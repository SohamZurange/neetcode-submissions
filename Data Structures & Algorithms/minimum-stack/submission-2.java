    class MinStack {
        private Stack<Integer> mainStack;
        private PriorityQueue<Integer> pq;

        public MinStack() {
            mainStack = new Stack<Integer>();
            pq = new PriorityQueue<>();
        }

        public void push(int val) {
            mainStack.push(val);
            pq.add(val);
        }

        public void pop() {
            int val =mainStack.pop();
            pq.remove(val);
        }

        public int top() {
            return mainStack.peek();
        }

        public int getMin() {
            return pq.isEmpty()? -1 : pq.peek();
        }
    }