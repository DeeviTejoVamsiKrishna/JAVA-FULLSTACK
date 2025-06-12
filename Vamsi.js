function Chandu()
{
    return(
        <h1>welcome</h1>
    );
}
export default Chandu; 
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
