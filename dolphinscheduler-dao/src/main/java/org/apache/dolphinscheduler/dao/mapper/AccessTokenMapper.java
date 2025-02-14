/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.dolphinscheduler.dao.mapper;

import org.apache.dolphinscheduler.dao.entity.AccessToken;

import org.apache.ibatis.annotations.Param;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * accesstoken mapper interface
 */
public interface AccessTokenMapper extends BaseMapper<AccessToken> {


    /**
     * access token page
     *
     * @param page page
     * @param userName userName
     * @param userId userId
     * @return access token Ipage
     */
    IPage<AccessToken> selectAccessTokenPage(Page page,
                                             @Param("userName") String userName,
                                             @Param("userId") int userId
    );

    /**
     * Query access token for specified user
     *
     * @param userId userId
     * @return access token for specified user
     */
    List<AccessToken> queryAccessTokenByUser(@Param("userId") int userId);

    /**
     * delete by userId
     *
     * @param userId userId
     * @return delete result
     */
    int deleteAccessTokenByUserId(@Param("userId") int userId);

    /**
     * list authorized Projects
     * @param userId
     * @param accessTokensIds
     * @return access token for specified user
     */
    List<AccessToken> listAuthorizedAccessToken(@Param("userId") int userId, @Param("accessTokensIds")List<Integer> accessTokensIds);
}
