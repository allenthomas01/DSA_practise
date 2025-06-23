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


