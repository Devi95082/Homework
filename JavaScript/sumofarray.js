let arr = [1, 2, 4, 5, 6];
let sum=0;
for (let i = 0; i < arr.length; i++) {
     sum=sum+arr[i];

}
console.log("Sum of Array is : "+sum)


let evencount=0;
let oddcount=0;
for (let i = 0; i < arr.length; i++) {
   if(arr[i]%2==0)
   {
    evencount++;
   }
   else{
    oddcount++;
   }
 
}
console.log("Even Count is : "+evencount);
console.log("Odd Count is : "+oddcount);


console.log("Array Reverse : ");
for (let i = arr.length; i >=0; i--) {
  
    console.log(arr[i]);
}