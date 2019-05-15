/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="GetPagesRequest.java">
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
 * Request model for getPages method.
 */
public class GetPagesRequest {
    
    /**
    * Initializes a new instance of the GetPagesRequest class.
    */      
    public GetPagesRequest()
    {
    }

    /**
    * Initializes a new instance of the GetPagesRequest class.    
    * @param filePath Document path in storage
    * @param countPagesToConvert The count pages to convert
    * @param pageNumber The start page number
    * @param pageNumbersToConvert The list of page numbers to convert
    * @param withoutAnnotations If true returns specific pages without annotations
    * @param enableCaching Indicates whether to use previously cached document or not
    * @param cacheStoragePath The cache storage path
    * @param password Source document opening password
    */
    public GetPagesRequest(String filePath, Integer countPagesToConvert, Integer pageNumber, List<Integer> pageNumbersToConvert, Boolean withoutAnnotations, Boolean enableCaching, String cacheStoragePath, String password)
    {
        this.filePath = filePath;
        this.countPagesToConvert = countPagesToConvert;
        this.pageNumber = pageNumber;
        this.pageNumbersToConvert = pageNumbersToConvert;
        this.withoutAnnotations = withoutAnnotations;
        this.enableCaching = enableCaching;
        this.cacheStoragePath = cacheStoragePath;
        this.password = password;
    }

  @SerializedName("filePath")
  private String filePath = null;

  @SerializedName("countPagesToConvert")
  private Integer countPagesToConvert = null;

  @SerializedName("pageNumber")
  private Integer pageNumber = null;

  @SerializedName("pageNumbersToConvert")
  private List<Integer> pageNumbersToConvert = null;

  @SerializedName("withoutAnnotations")
  private Boolean withoutAnnotations = null;

  @SerializedName("enableCaching")
  private Boolean enableCaching = null;

  @SerializedName("cacheStoragePath")
  private String cacheStoragePath = null;

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
   * The count pages to convert
   * @return The count pages to convert
  **/
  @ApiModelProperty(example = "0", value = "The count pages to convert")
  public Integer getcountPagesToConvert() {
    return countPagesToConvert;
  }

  public void setcountPagesToConvert(Integer countPagesToConvert) {
    this.countPagesToConvert = countPagesToConvert;
  }

  /**
   * The start page number
   * @return The start page number
  **/
  @ApiModelProperty(example = "0", value = "The start page number")
  public Integer getpageNumber() {
    return pageNumber;
  }

  public void setpageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  /**
   * The list of page numbers to convert
   * @return The list of page numbers to convert
  **/
  @ApiModelProperty(example = "Arrays.asList(56)", value = "The list of page numbers to convert")
  public List<Integer> getpageNumbersToConvert() {
    return pageNumbersToConvert;
  }

  public void setpageNumbersToConvert(List<Integer> pageNumbersToConvert) {
    this.pageNumbersToConvert = pageNumbersToConvert;
  }

  /**
   * If true returns specific pages without annotations
   * @return If true returns specific pages without annotations
  **/
  @ApiModelProperty(example = "false", value = "If true returns specific pages without annotations")
  public Boolean getwithoutAnnotations() {
    return withoutAnnotations;
  }

  public void setwithoutAnnotations(Boolean withoutAnnotations) {
    this.withoutAnnotations = withoutAnnotations;
  }

  /**
   * Indicates whether to use previously cached document or not
   * @return Indicates whether to use previously cached document or not
  **/
  @ApiModelProperty(example = "false", value = "Indicates whether to use previously cached document or not")
  public Boolean getenableCaching() {
    return enableCaching;
  }

  public void setenableCaching(Boolean enableCaching) {
    this.enableCaching = enableCaching;
  }

  /**
   * The cache storage path
   * @return The cache storage path
  **/
  @ApiModelProperty(example = "cacheStoragePath_example", value = "The cache storage path")
  public String getcacheStoragePath() {
    return cacheStoragePath;
  }

  public void setcacheStoragePath(String cacheStoragePath) {
    this.cacheStoragePath = cacheStoragePath;
  }

  /**
   * Source document opening password
   * @return Source document opening password
  **/
  @ApiModelProperty(example = "password_example", value = "Source document opening password")
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
    
    GetPagesRequest request = (GetPagesRequest) o;
    return Objects.equals(this.filePath, request.filePath) &&
        Objects.equals(this.countPagesToConvert, request.countPagesToConvert) &&
        Objects.equals(this.pageNumber, request.pageNumber) &&
        Objects.equals(this.pageNumbersToConvert, request.pageNumbersToConvert) &&
        Objects.equals(this.withoutAnnotations, request.withoutAnnotations) &&
        Objects.equals(this.enableCaching, request.enableCaching) &&
        Objects.equals(this.cacheStoragePath, request.cacheStoragePath) &&
        Objects.equals(this.password, request.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filePath, countPagesToConvert, pageNumber, pageNumbersToConvert, withoutAnnotations, enableCaching, cacheStoragePath, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPages {\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    countPagesToConvert: ").append(toIndentedString(countPagesToConvert)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageNumbersToConvert: ").append(toIndentedString(pageNumbersToConvert)).append("\n");
    sb.append("    withoutAnnotations: ").append(toIndentedString(withoutAnnotations)).append("\n");
    sb.append("    enableCaching: ").append(toIndentedString(enableCaching)).append("\n");
    sb.append("    cacheStoragePath: ").append(toIndentedString(cacheStoragePath)).append("\n");
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

