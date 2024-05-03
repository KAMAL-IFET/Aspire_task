<!-- Title: practice node
-- Author: B.KAMAL
-- Created Date: 01.05.2024
-- Last modified Date: 02.05.2024
-- Reviewed By:
-- Reviewed Date:  -->




var EventEmitter = require('events');

var emitter = new EventEmitter();


emitter.on('userLoggedIn', (username) => {
  console.log(`User ${username} logged in.`);
});

// Function to get into user login
function loginUser(username) {
  console.log(`Logging in user ${username}...`);
  setTimeout(() => {
    console.log(`User ${username} logged in successfully.`);
    emitter.emit('userLoggedIn', username); // Emit 'userLoggedIn' event
  }, 5000);
}

//call the login function
loginUser('Kamal');
