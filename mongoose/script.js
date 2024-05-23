const mongoose = require('mongoose');
const User = require('./User');

main().catch(err => console.log(err));

async function main() {
    await mongoose.connect('mongodb://127.0.0.1:27017/testdb'); // Connect to MongoDB

    const user1 = await User.create({ name: "Rajini", age: 72 });
    console.log(user1);

    user1.name = "Rajinikanth";
    await user1.save(); // Save the updated user to the database
    console.log(user1);

    const user2 = await User.create({
        firstName: "Kamal",
        lastName: "Haasan",
        age: 69,
        email: "kamalvpm@gmail.com", // Correct email format
        interestedLanguage: ["C", "Python", "Javascript"], // Corrected spelling of JavaScript
        address: {
            Street: "Ganapathy Nagar",
            City: "Chennai",
            Pincode: 605602
        }
    });

    console.log(user2);
}

// Create a new user instance and save it
