public class Exam {
    public static void main(String[] args){
        Exam exam = new Exam();
        Product product = new Product(1,1,1,0,0);
        Order order = new Order(product);
        System.out.println("Total : " + order.cal());
    }
}
