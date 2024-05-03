
// Import the express module
const express = require('express');

// Create an Express application
const app = express();

// Define a route handler for the root path
app.get('/', (req, res) => {
  res.send('Hello, World!');
});

// Define a route handler for '/about' path
app.get('/about', (req, res) => {
  res.send('about page');
});

app.get('/Services', (req, res) => {
  res.send('Services');
});

// Start the server on port 3000
app.listen(3000, () => {
  console.log('Server is running on port 3000');
});
