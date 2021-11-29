import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class CarRentalView extends JFrame implements ActionListener {

   String baseFont = "Arial";
   private final Container container;
   private final JLabel daysRented;
   private final JTextField itsDaysRented;
   private final JLabel baseCost;
   private static final double PRICE_PER_DAY = 30.00;
   private String vehicleType, feature, name, cardNumber, rentDay, returnDate;
   private int daysrented;
   private double rentingCost;
   // variables to hold ranges of random numbers
   private static double a = 0.0, b = (1.0 / 10.0), c = 2 * b, d = 3 * b, f = 4 * b, g = 5 * b, h = 6 * b, i = 7 * b,
         j = 8 * b, k = 9 * b, l = 10 * b;
   private final JTextField itsBaseCost;
   private final JLabel custName;
   private final JTextField itsname;
   private final JLabel creditCard;
   private final JTextField itsCreditCard;
   private final JLabel startingPeriod;
   private final JComboBox itsStartMonth;
   private static final String[] months = { "January", "February", "March", "April", "May", "June", "July", "August",
         "September", "October", "November", "December" };
   private final JComboBox itsStartDay;
   private static final String[] days = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13",
         "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
   private final JComboBox itsStartHour;
   private static final String[] hours = { "7am", "8am", "9am", "10am", "11am", "noon", "1pm", "2pm", "3pm", "4pm",
         "5pm" };
   private final JLabel endingPeriod;
   private final JComboBox itsEndMonth;
   private final JComboBox itsEndDay;
   private final JComboBox itsEndHour;
   private final JLabel check;
   private final JCheckBox itsManual;
   private final JCheckBox itsAir;
   private final JCheckBox itsCD;
   private final JLabel choose;
   private final ButtonGroup chooser;
   private final JRadioButton compact;
   private final JRadioButton full_size;
   private final JRadioButton luxury;
   private final JRadioButton SUV;
   private final JButton submit;
   private final JButton reset;
   private final JTextArea output;
   private final JPanel displayCar;

   // constructor
   public CarRentalView() {
      setTitle("Car Rentals");
      setBounds(200, 90, 1040, 600);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setResizable(false);

      container = getContentPane();
      container.setLayout(null);


      daysRented = new JLabel("Enter days rented: ");
      daysRented.setFont(new Font(baseFont, Font.PLAIN, 15));
      daysRented.setSize(200, 20);
      daysRented.setLocation(100, 100);
      container.add(daysRented);

      itsDaysRented = new JTextField("1");
      itsDaysRented.setFont(new Font(baseFont, Font.PLAIN, 15));
      itsDaysRented.setSize(200, 20);
      itsDaysRented.setLocation(300, 100);
      container.add(itsDaysRented);

      baseCost = new JLabel("The base cost is: ");
      baseCost.setFont(new Font(baseFont, Font.PLAIN, 15));
      baseCost.setSize(200, 20);
      baseCost.setLocation(100, 140);
      container.add(baseCost);

      itsBaseCost = new JTextField("" + PRICE_PER_DAY);
      itsBaseCost.setFont(new Font(baseFont, Font.PLAIN, 15));
      itsBaseCost.setSize(200, 20);
      itsBaseCost.setLocation(300, 140);
      container.add(itsBaseCost);

      custName = new JLabel("Name: ");
      custName.setFont(new Font(baseFont, Font.PLAIN, 15));
      custName.setSize(200, 20);
      custName.setLocation(100, 180);
      container.add(custName);

      itsname = new JTextField(18);
      itsname.setFont(new Font(baseFont, Font.PLAIN, 15));
      itsname.setSize(200, 20);
      itsname.setLocation(300, 180);
      container.add(itsname);

      creditCard = new JLabel("Card Number: ");
      creditCard.setFont(new Font(baseFont, Font.PLAIN, 15));
      creditCard.setSize(200, 20);
      creditCard.setLocation(100, 220);
      container.add(creditCard);

      itsCreditCard = new JTextField(18);
      itsCreditCard.setFont(new Font(baseFont, Font.PLAIN, 15));
      itsCreditCard.setSize(200, 20);
      itsCreditCard.setLocation(300, 220);
      container.add(itsCreditCard);

      startingPeriod = new JLabel("Day the car was rented:");
      startingPeriod.setFont(new Font(baseFont, Font.PLAIN, 15));
      startingPeriod.setSize(300, 20);
      startingPeriod.setLocation(100, 260);
      container.add(startingPeriod);

      itsStartMonth = new JComboBox(months);
      itsStartMonth.setFont(new Font(baseFont, Font.PLAIN, 15));
      itsStartMonth.setSize(80, 20);
      itsStartMonth.setLocation(300, 260);
      container.add(itsStartMonth);

      itsStartDay = new JComboBox(days);
      itsStartDay.setFont(new Font(baseFont, Font.PLAIN, 15));
      itsStartDay.setSize(50, 20);
      itsStartDay.setLocation(380, 260);
      container.add(itsStartDay);

      itsStartHour = new JComboBox(hours);
      itsStartHour.setFont(new Font(baseFont, Font.PLAIN, 15));
      itsStartHour.setSize(70, 20);
      itsStartHour.setLocation(430, 260);
      container.add(itsStartHour);

      endingPeriod = new JLabel("Date of Return:");
      endingPeriod.setFont(new Font(baseFont, Font.PLAIN, 15));
      endingPeriod.setSize(300, 20);
      endingPeriod.setLocation(100, 300);
      container.add(endingPeriod);

      itsEndMonth = new JComboBox(months);
      itsEndMonth.setFont(new Font(baseFont, Font.PLAIN, 15));
      itsEndMonth.setSize(80, 20);
      itsEndMonth.setLocation(300, 300);
      container.add(itsEndMonth);

      itsEndDay = new JComboBox(days);
      itsEndDay.setFont(new Font(baseFont, Font.PLAIN, 15));
      itsEndDay.setSize(50, 20);
      itsEndDay.setLocation(380, 300);
      container.add(itsEndDay);

      itsEndHour = new JComboBox(hours);
      itsEndHour.setFont(new Font(baseFont, Font.PLAIN, 15));
      itsEndHour.setSize(70, 20);
      itsEndHour.setLocation(430, 300);
      container.add(itsEndHour);

      check = new JLabel("Feature: ");
      check.setFont(new Font(baseFont, Font.PLAIN, 15));
      check.setSize(100, 20);
      check.setLocation(100, 340);
      container.add(check);

      itsManual = new JCheckBox("manual", false);
      itsManual.setFont(new Font(baseFont, Font.PLAIN, 15));
      itsManual.setSize(80, 20);
      itsManual.setLocation(250, 340);
      container.add(itsManual);

      itsAir = new JCheckBox("Air cond", true);
      itsAir.setFont(new Font(baseFont, Font.PLAIN, 15));
      itsAir.setSize(80, 20);
      itsAir.setLocation(330, 340);
      container.add(itsAir);

      itsCD = new JCheckBox("CD Player", true);
      itsCD.setFont(new Font(baseFont, Font.PLAIN, 15));
      itsCD.setSize(100, 20);
      itsCD.setLocation(410, 340);
      container.add(itsCD);

      choose = new JLabel("Car Type: ");
      choose.setFont(new Font(baseFont, Font.PLAIN, 15));
      choose.setSize(95, 20);
      choose.setLocation(100, 380);
      container.add(choose);

      compact = new JRadioButton("compact", true);
      compact.setFont(new Font(baseFont, Font.PLAIN, 15));
      compact.setSize(85, 20);
      compact.setLocation(195, 380);
      container.add(compact);

      full_size = new JRadioButton("Full Size", false);
      full_size.setFont(new Font(baseFont, Font.PLAIN, 15));
      full_size.setSize(90, 20);
      full_size.setLocation(280, 380);
      container.add(full_size);

      luxury = new JRadioButton("Luxury", false);
      luxury.setFont(new Font(baseFont, Font.PLAIN, 15));
      luxury.setSize(70, 20);
      luxury.setLocation(370, 380);
      container.add(luxury);

      SUV = new JRadioButton("SUV", false);
      SUV.setFont(new Font(baseFont, Font.PLAIN, 15));
      SUV.setSize(60, 20);
      SUV.setLocation(440, 380);
      container.add(SUV);

      chooser = new ButtonGroup();
      chooser.add(compact);
      chooser.add(full_size);
      chooser.add(luxury);
      chooser.add(SUV);

      submit = new JButton("Submit");
      submit.setFont(new Font(baseFont, Font.BOLD, 15));
      submit.setSize(100, 25);
      submit.setLocation(150, 420);
      submit.addActionListener(this);
      container.add(submit);

      reset = new JButton("Reset");
      reset.setFont(new Font(baseFont, Font.BOLD, 15));
      reset.setSize(100, 25);
      reset.setLocation(270, 420);
      reset.addActionListener(this);
      container.add(reset);

      output = new JTextArea();
      output.setFont(new Font(baseFont, Font.PLAIN, 15));
      output.setSize(450, 160);
      output.setLocation(540, 100);
      output.setLineWrap(true);
      output.setEditable(false);
      container.add(output);

      displayCar = new JPanel();
      displayCar.setSize(450, 185);
      displayCar.setLocation(540, 260);
      output.setLineWrap(true);
      output.setEditable(false);
      displayCar.setBackground(Color.white);
      container.add(displayCar);

      setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == submit) {
         Graphics clear = displayCar.getGraphics();
         clear.setColor(Color.white);
         clear.fillRect(0, 0, 450, 185);
        
         feature = "Additional Features:\t:";
         if (itsManual.isSelected()) {
            feature += " Manual";
         }
         if (itsAir.isSelected()) {
            feature += " Air Cond ";
         }
         if (itsCD.isSelected()) {
            feature += " CD Player \n";
         }
         /*
         *   Random Color pick and car display
         */
         Graphics graphic = displayCar.getGraphics();
         double Picker = Math.random();
         if ((Picker >= a) && (Picker < b)) {
            graphic.setColor(Color.red);
         } else if ((Picker >= b) && (Picker < c)) {
            graphic.setColor(Color.black);
         } else if ((Picker >= c) && (Picker < d)) {
            graphic.setColor(Color.blue);
         } else if ((Picker >= d) && (Picker < f)) {
            graphic.setColor(Color.cyan);
         } else if ((Picker >= f) && (Picker < g)) {
            graphic.setColor(Color.orange);
         } else if ((Picker >= g) && (Picker < h)) {
            graphic.setColor(Color.pink);
         } else if ((Picker >= h) && (Picker < i)) {
            graphic.setColor(Color.darkGray);
         } else if ((Picker >= i) && (Picker < j)) {
            graphic.setColor(Color.magenta);
         } else if ((Picker >= j) && (Picker < k)) {
            graphic.setColor(Color.lightGray);
         } else if ((Picker >= k) && (Picker < l)) {
            graphic.setColor(Color.yellow);
         }

         if (compact.isSelected()) {
            vehicleType = "Vehicle Type:\t\t: Compact \n";
            graphic.fillRect(125, 80, 200, 30);
            graphic.drawLine(200, 50, 280, 50);
            graphic.drawLine(200, 50, 170, 80);
            graphic.drawLine(280, 50, 300, 80);
            graphic.drawLine(245, 50, 245, 80);
            graphic.setColor(Color.red);
            graphic.setColor(Color.white);
            graphic.fillOval(145, 90, 35, 35);
            graphic.setColor(Color.black);
            graphic.fillOval(147, 92, 31, 31);
            graphic.setColor(Color.white);
            graphic.fillOval(260, 90, 35, 35);
            graphic.setColor(Color.black);
            graphic.fillOval(262, 92, 31, 31);

         } else if (full_size.isSelected()) {
            vehicleType = "Vehicle Type:\t\t: Full Size \n";
            graphic.fillRect(110, 80, 227, 40);
            graphic.drawLine(195, 40, 325, 40);
            graphic.drawLine(195, 40, 155, 80);
            graphic.drawLine(235, 40, 235, 80);
            graphic.drawLine(295, 40, 295, 80);
            graphic.drawLine(325, 40, 335, 80);
            graphic.fillRect(110, 110, 227, 4);
            graphic.setColor(Color.black);
            graphic.setColor(Color.white);
            graphic.fillOval(145, 95, 40, 40);
            graphic.setColor(Color.black);
            graphic.fillOval(147, 97, 36, 36);
            graphic.setColor(Color.white);
            graphic.fillOval(268, 95, 40, 40);
            graphic.setColor(Color.black);
            graphic.fillOval(270, 97, 36, 36);
         } else if (luxury.isSelected()) {
            vehicleType = "Vehicle Type:\t\t: Luxury \n";
            graphic.fillRect(75, 80, 300, 40);
            int x1[] = { 75, 170, 170 };
            int y1[] = { 80, 70, 80 };
            int n1 = 3;
            graphic.fillPolygon(x1, y1, n1);
            int x2[] = { 170, 170, 175, 240, 240 };
            int y2[] = { 70, 80, 80, 45, 40 };
            int n2 = 5;
            graphic.fillPolygon(x2, y2, n2);
            graphic.drawLine(230, 50, 230, 80);
            int x3[] = { 375, 360, 355, 340 };
            int y3[] = { 80, 50, 50, 80 };
            int n3 = 4;
            graphic.fillPolygon(x3, y3, n3);
            int x4[] = { 260, 270, 260, 250 };
            int y4[] = { 60, 60, 80, 80 };
            int n4 = 4;
            graphic.fillPolygon(x4, y4, n4);
            int x5[] = { 330, 340, 330, 320 };
            int y5[] = { 60, 60, 80, 80 };
            int n5 = 4;
            graphic.fillPolygon(x5, y5, n5);

            int x6[] = { 75, 75, 68 };
            int y6[] = { 80, 120, 120 };
            int n6 = 3;
            graphic.fillPolygon(x6, y6, n6);

            graphic.setColor(Color.lightGray);
            graphic.fillRect(68, 120, 307, 10);
            graphic.setColor(Color.white);
            graphic.fillOval(120, 90, 60, 60);
            graphic.setColor(Color.black);
            graphic.fillOval(122, 92, 56, 56);
            graphic.setColor(Color.lightGray);
            graphic.fillOval(133, 105, 30, 30);
            graphic.setColor(Color.white);
            graphic.fillOval(280, 90, 60, 60);
            graphic.setColor(Color.black);
            graphic.fillOval(282, 92, 56, 56);
            graphic.setColor(Color.lightGray);
            graphic.fillOval(293, 105, 30, 30);
         } else if (SUV.isSelected()) {
            vehicleType = "Vehicle Type:\t\t: SUV \n";
            graphic.fillRect(110, 80, 227, 40);
            graphic.drawLine(195, 40, 270, 40);
            graphic.drawLine(195, 40, 155, 80);
            graphic.drawLine(235, 40, 235, 80);
            graphic.drawLine(270, 40, 270, 80);
            graphic.setColor(Color.lightGray);
            graphic.fillRect(271, 75, 66, 5);
            graphic.setColor(Color.black);
            graphic.setColor(Color.white);
            graphic.fillOval(145, 95, 40, 40);
            graphic.setColor(Color.black);
            graphic.fillOval(147, 97, 36, 36);
            graphic.setColor(Color.white);
            graphic.fillOval(268, 95, 40, 40);
            graphic.setColor(Color.black);
            graphic.fillOval(270, 97, 36, 36);
         }
         name = "Customer Name:\t: " + itsname.getText() + "\n";
         cardNumber = "Credit Card:\t\t: " + itsCreditCard.getText() + "\n";
         daysrented = Integer.parseInt(itsDaysRented.getText());
         // calculating renting cost for the given days
         rentingCost = (double) daysrented * PRICE_PER_DAY;
         rentDay = "Starting Date:\t\t: " + (String) itsStartMonth.getSelectedItem() + "/"
               + (String) itsStartDay.getSelectedItem() + " at " + (String) itsStartHour.getSelectedItem() + ".\n";
         returnDate = "Final Date:\t\t: " + (String) itsEndMonth.getSelectedItem() + "/"
               + (String) itsEndDay.getSelectedItem() + " at " + (String) itsEndHour.getSelectedItem() + ".\n";
         output.setText(
               name + cardNumber + vehicleType + feature + rentDay + returnDate + "Renting Cost:\t\t: "
                     + rentingCost + "\n\n" + "VEHICLE IMAGE: \n");
         output.setEditable(false);
      }
      // reseting buttton
      else if (e.getSource() == reset) {
         String def = "";
         itsname.setText(def);
         itsCreditCard.setText(def);
         output.setText(def);
         itsStartMonth.setSelectedIndex(0);
         itsStartDay.setSelectedIndex(0);
         itsStartHour.setSelectedIndex(0);
         itsEndMonth.setSelectedIndex(0);
         itsEndDay.setSelectedIndex(0);
         itsEndHour.setSelectedIndex(0);
         // a graphic "clear" to reset the previous car
         Graphics res = displayCar.getGraphics();
         res.setColor(Color.white);
         res.fillRect(0, 0, 450, 185);
      }
   }
}

// Driver Code with the main method.
class Registration {

   public static void main(String[] args) throws Exception {
      CarRentalView rent = new CarRentalView();

   }
}