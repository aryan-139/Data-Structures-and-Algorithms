class MyLinkedList {
    class Node
    {
        int val;
        Node next;
        
        Node(int val)
        {
            this.val=val;
            this.next=null;
        }
    }

    private Node head;
    private int size;
    public MyLinkedList() {
        
    }
    
    public int get(int index)
    {
        if(index>=size) return -1;
        Node curr=head;
        for(int i=0;i<index;i++)
        {
            curr=curr.next;
        }
        return curr.val;
        
    }
    
    public void addAtHead(int val) 
    {
        Node newNode=new Node(val);
        size++;
        if(head==null)
        {
            head=newNode;
            return;
        }
         newNode.next=head;
         head=newNode;
        
    }
    
    public void addAtTail(int val) 
    {
        Node newNode=new Node(val);
        Node curr=head;
        size++;
         if(head==null)
        {
            head=newNode;
            return;
        }
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=newNode;
    }
    
    public void addAtIndex(int index, int val) 
    {
        if (index > size) return;
        
        if(index==0)
        {
            addAtHead(val);
        }
        else
        {
            size++;
            Node newNode=new Node(val);
            Node curr=head;
         
            
                 for(int i=0;i<index-1;i++)
                 {
                  curr=curr.next;
                 }
                 newNode.next=curr.next;
                 curr.next=newNode;
                 
            
        }
        
           
    }
    
    public void deleteAtIndex(int index) 
    {
        if (index >= size) return;
        size--;
         if(index==0)
        {
            head=head.next;
        }
        else
        {
            Node curr=head;
            Node temp=null;
             for(int i=0;i<index-1;i++)
              {
                  curr=curr.next;
              }
               temp=curr.next;
               curr.next=temp.next;
        }
        
    
          
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */