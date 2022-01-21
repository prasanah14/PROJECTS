import java.util.*;
class admin{
    static ArrayList<String> list=new ArrayList<String>();
    static ArrayList<Integer> list1=new ArrayList<Integer>();
    static Scanner sc=new Scanner(System.in);
    static void ad1(){
        int am=0;
        boolean kpr=true;
        do{
            System.out.flush();
            System.out.println("1.Add merchant");
            System.out.println("2.Approve merchant");
            am=sc.nextInt();
            sc.nextLine();
            switch(am){
                case 1:
                //System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Enter email of merchant:");
                String merid=sc.nextLine();
                vendor.list2.add(merid);
                System.out.println("Enter Password");
                int merpass=sc.nextInt();
                sc.nextLine();
                vendor.list3.add(merpass);
                System.out.println("merchant added sucessfully!!!");
                System.out.println("Enter 0 to exit");
                int mk=sc.nextInt();
                if(mk==0){
                    kpr=false;
                }
                
                break;
                case 2:
                //System.out.print("\033[H\033[2J");
                System.out.flush();
                if(list.size()==0){
                    System.out.println("no pending list");
                }
                if(list.size()>=1){
                    for(int i=0;i<list.size();i++){
                        System.out.println(list.get(i)+" ");
                        System.out.println("enter 0 to approve or 1 to remove");
                        int trans=sc.nextInt();
                        sc.nextLine();
                        if(trans==0){
                            vendor.list2.add(list.get(i));
                            vendor.list3.add(list1.get(i));
                            System.out.println("approved sucessfully");
                        }
                        if(trans==1){

                        }
                    }
                }
                System.out.println("Enter 0 to exit");
                int am2=sc.nextInt();
                if(am2==0){
                    kpr=false;
                }
                break;
            }
        }while(kpr);
    }
}
class vendor{
    static Scanner sc=new Scanner(System.in);
    static ArrayList<String> list2=new ArrayList<String>();
    static ArrayList<Integer> list3=new ArrayList<Integer>();
    static void existing(){
        boolean kpr=true;
        int choice=0;
        do{
            //System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Select the Catogory");
            System.out.println("1.Mobiles");
            System.out.println("2.Laptops");
            System.out.println("3.Telivisions");
            System.out.println("4.exit");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                //System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Enter the no.of.mobiles to add:");
                int addm=sc.nextInt();
                sc.nextLine();
                for(int i=0;i<addm;i++){
                System.out.println("Enter the Mobile Name:");
                String mobname=sc.nextLine();
                buyer.mobile.add(mobname);
                System.out.println("Enter the Mobile processor:");
                String mobdes=sc.nextLine();
                buyer.mobiledesc.add(mobdes);
                System.out.println("Enter the Mobile price:");
                int mobpr=sc.nextInt();
                buyer.mobprice.add(mobpr);
                System.out.println("Enter the quantity:");
                int quanti=sc.nextInt();
                sc.nextLine();
                System.out.println("mobile added sucessfully");
                }
                break;
                case 2:
                //System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Enter the no.of.Laptops to add:");
                int addl=sc.nextInt();
                sc.nextLine();
                for(int i=0;i<addl;i++){
                System.out.println("Enter the Laptop Name:");
                String lapname=sc.nextLine();
                buyer.laptop.add(lapname);
                System.out.println("Enter the Laptop processor:");
                String lapdes=sc.nextLine();
                buyer.lapdesc.add(lapdes);
                System.out.println("Enter the Laptop price:");
                int lappr=sc.nextInt();
                buyer.lapprice.add(lappr);
                System.out.println("Enter the quantity:");
                int quanti=sc.nextInt();
                sc.nextLine();
                System.out.println("Laptop added sucessfully");
                }
                break;
                case 3:
                //System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Enter the no.of.Telivision to add:");
                int add2=sc.nextInt();
                sc.nextLine();
                for(int i=0;i<add2;i++){
                System.out.println("Enter the Telivision Name:");
                String tvname=sc.nextLine();
                buyer.telivision.add(tvname);
                System.out.println("Enter the Telivision processor:");
                String tvdes=sc.nextLine();
                buyer.tvdesc.add(tvdes);
                System.out.println("Enter the Telivision price:");
                int tvpr=sc.nextInt();
                buyer.tvprice.add(tvpr);
                System.out.println("Enter the quantity:");
                int quanti=sc.nextInt();
                sc.nextLine();
                System.out.println("Telivision added sucessfully");
                }
                break;
                case 4:
                kpr=false;
                break;
            }
        }while(kpr);
    }
    static void ve1(){
        int vm=0;
        boolean kpr=true;
        do{
            System.out.println("1.New User");
            System.out.println("2.Existing User");
            vm=sc.nextInt();
            sc.nextLine();
            switch(vm){
                case 1:
                //System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Enter gmail id of vendor:");
                String usegm=sc.nextLine();
                admin.list.add(usegm);
                System.out.println("Enter password of vendor:");
                int uspass=sc.nextInt();
                admin.list1.add(uspass);
                System.out.println("Enter 0 to exit");
                int vm1=sc.nextInt();
                if(vm1==0){
                    kpr=false;
                }
                break;
                case 2:
                //System.out.print("\033[H\033[2J");
                System.out.flush();
                list2.add("Suthan");
                list3.add(1234);
                System.out.println("Enter gmail id of vendor:");
                String exid=sc.nextLine();
                System.out.println("Enter password of vendor:");
                int expass=sc.nextInt();
                sc.nextLine();
                int count=0;
                for(int i=0;i<list2.size();i++){
                    if(expass==list3.get(i) && exid.equals(list2.get(i))){
                        existing();
                        count++;
                        break;

                    }

                }
                if(count==0){
                    System.out.println("approval is pending");
                }

                System.out.println("Enter 0 to exit");
                int vm2=sc.nextInt();
                if(vm2==0){
                    kpr=false;
                }
                break;
            }
        }while(kpr);
    }
}
class buyer{
    static ArrayList<String> list4=new ArrayList<String>();
    static ArrayList<Integer> list5=new ArrayList<Integer>();
    static ArrayList<String> mobile=new ArrayList<String>();
    static ArrayList<String> mobiledesc=new ArrayList<String>();
    static ArrayList<Integer> mobprice=new ArrayList<Integer>();
    static ArrayList<String> laptop=new ArrayList<String>();
    static ArrayList<String> lapdesc=new ArrayList<String>();
    static ArrayList<Integer> lapprice=new ArrayList<Integer>();
    static ArrayList<String> telivision=new ArrayList<String>();
    static ArrayList<String> tvdesc=new ArrayList<String>();
    static ArrayList<Integer> tvprice=new ArrayList<Integer>();
    static ArrayList<ArrayList<String>> cart=new ArrayList<>();
    static ArrayList<ArrayList<String>> myorder=new ArrayList<>();
    
