







let arr:string[] = new Array("Aspire","2200","FrontEnd","Kamal");  
for(var i = 0;i<arr.length;i++) {   
   console.log(arr[i]);  
}  
//join
var concatenatedString = arr.join();

console.log(concatenatedString);
var arr2 = ["Professional", "Development"];
var combinedArray = arr.concat(arr2);
//combined array
console.log(combinedArray);
//copied array
var copiedArray = arr.copyWithin(2, 0);
console.log(copiedArray);
