public class Main{
public static void main(String[] args) {
        int[] weights = {1,3,5,7};
        int[] profits = {2,4,7,10};
        int bagWeight = 8;

        int maxProfit = napSack(bagWeight, 0, weights, profits);
        System.out.println("Maximum profit: " + maxProfit);
    }

public static int napSack(int bagweight,int selectedElement,int[]weights,int[]profits){
    if(selectedElement>=weights.length||bagweight==0){
        return 0;
    }
    int pick=0;
    if(bagweight>=weights[selectedElement]){
        pick=profits[selectedElement]+napSack(bagweight-weights[selectedElement],selectedElement+1,weights,profits);
        }
        int notpick=napSack(bagweight,selectedElement+1,weights,profits);
        return Math.max(pick,notpick);
}
}