//Hospital Management System
import java.io.*;
import java.util.*;

class common {   
  public static void clearScreen() { //used for clearing screen
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
}
// patient class
class patient extends common {
  String pname, sex, disease, pnum;
  int age;

  void new_patient() {  //entering new patient info
    Scanner input = new Scanner(System.in);
    try {
      clearScreen();
      PrintWriter mywriter = new PrintWriter(new BufferedWriter(new FileWriter("patient.txt", true)));
      System.out.println("--------------------------------------------------------------------------------");
      System.out.println("\t\tTell your details");
      System.out.println("--------------------------------------------------------------------------------");
      System.out.print("name:-");
      pname = input.nextLine();
      mywriter.write(pname);
      mywriter.write("\t\t");
      System.out.print("disease:-");
      disease = input.nextLine();
      mywriter.write(disease);
      mywriter.write("\t\t");
      System.out.print("sex:-");
      sex = input.nextLine();
      mywriter.write(sex);
      mywriter.write("\t\t");
      System.out.print("phone number:-");
      pnum = input.nextLine();
      mywriter.write(pnum);
      mywriter.write("\t\t");
      System.out.print("age:- ");
      age = input.nextInt();
      mywriter.write(Integer.toString(age));
      mywriter.write("\n");
      mywriter.close();
    } catch (Exception e) {
      System.out.println("File error");
    }
    clearScreen();
    input.close();

  }

  void patient_info() {  //show patient info
    System.out.println("\n\n\n\t\tPatient's Details\n");
    System.out.println("Name: " + pname + " \t Disease: " + disease + "\t   Sex: " + sex + "\nPhone number: " + pnum
        + "  \t Age: " + age + "\n\n");

  }

  void patient_list() {  //read data from file and show all the
    try {                //patients info present in the file
      clearScreen();
      File myObj = new File("patient.txt");
      Scanner myreader = new Scanner(myObj);
      System.out.println("\n\nName\t disease\t\t\tsex \tphone number\t\tage");
      while (myreader.hasNextLine()) {
        String data = myreader.nextLine();
        System.out.println(data + "\n");

      }
      myreader.close();
    } catch (Exception e3) {
      System.out.println("File error");
    }

  }
}

class doctor extends common {   //doctor class
  String did, dname, specilist, appoint, doc_qual;
  int droom;

  void new_doctor() {    //enter doctor details
    Scanner input = new Scanner(System.in);
    try {
      clearScreen();
      PrintWriter mywriter = new PrintWriter(new BufferedWriter(new FileWriter("doctor.txt", true)));
      System.out.print("id: ");
      did = input.nextLine();
      mywriter.write(did);
      mywriter.write("\t\t");
      System.out.print("name: ");
      dname = input.nextLine();
      mywriter.write(dname);
      mywriter.write("\t");
      System.out.print("specilization: ");
      specilist = input.nextLine();
      mywriter.write(specilist);
      mywriter.write("\t\t");
      System.out.print("work time(hour-hour eg 7-9): ");
      appoint = input.nextLine();
      mywriter.write(appoint);
      mywriter.write("\t");
      System.out.print("qualification: ");
      doc_qual = input.nextLine();
      mywriter.write(doc_qual);
      mywriter.write("\t\t\t");
      System.out.print("room no.: ");
      droom = input.nextInt();
      mywriter.write(Integer.toString(droom));
      mywriter.write("\n");
      mywriter.close();
    } catch (Exception e1) {
      System.out.println("File error");
    }
    clearScreen();
    input.close();
  }

void doctor_info() {    //show doctor info
    System.out.println("\n\n\n\t\tDoctor's Details\n");
    System.out.println("Id:-" + did + "   \tName: " + dname + "  \tSpecilist: " + specilist + " \nWork-time(am-pm): "
        + appoint + "\tQualifications: " + doc_qual + "   \tRoom No: " + droom + "\n\n");

  }
  void doctor_list() {  //read data from the file and show data
    try {               //of all the doctor present in the list
      clearScreen();
      File myObj = new File("doctor.txt");
      Scanner myreader = new Scanner(myObj);
      System.out.println("\n\nId\t\t Name\tspecilist  work-hours  qualification room-no");
      while (myreader.hasNextLine()) {
        String data = myreader.nextLine();
        System.out.println(data + "\n");

      }
      myreader.close();
    } catch (Exception e2) {
      System.out.println("File error");
    }

  }

  
}

class Facility extends common {   //facility class
  String facility;
  int lab_cost;

