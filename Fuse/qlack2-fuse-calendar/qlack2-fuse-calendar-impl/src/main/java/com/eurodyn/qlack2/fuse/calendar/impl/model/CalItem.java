/*
* Copyright 2014 EUROPEAN DYNAMICS SA <info@eurodyn.com>
*
* Licensed under the EUPL, Version 1.1 only (the "License").
* You may not use this work except in compliance with the Licence.
* You may obtain a copy of the Licence at:
* https://joinup.ec.europa.eu/software/page/eupl/licence-eupl
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the Licence is distributed on an "AS IS" basis,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the Licence for the specific language governing permissions and
* limitations under the Licence.
*/
package com.eurodyn.qlack2.fuse.calendar.impl.model;
// Generated by Hibernate Tools 3.2.4.GA

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * CalItem generated by hbm2java
 */
@Entity
@Table(name="cal_item"
)
public class CalItem  implements java.io.Serializable {


     private String id;
     private CalCalendar calendarId;
     private String categoryId;
     private String name;
     private String description;
     private String location;
     private String contactId;
     private long startTime;
     private long endTime;
     private boolean allDay;
     private long createdOn;
     private String createdBy;
     private long lastModifiedOn;
     private String lastModifiedBy;
     private Set<CalSupportingObject> calSupportingObjects = new HashSet<CalSupportingObject>(0);
     private Set<CalParticipant> calParticipants = new HashSet<CalParticipant>(0);

    public CalItem() {
    }


    public CalItem(CalCalendar calendarId, String categoryId, String name, String location, long startTime, long endTime, boolean allDay, long createdOn, String createdBy, long lastModifiedOn, String lastModifiedBy) {
        this.calendarId = calendarId;
        this.categoryId = categoryId;
        this.name = name;
        this.location = location;
        this.startTime = startTime;
        this.endTime = endTime;
        this.allDay = allDay;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.lastModifiedOn = lastModifiedOn;
        this.lastModifiedBy = lastModifiedBy;
    }
    public CalItem(CalCalendar calendarId, String categoryId, String name, String description, String location, String contactId, long startTime, long endTime, boolean allDay, long createdOn, String createdBy, long lastModifiedOn, String lastModifiedBy, Set<CalSupportingObject> calSupportingObjects, Set<CalParticipant> calParticipants) {
       this.calendarId = calendarId;
       this.categoryId = categoryId;
       this.name = name;
       this.description = description;
       this.location = location;
       this.contactId = contactId;
       this.startTime = startTime;
       this.endTime = endTime;
       this.allDay = allDay;
       this.createdOn = createdOn;
       this.createdBy = createdBy;
       this.lastModifiedOn = lastModifiedOn;
       this.lastModifiedBy = lastModifiedBy;
       this.calSupportingObjects = calSupportingObjects;
       this.calParticipants = calParticipants;
    }

		@Id
		public String getId() {
		if (this.id == null) {
             this.id = java.util.UUID.randomUUID().toString();
         }

		 return this.id;
		}

    public void setId(String id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="calendar_id", nullable=false)
		public CalCalendar getCalendarId() {
			return this.calendarId;
		}

    public void setCalendarId(CalCalendar calendarId) {
        this.calendarId = calendarId;
    }

    @Column(name="category_id", nullable=false, length=36)
		public String getCategoryId() {
			return this.categoryId;
		}

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    @Column(name="name", nullable=false, length=1024)
		public String getName() {
			return this.name;
		}

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="description", length=1024)
		public String getDescription() {
			return this.description;
		}

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name="location", nullable=false, length=1024)
		public String getLocation() {
			return this.location;
		}

    public void setLocation(String location) {
        this.location = location;
    }

    @Column(name="contact_id", length=36)
		public String getContactId() {
			return this.contactId;
		}

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    @Column(name="start_time", nullable=false)
		public long getStartTime() {
			return this.startTime;
		}

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    @Column(name="end_time", nullable=false)
		public long getEndTime() {
			return this.endTime;
		}

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    @Column(name="all_day", nullable=false)
		public boolean isAllDay() {
			return this.allDay;
		}

    public void setAllDay(boolean allDay) {
        this.allDay = allDay;
    }

    @Column(name="created_on", nullable=false)
		public long getCreatedOn() {
			return this.createdOn;
		}

    public void setCreatedOn(long createdOn) {
        this.createdOn = createdOn;
    }

    @Column(name="created_by", nullable=false, length=36)
		public String getCreatedBy() {
			return this.createdBy;
		}

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Column(name="last_modified_on", nullable=false)
		public long getLastModifiedOn() {
			return this.lastModifiedOn;
		}

    public void setLastModifiedOn(long lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
    }

    @Column(name="last_modified_by", nullable=false, length=36)
		public String getLastModifiedBy() {
			return this.lastModifiedBy;
		}

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="itemId")
		public Set<CalSupportingObject> getCalSupportingObjects() {
			return this.calSupportingObjects;
		}

    public void setCalSupportingObjects(Set<CalSupportingObject> calSupportingObjects) {
        this.calSupportingObjects = calSupportingObjects;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="itemId")
		public Set<CalParticipant> getCalParticipants() {
			return this.calParticipants;
		}

    public void setCalParticipants(Set<CalParticipant> calParticipants) {
        this.calParticipants = calParticipants;
    }




}


