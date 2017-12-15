package homework;

import com.lanou3g.exception.LoginException;
import com.lanou3g.exception.RegisterException;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    private  static final int REGISTER_CODE = 1;
    private  static final int LOGIN_CODE = 2;
    public static void main(String[] args) {
        new UserData();
        UserInter userInter = null;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1.登录\t\t2.注册");

            int key = scanner.nextInt();
            scanner.nextLine();
            if (key == 1) {
                System.out.println("请输入用户名");
                String userName = scanner.nextLine();
                System.out.println("请输入密码");
                String password = scanner.nextLine();
                try {
                    userInter = UserOperate.Login(userName,password);
                } catch (LoginException e) {
                    System.err.println(e.getMessage());
                    continue;
                }
                break;
            }else if(key == 2){
                Person person = new Person();

                System.out.println("请输入你的大名:");
                person.setName(scanner.nextLine());
                System.out.println("请输入你的用户名");
                person.setUserName(scanner.nextLine());
                System.out.println("请输入登录密码");
                person.setPassword(scanner.nextLine());
                choose(person);

                try {
                    UserOperate.register(person);
                } catch (RegisterException e) {
                    System.err.println(e.getMessage());
                    continue;
                }
                // System.out.println(UserData.getList().size());
            }
            else{
                System.out.println("输入错误,请重新输入!");
            }
        }
        if(userInter != null){
            Person person = (Person)userInter;
            person.show();
            long l = System.currentTimeMillis();
            SimpleDateFormat dFormat  = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            String time = dFormat.format(l);
            System.out.println("当前系统时间:" + time);
            System.out.println("是否开始工作:\t\t1.工作\t\t2.下班");
            int key = scanner.nextInt();
            switch (key){
                case REGISTER_CODE:
                    userInter.onLine();
                    break;
                case LOGIN_CODE:
                    userInter.offLine();
                    break;
                default:
                    break;
            }
        }
    }
    public static void choose(Person person){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择您的职业");
        System.out.println("1.Worker\t2.Doctor\t3.Cooker\t4.Boss");
        int por = scanner.nextInt();
        switch (por){
            case 1:
                person.setProfession("Worker");
                break;
            case 2:
                person.setProfession("Doctor");
                break;
            case 3:
                person.setProfession("Cooker");
                break;
            case 4:
                person.setProfession("Boss");
                break;
            default:
                System.out.println("错误,请重新输入");
                choose(person);
                break;
        }
    }
}