    static Scanner sc=new Scanner(System.in);
    static void Laptops(){
        System.out.printf("%-20s %15s %25s\n","Laptop Name","processor","Lap price");
        if(laptop.size()==0){
            System.out.println("No stocks available:");
        }
        else if(laptop.size()>0){
            for(int i=0;i<laptop.size();i++){
                
                System.out.printf("%-20s %15s %25s\n",(i+1)+"."+laptop.get(i),lapdesc.get(i),lapprice.get(i));
            }
        }
    }
    static void mobiles(){
        System.out.printf("%-20s %15s %25s\n","Mobile Name","processor","price");
        if(mobile.size()==0){
            System.out.println("No stocks available:");
        }
        else if(mobile.size()>0){
            for(int i=0;i<mobile.size();i++){
                
                System.out.printf("%-20s %15s %25s\n",(i+1)+"."+mobile.get(i),mobiledesc.get(i),mobprice.get(i));
                
            }
        }

    }
    static void tvs(){
        System.out.printf("%-20s %15s %25s\n","Tv Name","Screen Size","Tv price");
        if(telivision.size()==0){
            System.out.println("No stocks available:");
        }
        else if(telivision.size()>0){
            for(int i=0;i<telivision.size();i++){
                
                System.out.printf("%-20s %15s %25s\n",(i+1)+"."+telivision.get(i),tvdesc.get(i),tvprice.get(i));
                
            }
        }
    }
    static void cartBuyer(){
        System.out.println("you entered into cart");
        for(int i=0;i<cart.size();i++){
            for(int j=0;j<2;j++){
                System.out.print((i+1)+"."+cart.get(i).get(j)+" ");
            }
            System.out.println();
        }
        System.out.println("Enter 1 to order 0 to exit:");
        int order=sc.nextInt();
        sc.nextLine();
        if(order==1){
            System.out.println("Enter name of the product:");
            String productName=sc.nextLine();
            for(int i=0;i<cart.size();i++){
                if(productName.equals(cart.get(i).get(0))){
                    System.out.println("Buyed Successfully");
                    ArrayList<String> myor=new ArrayList<String>();
                    myor.add(cart.get(i).get(0));
                    myor.add(cart.get(i).get(1));
                    myorder.add(myor);
                    System.out.println("Enter 0 to continue");
                    int exi3=sc.nextInt();
                    if(exi3==0){
                        continue;
                    }
                }
            }
        }   
    }
    static void myorders(){
        System.out.println("you entered My orders");
        if(myorder.size()==0){
            System.out.println("no orders");
        }
        else{
            for(int i=0;i<myorder.size();i++){
                for(int j=0;j<2;j++){
                    System.out.print(myorder.get(i).get(j)+" ");
                }
                System.out.println();
            }
        }
    }
    static void buyer2(){
        boolean kpr=true;
        int choice=0;
        do{
            //System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Welcome!.........");
            System.out.println("1.Enter into shopping");
            System.out.println("2.Enter into cart");
            System.out.println("3.My orders");
            System.out.println("4.exit");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                buyer1();
                break;
                case 2:
                cartBuyer();
                break;
                case 3:
                myorders();
                System.out.println("Enter 0 to continue:");
                int exi4=sc.nextInt();
                if(exi4==0){
                   continue;
                }
                break;
                case 4:
                kpr=false;
                break;
            }

        }while(kpr);

    }
    static void buyer1(){
        
        boolean kpr=true;
        int choice=0;
        do{
            //System.out.print("\033[H\033[2J");
            System.out.flush();
            
            System.out.println("Select the Catogory");
            System.out.println("1.Mobiles");
            System.out.println("2.Laptops");
            System.out.println("3.Telivisions");
            System.out.println("4.exit");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                //System.out.print("\033[H\033[2J");
                System.out.flush();
                buyer.mobiles();
                System.out.println("Enter 1 for add to cart or 0 to exit:");
                int exi=sc.nextInt();
                sc.nextLine();
                if(exi==0){
                    continue;
                }
                else if(exi==1){
                    ArrayList<String> mobile1=new ArrayList<String>();
                    System.out.println("Enter the name of the product:");
                    String cartAdd=sc.nextLine();
                    int c=0;
                    for(int i=0;i<mobile.size();i++){
                        if(cartAdd.equals(mobile.get(i))){
                            mobile1.add(mobile.get(i));
                            String mobpr=mobprice.get(i)+" ";
                            mobile1.add(mobpr);
                            cart.add(mobile1);
                            c++;
                            System.out.println("Mobile added to cart sucessfully!!!");
                        }
                    }
                    if(c==0){
                        System.out.println("Enter product name correctly!!!");
                    }
                    System.out.println("Enter 0 to continue");
                    int con=sc.nextInt();
                    if(con==0){
                        continue;
                    }
                }
                break;
                case 2:
                //System.out.print("\033[H\033[2J");
                System.out.flush();
                buyer.Laptops();
                int exi1=sc.nextInt();
                sc.nextLine();
                if(exi1==0){
                    continue;
                }
                else if(exi1==1){
                    ArrayList<String> mobile1=new ArrayList<String>();
                    System.out.println("Enter the name of the product:");
                    String cartAdd=sc.nextLine();
                    int c=0;
                    for(int i=0;i<laptop.size();i++){
                        if(cartAdd.equals(laptop.get(i))){
                            mobile1.add(laptop.get(i));
                            String mobpr=lapprice.get(i)+" ";
                            mobile1.add(mobpr);
                            cart.add(mobile1);
                            c++;
                            System.out.println("Laptop added to cart sucessfully!!!");
                        }
                    }
                    if(c==0){
                        System.out.println("Enter product name correctly!!!");
                    }
                    System.out.println("Enter 0 to continue");
                    int con=sc.nextInt();
                    if(con==0){
                        continue;
                    }
                }
                break;
                case 3:
                //System.out.print("\033[H\033[2J");
                System.out.flush();
                buyer.tvs();
                int exi2=sc.nextInt();
                sc.nextLine();
                if(exi2==0){
                    continue;
                }
                else if(exi2==1){
                    ArrayList<String> mobile1=new ArrayList<String>();
                    System.out.println("Enter the name of the product:");
                    String cartAdd=sc.nextLine();
                    int c=0;
                    for(int i=0;i<telivision.size();i++){
                        if(cartAdd.equals(telivision.get(i))){
                            mobile1.add(telivision.get(i));
                            String mobpr=tvprice.get(i)+" ";
                            mobile1.add(mobpr);
                            cart.add(mobile1);
                            c++;
                            System.out.println("tv added to cart sucessfully!!!");
                        }
                    }
                    if(c==0){
                        System.out.println("Enter product name correctly!!!");
                    }
                    System.out.println("Enter 0 to continue");
                    int con=sc.nextInt();
                    if(con==0){
                        continue;
                    }
                }

                break;
                case 4:
                kpr=false;
                break;
            }
        }while(kpr); 
    }
    static void buy(){
        
        int vm=0;
        boolean kpr=true;
        do{
            System.out.println("1.New User");
            System.out.println("2.Existing User");
            System.out.println("3.Exit");
            
            vm=sc.nextInt();
            sc.nextLine();
            
            switch(vm){
                case 1:
                //System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Enter Username of buyer:");
                String user=sc.nextLine();
                list4.add(user);
                
                
                System.out.println("Enter Password of buyer:");
                int pass=sc.nextInt();
                sc.nextLine();
                list5.add(pass);
                
                
                System.out.println("User created Sucessfully!!");
                System.out.println("Enter 0 to exit:");
                int exi=sc.nextInt();
                sc.nextLine();
                if(exi==0){
                    kpr=false;
                }
                break;
                case 2:
                //System.out.print("\033[H\033[2J");
                System.out.flush();
                list4.add("Suthan");
                list5.add(1234);
                System.out.println("Enter Username of buyer:");
                String user1=sc.nextLine();
                System.out.println("Enter Password of buyer:");
                int pass1=sc.nextInt();
                sc.nextLine();
                int count=0;
                for(int i=0;i<list4.size();i++){
                    if(pass1==list5.get(i) && user1.equals(list4.get(i))){
                        buyer2();
                        count++;
                        break;
                    }
                }
                if(count==0){
                     System.out.println("invalid username or password!!!");
                }
                
                System.out.println("Enter 0 to exit");
                int vm2=sc.nextInt();
                if(vm2==0){
                    kpr=false;
                }
                case 3:
                kpr=false;
                break;
            }
        }while(kpr);
    }
}
public class amazon{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        
        boolean kpr=true;
        int home1;
        do{
            //System.out.println("\033[H\033[2J");
            System.out.flush();
            System.out.println("1.Admin");
            System.out.println("2.Vendor");
            System.out.println("3.Buyer");
            home1=sc.nextInt();
            switch(home1){
                case 1:
                //System.out.print("\033[H\033[2J");
                System.out.flush();
                admin.ad1();
                break;
                case 2:
                //System.out.print("\033[H\033[2J");
                System.out.flush();
                vendor.ve1();
                break;
                case 3:
                //System.out.print("\033[H\033[2J");
                System.out.flush();
                buyer.buy();
                break;

            }
        }while(kpr);
    }
}
