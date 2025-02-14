public class Grove {
    public String groveName;
    public Tree groveSize[];
    int spot;
    int count = 0;
    public Grove(){
        groveSize = new Tree[16];
    }
    public void grove(String groveName){
        this.groveName = groveName;
    }
    public int plant(Tree tree){
        for (int i = 0; i < groveSize.length; i++){
            if (groveSize[i] == null){
                groveSize[i] = tree;
                count = count + 1;
                return i;
            }
        }
        return -1;
    }
    public Tree remove(int spot){
        Tree tempTree = groveSize[spot];
        groveSize[spot] = null;
        count = count - 1;
        return tempTree;
    }
    public String toString(){
        return count + "";
    }
}
