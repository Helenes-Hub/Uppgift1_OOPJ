import javax.swing.*;

public class Plants {
    //alla plantor ärver denna klass
    //inkapsling
    private double height;

    public Plants(){};

    public Plants(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = height;
        }
        else {
            System.out.println("Du har inte angivit en giltlig höjd för plantan");
        }
    }
}
