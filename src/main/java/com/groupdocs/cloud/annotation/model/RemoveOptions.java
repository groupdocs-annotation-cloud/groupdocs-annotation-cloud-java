/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="RemoveOptions.java">
 *   Copyright (c) 2003-2021 Aspose Pty Ltd
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
import com.groupdocs.cloud.annotation.model.FileInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Options for removing annotations
 */
@ApiModel(description = "Options for removing annotations")
public class RemoveOptions {
  @SerializedName("fileInfo")
  private FileInfo fileInfo = null;

  @SerializedName("annotationIds")
  private List<Integer> annotationIds = null;

  @SerializedName("outputPath")
  private String outputPath = null;

  public RemoveOptions fileInfo(FileInfo fileInfo) {
    this.fileInfo = fileInfo;
    return this;
  }

   /**
   * Input document description
   * @return fileInfo
  **/
  @ApiModelProperty(value = "Input document description")
  public FileInfo getFileInfo() {
    return fileInfo;
  }

  public void setFileInfo(FileInfo fileInfo) {
    this.fileInfo = fileInfo;
  }

  public RemoveOptions annotationIds(List<Integer> annotationIds) {
    this.annotationIds = annotationIds;
    return this;
  }

  public RemoveOptions addAnnotationIdsItem(Integer annotationIdsItem) {
    if (this.annotationIds == null) {
      this.annotationIds = new ArrayList<Integer>();
    }
    this.annotationIds.add(annotationIdsItem);
    return this;
  }

   /**
   * List of annotation IDs to remove from the document
   * @return annotationIds
  **/
  @ApiModelProperty(value = "List of annotation IDs to remove from the document")
  public List<Integer> getAnnotationIds() {
    return annotationIds;
  }

  public void setAnnotationIds(List<Integer> annotationIds) {
    this.annotationIds = annotationIds;
  }

  public RemoveOptions outputPath(String outputPath) {
    this.outputPath = outputPath;
    return this;
  }

   /**
   * Path to output document in the cloud storage.
   * @return outputPath
  **/
  @ApiModelProperty(value = "Path to output document in the cloud storage.")
  public String getOutputPath() {
    return outputPath;
  }

  public void setOutputPath(String outputPath) {
    this.outputPath = outputPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveOptions removeOptions = (RemoveOptions) o;
    return Objects.equals(this.fileInfo, removeOptions.fileInfo) &&
        Objects.equals(this.annotationIds, removeOptions.annotationIds) &&
        Objects.equals(this.outputPath, removeOptions.outputPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileInfo, annotationIds, outputPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveOptions {\n");
    
    sb.append("    fileInfo: ").append(toIndentedString(fileInfo)).append("\n");
    sb.append("    annotationIds: ").append(toIndentedString(annotationIds)).append("\n");
    sb.append("    outputPath: ").append(toIndentedString(outputPath)).append("\n");
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

