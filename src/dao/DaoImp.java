package dao;



public class DaoImp implements IDao {


    @Override
    public double getData() {
        /*

        Se connecter à la bd pour récoupérer la temp
         */
        System.out.println("Version BD");

        double temp = Math.random()*40;

        return temp;
    }
}
