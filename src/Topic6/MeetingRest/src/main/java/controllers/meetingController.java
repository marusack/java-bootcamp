package controllers;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.chain.web.servlet.RequestParameterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import entitys.Attendees;
import entitys.Room;
import entitys.TimeSlot;
import resourses.AttendeesInterface;
import resourses.MeetingInterface;
import resourses.RoomInterface;
import resourses.TimeSlotInterface;

public class meetingController {

	@Autowired
	private MeetingInterface meetingInterface;
	@Autowired
	private AttendeesInterface attendeeInterface;
	@Autowired
	private RoomInterface roomInterface;
	@Autowired
	private TimeSlotInterface timeInterface;

	@RequestMapping(value = "/meetings")
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("meetings", this.meetingInterface.getAllMeeting());

		return new ModelAndView("meetings", "model", myModel);

	}

	@RequestMapping(value = "/meetings/{id}", method = RequestMethod.GET)
	public @ResponseBody String getMeeting(@PathVariable("id") int meetingId) {

		return meetingInterface.getMeeting(meetingId).toString();

	}

	@RequestMapping(value = "/meetings/cancel", method = { RequestMethod.DELETE })
	public @ResponseBody void cancelMeeting(@RequestParam("id") int meetingId) {
		meetingInterface.cancelMeeting(meetingId);
	}

	@RequestMapping(value = "/meetings/create", method = { RequestMethod.POST })
	public @ResponseBody void createMeeting(@RequestParam("id") int meetingId,
			@RequestParam("attendees") int[] attendeesIds,
			@RequestParam("room") int roomId, @RequestParam("year") int year,
			@RequestParam("month") int month, @RequestParam("day") int day,
			@RequestParam("hour") int hour,
			@RequestParam("minutes") int minutes,
			@RequestParam("duration") int duration) {
		ArrayList<Attendees> attendees = new ArrayList<Attendees>();
		for (int i : attendeesIds) {
			attendees.add(attendeeInterface.getAttendee(i));
		}
		Room room = roomInterface.getRoom(roomId);
		timeInterface.createTimeSlot(year, month, day, hour, minutes, 0,
				duration);
		TimeSlot time = timeInterface.getTime();
		meetingInterface.createMeeting(meetingId, attendees, room, time);
	}

	@RequestMapping(value = "/meetings/update", method = { RequestMethod.PUT })
	public @ResponseBody void updateMeeting(
			@RequestParam("id") int meetingId,
			@RequestParam(value = "attendees", required = false) int[] attendeesIds,
			@RequestParam(value = "room", required = false) int roomId,
			@RequestParam("year") int year, @RequestParam("month") int month,
			@RequestParam("day") int day, @RequestParam("hour") int hour,
			@RequestParam("minutes") int minutes,
			@RequestParam("duration") int duration) {
		timeInterface.createTimeSlot(year, month, day, hour, minutes, 0,
				duration);
		TimeSlot time = timeInterface.getTime();
		meetingInterface.getMeeting(meetingId).setTime(time);
		if (attendeesIds != null) {
			ArrayList<Attendees> attendees = new ArrayList<Attendees>();
			for (int i : attendeesIds) {
				attendees.add(attendeeInterface.getAttendee(i));
			}
			meetingInterface.getMeeting(meetingId).setAttendants(attendees);
		}
		if (roomId != 0) {
			Room room = roomInterface.getRoom(roomId);
			meetingInterface.getMeeting(meetingId).setRoom(room);
		}

	}

	public void setmeetingInterface(MeetingInterface meetingInterface) {
		this.meetingInterface = meetingInterface;
	}
}
