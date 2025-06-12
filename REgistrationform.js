function Registrationform()
{
return(
<div>
<body/>
 <form/>
<fieldset style="color:rgb(26, 5, 141);background-color:#dcf3fd;"/>    <legend align="center">REGISTATION FORM</legend>
<label >First_name :</label>
 <input type="text" autofocus/><br/><br/>
<label >Sur_name :</label>
<input type="text"/><br/><br/>
 <label >Age :</label>
 <input type="number"/><br/><br/>
<label for="">Gender :</label>
<input type="radio" name="h" id="1"/>
<label for="1"> male :</label>
 <input type="radio" name="h" id="2"/>
<label for="1"> female :</label>
<input type="radio" name="h" id="3">
<label for="1" >custom :</label></input><br/><br/>
 <label >DOB :</label>
<input type="date"/><br/><br/>
 <label for="">Email_id :</label>
 <input type="email" name="" id="" required/><br/><br/>
 <input type="tel" name="" id="" placeholder="Mobile_number"/><br/><br/>
 <select required>
 <option value="">ECE</option>
 <option value="">CSE</option>
 <option value="">MECH</option>
<option value="">EEE</option>
 <option value="">CIVIL</option>
</select><br/><br/>
<button type="submit">Submit</button>
<button type="submit">Reset</button>

</div>
);
}
export default Regitrationform;

import logo from './SVIETLOGO.png';
import './App.css';
import Chandu from './Chandu';
import Regitrationform from './Registrationform';
function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
      <Chandu></Chandu>
      <Regitrationform></Regitrationform>
    </div>
  );
}

export default App;

