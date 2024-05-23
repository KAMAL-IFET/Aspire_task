const mongoose = require('mongoose');

const addressSchema = new mongoose.Schema({
    Street: String,
    City: String,
    Pincode: Number
});

const userSchema = new mongoose.Schema({
    firstName: String,
    lastName: String,
    age: {
        type: Number,
        min: 1,
        max: 100
    },
    email: String,
    interestedLanguage: [String],
    address: addressSchema
});

// Export the model only once
module.exports = mongoose.model("User", userSchema);
