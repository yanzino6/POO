


class Lelula
{
    private int val;
    private Lelula next;

    public Lelula(int v, Lelula n)
    {
        this.val=v;
        this.next=n;
    }

    public Lelula getNext()
    {
        return this.next;
    }

    public void setNext(Lelula n) {
        this.next = n;
    }

    public int getVal() {
        return this.val;
    }
}
public class List {
    private Lelula prim;
    private int length;

    public List()
    {   
        this.prim=null;
        this.length=0;
    }

    public void push_front(int val)
    {
        this.prim= new Lelula(val, this.prim);
        this.length++;
    }
    
    public Integer pop_front()
    {
        if (this.prim==null) {
            return null;
        }
        int n = this.prim.getVal();
        this.prim=this.prim.getNext();
        this.length--;
        return n;
    }

    /* while (n != NULL)
    {
        printf("%d", n->value);
        n = n->next;

        if (n != NULL)
            printf(", ");
    } */


    public void print()
    {   
        Lelula c = this.prim;

        while (c!=null) {
            System.out.println(c.getVal());
            c=c.getNext();
        }
    }

}
