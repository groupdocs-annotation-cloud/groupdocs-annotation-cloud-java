/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="GetExportRequest.java">
 *   Copyright (c) 2003-2019 Aspose Pty Ltd
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

package com.groupdocs.cloud.annotation.model.requests;

import java.util.Objects;
import java.util.List;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.cloud.annotation.model.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.File;

/**
 * Request model for getExport method.
 */
public class GetExportRequest {
    
    /**
    * Initializes a new instance of the GetExportRequest class.
    */      
    public GetExportRequest()
    {
    }

    /**
    * Initializes a new instance of the GetExportRequest class.    
    * @param filePath Document path in storage
    * @param annotationTypes Annotation types that will be exported. All annotation types will be exported if not specified
    * @param annotatedPages Indicates whether to export only annotated pages
    * @param firstPage Determines number of first exported page
    * @param lastPage Determines number of last exported page
    * @param password Source document password
    */
    public GetExportRequest(String filePath, String annotationTypes, Boolean annotatedPages, Integer firstPage, Integer lastPage, String password)
    {
        this.filePath = filePath;
        this.annotationTypes = annotationTypes;
        this.annotatedPages = annotatedPages;
        this.firstPage = firstPage;
        this.lastPage = lastPage;
        this.password = password;
    }

  @SerializedName("filePath")
  private String filePath = null;

  @SerializedName("annotationTypes")
  private String annotationTypes = null;

  @SerializedName("annotatedPages")
  private Boolean annotatedPages = null;

  @SerializedName("firstPage")
  private Integer firstPage = null;

  @SerializedName("lastPage")
  private Integer lastPage = null;

  @SerializedName("password")
  private String password = null;

  /**
   * Document path in storage
   * @return Document path in storage
  **/
  @ApiModelProperty(example = "filePath_example", required = true, value = "Document path in storage")
  public String getfilePath() {
    return filePath;
  }

  public void setfilePath(String filePath) {
    this.filePath = filePath;
  }

  /**
   * Annotation types that will be exported. All annotation types will be exported if not specified
   * @return Annotation types that will be exported. All annotation types will be exported if not specified
  **/
  @ApiModelProperty(example = "annotationTypes_example", value = "Annotation types that will be exported. All annotation types will be exported if not specified")
  public String getannotationTypes() {
    return annotationTypes;
  }

  public void setannotationTypes(String annotationTypes) {
    this.annotationTypes = annotationTypes;
  }

  /**
   * Indicates whether to export only annotated pages
   * @return Indicates whether to export only annotated pages
  **/
  @ApiModelProperty(example = "false", value = "Indicates whether to export only annotated pages")
  public Boolean getannotatedPages() {
    return annotatedPages;
  }

  public void setannotatedPages(Boolean annotatedPages) {
    this.annotatedPages = annotatedPages;
  }

  /**
   * Determines number of first exported page
   * @return Determines number of first exported page
  **/
  @ApiModelProperty(example = "-1", value = "Determines number of first exported page")
  public Integer getfirstPage() {
    return firstPage;
  }

  public void setfirstPage(Integer firstPage) {
    this.firstPage = firstPage;
  }

  /**
   * Determines number of last exported page
   * @return Determines number of last exported page
  **/
  @ApiModelProperty(example = "-1", value = "Determines number of last exported page")
  public Integer getlastPage() {
    return lastPage;
  }

  public void setlastPage(Integer lastPage) {
    this.lastPage = lastPage;
  }

  /**
   * Source document password
   * @return Source document password
  **/
  @ApiModelProperty(example = "password_example", value = "Source document password")
  public String getpassword() {
    return password;
  }

  public void setpassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    
    GetExportRequest request = (GetExportRequest) o;
    return Objects.equals(this.filePath, request.filePath) &&
        Objects.equals(this.annotationTypes, request.annotationTypes) &&
        Objects.equals(this.annotatedPages, request.annotatedPages) &&
        Objects.equals(this.firstPage, request.firstPage) &&
        Objects.equals(this.lastPage, request.lastPage) &&
        Objects.equals(this.password, request.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filePath, annotationTypes, annotatedPages, firstPage, lastPage, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetExport {\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    annotationTypes: ").append(toIndentedString(annotationTypes)).append("\n");
    sb.append("    annotatedPages: ").append(toIndentedString(annotatedPages)).append("\n");
    sb.append("    firstPage: ").append(toIndentedString(firstPage)).append("\n");
    sb.append("    lastPage: ").append(toIndentedString(lastPage)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

