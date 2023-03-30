public class Main {
    public static void main(String[] args) {
        AdditionalClass additionalClass = new AdditionalClass();

        additionalClass.addEmployee("Иванова Людмила Михайловна", 1, 37800);
        additionalClass.addEmployee("Сидоров Михаил Петрович", 1, 35870);
        additionalClass.addEmployee("Баранов Иван Владимирович", 2, 30490);
        additionalClass.addEmployee("Жернакова Кристина Альбертовна", 2, 34000);
        additionalClass.addEmployee("Максимова Альбина Александровна", 3, 34078);
        additionalClass.addEmployee("Золотницкая Наталья Максимовна", 3, 31900);
        additionalClass.addEmployee("Петров Илья Александрович", 4, 34000);
        additionalClass.addEmployee("Ильина Софья Николаевна", 4, 37895);
        additionalClass.addEmployee("Баженова Кристина Владимировна", 5, 35850);
        additionalClass.addEmployee("Кузаков Борис Евгеньевич", 5, 34900);

        //список всех сотрудников со всеми данными
        additionalClass.printAllEmpoyees();
        System.out.println();
        //общая сумма затрат на зарплаты
        additionalClass.getTotalSalary();
        System.out.println();
        //сотрудник с минимальной зп
        additionalClass.getMinSalary();
        System.out.println();
        //сотрудник с максимальной зп
        additionalClass.getMaxSalary();
        System.out.println();
        //среднее значение
        additionalClass.getAverageSalary();
        System.out.println();
        //список сотрудников
        additionalClass.printAllNames();
        System.out.println();

    }
}