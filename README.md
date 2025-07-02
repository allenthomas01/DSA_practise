# DSA_practise
Dumping place for my DSA practise :)



import useAuth from "../context/UseAuth"; // already imported

export default function TemporaryDrawer({ drawerOpen, handleOnClose }: TemporaryDrawerProps) {
  const { user } = useAuth(); // 👈 access logged-in user
  const navigate = useNavigate();

  // rest of your drawer setup...

  return (
    <Drawer
      open={drawerOpen}
      onClose={handleOnClose}
      sx={{
        "& .MuiDrawer-paper": {
          backgroundColor: theme.palette.primary.main,
        },
      }}
    >
      <Box sx={{ width: 250 }} role="presentation" onClick={handleOnClose}>
        <List>
          {/* Always visible items */}
          <ListItem disablePadding>
            <ListItemButton onClick={() => navigate("/")}>
              <ListItemIcon><HomeIcon sx={{ color: "white" }} /></ListItemIcon>
              <ListItemText primary="Home" />
            </ListItemButton>
          </ListItem>

          <ListItem disablePadding>
            <ListItemButton onClick={() => navigate("/my-requests")}>
              <ListItemIcon><RequestPageIcon sx={{ color: "white" }} /></ListItemIcon>
              <ListItemText primary="My Requests" />
            </ListItemButton>
          </ListItem>

          {/* Conditional group: My Vehicles */}
          <ListItem disablePadding>
            <ListItemButton onClick={() => navigate("/my-vehicles")}>
              <ListItemIcon><DirectionsCarIcon sx={{ color: "white" }} /></ListItemIcon>
              <ListItemText primary="View Vehicles" />
            </ListItemButton>
          </ListItem>

          <ListItem disablePadding>
            <ListItemButton onClick={() => navigate("/add-vehicle")}>
              <ListItemIcon><DirectionsCarIcon sx={{ color: "white" }} /></ListItemIcon>
              <ListItemText primary="Add Vehicle" />
            </ListItemButton>
          </ListItem>

          {/* Conditional group: Slot Management */}
          <ListItem disablePadding>
            <ListItemButton onClick={() => navigate("/my-slot")}>
              <ListItemIcon><LocalParkingIcon sx={{ color: "white" }} /></ListItemIcon>
              <ListItemText primary="My Slot" />
            </ListItemButton>
          </ListItem>

          <ListItem disablePadding>
            <ListItemButton onClick={() => navigate("/book-slot")}>
              <ListItemIcon><EventAvailableIcon sx={{ color: "white" }} /></ListItemIcon>
              <ListItemText primary="Book Slot" />
            </ListItemButton>
          </ListItem>

          {/* 👇 Conditionally render this item only if user has permanent slot */}
          {user?.hasPermanentSlot && (
            <ListItem disablePadding>
              <ListItemButton onClick={() => navigate("/pass-slot")}>
                <ListItemIcon><EventAvailableIcon sx={{ color: "white" }} /></ListItemIcon>
                <ListItemText primary="Pass Slot" />
              </ListItemButton>
            </ListItem>
          )}
        </List>
      </Box>
    </Drawer>
  );
}