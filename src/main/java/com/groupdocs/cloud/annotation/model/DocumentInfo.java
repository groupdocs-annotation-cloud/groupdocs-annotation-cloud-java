/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="DocumentInfo.java">
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
import com.groupdocs.cloud.annotation.model.PageInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Describes document basic info
 */
@ApiModel(description = "Describes document basic info")
public class DocumentInfo {
  @SerializedName("name")
  private String name = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("extension")
  private String extension = null;

  @SerializedName("fileFormat")
  private String fileFormat = null;

  @SerializedName("size")
  private Long size = null;

  @SerializedName("dateModified")
  private OffsetDateTime dateModified = null;

  @SerializedName("pages")
  private List<PageInfo> pages = null;

  public DocumentInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Gets or sets the document name
   * @return name
  **/
  @ApiModelProperty(value = "Gets or sets the document name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DocumentInfo path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Gets or sets the document path
   * @return path
  **/
  @ApiModelProperty(value = "Gets or sets the document path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public DocumentInfo extension(String extension) {
    this.extension = extension;
    return this;
  }

   /**
   * Gets or sets the document extension
   * @return extension
  **/
  @ApiModelProperty(value = "Gets or sets the document extension")
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }

  public DocumentInfo fileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
    return this;
  }

   /**
   * Gets or sets the file format
   * @return fileFormat
  **/
  @ApiModelProperty(value = "Gets or sets the file format")
  public String getFileFormat() {
    return fileFormat;
  }

  public void setFileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
  }

  public DocumentInfo size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Gets or sets the document size
   * @return size
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the document size")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public DocumentInfo dateModified(OffsetDateTime dateModified) {
    this.dateModified = dateModified;
    return this;
  }

   /**
   * Gets or sets the document date modified
   * @return dateModified
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the document date modified")
  public OffsetDateTime getDateModified() {
    return dateModified;
  }

  public void setDateModified(OffsetDateTime dateModified) {
    this.dateModified = dateModified;
  }

  public DocumentInfo pages(List<PageInfo> pages) {
    this.pages = pages;
    return this;
  }

  public DocumentInfo addPagesItem(PageInfo pagesItem) {
    if (this.pages == null) {
      this.pages = new ArrayList<PageInfo>();
    }
    this.pages.add(pagesItem);
    return this;
  }

   /**
   * Gets or sets the pages
   * @return pages
  **/
  @ApiModelProperty(value = "Gets or sets the pages")
  public List<PageInfo> getPages() {
    return pages;
  }

  public void setPages(List<PageInfo> pages) {
    this.pages = pages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentInfo documentInfo = (DocumentInfo) o;
    return Objects.equals(this.name, documentInfo.name) &&
        Objects.equals(this.path, documentInfo.path) &&
        Objects.equals(this.extension, documentInfo.extension) &&
        Objects.equals(this.fileFormat, documentInfo.fileFormat) &&
        Objects.equals(this.size, documentInfo.size) &&
        Objects.equals(this.dateModified, documentInfo.dateModified) &&
        Objects.equals(this.pages, documentInfo.pages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, path, extension, fileFormat, size, dateModified, pages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
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

