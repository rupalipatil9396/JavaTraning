import axios from "axios";
import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import { Link } from "react-router-dom";



export default function AddSubAdmin() {
    let navigate = useNavigate();
    const [adminregistration, setSubAdmin] = useState({
      firstname: "",
      lastname: "",
      mobileno: "",
      emailid: "",
      password: "",
      confirmpassword: "",
      usertype: "User",
    });
  
    const {
      firstname,
      lastname,
      mobileno,
      emailid,
      password,
      confirmpassword,
      usertype,
    } = adminregistration;
  
    const onInputChange = (e) => {
      setSubAdmin({ ...adminregistration, [e.target.name]: e.target.value });
    };
  
    const onSubmit = async (e) => {
      e.preventDefault();
  
      if (adminregistration.firstname === "" || adminregistration.firstname == null) {
        alert("Please Enter First Name");
        return false;
      } else if (adminregistration.lastname === "" || adminregistration.lastname == null) {
        alert("Please Enter Last Name");
        return false;
      } else if (adminregistration.mobileno === "" || adminregistration.mobileno == null) {
        alert("Please Enter Mobile No.");
        return false;
      } else if (adminregistration.emailid === "" || adminregistration.emailid == null) {
        alert("Please Enter Email Id");
        return false;
      } else if (adminregistration.password === "" || adminregistration.password == null) {
        alert("Please Enter Password");
        return false;
      } else if (
        adminregistration.confirmpassword === "" ||
        adminregistration.confirmpassword == null
      ) {
        alert("Please Enter Confirmed Password");
        return false;
      } else if (adminregistration.password !== adminregistration.confirmpassword) {
        alert("Password And Confirmed Password is not matching");
        return false;
      } else {
        await axios.post("http://localhost:8080/registration", adminregistration);
  
        navigate("/admindashboard");
      }
    };
  
    return (
      <div className="container">
        <div className="row">
          <div className="col-md-6 offset-md-3 border rounded p-4 mt-2 shadow">
            <h2 className="text-center m-4">Register SubAdmin</h2>
            <form onSubmit={(e) => onSubmit(e)}>
              <div className="mb-3">
                <label htmlFor="Name" className="form-label">
                  First Name
                </label>
                <input
                  type={"text"}
                  className="form-control"
                  placeholder="Enter your First Name"
                  name="firstname"
                  value={firstname}
                  onChange={(e) => onInputChange(e)}
                />
              </div>
              <div className="mb-3">
                <label htmlFor="lastname" className="form-label">
                  Username
                </label>
                <input
                  type={"text"}
                  className="form-control"
                  placeholder="Enter your lastname"
                  name="lastname"
                  value={lastname}
                  onChange={(e) => onInputChange(e)}
                />
              </div>
              <div className="mb-3">
                <label htmlFor="mobileno" className="form-label">
                  mobileno
                </label>
                <input
                  type={"text"}
                  className="form-control"
                  placeholder="Enter your mobileno"
                  name="mobileno"
                  value={mobileno}
                  onChange={(e) => onInputChange(e)}
                />
              </div>
              <div className="mb-3">
                <label htmlFor="emailid" className="form-label">
                  emailid
                </label>
                <input
                  type={"text"}
                  className="form-control"
                  placeholder="Enter your emailid"
                  name="emailid"
                  value={emailid}
                  onChange={(e) => onInputChange(e)}
                />
              </div>
              <div className="mb-3">
                <label htmlFor="mobileno" className="form-label">
                  password
                </label>
                <input
                  type={"text"}
                  className="form-control"
                  placeholder="Enter your password"
                  name="password"
                  value={password}
                  onChange={(e) => onInputChange(e)}
                />
              </div>
              <div className="mb-3">
                <label htmlFor="confirmpassword" className="form-label">
                  confirmpassword
                </label>
                <input
                  type={"text"}
                  className="form-control"
                  placeholder="Enter your confirmpassword"
                  name="confirmpassword"
                  value={confirmpassword}
                  onChange={(e) => onInputChange(e)}
                />
              </div>
              <div>
                <input type="hidden" name="usertype" value="user" />
              </div>
              <button type="submit" className="btn btn-outline-primary">
                Submit
              </button>
              <Link className="btn btn-outline-danger mx-2" to="/admindashboard">
                Cancel
              </Link>
            </form>
          </div>
        </div>
      </div>
     )
}
