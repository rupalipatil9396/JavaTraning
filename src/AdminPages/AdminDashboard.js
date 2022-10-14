import React from 'react'
import { Link } from 'react-router-dom'
export default function AdminDashboard() {
  return (
    <div>AdminDashboard
      <div>
 <Link className="btn btn-outline-dark" to="/addsubadmin">Add SubAdmin</Link>
   
   
   <input type={"text"} className="form-control" 
   placeholder="add services" > 
</input><Link className="btn btn-outline-dark" type="text" to="/addservices">add services</Link>
</div>
</div>
  )
}
