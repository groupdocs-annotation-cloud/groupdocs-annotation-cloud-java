/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="AnnotationReplyInfo.java">
 *   Copyright (c) 2003-2018 Aspose Pty Ltd
 * </copyright>
 * <summary>
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.groupdocs.cloud.annotation.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Describes annotation reply properties
 */
@ApiModel(description = "Describes annotation reply properties")
public class AnnotationReplyInfo {
  @SerializedName("guid")
  private String guid = null;

  @SerializedName("userGuid")
  private String userGuid = null;

  @SerializedName("userName")
  private String userName = null;

  @SerializedName("userEmail")
  private String userEmail = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("repliedOn")
  private OffsetDateTime repliedOn = null;

  @SerializedName("parentReplyGuid")
  private String parentReplyGuid = null;

  public AnnotationReplyInfo guid(String guid) {
    this.guid = guid;
    return this;
  }

   /**
   * Gets or sets the unique identifier
   * @return guid
  **/
  @ApiModelProperty(value = "Gets or sets the unique identifier")
  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public AnnotationReplyInfo userGuid(String userGuid) {
    this.userGuid = userGuid;
    return this;
  }

   /**
   * Gets or sets the user&#39;s unique identifier
   * @return userGuid
  **/
  @ApiModelProperty(value = "Gets or sets the user's unique identifier")
  public String getUserGuid() {
    return userGuid;
  }

  public void setUserGuid(String userGuid) {
    this.userGuid = userGuid;
  }

  public AnnotationReplyInfo userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Gets or sets the user&#39;s name
   * @return userName
  **/
  @ApiModelProperty(value = "Gets or sets the user's name")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public AnnotationReplyInfo userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

   /**
   * Gets or sets the user email
   * @return userEmail
  **/
  @ApiModelProperty(value = "Gets or sets the user email")
  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public AnnotationReplyInfo message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Gets or sets the message
   * @return message
  **/
  @ApiModelProperty(value = "Gets or sets the message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public AnnotationReplyInfo repliedOn(OffsetDateTime repliedOn) {
    this.repliedOn = repliedOn;
    return this;
  }

   /**
   * Gets or sets the reply time
   * @return repliedOn
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the reply time")
  public OffsetDateTime getRepliedOn() {
    return repliedOn;
  }

  public void setRepliedOn(OffsetDateTime repliedOn) {
    this.repliedOn = repliedOn;
  }

  public AnnotationReplyInfo parentReplyGuid(String parentReplyGuid) {
    this.parentReplyGuid = parentReplyGuid;
    return this;
  }

   /**
   * Gets or sets the parent reply unique identifier
   * @return parentReplyGuid
  **/
  @ApiModelProperty(value = "Gets or sets the parent reply unique identifier")
  public String getParentReplyGuid() {
    return parentReplyGuid;
  }

  public void setParentReplyGuid(String parentReplyGuid) {
    this.parentReplyGuid = parentReplyGuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnotationReplyInfo annotationReplyInfo = (AnnotationReplyInfo) o;
    return Objects.equals(this.guid, annotationReplyInfo.guid) &&
        Objects.equals(this.userGuid, annotationReplyInfo.userGuid) &&
        Objects.equals(this.userName, annotationReplyInfo.userName) &&
        Objects.equals(this.userEmail, annotationReplyInfo.userEmail) &&
        Objects.equals(this.message, annotationReplyInfo.message) &&
        Objects.equals(this.repliedOn, annotationReplyInfo.repliedOn) &&
        Objects.equals(this.parentReplyGuid, annotationReplyInfo.parentReplyGuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guid, userGuid, userName, userEmail, message, repliedOn, parentReplyGuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotationReplyInfo {\n");
    
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    userGuid: ").append(toIndentedString(userGuid)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    repliedOn: ").append(toIndentedString(repliedOn)).append("\n");
    sb.append("    parentReplyGuid: ").append(toIndentedString(parentReplyGuid)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

