import './App.css';

function App({config}) {
  const { params } = config || {};
  const { name } = params || {};

  return (
      <div className="App">
        <header className="App-header">
          <p>
            Hello, {name}!
          </p>
        </header>
      </div>
  );
}

export default App;
