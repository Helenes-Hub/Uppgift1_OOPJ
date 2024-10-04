import javax.swing.*;

public class Main {
    Cactus igge = new Cactus(20);
    Palm laura = new Palm(500);
    Palm olof = new Palm(100);
    Carnivorous meatloaf = new Carnivorous(70);


    public void huvudProgram() {


        //startar meny loopen
        plantMenu();

    }

    public void plantMenu() {
        while (true) {
            String userPlantInput = JOptionPane.showInputDialog("Ange plantans namn eller plant typen");

            if(userPlantInput == null || (userPlantInput != null && ("".equals(userPlantInput))))
            {
                JOptionPane.showMessageDialog(null,"Ingen planta angiven, programmet avslutas");
                break;
            }
            else {
                userPlantInput = userPlantInput.toLowerCase();
                switch (userPlantInput) {
                    case "igge":
                        igge.fetchNeed();
                        break;
                    case "laura":
                        laura.fetchNeed();
                        break;
                    case "olof":
                        olof.fetchNeed();
                        break;
                    case "meatloaf":
                        meatloaf.fetchNeed(this.meatloaf.getHeight());
                        break;
                    case "kaktus":
                        PlantCalculationCenter.CACTUS.fetchNeed();
                        break;
                    case "palm":
                        PlantCalculationCenter.PALM.fetchNeed();
                        break;
                    case "köttätande":
                        PlantCalculationCenter.CARNIVOROUS.fetchNeed();
                        break;
                        default:
                            JOptionPane.showMessageDialog(null, "Kunde ej hitta en match i databasen");

                }

            }


            }

        }



    public static void main(String[] args) {
        Main m=new Main();
        m.huvudProgram();
    }


}