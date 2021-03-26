import java.util.*;

class Triplet implements Comparable<Triplet>
{
    int val;
    int aPos;
    int vPos;
    Triplet(int v,int ap,int vp)
    {
        val = v;
        aPos = ap;
        vPos = vp;
    }
    public int  compareTo(Triplet t) {
        if(val <= t.val) return -1;
        else return 1;        
    }
}

class MergeSortedArrays
{
    static List<Integer> mergeArr(ArrayList<ArrayList<Integer>> arr)
    {
        List<Integer> res = new ArrayList<Integer>();
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        for(int i = 0; i < arr.size();i++)
        {
            pq.offer(new Triplet(arr.get(i).get(0),i,0));
        }

        while(!pq.isEmpty())
        {
            Triplet curr = pq.poll();
            res.add(curr.val);
            int ap = curr.aPos;
            int vp = curr.vPos;
            if(vp+1 < arr.get(ap).size())
            {
                pq.offer(new Triplet(arr.get(ap).get(vp+1),ap,vp+1));
            }
        }
        return res;
    }
    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> a1 = new ArrayList<Integer>();

        a1.add(10);
        a1.add(20);
        a1.add(30);
        arr.add(a1);

        ArrayList<Integer> a2 = new ArrayList<Integer>();

        a2.add(5);
        a2.add(15);
        arr.add(a2);
        
        ArrayList<Integer> a3 = new ArrayList<Integer>();

        a3.add(1);
        a3.add(9);
        a3.add(11);
        a3.add(18);
        arr.add(a3);

        List<Integer> res = mergeArr(arr);

        for(int i : res)
        {
            System.out.print(i + " ");
        }
    }
}