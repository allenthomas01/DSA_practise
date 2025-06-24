# DSA_practise
Dumping place for my DSA practise :)



export const users = [
  { id: "u1", name: "Alice", role: "admin", hasPermanentSlot: false },
  { id: "u2", name: "Bob", role: "employee", hasPermanentSlot: true },
  { id: "u3", name: "Charlie", role: "employee", hasPermanentSlot: false },
  { id: "u4", name: "Diana", role: "employee", hasPermanentSlot: true },
  { id: "u5", name: "Guest", role: "guest", hasPermanentSlot: false }, // optional
];




export const parkingSlots = [
  { id: "s1", type: "permanent", status: "occupied", assignedTo: "u2" },
  { id: "s2", type: "permanent", status: "occupied", assignedTo: "u4" },
  { id: "s3", type: "reserved", status: "free", assignedTo: null },     // for CEO etc.
  { id: "s4", type: "guest", status: "free", assignedTo: null },
  { id: "s5", type: "temporary", status: "free", assignedTo: null },     // for passing
];



export const passedSlots = [
  {
    slotId: "s2",
    passedBy: "u4",
    from: "2025-06-24T09:00",
    to: "2025-06-24T17:00",
    isAssigned: false,
    assignedTo: null,
  }
];

export const slotRequests = [
  {
    id: "r1",
    requestedBy: "u3",
    from: "2025-06-24T10:00",
    to: "2025-06-24T16:00",
    status: "pending",
    slotId: null
  }
];



==============


const express = require('express');
const cors = require('cors');
const app = express();
const PORT = 4000;

app.use(cors());
app.use(express.json());

// Dummy Data
let users = [
  { id: 1, name: 'Alice', type: 'employee', hasPermanentSlot: true, vehicleType: 'four_wheeler' },
  { id: 2, name: 'Bob', type: 'employee', hasPermanentSlot: false, vehicleType: 'two_wheeler' },
  { id: 3, name: 'Charlie', type: 'admin' }
];

let slots = [
  { id: 1, type: 'four_wheeler', status: 'occupied', reserved: false, ownerId: 1 },
  { id: 2, type: 'four_wheeler', status: 'available', reserved: true, reservedFor: 'guest' },
  { id: 3, type: 'two_wheeler', status: 'available', reserved: false }
];

let tempPasses = [
  {
    id: 1,
    ownerId: 1,
    slotId: 1,
    fromDate: '2025-06-25',
    toDate: '2025-06-27',
    isAvailable: true
  }
];

let tempRequests = [
  {
    id: 1,
    employeeId: 2,
    date: '2025-06-26',
    status: 'approved',
    slotAssigned: 3
  }
];

// API Routes

// Get all users
app.get('/api/users', (req, res) => {
  res.json(users);
});

// Get all slots
app.get('/api/slots', (req, res) => {
  res.json(slots);
});

// Get temporary passes
app.get('/api/temp-passes', (req, res) => {
  res.json(tempPasses);
});

// Get temporary slot requests
app.get('/api/temp-requests', (req, res) => {
  res.json(tempRequests);
});

// Placeholder for requesting temp slot
app.post('/api/temp-request', (req, res) => {
  const newRequest = req.body;
  tempRequests.push(newRequest);
  res.json({ message: 'Temp request submitted', data: newRequest });
});

// Placeholder for requesting permanent slot (admin approval needed)
app.post('/api/permanent-request', (req, res) => {
  res.json({ message: 'Permanent slot request received. Pending admin approval.' });
});

app.listen(PORT, () => {
  console.log(`Dummy API running at http://localhost:${PORT}`);
});


