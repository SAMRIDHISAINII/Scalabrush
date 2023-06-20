// object demo{
//     println("hello")
// object o + functional
// how to assign stuff

//     var num : Int = 34
//     var num2 : Int = 43

    // var result = 34+43; this is not an operator 
    // in scala everything is object everything is a method 
//     var result = 8.+(-7);

    // so 8 is object . is operator + is function  7 is the parameter which we are passing through the functional

//     println(num+num2)


    // we can use the val as well to make it concurrent it becomes constant
// class object in scala
// when u see 8+7
// we don,t have any + operator 
// we have method

// case class student(var rollno: Int =1, var name: String = "sam", var marks: Int =2)
// u can create a constructor as soon as u make the class 
// this is the class 
// round bracket specify constructor 
// we can specify variable of type int

// now we will check how we make method
// def show() ={ 
    // def show = println("hi") in this way also it works

    // println("hello")

//     def >(s2: student) Boolean = marks > s2.marks
// }

// }
// var s1 = student();
// s1.show()
// var s2 = student(5,"ramu",6)
// s1.>(s2)


// scala support operator overloading

// var s1 =student(4,"rahul",45);
// we will achieving the constructor overloading her only

// but if we take only the rahul then what?
// var s1 =student(name = "rahul")
// for the numbers it other way
// var s1 = student(4);


// }
// List and lambda expression in scala
// object demo{
//     var nums = list(2,3,4,5)
//     // how do we print list of numbers
//     // nums.reverse it will reverse
//     // for(n <- nums)
//     // {
//     //     println(n)
//     // }
//     nums.foreach(i: Int => print(i)}

// }

// object demo{
//     var nums  = List(1,2,3,4,5)
//     // nums.drop(2).take(2)
// // we can simply write 
// nums drop 2 take 3


//     // it will drop top2 and take 2
//     // it will remove top 2number

//     nums.foreach{i:Int => println(i)}
// }

// scala type hirechy

object demp{
    var nums = List(1,2,3, true)
    nums drop 2 take 1
    // nums.foreach(i: Int => println(i))
}

