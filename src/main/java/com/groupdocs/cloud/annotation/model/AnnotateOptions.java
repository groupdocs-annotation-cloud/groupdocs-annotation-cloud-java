/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="AnnotateOptions.java">
 *   Copyright (c) 2003-2023 Aspose Pty Ltd
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
import com.groupdocs.cloud.annotation.model.AnnotationInfo;
import com.groupdocs.cloud.annotation.model.FileInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Defines options for annotating documents
 */
@ApiModel(description = "Defines options for annotating documents")
public class AnnotateOptions {
  @SerializedName("fileInfo")
  private FileInfo fileInfo = null;

  @SerializedName("annotations")
  private List<AnnotationInfo> annotations = null;

  @SerializedName("firstPage")
  private Integer firstPage = null;

  @SerializedName("lastPage")
  private Integer lastPage = null;

  @SerializedName("onlyAnnotatedPages")
  private Boolean onlyAnnotatedPages = null;

  @SerializedName("outputPath")
  private String outputPath = null;

  @SerializedName("fontsPath")
  private String fontsPath = null;

  public AnnotateOptions fileInfo(FileInfo fileInfo) {
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

  public AnnotateOptions annotations(List<AnnotationInfo> annotations) {
    this.annotations = annotations;
    return this;
  }

  public AnnotateOptions addAnnotationsItem(AnnotationInfo annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new ArrayList<AnnotationInfo>();
    }
    this.annotations.add(annotationsItem);
    return this;
  }

   /**
   * List of annotations to add to the document
   * @return annotations
  **/
  @ApiModelProperty(value = "List of annotations to add to the document")
  public List<AnnotationInfo> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(List<AnnotationInfo> annotations) {
    this.annotations = annotations;
  }

  public AnnotateOptions firstPage(Integer firstPage) {
    this.firstPage = firstPage;
    return this;
  }

   /**
   * First page number when saving page range
   * @return firstPage
  **/
  @ApiModelProperty(required = true, value = "First page number when saving page range")
  public Integer getFirstPage() {
    return firstPage;
  }

  public void setFirstPage(Integer firstPage) {
    this.firstPage = firstPage;
  }

  public AnnotateOptions lastPage(Integer lastPage) {
    this.lastPage = lastPage;
    return this;
  }

   /**
   * Last page number when saving page range
   * @return lastPage
  **/
  @ApiModelProperty(required = true, value = "Last page number when saving page range")
  public Integer getLastPage() {
    return lastPage;
  }

  public void setLastPage(Integer lastPage) {
    this.lastPage = lastPage;
  }

  public AnnotateOptions onlyAnnotatedPages(Boolean onlyAnnotatedPages) {
    this.onlyAnnotatedPages = onlyAnnotatedPages;
    return this;
  }

   /**
   * Indicates whether to save only annotated pages
   * @return onlyAnnotatedPages
  **/
  @ApiModelProperty(required = true, value = "Indicates whether to save only annotated pages")
  public Boolean getOnlyAnnotatedPages() {
    return onlyAnnotatedPages;
  }

  public void setOnlyAnnotatedPages(Boolean onlyAnnotatedPages) {
    this.onlyAnnotatedPages = onlyAnnotatedPages;
  }

  public AnnotateOptions outputPath(String outputPath) {
    this.outputPath = outputPath;
    return this;
  }

   /**
   * Path to output document in the cloud storage. Required for Add method. Not required if Annotate (with file result) method used.
   * @return outputPath
  **/
  @ApiModelProperty(value = "Path to output document in the cloud storage. Required for Add method. Not required if Annotate (with file result) method used.")
  public String getOutputPath() {
    return outputPath;
  }

  public void setOutputPath(String outputPath) {
    this.outputPath = outputPath;
  }

  public AnnotateOptions fontsPath(String fontsPath) {
    this.fontsPath = fontsPath;
    return this;
  }

   /**
   * The path to directory containing custom fonts in storage
   * @return fontsPath
  **/
  @ApiModelProperty(value = "The path to directory containing custom fonts in storage")
  public String getFontsPath() {
    return fontsPath;
  }

  public void setFontsPath(String fontsPath) {
    this.fontsPath = fontsPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnotateOptions annotateOptions = (AnnotateOptions) o;
    return Objects.equals(this.fileInfo, annotateOptions.fileInfo) &&
        Objects.equals(this.annotations, annotateOptions.annotations) &&
        Objects.equals(this.firstPage, annotateOptions.firstPage) &&
        Objects.equals(this.lastPage, annotateOptions.lastPage) &&
        Objects.equals(this.onlyAnnotatedPages, annotateOptions.onlyAnnotatedPages) &&
        Objects.equals(this.outputPath, annotateOptions.outputPath) &&
        Objects.equals(this.fontsPath, annotateOptions.fontsPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileInfo, annotations, firstPage, lastPage, onlyAnnotatedPages, outputPath, fontsPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotateOptions {\n");
    
    sb.append("    fileInfo: ").append(toIndentedString(fileInfo)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    firstPage: ").append(toIndentedString(firstPage)).append("\n");
    sb.append("    lastPage: ").append(toIndentedString(lastPage)).append("\n");
    sb.append("    onlyAnnotatedPages: ").append(toIndentedString(onlyAnnotatedPages)).append("\n");
    sb.append("    outputPath: ").append(toIndentedString(outputPath)).append("\n");
    sb.append("    fontsPath: ").append(toIndentedString(fontsPath)).append("\n");
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

