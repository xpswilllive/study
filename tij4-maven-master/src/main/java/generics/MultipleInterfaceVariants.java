package generics;
// {CompileTimeError} (Won't compile)

interface Payable<T> {}

//因为擦除，使得编译器认为是同种接口
class Employee1 implements Payable<Employee> {}
class Hourly extends Employee1
  implements Payable<Hourly> {} ///:~
