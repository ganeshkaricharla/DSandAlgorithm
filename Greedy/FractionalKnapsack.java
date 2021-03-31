import java.util.*;
class Item implements Comparable<Item>
{
    int weight;
    int price;

    Item(int w,int p)
    {
        weight  = w;
        price = p;
    }
    public int compareTo(Item a)
    {
        return weight*a.price  - price*a.weight;
    }
}

class FractionalKnapsack
{
    static double fractionalKnapsack(Item[] arr,int w)
    {
        Arrays.sort(arr);
        double res = 0.0;
        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i].weight <= w)
            {
                res = res + arr[i].price;
                w = w - arr[i].weight;
            }
            else
            {
                res = res + arr[i].price*((double) w)/((double) arr[i].weight);
                break;
            }
        }
        return res;

    }
    public static void main(String[] args) {
        Item[] arr = {new Item(10,60),new Item(40,40),new Item(20,100),new Item(30,120)};
        int w = 50;
        System.out.print(fractionalKnapsack(arr,w));       
    }
}