  void new_faci() {   //enter facility info
    Scanner input = new Scanner(System.in);
    try {
      clearScreen();
      PrintWriter mywriter = new PrintWriter(new BufferedWriter(new FileWriter("lab.txt", true)));
      System.out.print("facility: ");
      facility = input.nextLine();
      mywriter.write(facility);
      mywriter.write("\t\t\t");
      System.out.print("cost: ");
      lab_cost = input.nextInt();
      mywriter.write(Integer.toString(lab_cost));
      mywriter.write("\n");
      mywriter.close();
    } catch (Exception e4) {
      System.out.println("File error");

    }

    clearScreen();
    input.close();
  }

  void faci_info() {   //show facility info
    System.out.println("\n\n\n\t\tFacility's Details\n");
    System.out.println("facility: " + facility + "\tlab cost: " + lab_cost + "\n\n");
  }

  void faci_list() {   //read data from the file and show the
    try {              //details of all facilites in the file
      clearScreen();
      File myObj = new File("lab.txt");
      Scanner myreader = new Scanner(myObj);
      System.out.println("\n\nLab Name\t  lab cost");
      while (myreader.hasNextLine()) {
        String data = myreader.nextLine();
        System.out.println(data + "\n");
      }
      myreader.close();
    } catch (Exception e5) {
      System.out.println("File error");
    }

  }
}

class Staff extends common {   //staff class
  String sname, sex, designation, snum, department;
  int age;

  void new_staff() {  //enter staff details
    Scanner input = new Scanner(System.in);
    try {
      PrintWriter mywriter = new PrintWriter(new BufferedWriter(new FileWriter("staff.txt", true)));
      clearScreen();
      System.out.println("--------------------------------------------------------------------------------");
      System.out.println("\t\tTell your details");
      System.out.println("--------------------------------------------------------------------------------");
      System.out.print("name:-");
      sname = input.nextLine();
      mywriter.write(sname);
      mywriter.write("\t");
      System.out.print("sex:-");
      sex = input.nextLine();
      mywriter.write(sex);
      mywriter.write("\t\t");
      System.out.print("designation:-");
      designation = input.nextLine();
      mywriter.write(designation);
      mywriter.write("\t\t");
      System.out.print("department:-");
      department = input.nextLine();
      mywriter.write(department);
      mywriter.write("\t\t");
      System.out.print("phone number:-");
      snum = input.nextLine();
      mywriter.write(snum);
      mywriter.write("\t\t");
      System.out.print("age:- ");
      age = input.nextInt();
      mywriter.write(Integer.toString(age));
      mywriter.write("\n");

      mywriter.close();
    } catch (Exception e) {
      System.out.println("File error");
    }
    clearScreen();
    input.close();

  }

  void staff_info() {  //show staff details
    System.out.println("\n\n\n\t\tStaff's Details\n");
    System.out.println("Name: " + sname + "  \t Age: " + age + "\t   Sex: " + sex + " \t Designation: " + designation
        + "\nDepartment: " + department + "\tPhone number: " + snum + "\n\n");

  }

