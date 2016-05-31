package org.sourceit; 


public class Homework2 { 
/** 
* Конвертирует десятичное число в бинарную форму 
* 
* @param number может быть только позитивным 
* @return бинарная форма числа 
*/ 
public static long decimalToBinary(int number) { 

long b = 0 ; 
Long x = Long.valueOf(0); 
String temp = ""; 
while(number !=0){ 
b = number%2; 
temp = b + temp; 
number = number /2; 
} 
// temp = "0b" + temp ; 
x = Long.valueOf(temp); 
b = x ; 
return b ; 
} 

/** 
* Конвертирует десятичное число в октальную форму 
* 
* @param number может быть только позитивным 
* @return октальная форма числа 
*/ 
public static long decimalToOctal(int number) { 
long b = 0 ; 
Long x = Long.valueOf(0); 

String temp = ""; 
while(number !=0){ 
b = number%8; 
temp = b + temp; 
number = number /8; 
} 
// temp = "0" + temp ; 

x = Long.valueOf(temp); 
b = x ; 
return b ; 
} 



/** 
* Конвертирует десятичное число в хексовою форму 
* 
* @param number может быть только позитивным 
* @return хексовая форма числа 
*/ 
public static long decimalToHex(int number) { 
long b; 
String x = "" ; 
Long a = Long.valueOf(0); 
String temp = ""; 
while(number !=0){ 
b = number%16; 
if (b ==10 ) { 
x = "10"; 
} if (b == 11){ 
x = "11"; 
} if (b == 12){ 
x = "12"; 
} if (b == 13){ 
x = "13"; 
}if (b == 14){ 
x ="14"; 
}if (b == 15){ 
x = "15"; 
} if (b >= 10 && b <= 15 ) { 
temp = x + temp; 
} else{ 
temp = b + temp ; 
} 
number = number /16; 
} 
// temp = "0x" + temp ; 

a = Long.valueOf(temp); 
b = a ; 
return b ; 
} 



/** 
* Конвертирует бинарную форму в десятичное число 
* 
* @param binary бинарная форма, может быть только позитивным 
* @return десятичное число 
*/ 
public static int binaryToDecimal(long binary) { 
int d = 0; 
int z = 0; 
for (int i = 0; binary != 0; i++) { 
z = (int) binary % 2; 
z = z * (int) Math.pow(2, i); 
binary = binary / 10; 
d = d + z; 

} 
return d; 
} 
/** 
* Конвертирует октальную форму в десятичное число 
* 
* @param octal октальная форма, может быть только позитивным 
* @return десятичное число 
*/ 
public static int octalToDecimal(long octal) { 
int d = 0; 
int z = 0; 
for (int i = 0; octal != 0; i++) { 
z = (int) octal % 8; 
z = z * (int) Math.pow(8, i); 
octal = octal / 10; 
d = d + z; 

} 
return d; 
} 



/** 
* Конвертирует хексовую форму в десятичное число 
* 
* @param hex хексовая форма, может быть только позитивным 
* @return десятичное число 
*/ 
public static int hexToDecimal(long hex) { 
int d = 0; 
int z = 0; 
for (int i = 0; hex != 0; i++) { 
z = (int) hex % 15; 
z = z * (int) Math.pow(16, i); 
hex = hex / 10; 
d = d + z; 

} 
return d; 
} 

/** 
* Генерируют двумерный массив, со случайными числами. 
* 
* @param rows 
* @param columns 
* @return двумерный массив 
*/ 
public static int[][] generateTwoDimensionArray(int rows, int columns) { 
int [][]a = new int[10][11]; 
for (int rows1 = 0; rows1<10; rows1 ++ ) { 
for (int columns1 = 0; columns1 < 11; columns1 ++) { 



a[rows1][columns1]= (int)Math.random()*10; 
} 
} 

return a; 
} 

/** 
* Определить и вывести на экран индекс строки с 
* наибольшим по модулю произведением элементов. 
* Если таких строк несколько, то вывести индекс 
* первой встретившейся из них. 
* 
* @param input двумерный массив 
* @return индекс строки 
*/ 
public static int findMaxProduct(int[][] input) { 
int sum = 0 ; 
int [] a = new int [input.length]; 
int x = - 2147483648 ; 
int ret = 0 ; 

for ( int i =0; i < input.length; i ++ ){ 
for ( int j = 0; j < input[i].length; j++){ 
sum = sum + input [i][j]; 
} a[i]= sum ; 
sum = 0 ; 
}for (int i = 0; i < input.length; i ++ ){ 
if ( a[i] > x){ 
x = a[i]; 
ret = i; 
} 

} 
return ret; 
} 

/** 
* Выводит все простые числа из интервала от 2 до n. 
* 
* @param n 
* @return массив простых чисел. 
*/ 
public static int[] getSimple(int n) {
12.04.16	
int [] a = new int [n]; 
int x = 0; 


return null; 
} 

// Рекурсивные методы. Реализовать их нужно с помощью рекурсии. 

/** 
* Вычисляет сумму чисел от 1 до n включительно. 
* 
* @param n предел 
* @return сумма 
*/ 
public static long sum(int n) { 
long a = 0 ; 
for (int i = 1; i <= n ; i++){ 
a = a + i ; 
} 
return a; 
} 

/** 
* Метод вычисляет, результат умножения. 
* 
* @param first 
* @param second 
* @return 
*/ 

public static int product(int first, int second) { 
return first*second; 
} 

}
