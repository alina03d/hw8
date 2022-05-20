import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovch";
        String lastName = "Ivanov";
        System.out.printf("ФИО сотрудника — %s %s %s%n", lastName,firstName,middleName);

        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        fullName = "Иванов Семён Семёнович";
        String[] names = fullName.split(" ");
        System.out.print("Данные ФИО сотрудника — ");
        for (int i = 0; i< names.length; i++) {
            String name = names[i];
            if(name.contains("ё")){
                int index = name.indexOf('ё');
                names[i]=name.substring(0,index)+"е"+ name.substring(index+1);
            }
            if (i == name.length() - 1){
                System.out.print(names[i]);
            }else {
                System.out.print(names[i]+" ");
            }
        }

    }
}