  void staff_list() {  //read data from file and show data of all
    try {              // staff present in the file
      File myObj = new File("staff.txt");
      Scanner myreader = new Scanner(myObj);
      System.out.println("Name\tsex \tdesignation\tdepartment\tPhone number\tage\n");
      while (myreader.hasNextLine()) {
        String data = myreader.nextLine();
        System.out.println(data + "\n");

      }
      myreader.close();
    } catch (Exception e3) {
      System.out.println("File error");
    }

  }
}

class Guidance extends common {  //guidance class
  void medical_guide() {  
    Scanner input = new Scanner(System.in);
    System.out.println(
        "Here we provide medical guidance for day to day common disease. What precaution we should take or what medicine we take for these disease.\nBut don't take any illness lighlty many common disease are signs of many harmful disease ,so its good to take a medical checkup.\n\n\tPlease select disease for which you want information");
    System.out.println("1. Fever\n2. Cough\n3. Cold\n4. Stomach pain\n5. Head ache\n6. Body pain\n");
    int choice = input.nextInt();
    clearScreen();
    switch (choice) {
    case 1:
      System.out.println("\n\n\t\t\t'FEVER'\n");
      System.out.println(
          "Tablets:  paracetamol,Dolo 650,Crocin 500mg\nPrecaution/DO's:  Sponging wipe whole body with warm water, Try to keep your surroundings at high temperature, Take enough rest");
      break;
    case 2:
      System.out.println("\n\n\t\t\t'COUGH'\n");
      System.out.println(
          "Tablets: dextromethorphan and guaifenesin\nPrecaution/Do's:  Try to take hot water and Avoid oil foods and sweets");
      break;
    case 3:
      System.out.println("\n\n\t\t\t'COLD'\n");
      System.out.println(
          "Tablets: diphenhydramine ,pseudoephedrine\nPrecaution/Do's: Take steam inhalatiion and Take enough rest\n");
      break;
    case 4:
      System.out.println("\n\n\t\t\t'STOMACH PAIN'\n");
      System.out.println(
          "Tablets: Meftal spasm,spasmoproxyvon\nPrecaution and Do's:  Don't over eat,Take more fluids,Take enough rest");
      break;
    case 5:
      System.out.println("\n\n\t\t\t'HEADACHE'\n");
      System.out.println(
          "Tablets: ibuprofen,acetaminophen\nPrecaution and Do's:  Manage your stress,Take plenty of water, Take enough rest");
      break;
    case 6:
      System.out.println("\n\n\t\t\t'BODY PAIN'\n");
      System.out.println(
          "Tablets: paracetamol 650mg,Diclofenac\nPrecaution and Do's :  Apply ice to the affected area,Gently try to stretch the muscles,Take enough rest");
      break;
    default:
      System.out
          .println("!!!!!! This disease is not in our list!!!\nGo to hospital or Try entering disease from the list");
    }
    input.close();
  }
}

class Main {
  public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public static void main(String[] args) {
    clearScreen();
    patient pat = new patient();
    doctor doc = new doctor();
    Facility fac = new Facility();
    Staff stf = new Staff();
    Guidance guide = new Guidance();
    Scanner input = new Scanner(System.in);
    try {
      int choice, ch;

      clearScreen();
      System.out.println("\n\n\t\tSelect what service you want to use\n");
      System.out.println("1. Patient\n2. Docter\n3. Facility\n4. Staff\n5. Medical Guidance\n6. Exit");
      choice = input.nextInt();
      clearScreen();
      switch (choice) {
      case 1:
        System.out.println("Welcome to Patient Section\n");
        System.out.println("**************************************************************************************");
        System.out.println("\n\n\t\tSelect what service you want to use\n");
        System.out.println("1. Patient entry\n2. Patient list");
        ch = input.nextInt();
        switch (ch) {
        case 1:
          pat.new_patient();
          pat.patient_info();
          break;
        case 2:
          pat.patient_list();
          break;
        }
        break;
      case 2:
        System.out.println("Welcome to Doctor Section\n");
        System.out.println("**************************************************************************************");
        System.out.println("\n\n\t\tSelect what service you want to use\n");
        System.out.println("1. Doctor entry\n2. Doctors list");
        ch = input.nextInt();
        switch (ch) {
        case 1:
          doc.new_doctor();
          doc.doctor_info();
          break;
        case 2:
          doc.doctor_list();
          break;
        }

        break;
      case 3:
        System.out.println("Welcome to Facility section");
        System.out.println("**************************************************************************************");
        System.out.println("\n\n\t\tSelect what service you want to use\n");
        System.out.println("1. Facility entry\n2. Facility list");
        ch = input.nextInt();
        switch (ch) {
        case 1:
          fac.new_faci();
          fac.faci_info();
          break;
        case 2:
          fac.faci_list();
          break;
        }
        break;
      case 4:
        System.out.println("Welcome to Staff Section\n");
        System.out.println("**************************************************************************************");
        System.out.println("\n\n\t\tSelect what service you want to use\n");
        System.out.println("1. Staff entry\n2. Staff list");
        ch = input.nextInt();
        switch (ch) {
        case 1:
          stf.new_staff();
          stf.staff_info();
          break;
        case 2:
          stf.staff_list();
          break;
        }

        break;

      case 5:
        System.out.println("Welcome to Medical Guidance Section\n");
        System.out.println("**************************************************************************************");
        guide.medical_guide();
        break;
      case 6:
        System.exit(0);
      default:
        System.out.println("!!!!!Wrong choice!!!!\n____________try again_________");
      }

    }

    catch (Exception e) {
      System.out.println("error");
    }

    input.close();
  }
}