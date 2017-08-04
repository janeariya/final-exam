public class Order {
    private Product product;

    public Order(Product product) {
        this.product = product;
    }

    public void printP(){
        System.out.println("Product A :" + product.getProductA()+ " Piece");
        System.out.println("Product B :" + product.getProductB()+ " Piece");
        System.out.println("Product C :" + product.getProductC()+ " Piece");
        System.out.println("Product D :" + product.getProductD()+ " Piece");
        System.out.println("Product E :" + product.getProductE()+ " Piece");
    }

    public double cal(){
        double total=0;
        while (!nullProduct()){
            int temp = numProduct();
            switch (temp){
                case 1: total = total + (1*100);
                        break;
                case 2: total = total + (2*100*0.95);
                        break;
                case 3: total = total + (3*100*0.9);
                        break;
                case 4: total = total + (4*100*0.8);
                        break;
                case 5: total = total + (5*100*0.75);
                        break;
            }
        }
        return total;
    }

    public boolean nullProduct(){
        if(product.getProductA()==0 && product.getProductB()==0 && product.getProductC()==0 && product.getProductD()==0 && product.getProductE()==0  ){
            return true;
        }
        return false;
    }

    public int numProduct(){
        int numP = 0;
        if(product.getProductA()>0) {
            numP++;
            product.setProductA(product.getProductA()-1);
        }
        if(product.getProductB()>0) {
            numP++;
            product.setProductB(product.getProductB()-1);
        }
        if(product.getProductC()>0)  {
            numP++;
            product.setProductC(product.getProductC()-1);
        }
        if(product.getProductD()>0) {
            numP++;
            product.setProductD(product.getProductD()-1);
        }
        if(product.getProductE()>0) {
            numP++;
            product.setProductE(product.getProductE()-1);
        }

        return numP;
    }
}
