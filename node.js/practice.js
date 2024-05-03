<!-- Title: practice node
-- Author: B.KAMAL
-- Created Date: 01.05.2024
-- Last modified Date: 02.05.2024
-- Reviewed By:
-- Reviewed Date:  -->




var data = 40;

function greet() {
    console.log("hello coder");
    setTimeout(() => {
        console.log("completed break");
        setTimeout(() => {
            console.log("once again completed");
        }, 3000); 
    }, 2000); 
    console.log("program ends");
}

greet();

    
    
