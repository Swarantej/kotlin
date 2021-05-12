fun main (args : Array<String>) {
	println("Hello Kotlin World")
	var obj = ObjectCreation();
	obj.name = "Swaran";
	println("My name is ${obj.name}")

	//Creating an Obj for Java class file

	var javaObj = JavaLearn();
	javaObj.name = "Swarantej"
	println(javaObj.name)

	var num1: Int = 2
	var num2: Int = 3
	var result = num1 + num2;
	println("Sum of ${num1} and ${num2} is ${result}")

	var res = if (num1 > num2)
		num1
	else
		num2
	println("$res is greater")

	var str1: String = "Swaran"
	var str2: String = "swaran"
	if (str1.equals(str2, true))
		println("String .equals method :: same")
	else
		println("String .equals method ::not same")

	if (str1 == str2)
		println("String == method ::same")
	else
		println("String == method ::not same")


	// Handling Null Pointer Exceptions

	//var Str3: String = null;
	var Str4: String? = null;
	println(Str4?.length);

	//When Statement similar to Switch

	var num: Int = 2
	when (num) {
		1 -> println("One")
		2 -> println("Two")
		3 -> println("Three")
		else -> println("Enter a proper value")
	}

	//2n type as Expression

	var numb: Int = 3
	val ress = when (numb) {
		1 -> "One"
		2 -> "Two"
		3 -> "Three"
		else -> "Enter a proper value"
	}
	println("ANswer ${ress}")


	//For Loop and Range

	var forloop = 1..5
	for (a in forloop) {
		println("nums is for loop $a")
	}

	//reversed
	for (a in forloop.reversed()) {
		println(" revered nums is for loop $a")
	}

	//Condition

	for (a in forloop step 2) {
		println(" step up nums is for loop $a")
	}

	//descending order using Downto keryword

	var forloop1 = 10 downTo 1
	for (a in forloop1) {
		println("descenidng order is for loop $a")
	}

	//Untli keyword

	var forloop2 = 1 until 6
	for (a in forloop2) {
		println("until keyword order is for loop $a")
	}





}