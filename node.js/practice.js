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

    
    
