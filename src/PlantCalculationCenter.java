import javax.swing.*;

public enum PlantCalculationCenter implements PlantNutriNeed{

    CACTUS{
        //polymorfism på varje @override
        @Override
        public void fetchNeed(double height) {
            double mineralVattenPerDag=0.02;
            String dayInput=JOptionPane.showInputDialog("Hur många dagar ska plantan stanna på boendet?");
            try{
            int days=Integer.parseInt(dayInput);
                JOptionPane.showMessageDialog(null, "Denna kaktus behöver " +mineralVattenPerDag+" cl "+
                        "mineralvatten per dag, totalt "+String.format("%.2f", (mineralVattenPerDag*days))+" liter mineralvatten under sin vistelse på "+ days + " dagar");}
            catch(NumberFormatException e){
                System.out.println("ej giltlig input");
            }

        }

        @Override
        public void fetchNeed() {
            double mineralVattenPerDag=0.2;
            String dayInput=JOptionPane.showInputDialog("Hur många dagar ska plantan stanna på boendet?");
            try{
                int days=Integer.parseInt(dayInput);
                JOptionPane.showMessageDialog(null, "Denna kaktus behöver " +mineralVattenPerDag+" liter "+
                        "mineralvatten per dag, totalt "+String.format("%.2f", (mineralVattenPerDag*days))+" liter mineralvatten under sin vistelse på "+ days + " dagar");}
            catch(NumberFormatException e){
                System.out.println("ej giltlig input");
            }
        }
    }
    ,
    PALM{
        @Override
        public void fetchNeed(double height) {
            double kranVattenPerDag=0.5;
            height=height/100;
            String dayInput=JOptionPane.showInputDialog("Hur många dagar ska plantan stanna på boendet?");
            try{
                int days=Integer.parseInt(dayInput);
                JOptionPane.showMessageDialog(null, "Denna palm behöver " +(kranVattenPerDag*height)+" liter "+
                        "kranvatten per dag, totalt "+String.format("%.2f", ((kranVattenPerDag*height)*days))+" liter kranvatten under sin vistelse på "+ days + " dagar");}
            catch(NumberFormatException e){
                System.out.println("ej giltlig input");
            }

        }

        @Override
        public void fetchNeed() {
            double kranVattenPerDag=0.5;
            double height=getHeight();
            String dayInput=JOptionPane.showInputDialog("Hur många dagar ska plantan stanna på boendet?");
            try{
                int days=Integer.parseInt(dayInput);
                JOptionPane.showMessageDialog(null, "Denna palm behöver " +(kranVattenPerDag*height)+" liter "+
                        "kranvatten per dag, totalt "+String.format("%.2f", ((kranVattenPerDag*height)*days))+" liter kranvatten under sin vistelse på "+ days + " dagar");}
            catch(NumberFormatException e){
                System.out.println("ej giltlig input");
            }
        }
    }
    ,
    CARNIVOROUS{
        @Override
        public void fetchNeed(double height) {
            height=height/100;
            double proteinDryckPerDag=0.1;
            double proteinPerHeight=0.2;
            String dayInput=JOptionPane.showInputDialog("Hur många dagar ska plantan stanna på boendet?");
            try{
                int days=Integer.parseInt(dayInput);
                JOptionPane.showMessageDialog(null, "Denna köttätande växt behöver " +(proteinDryckPerDag+(proteinPerHeight*height))+" liter "+
                        "proteindryck per dag, totalt "+String.format("%.2f", (proteinDryckPerDag+(proteinPerHeight*height)*days))+" liter proteindryck under sin vistelse på "+ days + " dagar");}
            catch(NumberFormatException e){
                System.out.println("ej giltlig input");
            }

        }

        @Override
        public void fetchNeed() {
            double height=getHeight();
            double proteinDryckPerDag=0.1;
            double proteinPerHeight=0.2;
            String dayInput=JOptionPane.showInputDialog("Hur många dagar ska plantan stanna på boendet?");
            try{
                int days=Integer.parseInt(dayInput);
                JOptionPane.showMessageDialog(null, "Denna köttätande växt behöver " +(proteinDryckPerDag+(proteinPerHeight*height))+" liter "+
                        "proteindryck per dag, totalt "+String.format("%.2f", (proteinDryckPerDag+(proteinPerHeight*height)*days))+" liter proteindryck under sin vistelse på "+ days + " dagar");}
            catch(NumberFormatException e){
                System.out.println("ej giltlig input");
            }
        }
    };
    public double getHeight(){
        String height = JOptionPane.showInputDialog("Ange höjd på plantan i centimeter: ");
        double heightToDouble;
        try {
            heightToDouble = Double.parseDouble(height);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Du har inte angivit en giltlig höjd");
            throw new RuntimeException(e);
        }
        heightToDouble=heightToDouble/100;
        return heightToDouble;
    }
}
