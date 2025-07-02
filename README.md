// HomePage.tsx

import DataTable from "../components/DataTable";
import { Box, Grid, Button, CircularProgress } from "@mui/material";
import { useNavigate } from "react-router-dom";
import useAuth from "../context/UseAuth";
import SlotInfoCard from "../components/SlotInfoCard";
import { useEffect, useState } from "react";

const HomePage = () => {
  const { user } = useAuth();
  const navigate = useNavigate();
  const [requests, setRequests] = useState<any[]>([]);
  const [loading, setLoading] = useState(true);
  const [todaysTempSlot, setTodaysTempSlot] = useState<any | null>(null);

  // 🔽 Get today’s date in YYYY-MM-DD format
  const today = new Date().toISOString().split("T")[0];

  useEffect(() => {
    const fetchData = async () => {
      try {
        // Fetch recent requests for DataTable
        const res = await fetch("http://localhost:3000/api/requests");
        const data = await res.json();

        const sorted = data.sort(
          (a: any, b: any) => new Date(b.date).getTime() - new Date(a.date).getTime()
        );

        const formatted = sorted.map((item: any, index: number) => ({
          id: index + 1,
          date: item.date,
          floor: item.floor,
          vehicleType: item.vehicleType,
          passed: item.passed,
          status: item.status,
        }));

        setRequests(formatted.slice(0, 5));
      } catch (err) {
        console.error("Failed to fetch requests", err);
      } finally {
        setLoading(false);
      }
    };

    const fetchTodaysSlot = async () => {
      try {
        const res = await fetch("http://localhost:3000/api/requests");
        const data = await res.json();

        const match = data.find(
          (r: any) =>
            r.date === today && r.status.toLowerCase() === "booked"
        );

        if (match) {
          setTodaysTempSlot(match);
        }
      } catch (error) {
        console.error("Failed to fetch today's slot", error);
      }
    };

    fetchData();
    fetchTodaysSlot();
  }, []);

  return (
    <Box p={4}>
      {/* 🔽 Cards Row */}
      <Grid container spacing={4}>
        {/* Permanent Slot */}
        {user?.hasPermanentSlot && (
          <Grid item xs={12} md={6}>
            <SlotInfoCard
              type="permanent"
              slotNumber={user.slotNumber}
              location={user.location}
              vehicleType={user.vehicleType}
            />
          </Grid>
        )}

        {/* Temporary Slot for today */}
        {todaysTempSlot && (
          <Grid item xs={12} md={6}>
            <SlotInfoCard
              type="temporary"
              from={todaysTempSlot.from}
              to={todaysTempSlot.to}
              vehicleType={todaysTempSlot.vehicleType}
            />
          </Grid>
        )}
      </Grid>

      {/* 🔽 Buttons */}
      <Grid container spacing={2} mt={4} justifyContent="center">
        <Grid item>
          <Button variant="contained" color="primary" onClick={() => navigate("/book-slot")}>
            Request Temp Slot
          </Button>
        </Grid>
        {user?.hasPermanentSlot && (
          <Grid item>
            <Button variant="outlined" color="primary" onClick={() => navigate("/pass-slot")}>
              Pass Slot
            </Button>
          </Grid>
        )}
      </Grid>

      {/* 🔽 Data Table */}
      {loading ? (
        <Box display="flex" justifyContent="center" mt={4}>
          <CircularProgress />
        </Box>
      ) : (
        <DataTable rows={requests} title="Recent Requests" showViewAllButton />
      )}
    </Box>
  );
};

export default HomePage;