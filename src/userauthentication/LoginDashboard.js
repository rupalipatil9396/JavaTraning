import React from "react";
import { Link } from "react-router-dom";
import "./logindashboard.css";

export default function LoginDashboard() {
  return (
    <div className="logindashboard">
      <div>LoginDashboard</div>
      <div>
        <Link className="btn-btn-outline-light" to="/registeruser">
          Register User
        </Link>
        <div>
          <Link className="btn-btn-outline-light" to="/userlogin">
            User Login
          </Link>
        </div>
        <div>
          <Link className="btn-btn-outline-light" to="/adminlogin">
            Admin Login
          </Link>
        </div>
      </div>
    </div>
  );
}
