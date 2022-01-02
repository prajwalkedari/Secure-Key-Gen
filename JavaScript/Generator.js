const d = new Date();
let minutes = d.getMinutes()*2;
let month = (1+d.getMonth())*6;
let year = d.getFullYear()*7;
let hour = d.getHours()*4;
let day = d.getDate()*9;
key=(minutes+''+month+''+year+''+hour+''+day)
console.log("Key:- "+key)
