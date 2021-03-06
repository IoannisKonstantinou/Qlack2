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
package com.eurodyn.qlack2.fuse.componentlibrary.impl.model;
// Generated by Hibernate Tools 3.2.4.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ApiGadgetHasPermission generated by hbm2java
 */
@Entity
@Table(name="cmp_gadget_has_permission"
)
public class ApiGadgetHasPermission  implements java.io.Serializable {


     private String id;
     private ApiGadget gadget;
     private String userId;
     private String permission;
     private Boolean enabled;

    public ApiGadgetHasPermission() {
    }


    public ApiGadgetHasPermission(ApiGadget gadget, String userId, String permission) {
        this.gadget = gadget;
        this.userId = userId;
        this.permission = permission;
    }
    public ApiGadgetHasPermission(ApiGadget gadget, String userId, String permission, Boolean enabled) {
       this.gadget = gadget;
       this.userId = userId;
       this.permission = permission;
       this.enabled = enabled;
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
    @JoinColumn(name="gadget", nullable=false)
		public ApiGadget getGadget() {
			return this.gadget;
		}

    public void setGadget(ApiGadget gadget) {
        this.gadget = gadget;
    }

    @Column(name="user_id", nullable=false, length=36)
		public String getUserId() {
			return this.userId;
		}

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Column(name="permission", nullable=false, length=36)
		public String getPermission() {
			return this.permission;
		}

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Column(name="enabled")
		public Boolean getEnabled() {
			return this.enabled;
		}

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }




}


