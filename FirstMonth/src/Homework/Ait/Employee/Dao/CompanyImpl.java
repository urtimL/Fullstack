package Homework.Ait.Employee.Dao;

import Homework.Ait.Employee.Model.Employee;
import Homework.Ait.Employee.Model.SalesManager;

public class CompanyImpl implements Company {
    private Employee[] employees;
    private int size = 0;

    public CompanyImpl(int capacity) {
        employees = new Employee[capacity];
    }

    @Override
    public boolean addEmployee(Employee employee) {
        //проверка на null
        if(employee == null) {
            return false;
        }

        //проверка на заполненность массива employees
        if(employees.length < size + 1){
            return false;
        }

        //проверка на повтор (если в массиве уже есть элемент с таким id
        //то его нельзя добавлять)
        if(findEmployee(employee.getId()) != null){
            return false;
        }

        //добавим сотрудника в массив
        employees[size++] = employee;

        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        Employee emp = findEmployee(id);

        if(emp == null){
            return null;
        }

        boolean needToMove = false;
        for (int i = 0; i < size; i++) {
            if(needToMove){
                employees[i] = employees[i + 1];
            }
            if(employees[i].getId() == id) {
                employees[i] = employees[i + 1];
                needToMove = true;
                size--;
            }
        }

        return emp;
    }

    @Override
    public Employee findEmployee(int id) {
        if(size == 0) {
            return null;
        }

        for (int i = 0; i < size; i++) {
            if(employees[i] == null){
                return null;
            }

            if(employees[i].getId() == id) {
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public double totalSalary() {
        double res = 0;

        for (int i = 0; i < size; i++) {
            res += employees[i].calcSalary();
        }
        return res;
    }

    @Override
    public double avgSalary() {
        if(size == 0){
            return 0;
        }

        return totalSalary() / size;
    }

    @Override
    public double totalSales() {
        double res = 0;

        if(size == 0){
            return res;
        }

        for (int i = 0; i < size; i++) {
            if(employees[i] instanceof SalesManager){
                res +=  ((SalesManager) employees[i]).getSalesValue();
            }
        }

        return res;
    }

    @Override
    public void printEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }
}
