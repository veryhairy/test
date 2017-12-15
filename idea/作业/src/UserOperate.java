import com.lanou3g.exception.*;

import java.util.HashMap;
import java.util.Map;

public class UserOperate {
    /*
    public static UserInter Login(String userName,String password) throws LoginException {
        for (int i = 0; i < UserData.getList().size(); i++) {
            Object object = UserData.getList().get(i);
            if (object instanceof Person) {
                Person person = (Person)object;
                if (userName.equals(person.getUserName()) && password.equals(person.getPassword())) {
                    System.out.println("登录成功!");
                    String name = person.getName();
                    String joob = person.getProfession();
                    switch (person.getProfession()) {
                        case "Worker":
                            return new Worker(name,userName,password,joob);
                        case "Docter":
                            return  new Doctor(name,userName,password,joob);
                        case "Cooker":
                            return new Cooker(name,userName,password,joob);
                        case "Boss":
                            return new Boss(name,userName,password,joob);
                        default:
                            break;
                    }

                }
                else if (userName.equals(person.getUserName())){
                    throw new NotMatchUserNameAndPasswordException();
                }
            }

        }
        throw new NotUserNameException();

    }
*/
    /*
    public static void register(Person person)throws RegisterException{
        for (int i = 0; i < UserData.getList().size(); i++) {
            Object object = UserData.getList().get(i);
            if (object instanceof Person) {
                Person person1 = (Person) object;
                if (person.getUserName().equals(person1.getUserName())) {
                    throw new UserNameExistException();
                }
                if(person.getUserName().length() < 3){
                    throw new UserNameTooShortException();
                }
                if (person.getUserName().length() >10){
                    throw new UserNameTooLongException();
                }
                if (Instrument.instrument(person.getPassword())){
                    throw new PasswordInsecureException();
                }
                if (person.getPassword().length() > 16){
                    throw new PasswordTooLongException();
                }
            }
        }
        UserData.setList(person);
    }
    */
    // Map修改的登录方法
    public static UserInter Login(String userName,String password) throws LoginException{
        Person person = UserData.getMap().get(userName);
        if (person == null) {
            throw new NotUserNameException();
        }
        if (! password.equals(person.getPassword())){
            throw new NotMatchUserNameAndPasswordException();
        }
        System.out.println("登录成功");
        String name = person.getName();
        String joob = person.getProfession();
        switch (person.getProfession()) {
            case "Worker":
                return new Worker(name,userName,password,joob);
            case "Docter":
                return  new Doctor(name,userName,password,joob);
            case "Cooker":
                return new Cooker(name,userName,password,joob);
            case "Boss":
                return new Boss(name,userName,password,joob);
            default:
                break;
        }
        return null;
    }

    // Map 的注册方法
    public static void register(Person person)throws RegisterException{
        Person person1 = UserData.getMap().get(person.getUserName());
        if (person1 != null){
            throw new UserNameExistException();
        }
        if(person.getUserName().length() < 3){
            throw new UserNameTooShortException();
        }
        if (person.getUserName().length() >10){
            throw new UserNameTooLongException();
        }
        if (person.getPassword().length() > 16){
            throw new PasswordTooLongException();
        }
        if (person.getPassword().length() < 7){
            throw new PasswordTooShortException();
        }
        if (Instrument.instrument(person.getPassword())){
            throw new PasswordInsecureException();
        }
        Map<String , Person> map = new HashMap<>();
        map.put(person.getUserName(),person);
        UserData.setMap(map);
    }
}
