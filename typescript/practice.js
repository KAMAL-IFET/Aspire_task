/*
 * Title : typescript practice
 * Author : KAMAL B
 * Created At : 08-04-2024
 * Last Modified Date : 12-04-2024
 * Reviewed By :
 * Review Date :
 */
var arr = new Array("Aspire", "2200", "FrontEnd", "Kamal");
for (var i = 0; i < arr.length; i++) {
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
console.log("cpoied array="+copiedArray);
//every function
var allStrings = arr.every(function(element) {
    return typeof element === 'int';
});
//filled array(professional is filled with the start index 3 end at index at 4 )
console.log(allStrings);
var filledArray = arr.fill("Professional", 3, 4);
console.log(filledArray);
//find index

var index = arr.indexOf("Aspire");
console.log(index);

//contains or not 
var includes = arr.includes("2200");
console.log(includes);

var lastIndex = arr.lastIndexOf("2200");
console.log(lastIndex);
var poppedElement = arr.pop();
console.log(poppedElement);

//  push Adds new elements to the array.
arr.push("Developer");
console.log(arr);

//  reverse
var reversedArray = arr.reverse();
console.log(reversedArray);
//remove 1st element
var shiftedElement = arr.shift();
console.log(shiftedElement);
//slicing the section of the array 
var slicedArray = arr.slice(1, 3);
console.log(slicedArray);

//sorting
var sortedArray = arr.sort();
console.log(sortedArray);
//add the element at  that position

var splicedArray = arr.splice(0, 1, "Technology", "Engineer");
console.log(arr);
//string 
var stringRepresentation = arr.toString();
console.log(stringRepresentation);
//add element to begin of thr array  
arr.unshift("Professional", "Software");
console.log(arr);


