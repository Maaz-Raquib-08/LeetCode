class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list=new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        int n=list.size();
        int arr[]=new int[n];
        Stack <Integer> s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=list.get(i)){
                s.pop();
            }
            if(s.isEmpty()){
                arr[i]=0;  
            }else{
                arr[i]=s.peek();
            }
            s.push(list.get(i));
        }
        return arr;
    }
}