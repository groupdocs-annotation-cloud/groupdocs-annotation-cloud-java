/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="GetPagesRequest.java">
 *   Copyright (c) 2003-2020 Aspose Pty Ltd
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
    * @param pageNumbersToConvert The list of page numbers to convert
    * @param format Preview format: \"PNG\" (default), \"JPEG\", or \"BMP\"
    * @param width Preview image width
    * @param height Preview image height
    * @param withoutAnnotations If true returns specific pages without annotations
    * @param renderComments Render comments (false by default)
    * @param password Source document opening password
    */
    public GetPagesRequest(String filePath, List<Integer> pageNumbersToConvert, String format, Integer width, Integer height, Boolean withoutAnnotations, Boolean renderComments, String password)
    {
        this.filePath = filePath;
        this.pageNumbersToConvert = pageNumbersToConvert;
        this.format = format;
        this.width = width;
        this.height = height;
        this.withoutAnnotations = withoutAnnotations;
        this.renderComments = renderComments;
        this.password = password;
    }

  @SerializedName("filePath")
  private String filePath = null;

  @SerializedName("pageNumbersToConvert")
  private List<Integer> pageNumbersToConvert = null;

  @SerializedName("format")
  private String format = null;

  @SerializedName("width")
  private Integer width = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("withoutAnnotations")
  private Boolean withoutAnnotations = null;

  @SerializedName("renderComments")
  private Boolean renderComments = null;

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
   * Preview format: \"PNG\" (default), \"JPEG\", or \"BMP\"
   * @return Preview format: \"PNG\" (default), \"JPEG\", or \"BMP\"
  **/
  @ApiModelProperty(example = "format_example", value = "Preview format: \"PNG\" (default), \"JPEG\", or \"BMP\"")
  public String getformat() {
    return format;
  }

  public void setformat(String format) {
    this.format = format;
  }

  /**
   * Preview image width
   * @return Preview image width
  **/
  @ApiModelProperty(example = "0", value = "Preview image width")
  public Integer getwidth() {
    return width;
  }

  public void setwidth(Integer width) {
    this.width = width;
  }

  /**
   * Preview image height
   * @return Preview image height
  **/
  @ApiModelProperty(example = "0", value = "Preview image height")
  public Integer getheight() {
    return height;
  }

  public void setheight(Integer height) {
    this.height = height;
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
   * Render comments (false by default)
   * @return Render comments (false by default)
  **/
  @ApiModelProperty(example = "false", value = "Render comments (false by default)")
  public Boolean getrenderComments() {
    return renderComments;
  }

  public void setrenderComments(Boolean renderComments) {
    this.renderComments = renderComments;
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
        Objects.equals(this.pageNumbersToConvert, request.pageNumbersToConvert) &&
        Objects.equals(this.format, request.format) &&
        Objects.equals(this.width, request.width) &&
        Objects.equals(this.height, request.height) &&
        Objects.equals(this.withoutAnnotations, request.withoutAnnotations) &&
        Objects.equals(this.renderComments, request.renderComments) &&
        Objects.equals(this.password, request.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filePath, pageNumbersToConvert, format, width, height, withoutAnnotations, renderComments, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPages {\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    pageNumbersToConvert: ").append(toIndentedString(pageNumbersToConvert)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    withoutAnnotations: ").append(toIndentedString(withoutAnnotations)).append("\n");
    sb.append("    renderComments: ").append(toIndentedString(renderComments)).append("\n");
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

