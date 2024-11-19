""" medium
Given an array of meeting time interval objects consisting of start and end times [[start_1,end_1],[start_2,end_2],...] (start_i < end_i), find the minimum number of days required to schedule all meetings without any conflicts.

Example 1:

Input: intervals = [(0,40),(5,10),(15,20)]

Output: 2
Explanation:
day1: (0,40)
day2: (5,10),(15,20)

Example 2:

Input: intervals = [(4,9)]

Output: 1
Note:

(0,8),(8,10) is not considered a conflict at 8
Constraints:

0 <= intervals.length <= 500
0 <= intervals[i].start < intervals[i].end <= 1,000,000
"""


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