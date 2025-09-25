import React from 'react';
import UserGreeting from'./UserGreeting';
import UserInfo from'./UserInfo';
import'./App.css';
function App(){
const user={
name:'PRAVEENA',
age:24
};
return(
<div className="app-container">
<div className="card">
<h2>Sharing Data USing Props</h2>
<USerGreeting name={user.name}/>
<USerInfo name={user.name}age={user.age}/>
</div>
</div>
);
}
