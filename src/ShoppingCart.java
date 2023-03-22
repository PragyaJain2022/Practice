import java.util.HashMap;

class Pair{
    int type;
    int amount;

    public Pair(int x,int y){
        this.type=x;
        this.amount=y;
    }
}

public class ShoppingCart {

    public static void main(String[] args){
        String[][] products=
                new String[][]{{"10", "d0", "d1"}, {"15", "EMPTY", "EMPTY"}, {"20", "d1", "EMPTY"}};
        String[][] discount=
                new String[][]{{"d0","1","27"},{"d1","2","5"}};

        int ans=findLowestPrice(products,discount);
        System.out.print(ans);

    }

    public static int findLowestPrice(String[][] products,String[][] discount){
        HashMap<String,Pair> map=new HashMap<String,Pair>();

        for(int i=0;i<discount.length;i++){
            map.put(discount[i][0],new Pair(Integer.parseInt(discount[i][1]),Integer.parseInt(discount[i][2])));
        }
        int total=0;
        for(int i=0;i<products.length;i++){
            total+=getMinPrice(products,map);
        }
        return total;
    }

    public static int getMinPrice(String[][] products, HashMap<String,Pair> map){
        int mrp=Integer.parseInt(products[0][0]);
        int min_price=mrp;

    }
}
