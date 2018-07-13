import java.util.*;
import java.io.*;
class node
{
    int data;
    node next;
    node(int d)
    {
        data=d;
        next=null;
    }
}
public class linklish_search {
    public static void search(node head,int search)
    {
        node temp=head;
        while(temp!=null)
        {
            if(temp.data==search)
            {
                System.out.println(temp.data+"Found");
            }
            temp=temp.next;
        }
        //System.out.println("no element found");
    }
  public static void main(String args[])
  {
      Scanner scan=new Scanner(System.in);
      node head=null,temp=null;
      System.out.println("Nodes");
      int n=scan.nextInt();
      for(int i=0;i<n;i++)
      {
          int e=scan.nextInt();
          if(head==null)
          {
              head=new node(e);
              temp=head;

          }
          else
          {
              node sec=new node(e);
              temp.next=sec;
              temp=temp.next;

          }

      }
      System.out.println("Enter searching element");
      int element=scan.nextInt();
      search(head,element);
  }
}
