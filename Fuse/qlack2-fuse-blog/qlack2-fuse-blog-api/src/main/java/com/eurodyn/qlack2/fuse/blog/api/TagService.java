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
package com.eurodyn.qlack2.fuse.blog.api;

import java.util.List;

import com.eurodyn.qlack2.fuse.blog.api.dto.BlogTagDTO;
import com.eurodyn.qlack2.fuse.blog.api.exception.QBlogException;

/**
 *
 * @author European Dynamics SA.
 */
public interface TagService {

    /**
     * Creates a tag.While creating the new tag this method makes sure that
     * name is set in DTO. If required are missing then exception
     * is thrown.
     * @param dto BlogTagDTO contains the information about the tag to persist.
     * @return String contains the information about the tag.
     * @throws QBlogException
     *
     */
    String createTag(BlogTagDTO dto) throws QBlogException;

    /**
     * Deletes a tag
     * @param tagId the id of the tag to remove
     * @throws QBlogException
     */
    void deleteTag(String tagId) throws QBlogException;

    /**
     * Finds the tag.
     * @param id
     * @return
     */
    BlogTagDTO findTag(String id);

    /**
     * Finds the tag by tag name.
     * @param name name of tag.
     * @return dto BlogTagDTO contains the information about the tag.
     */
    BlogTagDTO findTagByName(String name);

    /**
     * Gets all the tags.
     * @return list of BlogTagDTO which contains the information about the tag.
     */
    List<BlogTagDTO> findAllTags();
}
