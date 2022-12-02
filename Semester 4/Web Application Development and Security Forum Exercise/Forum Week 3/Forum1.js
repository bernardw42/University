//Promise
let p = new Promise((resolve, reject) =>
{
    let a = 1+2
    if (a==2)
    {
        resolve('success')
    }
    else
    {
        reject('failed')
    }
})

p.then((message) => 
{
    console.log('This is ' +message)
}).catch((message) => 
{
    console.log('This is '+ message)
});

//Async Await
function setTimeoutPromise(delay) {
    return new Promise((resolve, reject) => {
      if (delay < 0) return reject("Delay must be greater than 0")
  
      setTimeout(() => {
        resolve(`You waited ${delay} milliseconds`)
      }, delay)
    })
  }

  doStuff()
  async function doStuff() {
  try {
    const msg = await setTimeoutPromise(-10)
    console.log(msg)
  } catch (error) {
    console.error(error)
  } finally {
    console.log("Runs no matter what")
  }
};

//Fetch Funtion 
import fetch from "node-fetch";
fetch("https://reqres.in/api/users/1")
.then((response) => console.log(response)) 
.then((json)=>console.log(json))
.catch((error)=>{
  console.log(error)
})

//Map, Filter, and Reduce
const orders =
[
  {
    userid: 1,
    amount: 10
  },
  {
    userid: 1,
    amount: 15
  },
  {
    userid: 2,
    amount: 5
  },
  {
    userid: 2,
    amount: 100
  }
];
const sum = orders.filter(order => order.userid = 1)
.map(order => order.amount)
.reduce((a,b)=> a+b);
console.log(sum);