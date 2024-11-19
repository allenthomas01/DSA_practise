"""
Definition of Interval:
class Interval(object):
    def __init__(self, start, end):
        self.start = start
        self.end = end
"""

class Solution:
    def minMeetingRooms(self, intervals: List[Interval]) -> int:
        roomCount=0
        maxRoomCount=0
        startTimes = [interval.start for interval in intervals]
        endTimes=[interval.end for interval in intervals]
        startTimes.sort()
        endTimes.sort()
        i,j =0,0
        while i<len(startTimes):
            if startTimes[i]<endTimes[j]:
                i+=1
                roomCount+=1
            else:
                roomCount-=1
                j+=1
            maxRoomCount=max(maxRoomCount,roomCount)


        return maxRoomCount