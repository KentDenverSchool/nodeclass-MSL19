import java.util.ArrayList;
//BIG thanks to sloan who's codde I basically copied
public class node {
    String data;
    ArrayList <node> pointy;

    public node(String myData, node myPointy) {
        data = myData;
        pointy = new ArrayList<node>();
        pointy.add(myPointy);

    }
    public node(String myData){
        data = myData;
        pointy = new ArrayList<node>();
    }

    public void pointMe(node n){
        pointy.add(n);
    }

    public void setData(String data) {this.data = data; }

    public String getData() { return data; }

    public node getPointer(int x){
        return pointy.get(x);
    }


}
