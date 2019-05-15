/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PostAnnotationsRequest.java">
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
 * Request model for postAnnotations method.
 */
public class PostAnnotationsRequest {
    
    /**
    * Initializes a new instance of the PostAnnotationsRequest class.
    */      
    public PostAnnotationsRequest()
    {
    }

    /**
    * Initializes a new instance of the PostAnnotationsRequest class.    
    * @param filePath Document path in storage
    * @param annotations Array of annotation descriptions
    */
    public PostAnnotationsRequest(String filePath, List<AnnotationInfo> annotations)
    {
        this.filePath = filePath;
        this.annotations = annotations;
    }

  @SerializedName("filePath")
  private String filePath = null;

  @SerializedName("annotations")
  private List<AnnotationInfo> annotations = null;

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
   * Array of annotation descriptions
   * @return Array of annotation descriptions
  **/
  @ApiModelProperty(example = "Arrays.asList(new AnnotationInfo())", required = true, value = "Array of annotation descriptions")
  public List<AnnotationInfo> getannotations() {
    return annotations;
  }

  public void setannotations(List<AnnotationInfo> annotations) {
    this.annotations = annotations;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    
    PostAnnotationsRequest request = (PostAnnotationsRequest) o;
    return Objects.equals(this.filePath, request.filePath) &&
        Objects.equals(this.annotations, request.annotations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filePath, annotations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostAnnotations {\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
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

