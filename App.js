import React from "react";
import { Route, Routes, Link } from "react-router-dom";
import "./App.css";
import SignIn from "./Components/SignIn";
import SignUp from "./Components/SignUp";

function App() {
  return (
    <>
      <nav>
        <ul
          className="navs"
          style={{
            listStyle: "none",
            display: "flex",
            gap: "1rem",
            cursor: "pointer",
          }}
        ></ul>
      </nav>
      <Routes>
        <Route path="/" element={<SignIn />} />
        <Route path="/signUp" element={<SignUp />} />
      </Routes>
    </>
  );
}

export default App;
